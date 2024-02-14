package AgentLogin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OutBound_Call  {
	
	String dial_Number = "9514380497";
	
	String lead_Number ="9514380497";
	
	String meeting_Number="9514380497";
	
	String URL ="https://web-v2.doocti.com/v2.1.106/";
	
	String user_Name = "developv2_agent02@doocti.com";
	
	String user_Password ="Doocti@123";
	
	String user_Campaign ="Dialer";
	
	String user_Queue ="developv2_8633537660";
	
	String call_Dispo ="CALLBACK";
	
	public static WebDriver driver;
	
	
	@BeforeTest
	public void Setup() {
		
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

	@Test
	public void Outbound_Call() {
		
			
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	
		// Open Dial Pad
		
		driver.findElement(By.xpath("//span[text()='Dial Pad']")).click();
		
		driver.findElement(By.xpath("(//span[text()='Dial Pad']/following::input)[1]")).sendKeys(dial_Number);
		
		// Click Call Now
		
		driver.findElement(By.xpath("//button[contains(@class,'callnow ')]")).click();
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'mic_off')]")));
		
//		driver.findElement(By.xpath("//a[contains(text(),'mic_off')]")).click();
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Cut the Call
		
		driver.findElement(By.xpath("//span[text()='call_end']")).click();
		
		// Giving Dispo
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='"+call_Dispo+"']/following-sibling::div")));
		
		driver.findElement(By.xpath("//div[text()='"+call_Dispo+"']//following-sibling::div[text()='check']")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Ok!']")));
		
		driver.findElement(By.xpath("//button[text()='Ok!']")).click();
		
	}
	
	@Test
	public void Contact_Call() {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		// Contact Page
		
		driver.findElement(By.xpath("//div[text()='contacts']")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='"+lead_Number+"']//following::span[text()='phone']")));
		
		
		driver.findElement(By.xpath("//p[text()='"+lead_Number+"']//following::span[text()='phone']")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'mic_off')]")));
		
//		driver.findElement(By.xpath("//a[contains(text(),'mic_off')]")).click();
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Cut the Call
		
		driver.findElement(By.xpath("//span[text()='call_end']")).click();
		
		// Giving Dispo
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='"+call_Dispo+"']/following-sibling::div")));
		
		driver.findElement(By.xpath("//div[text()='"+call_Dispo+"']//following-sibling::div[text()='check']")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Ok!']")));
		
		driver.findElement(By.xpath("//button[text()='Ok!']")).click();
		
	}
	
	@Test
	public void Meeting_Call() {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		Robot rb;
		try {
			rb = new Robot();
			
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_SHIFT);
			rb.keyPress(KeyEvent.VK_J);
			
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
		// Meeting Page
		
		driver.findElement(By.xpath("//div[text()='group']")).click();
		
	/*	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='"+meeting_Number+"']//following::span[text()='phone']")));
		
		List<WebElement> Alldata = driver.findElements(By.xpath("//table[contains(@class,'lead table')]//tr//td[5]"));
		
		for(WebElement Data : Alldata) {
			
			String value =Data.getText();
			
			if(value.contains("Upcoming")) {
				
				System.out.println(driver.findElement(By.xpath("//table[contains(@class,'lead table')]//tr//td[3]")).getText());
			}
			
		}
		driver.findElement(By.xpath("//p[text()='"+meeting_Number+"']//following::span[text()='phone']")).click();
		*/
		
	}
}
