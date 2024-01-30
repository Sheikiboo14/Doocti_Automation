package Admin_Configuration_DeleteFlow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Delete_InboundRouter extends AdminLogin {
	

	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		// Configuration
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Inbound Route 
		
		driver.findElement(By.xpath("(//span[normalize-space()='Inbound Route'])[1]")).click();
		
		Thread.sleep(1000);		
	}
	
	@Parameters({"did_Num"})
	@Test
	public void Delete_InboundRouter(String did_Num) throws InterruptedException{

		// Delete Inbound Router
		
		driver.findElement(By.xpath("//td[text()='"+did_Num+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light red--text']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[text()='Yes, Delete !']")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		Thread.sleep(1000);
		
		//Verification
		
		List<WebElement> Alldatas = driver.findElements(By.xpath("//table[contains(@class,'v-datatable')]//td[1]"));
		
		boolean flag = false;
		
		for (WebElement Data : Alldatas) {
			
			String value = Data.getText();
			
			if(value.contains(did_Num)) {
				
				flag = true;
			}
		}
		
		Assert.assertFalse(flag,"Inbound Route is Not Deleted..!");
		
		
	}


}
