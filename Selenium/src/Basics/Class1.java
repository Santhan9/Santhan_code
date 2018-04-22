package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Desktop\\Softwares\\chromedriver.exe");
		
		WebDriver driver1 = new ChromeDriver();
		
		//driver1.get("https://www.google.com/gmail/about/#");
		
		driver1.navigate().to("http://toolsqa.com/automation-practice-form/");
		
		driver1.manage().window().maximize();
		
		WebElement textField1 =driver1.findElement(By.name("lastname"));
		
		textField1.sendKeys(Keys.ENTER);
		
		Boolean t= textField1.isDisplayed();
		System.out.println(t);
		
		textField1.sendKeys("Selenium");
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(1000);
		
WebElement textField2 =driver1.findElement(By.name("firstname"));
		
		textField2.sendKeys("Selenium");
		
		WebElement searchButton =driver1.findElement(By.id("exp-2"));
		
		searchButton.click();
		
		driver1.findElement(By.name(""));
		
		
		/*WebDriver driver2 = new ChromeDriver();
		driver2.get("https://login.yahoo.com/");*/
		String s= driver1.getCurrentUrl();
		if(s.equals("https://www.google.com/gmail/about/#"))
		{
			System.out.println("Test Passed");
		}
		//System.out.println(s);
		driver1.quit();
	}

}
