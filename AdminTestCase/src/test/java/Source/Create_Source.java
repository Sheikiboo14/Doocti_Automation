package Source;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Create_Source extends AdminLogin {
	
	
	String SourceName ="Facebook";
	
	String Description ="Testing";

	@BeforeTest
	public void Setup() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//div[contains(text(),'Users & Groups')]")).click();
		
		Thread.sleep(1000);
		
		//Going to Source Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Source'])[1]")).click();
	}
	
	@Test
	public void Create_Source() throws InterruptedException {
		
	// Add Source Popup
		
		driver.findElement(By.xpath("(//div[normalize-space()='Add Source'])[1]")).click();
		
		Thread.sleep(1000);
		
	// Source Name
		
		driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")).sendKeys(SourceName);
		
	// Source Description
		
		driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")).sendKeys(Description);
		
	// Create Source
		
		driver.findElement(By.xpath("(//div[normalize-space()='Create'])[1]")).click();
		
		Thread.sleep(1000);
		
	// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		
	}
}
