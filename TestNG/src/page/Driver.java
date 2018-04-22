package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	
	WebDriver driver;
	
	
	
	public WebDriver setBrowser(String browser) {
		
		if(browser=="Chrome") {
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Desktop\\Softwares\\chromedriver.exe");
		
        System.out.println("First");
		 this.driver = new ChromeDriver();
		 
		}
		
		
		
		
		 System.out.println("second");
		 return this.driver;
		 
	}
	
	public void openURL(String URL) {
		this.driver.get(URL);
	}
	
	public void closeBrowser() {
		
		this.driver.close();
		
	}

}
