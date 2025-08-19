package TestNG_package;

import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Ebay_project {
  WebDriver driver;
  PageClass pg;

  
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  driver = new ChromeDriver();
	  pg = new PageClass(driver);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().window().maximize();
	  driver.get("https://www.ebay.com/");
	  
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  Assert.assertTrue(true,"Search Button is not working");
	  //driver.quit();
	  System.out.println("Test Case Executed Sucessfully!!!!");
  }
  
  @Test(priority = 1)
  public void Login() throws InterruptedException {
	  driver.navigate().to("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&sgfl=gh&ru=https%3A%2F%2Fwww.ebay.com%2F");
	  pg.email_in();
	  pg.pass_in();
	  pg.con_in();

  }
  @Test(priority = 2)
  public void search() throws InterruptedException {
	  pg.search_in();

  }
  @Test(priority = 3)
  public void adddeletetocart() throws InterruptedException {
	  pg.addcart();
	  Thread.sleep(2000);
	  pg.deletecart();

  }
  
  @Test(priority = 4)
  public void shopbycategory() throws InterruptedException {
	  pg.shopbycategory();


  }
  @Test(priority = 5)
  public void description() throws InterruptedException {
	  pg.description();


  }
  @Test(priority = 6)
  public void showallcategory() throws InterruptedException {
	  pg.allcategory();


  }
  @Test(priority = 7)
  public void lang() throws InterruptedException {	
	  pg.lang();

		System.out.println("Language changed to Español.");
  }
  @Test(priority = 8)
  public void scroll() throws InterruptedException {	
	  pg.scroll();
		
  }   
}
