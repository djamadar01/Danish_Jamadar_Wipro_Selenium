package TestNG_package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
//Comparable Testing - 
//Comparative Testing - 
//1. All test in Single Tab
//2. Create Browser Object in before class/test only
//3. Same Application different version


//Compitetive Testing 
//1. each test in different Browser
//2. Create Browser Object in each test case
//3. comparing different software 
public class Para_Testing {
	WebDriver driver;
	@BeforeClass
	public void beforeClass() throws InterruptedException 
	{
		//driver = new ChromeDriver();
		Thread.sleep(2000);
		//driver.manage().window().maximize();
	  } 
  @Test
  public void ebay() {
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		System.out.println("ebay - Thread ID : "+Thread.currentThread().getId());
		driver.quit();

  }
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
  @Test
  public void zero() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");
		WebElement search = driver.findElement(By.id("searchTerm"));
		search.sendKeys("Online Banking");
		search.sendKeys(Keys.ENTER);
		Assert.assertTrue("Search Button is not working",true);
		Thread.sleep(3000);
		System.out.println("Zerobank - Thread ID : "+Thread.currentThread().getId());
		driver.quit();


  }
  

  @AfterClass
  public void afterClass() {
	 driver.quit();
  }

}
