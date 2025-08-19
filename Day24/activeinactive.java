package TestNG_package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class activeinactive {
	WebDriver driver;
	PageClass pg;
	@Test(enabled = false)
	  public void showallcategory() throws InterruptedException {
		  pg.allcategory();


	  }
	 @Test(enabled = true)
	  public void shopbycategory() throws InterruptedException {
		  pg.shopbycategory();


	  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  pg = new PageClass(driver);
	  driver.get("https://www.ebay.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
