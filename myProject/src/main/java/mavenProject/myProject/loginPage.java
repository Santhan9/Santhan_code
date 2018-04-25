package mavenProject.myProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class loginPage extends Driver {
	
	WebElement userName = driver.findElement(By.id("email"));
	
	WebElement password = driver.findElement(By.id("password"));
	
	WebElement button = driver.findElement(By.id("Log In"));
	
	public void login(String userName,String password) {
	   this.userName.sendKeys("");
	   this.password.sendKeys("");
	   this.button.click();
	}

}
