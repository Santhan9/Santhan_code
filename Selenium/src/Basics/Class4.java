package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Desktop\\Softwares\\chromedriver.exe");
		
		WebDriver driver1 = new ChromeDriver();
		
		//driver1.get("https://www.google.com/gmail/about/#");
		
		driver1.navigate().to("http://toolsqa.com/automation-practice-form/");
		
		driver1.manage().window().maximize();
		
		List<WebElement> textField1 = driver1.findElements(By.name("tool"));
		
		int s=textField1.size();
		System.out.println(s);
		textField1.get(1).click();
		/*for(int i=0;i<s;i++) {
			if(i==1) {
				textField1.get(i).click();
			}
			
		}*/
		
		//driver1.close();
		

	}

}
