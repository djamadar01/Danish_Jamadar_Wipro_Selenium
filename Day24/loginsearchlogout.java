package TestNG_package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class loginsearchlogout {
	WebDriver driver;
	PageClass pg;
	 @BeforeTest
	  public void beforeTest() {
		  driver = new ChromeDriver();
		  pg = new PageClass(driver);
		  driver.get("https://www.ebay.com/");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  driver.manage().window().maximize();
	  }

  @Test
  public void login() {
	  driver.navigate().to("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&sgfl=gh&ru=https%3A%2F%2Fwww.ebay.com%2F");
	  pg.email_in();
	  pg.pass_in();
	  pg.con_in();
  }
  @Test(dependsOnMethods = {"login"})
  public void search() {
	  pg.search_in();

  }
  @Test(dependsOnMethods = {"login","search"})
  public void logout() {
	  Actions act  = new Actions(driver);	
	  WebElement scr = driver.findElement(By.cssSelector("button[aria-controls=\"s0-1-4-9-3[0]-0-9-dialog\"]"));
	  act.moveToElement(scr).perform();
	  driver.findElement(By.xpath("//*[@id=\"s0-1-4-9-3[0]-0-9-dialog\"]/div/div/ul/li[3]/a")).click();
  }
 

  @AfterTest
  public void afterTest() {
	  //driver.close();

  }

}
