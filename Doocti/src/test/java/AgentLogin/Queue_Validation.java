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

public class Queue_Validation {
	
	/*
	String URL ="https://web-dev.doocti.com/v2.1.106/";
	
	String user_Name = "smibrahimagent07@doocti.com";
	
	String user_Password ="Doocti@123";
	
	String user_Campaign ="106-testing";
	
	String user_Queue1 ="smibrahim_8071893401";
	
	String user_Queue2 ="Test Queue";
	
	String expected_Value="Please fill required fields";
	
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
	
	@Parameters({"URL","user_Name","user_Password","user_Campaign","expected_Value"})
	@Test(priority=0)
	public void withoutQueue(String URL, String user_Name, String user_Password , String user_Campaign, String expected_Value) {
		
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
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class=' css-1u9des2-indicatorSeparator']/following-sibling::div)[2]")));
		
		driver.findElement(By.xpath("//div//button[.=' Save']")).click();
		
		String actual_Value=driver.findElement(By.xpath("//div[@class=' css-b62m3t-container']/following-sibling::span[1]")).getText();
		
//		System.out.println(actual_Value);
		
		Assert.assertEquals(actual_Value, expected_Value);
		
		driver.findElement(By.xpath("//span[text()='logout']")).click();

	}
	
	@Parameters({"URL","user_Name","user_Password","user_Campaign","user_Queue1","user_Queue2"})
	@Test(priority=1)
	public void MultipleQueue(String URL, String user_Name, String user_Password , String user_Campaign, String user_Queue1,String user_Queue2) {
		
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
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class=' css-1u9des2-indicatorSeparator']/following-sibling::div)[2]")));
		
		driver.findElement(By.xpath("(//span[@class=' css-1u9des2-indicatorSeparator']/following-sibling::div)[2]")).click();
		
		driver.findElement(By.xpath("//div[text()='"+user_Queue1+"']")).click();
		
		action.click().build().perform();
		
		driver.findElement(By.xpath("(//span[@class=' css-1u9des2-indicatorSeparator']/following-sibling::div)[2]")).click();
		
		driver.findElement(By.xpath("//div[text()='"+user_Queue2+"']")).click();
		
		driver.findElement(By.xpath("//div//button[.=' Save']")).click();
		
		WebElement toast = driver.findElement(By.xpath("//div[contains(@class,'toast-header warning_cold')]"));
		
		wait.until(ExpectedConditions.visibilityOf(toast));
		
		String actual_Value=toast.getText();
		
		System.out.println(actual_Value);
		
		Assert.assertEquals(actual_Value, "Agent Ready Successfully");
		
		//Logout
		
		driver.findElement(By.xpath("//p[@class='unread']/following-sibling::img[1]")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[text()='Log Out']"))));
		
		driver.findElement(By.xpath("//div[text()='Log Out']")).click();
	}

	@Parameters({"URL","user_Name","user_Password","user_Campaign","user_Queue1"})
	@Test(priority=2)
	public void withQueue(String URL, String user_Name, String user_Password , String user_Campaign, String user_Queue1) {
		
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
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class=' css-1u9des2-indicatorSeparator']/following-sibling::div)[2]")));
		
		driver.findElement(By.xpath("//div[@id='react-select-6-placeholder']/following-sibling::div[1]")).click();
		
		driver.findElement(By.xpath("//div[text()='"+user_Queue1+"']")).click();
		
		driver.findElement(By.xpath("//div//button[.=' Save']")).click();
		
		WebElement toast = driver.findElement(By.xpath("//div[contains(@class,'toast-header warning_cold')]"));
		
		wait.until(ExpectedConditions.visibilityOf(toast));
		
		String actual_Value=toast.getText();
		
		System.out.println(actual_Value);
		
		Assert.assertEquals(actual_Value, "Agent Ready Successfully");
		
		//Logout
		
		driver.findElement(By.xpath("//p[@class='unread']/following-sibling::img[1]")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[text()='Log Out']"))));
		
		driver.findElement(By.xpath("//div[text()='Log Out']")).click();
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


