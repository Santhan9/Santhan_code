package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Desktop\\Softwares\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://toolsqa.com/automation-practice-form/");
		
		//driver.get("https://mail.google.com/mail/u/0/");
		
		/*String s= driver.getTitle();
		
		System.out.println(s);
		
		
		
		
		
		
		
		String ps=driver.getPageSource();
		
		System.out.println(ps);*/
		
		WebElement e1= driver.findElement(By.name("firstname"));
		
		//e1.clear();
		
		boolean t = e1.isDisplayed();
		
		System.out.println(t);
		
		WebElement e2= driver.findElement(By.id("sex-0"));
		
		boolean t1= e2.isEnabled();
		
		WebElement e3= driver.findElement(By.id("sex-0"));
		
		boolean t2= e3.isSelected();
		
		
		System.out.println(t1);
		System.out.println(t2);
		
		//driver.close();
		
		//driver.quit();
		
		
		
		
		

	}

}
