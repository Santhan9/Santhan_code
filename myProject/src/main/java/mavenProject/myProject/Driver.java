package mavenProject.myProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	
	WebDriver driver;
	
	public void setBrowser() {
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Desktop\\Softwares\\chromedriver.exe");
		
        System.out.println("First");
		 this.driver = new ChromeDriver();
		 System.out.println("second");
		 
	}
	
	public void openURL(String URL) {
		this.driver.get(URL);
	}
	
	public void closeBrowser() {
		
		this.driver.close();
		
	}

}
