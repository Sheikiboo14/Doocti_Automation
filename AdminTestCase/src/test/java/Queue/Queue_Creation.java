package Queue;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Queue_Creation extends AdminLogin{
	
	String QueueName ="Test1";
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Opening Queue Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Queues'])[1]")).click();
		
	}
	
	@Test
	public void Create_Queue() throws InterruptedException {
		
		//Add Queue Popup
		
		driver.findElement(By.xpath("(//div[normalize-space()='Add Queue'])[1]")).click();
		
		Thread.sleep(1000);
		
		//Queue Name
		
		driver.findElement(By.xpath("(//input[@aria-label='Queues'])[2]")).sendKeys(QueueName);
	
		// Creating Queue
		
		driver.findElement(By.xpath("(//div[normalize-space()='Create'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
	}

}
