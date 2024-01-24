package Admin_Configuration_DeleteFlow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Delete_InboundRouter extends AdminLogin {
	

	Long Did_Num=12345L;
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		// Configuration
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Inbound Route 
		
		driver.findElement(By.xpath("(//span[normalize-space()='Inbound Route'])[1]")).click();
		
	}
	
	@Test
	public void Delete_InboundRouter() throws InterruptedException{

		// Delete Inbound Router
		
		driver.findElement(By.xpath("//td[text()='"+Did_Num+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light red--text']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[text()='Yes, Delete !']")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		Thread.sleep(1000);
		
		//Verification
		
		List<WebElement> Alldatas = driver.findElements(By.xpath("//table[contains(@class,'v-datatable')]//td[1]"));
		
		boolean flag = true;
		
		for (WebElement Data : Alldatas) {
			
			String value = Data.getText();
			
			if(value.contains(Long.toString(Did_Num))) {
				
				flag = false;
			}
		}
		
		Assert.assertFalse(flag,"Inbound Route is Not Deleted..!");
		
		
	}


}
