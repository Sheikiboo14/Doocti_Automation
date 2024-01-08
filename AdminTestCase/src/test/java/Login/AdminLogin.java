package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdminLogin {

	
	String URL ="https://console-v2.doocti.com/v2.1.105/";

	String AdminEmail = "smibrahim_admin@doocti.com";
	
	String AdminPassword = "Doocti@123";
	
	
	public WebDriver driver;
	
	@BeforeTest
	public void Login() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions Browser = new ChromeOptions();
		
		Browser.addArguments("--incognito");
		
		driver = new ChromeDriver(Browser);
		
		driver.manage().window().maximize();
		
		driver.get(URL);
		
		driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys(AdminEmail);
		
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys(AdminPassword);
		
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		
		Thread.sleep(3000);

		driver.navigate().refresh();
		
	}
	
//	@AfterTest
//	public void Quit() throws InterruptedException {
//		
//		Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("//i[@title='Sign Out']")).click();
//		
//		driver.quit();
//		
//	}
	
}

