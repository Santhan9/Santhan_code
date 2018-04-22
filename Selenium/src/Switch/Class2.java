package Switch;

import java.util.Set;

import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.Alert;
 
import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class Class2 {
 
		public static WebDriver driver;
 
		public static void main(String[] args) {
 
			
            System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Desktop\\Softwares\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
 
	        
 
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
	       
 
	        driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
	        
	        driver.manage().window().maximize();
 
	        
 
	        driver.findElement(By.xpath(".//*[@id='alert']")).click();
 
	        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
	        Alert myAlert = driver.switchTo().alert();
 
	        
 
	        String s=myAlert.getText();
	        
	        //String s=myAlert.
	        myAlert.accept();
	        
	        
	        System.out.println(s);
	        
	        //myAlert.accept();
 
	        
 
	        //driver.close();
 
	}
 
}
