package Login;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginAdminPassword extends AdminLogin{
	
	WebDriver driver;
	
	String URL ="https://sandboxv2.doocti.com";
	
	String AdminPageURL ="https://portal-dev.doocti.com/v2.1.105/realtime/live-agents";
	
	String Email = "devsandbox_admin@doocti.com";
	
	String password1="122334";
	
	String password2="aaaaaa";
	
	String password3="@@@@@";
	
	String password4="Doocti@123";

	@BeforeTest
	public void SetUp() {
		
		
		
		WebDriverManager.chromedriver().setup();
		

		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
			
	}
	
	@Test(priority=0)
	public void Email1() throws InterruptedException {
		
		
		
		driver.get(URL);
		
		driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys(Email);
		
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys(password1);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		assertEquals(driver.getCurrentUrl(), URL);
		
	}
	@Test(priority=1)
	public void Email2() {
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get(URL);
		
		driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys(Email);
		
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys(password2);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		assertEquals(driver.getCurrentUrl(), URL);
		
	}
	@Test(priority=2)
	public void Email3() {
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get(URL);
		
		driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys(Email);
		
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys(password3);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		assertEquals(driver.getCurrentUrl(), URL);
		
	}
	@Test(priority=3)
	public void Email4() throws InterruptedException {
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get(URL);
		
		driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys(Email);

		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys(password4);

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
		assertEquals(driver.getCurrentUrl(), AdminPageURL);
	
		Thread.sleep(1000);

		driver.findElement(By.xpath("//i[@title='Sign Out']")).click();

	}
	@AfterTest
	public void Quit() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
		
	}
}
