package Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class2{

public static WebDriver driver;

public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Desktop\\Softwares\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();

 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

 driver.get("https://www.amazon.in/");

 WebElement element = driver.findElement(By.xpath(".//*[@id='nav-link-shopall']/span[2]"));

 Actions action = new Actions(driver);

 action.moveToElement(element).build().perform();
 
 

 //driver.findElement(By.click();

 }

}