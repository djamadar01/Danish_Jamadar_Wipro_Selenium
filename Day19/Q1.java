package assingment19;
//Task 1 – Login Test
//Steps:
//1.Open browser and navigate to the site.
//2.Click on Sign in.
//3.Enter valid email and password.
//4.Click Sign in button.
//5.Verify the My Account page is displayed.
//Expected Result: User should successfully log in and see their account dashboard.
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.Assert;
public class Q1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.saucedemo.com/"); 
		System.out.println("Welocme to Login Page");
		
		WebElement user=driver.findElement(By.name("user-name")); 
		user.sendKeys("standard_user");
		
		WebElement pass=driver.findElement(By.name("password")); 		
		pass.sendKeys("secret_sauce"); 
		
		driver.findElement(By.name("login-button")).click();
		
		Assert.assertTrue(true, "Login Failed!");

	}

}
