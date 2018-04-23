package xmlExample;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.xml.sax.SAXException;

public class loginPage {
	
	private WebDriver driver;
	
	private WebElement userName;
	
	private WebElement password;
	
	private WebElement login_button;
	
	private WebElement marketPlace;
	
	public loginPage() {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Desktop\\Softwares\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
this.userName= driver.findElement(By.id("email"));
		
		this.password= driver.findElement(By.id("pass"));
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//this.login_button= driver.findElement(By.id("u_0_2"));
		
		//int size = driver.findElements(By.tagName("iframe")).size();
		
		//System.out.println(size);

		//this.marketPlace= driver.findElement(By.className("linkWrap noCount"));
	}
	
	
	public void  login (String user) throws ParserConfigurationException, SAXException, IOException {
		
		class1 obj= new class1();
		
		this.userName.sendKeys(obj.getData("userName"));
		this.password.sendKeys(obj.getData("password"));
		//this.login_button.click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//this.marketPlace.click();
		
		
		
		
	}

}
