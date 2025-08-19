package Site_package;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import java.util.*;



public class demo_QA {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(2000);
		driver.manage().window().maximize();

		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		
		WebElement fname = driver.findElement(By.id("firstName"));
		fname.sendKeys("neeva");
		
		
		WebElement lname = driver.findElement(By.id("lastName"));
		lname.sendKeys("Sharma");
		
		
		WebElement mail = driver.findElement(By.id("userEmail"));
		mail.sendKeys("danish123@gmail.com");
		
		
		WebElement fmale = driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]"));
		fmale.click();
		
		js.executeScript("window.scrollBy(0,700)");

		
		WebElement number = driver.findElement(By.id("userNumber"));
		number.sendKeys("9763060269");
		
		driver.findElement(By.id("dateOfBirthInput")).click();
		WebElement year = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
		Select sel = new Select(year);
		//sel.selectByIndex(125);
		sel.selectByVisibleText("2025");
		
		WebElement month = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
		Select sel1 = new Select(month);
		//sel1.selectByValue("0");
		sel1.selectByVisibleText("December");

		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[3]")).click();
		
		
		String[] subjects = {"Math","phy","Eco"};
		WebElement sub = driver.findElement(By.id("subjectsInput"));
		for(String subject:subjects) {
			sub.sendKeys(subject);
			Thread.sleep(1000);

			sub.sendKeys(Keys.ENTER);
		}
//		sub.sendKeys("Maths");
//		sub.sendKeys(Keys.ENTER);
//		sub.sendKeys("Phy");
//		sub.sendKeys(Keys.ENTER);
//		sub.sendKeys("CO");
//		sub.sendKeys(Keys.ARROW_DOWN);
//		sub.sendKeys(Keys.ENTER);
		
		
		WebElement hobby = driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label"));
		hobby.click();
		
		
		
		js.executeScript("window.scrollBy(0,900)");

		//picture
		WebElement img = driver.findElement(By.id("uploadPicture"));
		img.sendKeys("C:\\Users\\djama\\Downloads\\profile.jpg");
		
		//address
		WebElement address = driver.findElement(By.id("currentAddress"));
		address.sendKeys("182.b Nasfjls 416416");
		
		
		//State
		WebElement state = driver.findElement(By.id("react-select-3-input"));
		state.sendKeys("ncr");
		state.sendKeys(Keys.ENTER);
		
		
		//city
		WebElement city = driver.findElement(By.id("react-select-4-input"));
		city.sendKeys("Delhi");
		city.sendKeys(Keys.ENTER);
		
		
		driver.findElement(By.id("submit")).click();

		
		Thread.sleep(2000);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("screenshot.png");
		Files.copy(src.toPath(), dest.toPath(),StandardCopyOption.COPY_ATTRIBUTES);
		
		
		
		

		



		


	}

}
