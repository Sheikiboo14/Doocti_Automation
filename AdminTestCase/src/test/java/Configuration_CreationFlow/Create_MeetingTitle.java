package Configuration_CreationFlow;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Create_MeetingTitle extends AdminLogin{
	
	String MeetingTitle = "Test";
	
	String MeetingSubTitle = "Testing";
	
	String Description = "Testing Purpose";
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Opening Meeting Title Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Meeting Title'])[1]")).click();
	}
	
	@Test
	public void MeetingTitle_Creation() throws InterruptedException {
		
		// Add Meeting Title Popup
		
		driver.findElement(By.xpath("(//div[normalize-space()='Add Meeting Title'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Meeting Title 
		
		driver.findElement(By.xpath("(//input[@aria-label='Meeting Title'])[2]")).sendKeys(MeetingTitle);
		
		//Meeting Sub Title
		
		driver.findElement(By.xpath("(//input[@aria-label='Meeting Sub Title'])[1]")).sendKeys(MeetingSubTitle);
		
		// MeetingDescription
		
		driver.findElement(By.xpath("(//input[@aria-label='Description'])[3]")).sendKeys(Description);
		
		// Creating Meeting
		
		driver.findElement(By.xpath("(//div[normalize-space()='Create'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
	}
	

}
