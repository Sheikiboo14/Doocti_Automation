package Admin_Configuration_DeleteFlow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Delete_DIDNumber extends AdminLogin{
	

	Long did_number = 8071893401L;
	

	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		// Configuration
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// DID Number Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='DID Number'])[1]")).click();
		
		Thread.sleep(1000);
		
	}
	
	@Test
	public void Delete_DIDNumber() throws InterruptedException {
		

		
		//Delete DID Number
		
		driver.findElement(By.xpath("//td[text()='"+did_number+"']//following-sibling::td[4]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light red--text']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//div[normalize-space()='Yes, Delete !'])[1]")).click();
		
		Thread.sleep(1000);
		
		//Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[4]")).click();
		
		Thread.sleep(1000);
		
//		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		//Verification
		
		List<WebElement> Alldatas = driver.findElements(By.xpath("//table[contains(@class,'v-datatable')]//td[2]"));
		
		boolean flag = true;
		
		for (WebElement Data : Alldatas) {
			
			String value = Data.getText();
			
			if(value.contains(Long.toString(did_number))) {
				
				flag = false;
			}
		}
		
		Assert.assertFalse(flag,"DID NUMBER is Not Deleted..!");

	}



}
