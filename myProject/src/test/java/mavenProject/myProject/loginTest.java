package mavenProject.myProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;

public class loginTest {
	
	Driver obj;
	loginPage lp;
  @Test
  
  //@Parameters({"username","password"})
  
  public void login() {
	  System.out.println("First");
	  lp.login("yghghj","hfhh");
	  
	  
  }
  @BeforeMethod
  
  //@Parameters({"url"})
  public void beforeMethod() {
	  
	  obj.setBrowser();
	  obj.openURL("https://www.facebook.com/");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  obj.closeBrowser();
  }

}
