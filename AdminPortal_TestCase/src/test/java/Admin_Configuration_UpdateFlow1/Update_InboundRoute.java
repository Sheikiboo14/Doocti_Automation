package Admin_Configuration_UpdateFlow1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Update_InboundRoute extends AdminLogin{


	 
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		// Configuration
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Inbound Route 
		
		driver.findElement(By.xpath("(//span[normalize-space()='Inbound Route'])[1]")).click();
		
		Thread.sleep(1000);
	}
	
	@Parameters({"iR_Application","dID_Number","blockList"})
	@Test
	public void Update_IR(String iR_Application,Long dID_Number,boolean blockList) throws InterruptedException {
		
		
		// Update Popup
		
		driver.findElement(By.xpath("//td[text()='dID_Number']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
		
		Thread.sleep(1000);
		
		WebElement UpdatePopup= driver.findElement(By.xpath("(//div[@class='v-card__text'])[2]"));
		
		//DID Number
		WebElement Did_Number = driver.findElement(By.xpath("(//input[@aria-label='DID Number'])[1]"));
		
		Did_Number.sendKeys(Long.toString(dID_Number));
		
		// Update DID Number
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

		
	}


}
