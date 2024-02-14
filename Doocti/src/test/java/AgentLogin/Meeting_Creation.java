package AgentLogin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Meeting_Creation extends AgentLogin {
	
	String meeting_Title="Decision-making meeting";
	
	String meeting_Number ="9809809809";
	
	String meeting_Module="contact";
	
	String meeting_Hours="20";
	
	String meeting_Min = "00";
	
	String meeting_des = "Testing";
	
	
	@Test
	public void Create_Meeting() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		Actions action = new Actions(driver);
		
		// Meeting Page
		
		driver.findElement(By.xpath("//div[text()='group']")).click();
		
		// Meeting Creation
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='add_circle']")));
		
		driver.findElement(By.xpath("//div[text()='add_circle']")).click();
		
		//Meeting Title
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[name()='svg'][@class='css-8mmkcg'])[1]")));
		
		driver.findElement(By.xpath("(//*[name()='svg'][@class='css-8mmkcg'])[1]")).click();
		
		driver.findElement(By.xpath("//div[text()='"+meeting_Title+"']")).click();
	
		//Phone Number
		
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys(meeting_Number);
		
		action.click().build().perform();
		
		// Module
		
		driver.findElement(By.xpath("(//*[name()='svg'][@class='css-8mmkcg'])[2]")).click();
		
		driver.findElement(By.xpath("//div[text()='"+meeting_Module+"']")).click();
		
		//Time
		
		driver.findElement(By.xpath("(//*[name()='svg'][@class='css-8mmkcg'])[3]")).click();
		
		driver.findElement(By.xpath("//div[text()='"+meeting_Hours+"']")).click();
		
		driver.findElement(By.xpath("(//*[name()='svg'][@class='css-8mmkcg'])[4]")).click();
		
		driver.findElement(By.xpath("//div[text()='"+meeting_Min+"']")).click();
		
		driver.findElement(By.xpath("(//label[text()='Schedule Date']/following::input)[3]")).click();
		
		driver.findElement(By.xpath("//div[@aria-label='Choose Monday, February 12th, 2024']")).click();
		
		// Description
		
		driver.findElement(By.xpath("(//textarea[@placeholder='Enter Your Comments'])[1]")).sendKeys(meeting_des);

		// Create Meeting 
		
		driver.findElement(By.xpath("//button[text()='Create']")).click();

	
	}

}
