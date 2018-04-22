package Naukari;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class update {
	
	//private String url;
	
	public void login(String url) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Desktop\\Softwares\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		WebElement e1=driver.findElement(By.xpath(".//*[@id='usernameField']"));
		//e1.clear();
		System.out.println("Step1");
		e1.sendKeys("bandarusanthan9@gmail.com");
		
		WebElement e2= driver.findElement(By.xpath(".//*[@id='passwordField']"));
		
		e2.sendKeys("Passion@411");
		
		WebElement e3=driver.findElement(By.xpath(".//*[@id='passwordField']"));
		
		e3.click();
		
		
			
			/*WebElement e1=driver.findElement(By.id("emailTxt"));
			//e1.clear();
			e1.sendKeys("bandarusanthan9@gmail.com");
			
			WebElement e2= driver.findElement(By.id("pwd1"));
			e2.clear();
			e2.sendKeys("Passion@411");
			
			WebElement e3=driver.findElement(By.id("sbtLog"));
			
			e3.click();*/
		
		
	}
	
	public void update_resume() {
		
	}
	
	public static void main(String[] args) {
		
		update obj= new update();
		
		obj.login("https://login.naukri.com/nLogin/Login.php");
		obj.update_resume();
		
	}

}
