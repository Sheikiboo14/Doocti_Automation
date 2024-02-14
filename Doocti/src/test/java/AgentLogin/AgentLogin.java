package AgentLogin;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AgentLogin {
	
	String URL ="https://web-v2.doocti.com/v2.1.106/";
	
	String user_Name = "developv2_agent02@doocti.com";
	
	String user_Password ="Doocti@123";
	
	String user_Campaign ="Dialer";
	
	String user_Queue ="developv2_8633537660";
	
	public static WebDriver driver;
	
	@BeforeTest
	public void Login() {
		
		
		ChromeOptions browser = new ChromeOptions();
		
		browser.addArguments("use-fake-ui-for-media-stream","--incognito");

		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver(browser);
		
		driver.manage().window().maximize();
		
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
		
		driver.findElement(By.xpath("//div[@id='react-select-6-placeholder']/following-sibling::div[1]")).click();
		
		driver.findElement(By.xpath("//div[text()='"+user_Queue+"']")).click();
		
		driver.findElement(By.xpath("//div//button[.=' Save']")).click();
		
		WebElement toast = driver.findElement(By.xpath("//div[contains(@class,'toast-header warning_cold')]"));
		
		wait.until(ExpectedConditions.visibilityOf(toast));
		
		String actual_Value=toast.getText();
		
		System.out.println(actual_Value);
		
		Assert.assertEquals(actual_Value, "Agent Ready Successfully");
				
	}
	
	
//	@AfterTest
//	public void Quit() {
//		
//		
//		driver.quit();
//	}

}
