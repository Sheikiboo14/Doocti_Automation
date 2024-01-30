package Admin_Configuration_DeleteFlow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Delete_MeetingTitle extends AdminLogin {
	

	
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		// Configuration
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Meeting Title Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Meeting Title'])[1]")).click();
		Thread.sleep(1000);		

	}
	
	@Parameters({"title_Name"})
	@Test
	public void Delete_MeetingTitle(String title_Name) throws InterruptedException {
		
		
		// Delete Meeting
		
		driver.findElement(By.xpath("//td[text()='"+title_Name+"']//following-sibling::td[4]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light red--text']")).click();
		
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
			
			if(value.contains(title_Name)) {
				
				flag = true;
			}
		}
		
		Assert.assertFalse(flag,"Meeting Title is Not Deleted..!");
		}


}
