package Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
import org.openqa.selenium.interactions.Action;
 
import org.openqa.selenium.interactions.Actions;
 
public class Class1 {
 
public static void main(String[] args) throws InterruptedException {
 
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Desktop\\Softwares\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
 
String URL = "http://www.dhtmlx.com/docs/products/dhtmlxTree/index.shtml";
 
driver.get(URL);
 
// It is always advisable to Maximize the window before performing DragNDrop action
 
driver.manage().window().maximize();
 
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
WebElement From = driver.findElement(By.xpath(".//*[@id='treebox1']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
 
WebElement To = driver.findElement(By.xpath(".//*[@id='treebox2']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
 
Actions builder = new Actions(driver);

builder.dragAndDrop(From, To).build().perform();
 
//Action dragAndDrop = builder.clickAndHold(From).moveToElement(To).release(To).build();
 
//dragAndDrop.perform();
 
}
 
}