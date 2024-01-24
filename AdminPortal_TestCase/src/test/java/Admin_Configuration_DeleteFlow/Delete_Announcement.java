package Admin_Configuration_DeleteFlow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Delete_Announcement extends AdminLogin {
	

	String Announcement_Name= "Testing";

	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		// Configuration
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Announcement 
		
		driver.findElement(By.xpath("(//span[normalize-space()='Announcements'])[1]")).click();
		
		Thread.sleep(1000);
			
	}
	
	@Test
	public void Announcement_Delete() throws InterruptedException {
				
		// Delete Announcement
		
		driver.findElement(By.xpath("//td[text()='"+Announcement_Name+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light red--text']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//div[normalize-space()='Yes, Delete !'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[4]")).click();
		
//		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		//Verification
		
		List<WebElement> Alldatas = driver.findElements(By.xpath("//table[contains(@class,'v-datatable')]//td[1]"));
		
		boolean flag = true;
		
		for(WebElement Data : Alldatas) {
			
			String value = Data.getText();
			
			if(value.contains(Announcement_Name)) {
				
				flag = false;
			}
		}
		
		Assert.assertFalse(flag,"Announcement is Not Deleted...!");
		
		
		

	}


}
