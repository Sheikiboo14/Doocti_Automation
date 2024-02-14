package AgentLogin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Ticket_Creation extends AgentLogin {
	
	/*
	
	String status = "Open";
	
	String account_Name = "Testing";
	
	String subject_Name = "Testing";
	
	String description = "Testing";
	
	String phone_Number="9876543210";
	
	String ticket_Priority = "Medium";
	
	String ticket_Channel = "Tester";
	
	*/

	@Parameters({"status","account_Name","subject_Name","description","phone_Number","ticket_Priority","ticket_Channel"})
	@Test
	public void Create_Ticket(String status ,String account_Name,String subject_Name,String description ,String phone_Number,String ticket_Priority ,String ticket_Channel) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		// Ticket Page
		
		driver.findElement(By.xpath("//div[text()='confirmation_number']")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='add_circle']")));
		
		driver.findElement(By.xpath("//div[text()='add_circle']")).click();
		
		// Status
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[name()='svg'][@class='css-8mmkcg'])[1]")));

		
		driver.findElement(By.xpath("(//*[name()='svg'][@class='css-8mmkcg'])[1]")).click();
		
		driver.findElement(By.xpath("//div[text()='"+status+"']")).click();
		
		// Account Name
		
		driver.findElement(By.xpath("(//input[@placeholder='Account_name'])[1]")).sendKeys(account_Name);
		
		// Subject
		
		driver.findElement(By.xpath("(//input[@placeholder='Subject'])[1]")).sendKeys(subject_Name);
		
		// Description
		
		driver.findElement(By.xpath("(//textarea[@placeholder='Description'])[1]")).sendKeys(description);
	
		// Phone Number
		
		driver.findElement(By.xpath("(//input[@placeholder='PhoneNumber'])[1]")).sendKeys(phone_Number);
	
		// Due Date
		
		driver.findElement(By.xpath("(//input[@placeholder='DueDate'])[1]")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='react-datepicker'])[1]")));
		
		driver.findElement(By.xpath("(//div[@aria-label='Choose Monday, February 12th, 2024'])[1]")).click();
		
		//Priority
		
		driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])[3]")).click();
		
		driver.findElement(By.xpath("//div[text()='"+ticket_Priority+"']")).click();
	
		// Channel
		
		driver.findElement(By.xpath("(//*[name()='svg'][@class='css-8mmkcg'])[5]")).click();
		
		driver.findElement(By.xpath("//div[text()='"+ticket_Channel+"']")).click();
		
		// Save Ticket
		
		driver.findElement(By.xpath("//div[text()='save']")).click();
		
		driver.findElement(By.xpath("//div[text()='confirmation_number']")).click();
		
		
		//Logout
		
		driver.findElement(By.xpath("(//img[@class='navbar-profile'])[1]")).click();
			
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Log Out']")));	
					
		driver.findElement(By.xpath("//div[text()='Log Out']")).click();
	
	}

}
