package Admin_CRM_DeleteFlow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Delete_Campaign extends AdminLogin{
	
	String campaign_Name ="Preview 2";
	
	
	@BeforeTest
	public void Setup() {
		
		driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();
		
		driver.findElement(By.xpath("(//span[normalize-space()='Campaigns'])[1]")).click();
		
		try {
			
			Thread.sleep(1000);
		
		} 
		
		catch (InterruptedException e) {
		
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}

	}
	
	@Test
	public void Delete_Campaign() throws InterruptedException{
		
		// Delete Campaign
		
		driver.findElement(By.xpath("//td[text()='"+campaign_Name+"']//following-sibling::td[8]//i[@class='v-icon mr-2 v-icon--link material-icons theme--light red--text']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//div[normalize-space()='Yes, Delete !'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[4]")).click();
		
		//Verification
		
		List<WebElement> Alldatas = driver.findElements(By.xpath("//table[contains(@class,'v-datatable')]//tr//td[1]"));
		
		boolean flag = false;
		
		for(WebElement Data : Alldatas) {
			
			String value = Data.getText();
			
			if(value.contains(campaign_Name)) {
				
				flag = true;
			}
		}
		
		Assert.assertFalse(flag,"Campaign is not Deleted...!");
	}

}
