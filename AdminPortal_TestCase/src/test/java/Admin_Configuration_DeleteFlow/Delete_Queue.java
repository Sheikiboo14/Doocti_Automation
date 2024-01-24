package Admin_Configuration_DeleteFlow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Delete_Queue extends AdminLogin{
	

	String QueueName = "Test1";
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		// Configuration
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Queue Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Queues'])[1]")).click();
		
		Thread.sleep(1000);

	}
	
	@Test
	public void Queue_Deletion() throws InterruptedException {
		
		
		
		// Delete Queue
		
		driver.findElement(By.xpath("//td[text()='"+QueueName+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light red--text']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//div[normalize-space()='Yes, Delete !'])[1]")).click();
		
		Thread.sleep(1000);
		
		//Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		Thread.sleep(1000);
		
		List<WebElement> Alldatas = driver.findElements(By.xpath("//table[contains(@class,'v-datatable')]//td[1]"));
		
		boolean flag = true;
		
		for (WebElement Data : Alldatas) {
			
			String value = Data.getText();
			
			if(value.contains(QueueName)) {
				
				flag = false;
			}
		}
		
		Assert.assertFalse(flag,"Queue is Not Deleted..!");
	}


}
