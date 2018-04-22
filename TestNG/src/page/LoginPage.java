package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage  {
	
	WebDriver Driver;
	
	 WebElement userName;// = driver.findElement(By.id("email"));
	
	private WebElement password;// = driver.findElement(By.id("password"));
	
	private WebElement button;// = driver.findElement(By.id("Log In"));
	
	public LoginPage(WebDriver driver) {
		
		System.out.println(driver);
		this.Driver=driver;
		System.out.println(this.Driver);
		this.userName= Driver.findElement(By.id("email"));
		
		this.password= Driver.findElement(By.id("pass"));
		
		this.button= Driver.findElement(By.id("u_0_2"));

	}
	
	public void login(String userName,String password) {
		
		System.out.println(userName+password);
	   this.userName.sendKeys(userName);
	   this.password.sendKeys(password);
	   this.button.click();
	}

}
