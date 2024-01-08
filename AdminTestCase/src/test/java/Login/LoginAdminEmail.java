package Login;



import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginAdminEmail {
	
	WebDriver driver;
	
	String URL ="https://sandboxv2.doocti.com";
	
	String AdminPageURL ="https://portal-dev.doocti.com/v2.1.105/realtime/live-agents";
	
	String password="Doocti@123";
	
	String Nopass="";
	
	String Noemail="";

	String Email1="devsandbox_admin";
	
	String Email2="devsandbox_admin@";
	
	String Email3="devsandbox_admin@doocti";
	
	String Email4="devsandbox_@doocti.com";
	
	String Email5="@doocti.com";
	
	String Email6="devsandbox_admin@doocti.com";
	
	@BeforeTest
	public void SetUp() {
		
		
		
		WebDriverManager.chromedriver().setup();
		

		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	
		
		
	}
	
	@Test(priority=0)
	public void NoEmail_Pass() throws InterruptedException {
		
		driver.get(URL);
		
		driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys(Noemail);
		
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys(Nopass);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		assertEquals(driver.getCurrentUrl(), URL);
		
	}
	
	@Test(priority=1)
	public void Email1() throws InterruptedException {
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get(URL);
		
		driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys(Email1);
		
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		assertEquals(driver.getCurrentUrl(), URL);
		
	}
	@Test(priority=2)
	public void Email2() {
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get(URL);
		
		driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys(Email2);
		
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		assertEquals(driver.getCurrentUrl(), URL);
		
	}
	@Test(priority=3)
	public void Email3() {
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get(URL);
		
		driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys(Email3);
		
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		assertEquals(driver.getCurrentUrl(), URL);
		
	}
	
	@Test(priority=4)
	public void Email4() {
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get(URL);
		
		driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys(Email4);
		
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		assertEquals(driver.getCurrentUrl(), URL);
		
	}
	
	@Test(priority=5)
	public void Email5() {
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get(URL);
		
		driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys(Email5);
		
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		assertEquals(driver.getCurrentUrl(), URL);
		
	}
	@Test(priority=6)
	public void Email6() throws InterruptedException {
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get(URL);
		
		driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys(Email6);

		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys(password);

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
		assertEquals(driver.getCurrentUrl(), AdminPageURL);
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//i[@title='Sign Out']")).click();
		
		
	
	}
	
	@AfterTest
	public void quit() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
	}	
	
}

