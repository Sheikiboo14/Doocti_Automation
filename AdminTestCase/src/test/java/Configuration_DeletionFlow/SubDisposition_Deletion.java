package Configuration_DeletionFlow;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class SubDisposition_Deletion extends AdminLogin{


	String Sub_DispoName="Test Working";
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		// Configuration
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Sub Disposition Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Sub-Dispositions'])[1]")).click();
		
	}
	
	@Test
	public void Delete_SubDisposition() throws InterruptedException {
		
		// Filter 
		
		driver.findElement(By.xpath("(//i[@class='fas fa-filter'])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@aria-label='Sub Disposition'])[1]")).sendKeys(Sub_DispoName);
		
		// Apply Filter
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Filter'])[1]")).click();
		
		Thread.sleep(1000);

		// Delete Sub Disposition
		
		driver.findElement(By.xpath("(//i[@class='v-icon mr-4 v-icon--link material-icons theme--light red--text'])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//div[normalize-space()='Yes, Delete !'])[1]")).click();
		
		Thread.sleep(1000);
		
		//Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

		
		
	}

}
