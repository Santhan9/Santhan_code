package Switch;

import java.util.Set;

import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class Class1 {
 
		public static WebDriver driver;
 
		public static void main(String[] args) {
 
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Desktop\\Softwares\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
 
	        // Put an Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
 
	        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
	        // Launch the URL
 
	        driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
 
	        driver.manage().window().maximize();
 
	        String handle= driver.getWindowHandle();
 
	        System.out.println(handle);
	        
	        
 
	        // Click on the Button "New Message Window"
 
	        driver.findElement(By.id("button1")).click();
 
	        // Store and Print the name of all the windows open	              
 
	        Set<String> handles = driver.getWindowHandles();
 
	        System.out.println(handles);
 
	        // Pass a window handle to the other window
 
	        for (String handle1 : handles ) {
 
	        	System.out.println(handle1);
 
	        	driver.switchTo().window(handle1);
 
	        	}
	        driver.manage().window().maximize();
 
	        // Closing Pop Up window
 
	        //driver.close();
 
	        // Close Original window
 
	        //driver.quit();
 
	}
 
}