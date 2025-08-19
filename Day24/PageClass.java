package TestNG_package;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageClass {
	WebDriver driver;
	By email=By.id("userid");
	By pass = By.id("pass");
	By signin = By.id("signin-continue-btn");
	By cont = By.id("sgnBt");
	
	
	By search = By.id("gh-ac");
	
	
	By addtocart = By.id("atcBtn_btn_1");
	By cart = By.cssSelector("a[href=\"https://cart.ebay.com?_trksid=p4540640.m167481.l8876\"]");
	
	By remove = By.cssSelector("button[data-test-id=\"cart-remove-item\"]");
	
	By category = By.cssSelector("button[aria-controls=\"s0-1-4-12-0-1-dialog\"]");
	By categoryname = By.cssSelector("a[href=\"https://www.ebay.com/b/Motorcycles/6024/bn_1865434\"]");
	
	
	By product = By.xpath("//*[@id=\"placement101875\"]/div/div/div/div/div/div[1]/div[2]/div[1]/div/a/div/div[1]/div");
	
	By allcategory = By.xpath("//*[@id=\"gh-cat\"]");
	By artcategory = By.xpath("//*[@id=\"gh-cat\"]");
	By searchcategory = By.id("gh-search-btn");
	
	By country = By.xpath("//*[@id=\"glbfooter\"]/footer/div[1]/div[5]/div[3]/div/div/button");
	By flag = By.linkText("Spain");
	
	
	By motor = By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[4]/a");
	By fashion = By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[5]/a");
	By sports = By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[7]/a");
	By health = By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[8]/a");

	
	public PageClass(WebDriver driver) {
		this.driver = driver;
	}
	public void email_in() {
		driver.findElement(email).click();
		driver.findElement(email).sendKeys("djamadar01@gmail.com");
		driver.findElement(signin).click();	  		
	}
	public void pass_in() {
		driver.findElement(pass).click();
		driver.findElement(pass).sendKeys("Pass@123");
	}
	public void con_in() {
		driver.findElement(cont).click();
	}
	public void search_in() {
	List<String> ser = new ArrayList<>();
      ser.add("watch");
      ser.add("phone");
      ser.add("Headphones");
	  for (String item : ser) {
	      driver.findElement(search);
	      driver.findElement(search).clear();
	      driver.findElement(search).sendKeys(item);
	      driver.findElement(search).sendKeys(Keys.ENTER);
          System.out.println("Searched for: " + item);
      }
	}
	
	public void addcart() {		        
	      driver.navigate().to("https://www.ebay.com/itm/197358943678?_skw=watch&epid=27052389855&itmmeta=01K2RKZXH958HS5DK436M4D6NJ&hash=item2df3827dbe:g:eRgAAeSw3VBoerbN&itmprp=enc%3AAQAKAAAA4FkggFvd1GGDu0w3yXCmi1cnX%2FLZnOUioz2%2FrZ9Gdp2JL6x5C%2BtaEbeBGfjj1AR2XRxRZKqmtEvs97zpd5ZuwwGyb4Vb2RkAwKLl5A%2FZMaaLNWAETF44lKYwCM5V2uCVoEvsOCgLZL34%2BD56p3uaxY0dH0CFdNgkD5OFYLAAmzFMH0BYNz%2F81v8Y8wvTAy4pRLoK7oWmzNMEmS15PKM%2B3G3uqmmgJeyJuulY8oQVQPp1KOSh7oNe5b6BVvuRByClIDBnRUnvlfu5AidDxkNjG1m9QxTPiaXsL3ENc2D4LxUP%7Ctkp%3ABk9SR4bZ_5OWZg");
	      driver.findElement(addtocart).click();
	     	  
	}
	public void deletecart() {
		  driver.findElement(cart).click();
		  driver.findElement(remove).click();
		  		  
	}
	public void shopbycategory() {
		  driver.findElement(category).click();
		  driver.findElement(categoryname).click();	  		  
	}
	public void description() {
		driver.navigate().to("https://www.ebay.com/itm/197358943678?_trkparms=amclksrc%3DITM%26aid%3D777008%26algo%3DPERSONAL.TOPIC%26ao%3D1%26asc%3D20250324085124%26meid%3Da99a2105263845a180a3dad53273a9ca%26pid%3D101770%26rk%3D1%26rkt%3D1%26itm%3D197358943678%26pmt%3D1%26noa%3D1%26pg%3D4375194%26algv%3DRecentlyViewedItemsV2WithMLRPboosterAndUpdatedFeatures_BP%26brand%3DTAG%2BHeuer&_trksid=p4375194.c101770.m146925&_trkparms=parentrq%3Ab15688361980a88c1df32ff9fff6ee38%7Cpageci%3A57b659e7-7a61-11f0-bd0b-1a8c53e3ef22%7Ciid%3A1%7Cvlpname%3Avlp_homepage");
		ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(0));	  
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("window.scrollBy(0,800)");
		  driver.findElement(product).click();

	}
	public void allcategory() {
		WebElement all = driver.findElement(allcategory);
		all.click();
		Select any = new Select(all);
		any.selectByVisibleText("Art");		
		driver.findElement(searchcategory).click();
	}
	
	public void  lang() {
		Actions act  = new Actions(driver);	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000)");
		WebElement con = driver.findElement(country);
		act.moveToElement(con).perform();
		driver.findElement(flag).click();;		
		
	}
	
	public void scroll() {
		Actions act  = new Actions(driver);	
		WebElement motor1 = driver.findElement(motor);
		act.moveToElement(motor1).perform();
		WebElement fashion1 = driver.findElement(fashion);
		act.moveToElement(fashion1).perform();
		WebElement sports1 = driver.findElement(sports);
		act.moveToElement(sports1).perform();
		WebElement health1 = driver.findElement(health);
		act.moveToElement(health1).perform();
	}
	

}
