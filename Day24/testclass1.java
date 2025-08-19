package TestNG_package;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testclass1 {
  WebDriver driver;
  @Test
  public void amazon() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String expecedurl = "https://www.amazon.in/";
		String actualurl = driver.getCurrentUrl();
		Assert.assertEquals("Url dosen't match",expecedurl,actualurl);
		Thread.sleep(3000);
		System.out.println("Amazon - Thread ID : "+Thread.currentThread().getId());
		driver.quit();
  }
}
