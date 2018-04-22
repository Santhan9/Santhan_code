package Test;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import page.*;

public class loginTest {
	WebDriver driver;
	private Driver obj;//= new Driver();
	private LoginPage lp;//= new LoginPage();
	
	
  @Test (priority=1)
  public void loginTest1() {
	  
	  this.lp=new LoginPage(this.driver);
	  
	  System.out.println("login");
	  
	  lp.login("9866721248", "Passion@411");
	  
  }
  
  @Test (priority=0,retryAnalyzer = reTry.class) 
  
  public void loginTest2() {
	  
	  this.lp=new LoginPage(this.driver);
	  
	  System.out.println("login");
	  
	  lp.login("98667212", "Passion@411");
	  
	  Assert.assertTrue(false);
	  
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  this.obj= new Driver();
	   
	  this.driver= obj.setBrowser("Chrome");
	  obj.openURL("https://www.facebook.com/");
	  
  }

  
  
  @AfterMethod
  public void afterMethod() {
	  
	  obj.closeBrowser();
  }

}
