package Amazon;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AddToCart {
	
	private String  url;
	
	private WebDriver driver=new ChromeDriver();
	
	private WebElement e1;//= driver.findElement(By.xpath(".//*[@id='nav-link-shopall']/span[2]"));
	
	private WebElement e2;//= driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[2]/span[7]/span"));
	
	private WebElement e3;
	
	private List<WebElement> e4;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Desktop\\Softwares\\chromedriver.exe");
		
		 
		
		
		
		//driver= new ChromeDriver();
		
		AddToCart obj = new AddToCart("https://www.amazon.in/");
		
		//obj.driver.get(obj.url);
		
		obj.selectItem();
	 

	}
	
	public AddToCart(String url) {
		this.url=url;
		this.driver.get(this.url);
		this.driver.manage().window().maximize();
		this.e1=this.driver.findElement(By.xpath(".//*[@id='nav-link-shopall']/span[1]"));
		this.e2=driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[2]/span[6]/span"));
		this.e3=driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[3]/div[6]/div[1]/div/a[5]/span"));
		
	}
	
	public void selectItem() {
		
		Actions action = new Actions(this.driver);
		
		action.moveToElement(this.e1).build().perform();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		action.moveToElement(this.e2).build().perform();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		this.e3.click();
		
		this.e4=driver.findElements(By.className("acs_tile__image"));
		System.out.println(this.e4);
		
		this.e4.get(0).click();
	}

}
