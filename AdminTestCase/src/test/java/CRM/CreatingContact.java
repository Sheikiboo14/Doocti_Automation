package CRM;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Login.AdminLogin;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatingContact extends AdminLogin{


	
	String ContactName = "Ibrahim";
	
	Long PhoneNumber = 9514380497L;
	
	String Expected = "Uploaded Successfully";
	
	
	@BeforeTest
	public void SetUp() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[normalize-space()='Contacts']")).click();
		
	}
	
	@Test(priority = 0 , enabled = true)
	public void CreateContact() throws InterruptedException, AWTException {
		
		Robot rb = new Robot();
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_SHIFT);
		rb.keyPress(KeyEvent.VK_J);

		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//i[@class='fas fa-plus']")).click();
		
		Thread.sleep(5000);
		
// Contact Name
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(ContactName);
		
// Contact Number		
		
		WebElement phno =driver.findElement(By.xpath("//input[@placeholder='PhoneNumber']"));
		
		phno.sendKeys(Long.toString(PhoneNumber));
		
	}
	
	@Test(priority = 1,enabled = false)
	public void UplodeContact() throws AWTException, InterruptedException {
		
		
		driver.findElement(By.xpath("//div[normalize-space()='Upload']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='file-dummy']")).click();
		
		Thread.sleep(1000);
		
// Robot
	
		Robot rb = new Robot();
		
		StringSelection FilePath = new StringSelection("C:\\Users\\User\\Desktop\\ContactList.csv");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(FilePath, null);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(1000);
		
// Assertion
		
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='file-dummy']")).getText(), Expected);
		
		
// Close the Popup
		
		driver.findElement(By.xpath("//div[contains(text(),'Close')]")).click();
		
		
		
	}
	
}

