package Selenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Class2 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Desktop\\Softwares\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://toolsqa.com/automation-practice-form/");
		
		WebElement e = driver.findElement(By.id("continents"));
		
		Class2 obj= new Class2();
		
		obj.drop_down(e);
		
		
		/*Select s= new Select(e);

		//s.selectByVisibleText("North America");
		
		List<WebElement> L = s.getOptions();
		
		System.out.println(L.size());
		
		for(WebElement k : L) {
		
			System.out.println(k.getText());
			
		}	*/
		

	}
	
	public void drop_down(WebElement a) {
		
		
		Select s= new Select(a);

		List<WebElement> L = s.getOptions();
		
		System.out.println(L.size());
		
		for(WebElement k : L) {
		
			System.out.println(k.getText());
			
		}	
		
	}

}
