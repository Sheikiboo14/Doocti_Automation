package Configuration_DeletionFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Queue_Deletion extends AdminLogin{
	

	String QueueName = "Test";
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		// Configuration
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Queue Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Queues'])[1]")).click();
		
	}
	
	@Test
	public void Queue_Deletion() throws InterruptedException {
		
		// Filter 
		
		driver.findElement(By.xpath("(//i[@class='fas fa-filter'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement FilterPopup = driver.findElement(By.xpath("(//div[@class='container sidenavContainer'])[1]"));
		
		driver.findElement(By.xpath("(//input[@role='combobox'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement QueueList= driver.findElement(By.xpath("(//input[@role='combobox'])[1]"));
		
		QueueList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+QueueName+"'])[1]")).click();
		
		FilterPopup.click();
		
		// Apply Filter
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Filter'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Delete Queue
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Filter'])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//div[normalize-space()='Yes, Delete !'])[1]")).click();
		
		Thread.sleep(1000);
		
		//Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

	}


}
