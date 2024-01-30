package Admin_Configuration_DeleteFlow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Delete_Tags extends AdminLogin {
	

	 	

	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		// Configuration
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Tags 
		
		driver.findElement(By.xpath("(//span[normalize-space()='Tags'])[1]")).click();
	
		Thread.sleep(1000);		

	}
	
	@Parameters({"tag_Name"})
	@Test
	public void Delete_Tags(String tag_Name) throws InterruptedException{
		

		
		// Delete Tags
		
		driver.findElement(By.xpath("//td[text()='"+tag_Name+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light red--text']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//div[normalize-space()='Yes, Delete !'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close snakbar
		
		driver.findElement(By.xpath("(//div[normalize-space()='Close'])[1]")).click();
		
		Thread.sleep(1000);
		

		List<WebElement> Alldatas = driver.findElements(By.xpath("//table[contains(@class,'v-datatable')]//td[1]"));
		
		boolean flag = false;
		
		for (WebElement Data : Alldatas) {
			
			String value = Data.getText();
			
			if(value.contains(tag_Name)) {
				
				flag = true;
			}
		}
		
		Assert.assertFalse(flag,"Tag is Not Deleted..!");
		
		
		
		
	}



}
