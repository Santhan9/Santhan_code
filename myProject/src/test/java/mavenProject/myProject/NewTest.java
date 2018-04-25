package mavenProject.myProject;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;



public class NewTest {

WebDriver driver;

@BeforeMethod

public void beforeMethod() throws Exception {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Desktop\\Softwares\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    driver.get("http://www.store.demoqa.com");	 

}

@Test


@Parameters({ "sUsername", "sPassword" })

public void Registration_data(String sUsername,String sPassword){

driver.findElement(By.xpath(".//*[@id='account']/a")).click();

driver.findElement(By.id("log")).sendKeys(sUsername);

System.out.println(sUsername);

driver.findElement(By.id("pwd")).sendKeys(sPassword);

System.out.println(sPassword);

driver.findElement(By.id("login")).click();

System.out.println(" Login Successfully, now it is the time to Log Off buddy.");

driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();

}

@DataProvider

public Object[][] Authentication() throws Exception {

 Object[][] testObjArray = Excel.getTableArray("C:\\Users\\ADMIN\\eclipse-workspace1\\myProject\\src\\test\\java\\testData\\TestData.xlsx","Sheet1");

 return (testObjArray);

}

@AfterMethod

public void afterMethod() {

  driver.close();

}

}