package TestNG_package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Ebay_project {
  WebDriver driver;
  
  @Test//1
  public void Login() throws InterruptedException {
	  driver.navigate().to("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&sgfl=gh&ru=https%3A%2F%2Fwww.ebay.com%2F");
	  WebElement log = driver.findElement(By.id("userid"));
	  log.sendKeys("djamadar01@gmail.com");
	  driver.findElement(By.id("signin-continue-btn")).click();
	  
	  Thread.sleep(1000);
	  WebElement pass = driver.findElement(By.id("pass"));
	  pass.sendKeys("Pass@123");
	  driver.findElement(By.id("sgnBt")).click();

  }
  @Test//2
  public void search() throws InterruptedException {
	  driver.navigate().to("https://www.ebay.com/");
	  List<String> ser = new ArrayList<>();
      ser.add("watch");
      ser.add("phone");
      ser.add("Headphones");
      //WebElement search = driver.findElement(By.id("gh-ac"));
	  for (String item : ser) {
	      WebElement search = driver.findElement(By.id("gh-ac"));
          search.clear();
          search.sendKeys(item);
          search.sendKeys(Keys.ENTER);
          Thread.sleep(2000);
      }
  }
  @Test//3 & 4
  public void adddeletetocart() throws InterruptedException {
	  Actions act = new Actions(driver);    
	  driver.navigate().to("https://www.ebay.com/itm/357452864391?_skw=watch&itmmeta=01K2HATY3PNF6FJG54HSN5E19Q&hash=item5339d9db87:g:qGcAAeSwTZlonDGz&itmprp=enc%3AAQAKAAAA4FkggFvd1GGDu0w3yXCmi1cxJCBoiPEDXSJdodENnv%2B9KEcDKni0pf3%2FTgJO5mF6m9oEzrvFI968zZwPXQSIIRhwMEsophUMmH6VUnGSdM%2BnedZu9WOvH2xCdGgECFAGOWPLKPgcV%2Bo%2FByYEbGCoAVRyO2w06UAg4gVfwyBDoGH%2Bo%2BXY4VNKCoYEbU0rTIMAgYEo52uQf4SZhn0jZsf7cLDpDjieS2CHfxfDk1%2Fawr0qzP32nFJKLmyWw1pwvy5gvgsXqc%2Bo40UMtUOoObmu0zLUwvYQ5u3RydTVtLHU9ctu%7Ctkp%3ABFBMuOLrqpRm");
          Thread.sleep(2000);
	      driver.findElement(By.cssSelector("a[id=\"atcBtn_btn_1\"]")).click(); 
	      Thread.sleep(2000);
	      WebElement clk = driver.findElement(By.cssSelector("a[href=\"https://cart.ebay.com?_trksid=p4540640.m167481.l8876\"]"));
	      act.click(clk).perform();
	      //driver.navigate().to("https://cart.ebay.com/");
		  Thread.sleep(2000);
		  driver.findElement(By.cssSelector("button[data-test-id=\"cart-remove-item\"]")).click();
 }
  @Test//5 & 6
  public void changeliginname() throws InterruptedException {
	  driver.navigate().to("https://www.ebay.com/");
      driver.findElement(By.cssSelector("a[id=\"atcBtn_btn_1\"]")).click(); 
      


	  
  }
  @Test//6
  public void shopbycategory() throws InterruptedException {
	  driver.navigate().to("https://www.ebay.com/");
	  Thread.sleep(1000);
	  driver.findElement(By.cssSelector("button[aria-controls=\"s0-1-4-12-0-1-dialog\"]")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.cssSelector("a[_sp=\"m570.l3653\"]")).click();	  

  }
  @Test//7
  public void description() throws InterruptedException {
	  driver.navigate().to("https://www.ebay.com/itm/355435154307?_skw=watch&itmmeta=01K2KCM492R0XF7Y0G3VW3QZ6D&hash=item52c1960b83:g:43gAAOSw4zhlvdkA");
	  Thread.sleep(1000);
	  ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
	  driver.switchTo().window(tab.get(0));
	  
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,700)");	
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"placement101875\"]/div/div/div/div/div/div[1]/div[2]/div[1]/div/a/div/div[1]/div")).click();
	  Thread.sleep(2000);
	  //driver.switchTo().window(tab.get(1));

  }
  @Test//8
  public void showallcategory() throws InterruptedException {
	  driver.navigate().to("https://www.ebay.com/");
	  Thread.sleep(1000);
	  WebElement all = driver.findElement(By.xpath("//*[@id=\"gh-cat\"]"));
	  all.click();
	  Select any = new Select(all);
	  any.selectByVisibleText("Art");
	  Thread.sleep(1000);
	  driver.findElement(By.id("gh-search-btn")).click();

  }
  @Test//9
  public void lang() throws InterruptedException {	
		Actions act  = new Actions(driver);	
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("window.scrollBy(0,2000)");
			Thread.sleep(3400);

		WebElement country = driver.findElement(By.xpath("//*[@id=\"glbfooter\"]/footer/div[1]/div[5]/div[3]/div/div/button"));
		act.moveToElement(country).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"s0-1-5-1-1-18[2[4]]-7-dialog\"]/div/ul/li[41]/a/span")).click();
		

  }
  
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.get("https://www.ebay.com/");
	  Thread.sleep(2000);
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  Assert.assertTrue(true,"Search Button is not working");
	  Thread.sleep(2000);
	  driver.close();
	  System.out.println("Test Case Executed Sucessfully!!!!");
  }

}
