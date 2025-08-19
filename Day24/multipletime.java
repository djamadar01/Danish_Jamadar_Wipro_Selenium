package TestNG_package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class multipletime {
	WebDriver driver;
	PageClass pg;
	@Test(invocationCount = 5)
	  public void scroll() throws InterruptedException {	
		  pg.scroll();
			
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
