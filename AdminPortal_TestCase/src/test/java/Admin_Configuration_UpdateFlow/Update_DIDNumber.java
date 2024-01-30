package Admin_Configuration_UpdateFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Update_DIDNumber extends AdminLogin {

	
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		// Configuration
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// DID Number Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='DID Number'])[1]")).click();
		
	}
	
	@Parameters({"did_number","did_status"})
	@Test
	public void Update_DIDStatus(Long did_number,String did_status) throws InterruptedException {
		

		
		// Update DID Number
		
		driver.findElement(By.xpath("//td[text()='"+did_number+"']//following-sibling::td[1]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light red--text']")).click();
		
		Thread.sleep(1000);
		
		WebElement UpdatePopup = driver.findElement(By.xpath("(//div[@class='v-card__text'])[2]"));
		
		//Status
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement StatusList = driver.findElement(By.xpath("(//div[@role='list'])[2]"));
		
		driver.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+did_status+"'])[1]")).click();
		
		UpdatePopup.click();
		
		// Active
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[2]")).click();
		
		Thread.sleep(1000);
		
		WebElement ActiveList = driver.findElement(By.xpath("(//div[@role='list'])[1]"));
		
		if(did_status.equalsIgnoreCase("Active")) {
			
			driver.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='Yes'])[1]")).click();
			
			UpdatePopup.click();
		}
		else {
		
			driver.findElement(By.xpath("(//div[contains(text(),'No')])[1]")).click();
			
			UpdatePopup.click();
		}
		
		// Update Did Number
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[4]")).click();
		
		//Verification
		
		String actualvalue = driver.findElement(By.xpath("//td[text()='did_number']//following-sibling::td[2]")).getText();
		
		Assert.assertEquals(actualvalue, did_status, "DID Number Status is Not Updated...!");
		
//		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

		
	}

}
