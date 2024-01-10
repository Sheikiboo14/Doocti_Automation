package Configuration_CreationFlow;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;


public class Create_Tags extends AdminLogin {

	
	String TagName = "Test";
	
	String TagDescription = "Testing";
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Opening Block List Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Tags'])[1]")).click();
		
	}
	
	@Test
	public void Tags_Creation() throws InterruptedException {
		
		// Add Tag Popup
		
		driver.findElement(By.xpath("(//div[normalize-space()='Add Tag'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Tag Name
		
		driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")).sendKeys(TagName);
		
		// Tag Description
		
		driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")).sendKeys(TagDescription);
		
		// Tag Creating 
		
		driver.findElement(By.xpath("(//div[normalize-space()='Create'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[normalize-space()='Close'])[1]")).click();
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

		
	}
}
