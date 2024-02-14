package AgentLogin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Validation {

	/*
	String URL ="https://web-dev.doocti.com/v2.1.106/";
	
	String user_Name1 = "smibrahimagent@doocti.com";
	
	String user_Name2 = "smibrahimagent07@doocti";
	
	String user_Name3 = "smibrahimagent07@";
	
	String user_Name4 = "smibrahimagent07@doocti.com";
	
	String user_Password ="Doocti@123";
	
	String invalid_Password ="Doocti@12";
	
	String expected_URL ="https://web-dev.doocti.com/v2.1.106/select";
	
	
	*/
	
	public WebDriver driver;
	
	@Parameters({"URL"})
	@BeforeMethod
	public void Setup(String URL) {
		
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions browser = new ChromeOptions();
		
		browser.addArguments("--incognito");
		
		driver = new ChromeDriver(browser);
		
		driver.manage().window().maximize();
				
		driver.get(URL);
		
	}
	
	
	@Parameters({"URL","user_Name1","user_Password"})
	@Test(priority=0)
	public void Email_Validation1(String URL, String user_Name1, String user_Password) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		Actions action =new Actions(driver);
		
		// UserName
		
		driver.findElement(By.id("formBasicEmail")).sendKeys(user_Name1);
		
		// User Password
		
		driver.findElement(By.id("formBasicPassword")).sendKeys(user_Password);
		
		// Submit 
		
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).submit();
		
		// Verification
		
		String actual_Value = driver.getCurrentUrl();
		
		Assert.assertEquals(actual_Value, "https://web-dev.doocti.com/v2.1.106/");

			
	}

	@Parameters({"URL","user_Name2","user_Password"})
	@Test(priority=1)
	public void Email_Validation2(String URL, String user_Name2, String user_Password) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		Actions action =new Actions(driver);
		
		// UserName
		
		driver.findElement(By.id("formBasicEmail")).sendKeys(user_Name2);
		
		// User Password
		
		driver.findElement(By.id("formBasicPassword")).sendKeys(user_Password);
		
		// Submit 
		
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).submit();
		
		// Verification
		
		String actual_Value = driver.getCurrentUrl();
		
		Assert.assertEquals(actual_Value, "https://web-dev.doocti.com/v2.1.106/");
		

			
	}
	
	@Parameters({"URL","user_Name3","user_Password"})
	@Test(priority=2)
	public void Email_Validation3(String URL, String user_Name3, String user_Password) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		Actions action =new Actions(driver);
		
		// UserName
		
		driver.findElement(By.id("formBasicEmail")).sendKeys(user_Name3);
		
		// User Password
		
		driver.findElement(By.id("formBasicPassword")).sendKeys(user_Password);
		
		// Submit 
		
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).submit();
		
		// Verification
		
		String actual_Value = driver.getCurrentUrl();
		
		Assert.assertEquals(actual_Value, "https://web-dev.doocti.com/v2.1.106/");
		

			
	}
	
	@Parameters({"URL","user_Name4","user_Password","expected_URL"})
	@Test(priority=3)
	public void Email_Validation4(String URL, String user_Name4, String user_Password,String expected_URL) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		Actions action =new Actions(driver);
		
		// UserName
		
		driver.findElement(By.id("formBasicEmail")).sendKeys(user_Name4);
		
		// User Password
		
		driver.findElement(By.id("formBasicPassword")).sendKeys(user_Password);
		
		// Submit 
		
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).submit();
		
		
		// Verification
				
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='css-7pg0cj-a11yText']/following-sibling::div[1]")));
				
		driver.findElement(By.xpath("//span[@class='css-7pg0cj-a11yText']/following-sibling::div[1]")).click();
		
		String  actual_URL = driver.getCurrentUrl();	
		
		Assert.assertEquals(actual_URL, expected_URL);
			
			
	}
	
	
	@Parameters({"URL","user_Name4","invalid_Password"})
	@Test(priority=4)
	public void Password_Validation(String URL, String user_Name4, String invalid_Password) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		Actions action =new Actions(driver);
		
		// UserName
		
		driver.findElement(By.id("formBasicEmail")).sendKeys(user_Name4);
		
		// User Password
		
		driver.findElement(By.id("formBasicPassword")).sendKeys(invalid_Password);
		
		// Submit 
		
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).submit();
		
		
		// Verification
		
		String actual_Value = driver.getCurrentUrl();
		
		Assert.assertEquals(actual_Value, "https://web-dev.doocti.com/v2.1.106/");
		
	}
	
	@AfterMethod
	public void Quit() {
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}

}
