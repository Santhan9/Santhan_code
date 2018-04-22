package Basics;

import java.util.List;
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class Class2 {
 
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Desktop\\Softwares\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("http://toolsqa.wpengine.com/automation-practice-form");
		
		
		List<WebElement> rdBtn_Sex = driver.findElements(By.name("sex"));
		
		
		boolean bValue = false;
		
		
		bValue = rdBtn_Sex.get(0).isSelected();
		
		
		if(bValue == true){
			
			rdBtn_Sex.get(1).click();
		}else{
			
			rdBtn_Sex.get(0).click();
		}
		
		
		WebElement rdBtn_Exp = driver.findElement(By.id("exp-2"));
		rdBtn_Exp.click();
		
		
		List<WebElement> chkBx_Profession = driver.findElements(By.name("profession"));
		
		
		int iSize = chkBx_Profession.size();
		
		// Start the loop from first Check Box to last Check Boxe
		for(int i=0; i < iSize ; i++ ){
			// Store the Check Box name to the string variable, using 'Value' attribute
			String sValue = chkBx_Profession.get(i).getAttribute("value");
			
			// Select the Check Box it the value of the Check Box is same what you are looking for
			if (sValue.equalsIgnoreCase("Automation Tester")){
				chkBx_Profession.get(i).click();
			// This will take the execution out of for loop
			break;
			}
		}
		
		WebElement oCheck_Box = driver.findElement(By.cssSelector("input[value='Selenium IDE']"));
		oCheck_Box.click();
		
		
		driver.quit();
 
	}
 
}