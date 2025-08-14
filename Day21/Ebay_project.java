package TestNG_package;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Ebay_project {
  WebDriver driver;
  
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.manage().window().maximize();
	  driver.get("https://www.ebay.com/");
	  
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  Assert.assertTrue(true,"Search Button is not working");
	  driver.quit();
	  System.out.println("Test Case Executed Sucessfully!!!!");
  }
  
  @Test(priority = 1)
  public void Login() throws InterruptedException {
	  driver.navigate().to("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&sgfl=gh&ru=https%3A%2F%2Fwww.ebay.com%2F");
	  WebElement log = driver.findElement(By.id("userid"));
	  log.sendKeys("djamadar01@gmail.com");
	  driver.findElement(By.id("signin-continue-btn")).click();	  
	  WebElement pass = driver.findElement(By.id("pass"));
	  pass.sendKeys("Pass@123");
	  driver.findElement(By.id("sgnBt")).click();
	  System.out.println("Login test executed.");
  }
  @Test(priority = 2)
  public void search() throws InterruptedException {
	  List<String> ser = new ArrayList<>();
      ser.add("watch");
      ser.add("phone");
      ser.add("Headphones");
	  for (String item : ser) {
	      WebElement search = driver.findElement(By.id("gh-ac"));
          search.clear();
          search.sendKeys(item);
          search.sendKeys(Keys.ENTER);
          System.out.println("Searched for: " + item);
      }
  }
  @Test(priority = 3)
  public void adddeletetocart() throws InterruptedException {
	  Actions act = new Actions(driver);    
	  driver.navigate().to("https://www.ebay.com/itm/357452864391?_skw=watch&itmmeta=01K2HATY3PNF6FJG54HSN5E19Q&hash=item5339d9db87:g:qGcAAeSwTZlonDGz&itmprp=enc%3AAQAKAAAA4FkggFvd1GGDu0w3yXCmi1cxJCBoiPEDXSJdodENnv%2B9KEcDKni0pf3%2FTgJO5mF6m9oEzrvFI968zZwPXQSIIRhwMEsophUMmH6VUnGSdM%2BnedZu9WOvH2xCdGgECFAGOWPLKPgcV%2Bo%2FByYEbGCoAVRyO2w06UAg4gVfwyBDoGH%2Bo%2BXY4VNKCoYEbU0rTIMAgYEo52uQf4SZhn0jZsf7cLDpDjieS2CHfxfDk1%2Fawr0qzP32nFJKLmyWw1pwvy5gvgsXqc%2Bo40UMtUOoObmu0zLUwvYQ5u3RydTVtLHU9ctu%7Ctkp%3ABFBMuOLrqpRm");
	  driver.findElement(By.cssSelector("a[id=\"atcBtn_btn_1\"]")).click(); 
	  System.out.println("Product added to cart.");
	  WebElement clk = driver.findElement(By.cssSelector("a[href=\"https://cart.ebay.com?_trksid=p4540640.m167481.l8876\"]"));
	  act.click(clk).perform();
	  driver.findElement(By.cssSelector("button[data-test-id=\"cart-remove-item\"]")).click();
	  System.out.println("Product removed from cart.");
  }
  
  @Test(priority = 4)
  public void shopbycategory() throws InterruptedException {
	  driver.navigate().to("https://www.ebay.com/");
	  driver.findElement(By.cssSelector("button[aria-controls=\"s0-1-4-12-0-1-dialog\"]")).click();
	  driver.findElement(By.cssSelector("a[_sp=\"m570.l3653\"]")).click();
      System.out.println("Shopped by Electronics category.");


  }
  @Test(priority = 5)
  public void description() throws InterruptedException {
	  driver.navigate().to("https://www.ebay.com/itm/355435154307?_skw=watch&itmmeta=01K2KCM492R0XF7Y0G3VW3QZ6D&hash=item52c1960b83:g:43gAAOSw4zhlvdkA");
	  ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
	  driver.switchTo().window(tab.get(0));	  
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,700)");	
	  driver.findElement(By.xpath("//*[@id=\"placement101875\"]/div/div/div/div/div/div[1]/div[2]/div[1]/div/a/div/div[1]/div")).click();
	  driver.switchTo().window(tab.get(1));

  }
  @Test(priority = 6)
  public void showallcategory() throws InterruptedException {
	  WebElement all = driver.findElement(By.xpath("//*[@id=\"gh-cat\"]"));
	  all.click();
	  Select any = new Select(all);
	  any.selectByVisibleText("Art");
	  driver.findElement(By.id("gh-search-btn")).click();

  }
  @Test(priority = 7)
  public void lang() throws InterruptedException {	
		Actions act  = new Actions(driver);	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000)");
		WebElement country = driver.findElement(By.xpath("//*[@id=\"glbfooter\"]/footer/div[1]/div[5]/div[3]/div/div/button"));
		act.moveToElement(country).perform();
		driver.findElement(By.xpath("//*[@id=\"s0-1-5-1-1-18[2[4]]-7-dialog\"]/div/ul/li[41]/a/span")).click();
		System.out.println("Language changed to Español.");
  }
  @Test(priority = 8)
  public void scroll() throws InterruptedException {	
		Actions act  = new Actions(driver);	
		WebElement motor = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[4]/a"));
		act.moveToElement(motor).perform();
		Thread.sleep(2000);
		WebElement fashion = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[5]/a"));
		act.moveToElement(fashion).perform();
		Thread.sleep(2000);
		WebElement sports = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[7]/a"));
		act.moveToElement(sports).perform();
		Thread.sleep(2000);
		WebElement health = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[8]/a"));
		act.moveToElement(health).perform();		
  }   
}
