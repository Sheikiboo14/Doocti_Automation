package Login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdminLogin {

//Login Credentials
	
	String URL ="https://console-v2.doocti.com/v2.1.106/";

	String AdminEmail = "developv2_admin@doocti.com";
	
	String AdminPassword = "Doocti@123";
	
	String expected_URL ="https://console-v2.doocti.com/v2.1.106/realtime/live-agents";
	
	public WebDriver driver;
	
	
//	@Parameters("browserName")
	@BeforeTest
	public void Login() throws InterruptedException {
		/*
		switch(browserName) {
		
		case "chrome":
			
			WebDriverManager.chromedriver().setup();
			
			ChromeOptions Browser = new ChromeOptions();
			
			Browser.addArguments("--incognito");
			
			driver = new ChromeDriver(Browser);
			
			break ;
		
		case "edge":

			WebDriverManager.edgedriver().setup();
			
			driver = new EdgeDriver();
			
			break ;
			

		case "firefox":

			WebDriverManager.firefoxdriver().setup();
			
			driver = new FirefoxDriver();
			
			break ;
			
		default :
			
			System.err.println("Browser Name Invalid");
			
		}
		*/
		
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions Browser = new ChromeOptions();
		
		Browser.addArguments("--incognito");
		
		driver = new ChromeDriver(Browser);
			
		/*


		
		
		WebDriverManager.edgedriver().setup();
		
		driver = new EdgeDriver();
		
		*/
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
		driver.get(URL);
		
		
		driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys(AdminEmail);
		
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys(AdminPassword);
		
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
				
		wait.until(ExpectedConditions.urlToBe(expected_URL));
		
		driver.navigate().refresh();
		
	}
	
	@AfterTest
	public void Quit() throws InterruptedException {
		
		Thread.sleep(1000);
		
//		driver.findElement(By.xpath("//i[@title='Sign Out']")).click();
		
		driver.quit();
		
	}
	
}

