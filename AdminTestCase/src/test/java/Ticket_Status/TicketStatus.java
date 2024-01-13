package Ticket_Status;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class TicketStatus extends AdminLogin{
	
	String TicketStatus_Name = "Testing";
	
	String TicketStatus_Description = "Testing Purpose";
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Opening Ticket Status page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Ticket Status'])[1]")).click();
		
	}
	
	@Test
	public void Create_TicketStatus() throws InterruptedException {
		
		// Add Popup
		
		driver.findElement(By.xpath("(//div[normalize-space()='Add New'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Status Name
		
		driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")).sendKeys(TicketStatus_Name);
		
		//Status Description
		
		driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")).sendKeys(TicketStatus_Description);
		
		// Create Status
		
		driver.findElement(By.xpath("(//div[normalize-space()='Create'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

		
	}

}
