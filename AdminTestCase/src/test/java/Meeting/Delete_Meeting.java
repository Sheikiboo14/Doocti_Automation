package Meeting;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Delete_Meeting extends AdminLogin{
	
	
	@BeforeTest
	public void SetUp() throws InterruptedException {
		
		driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[normalize-space()='Meetings']")).click();
		
		Thread.sleep(1000);
	}
	
	@Test
	public void Delete_Meeting() throws InterruptedException {
		
		//delete meeting
		
		driver.findElement(By.xpath("(//i[@class='v-icon mr-4 v-icon--link material-icons theme--light red--text'][normalize-space()='delete'])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//div[normalize-space()='Yes, Delete !'])[1]")).click();
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		
		
	}

}
