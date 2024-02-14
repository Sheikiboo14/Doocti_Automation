package AgentLogin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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

public class Campaign_Validation {
	/*
	String URL ="https://web-dev.doocti.com/v2.1.106/";
	
	String user_Name = "smibrahimagent07@doocti.com";
	
	String user_Password ="Doocti@123";
	
	String user_Campaign ="106-testing";
	
	String user_Queue ="smibrahim_8071893401";
	*/
	public WebDriver driver;
	
	@BeforeMethod
	public void Setup() {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions browser = new ChromeOptions();
		
		browser.addArguments("--incognito");
		
		driver = new ChromeDriver(browser);
		
		driver.manage().window().maximize();
		
	}

	@Parameters({"URL","user_Name","user_Password"})
	@Test(priority=0)
	public void NoCampaign(String URL, String user_Name, String user_Password) {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	
	Actions action =new Actions(driver);

	driver.get(URL);
	
	// UserName
	
	driver.findElement(By.id("formBasicEmail")).sendKeys(user_Name);
	
	// User Password
	
	driver.findElement(By.id("formBasicPassword")).sendKeys(user_Password);
	
	// Submit 
	
	driver.findElement(By.xpath("//button[normalize-space()='Submit']")).submit();
	
	// Select campaign
	
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='css-7pg0cj-a11yText']/following-sibling::div[1]")));
			
//	driver.findElement(By.xpath("//span[@class='css-7pg0cj-a11yText']/following-sibling::div[1]")).click();
//	
//	driver.findElement(By.xpath("//div[text()='"+user_Campaign+"']")).click();
	
	driver.findElement(By.xpath("//div//button[.='Submit']")).click();

	String actual_Url = driver.getCurrentUrl();
	
	Assert.assertEquals(actual_Url,"https://web-dev.doocti.com/v2.1.106/select");
	
	}
	
	@Parameters({"URL","user_Name","user_Password","user_Campaign","user_Queue"})
	@Test(priority=1)
	public void WithCampaign(String URL, String user_Name, String user_Password , String user_Campaign, String user_Queue) {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	
	Actions action =new Actions(driver);

	driver.get(URL);
	
	// UserName
	
	driver.findElement(By.id("formBasicEmail")).sendKeys(user_Name);
	
	// User Password
	
	driver.findElement(By.id("formBasicPassword")).sendKeys(user_Password);
	
	// Submit 
	
	driver.findElement(By.xpath("//button[normalize-space()='Submit']")).submit();
	
	// Select campaign
	
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='css-7pg0cj-a11yText']/following-sibling::div[1]")));
			
	driver.findElement(By.xpath("//span[@class='css-7pg0cj-a11yText']/following-sibling::div[1]")).click();
	
	driver.findElement(By.xpath("//div[text()='"+user_Campaign+"']")).click();
	
	driver.findElement(By.xpath("//div//button[.='Submit']")).click();
	
	// Queue Selection
	
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='react-select-6-placeholder']/following-sibling::div[1]")));
	
	String actual_Url = driver.getCurrentUrl();
	
	Assert.assertEquals(actual_Url,"https://web-dev.doocti.com/v2.1.106/dashboard");
	
	driver.findElement(By.xpath("//span[text()='logout']")).click();
	
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


