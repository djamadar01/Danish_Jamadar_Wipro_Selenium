package TestNG_package;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testclass2 {
	WebDriver driver;
	  @Test
	  public void flipkart() throws InterruptedException {
			driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			String expecedtitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
			String actualtitle = driver.getTitle();
			Assert.assertEquals("title dosen't match",expecedtitle,actualtitle);
			Thread.sleep(3000);
			System.out.println("Flipkart - Thread ID : "+Thread.currentThread().getId());
			driver.quit();


	  }  
}
