package Admin_Configuration_DeleteFlow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Delete_BlockList extends AdminLogin{
	

	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Opening Block List Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Block List'])[1]")).click();
		Thread.sleep(1000);		

	}
	
	@Parameters({"phno"})
	@Test
	public void BlockList_Delete(String phno)throws InterruptedException {

		
		// Delete BlockList
		
		driver.findElement(By.xpath("//td[text()='"+phno+"']//following-sibling::td[1]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light red--text']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//div[normalize-space()='Yes, Delete !'])[1]")).click();
		
		Thread.sleep(1000);
		
		//Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[2]")).click();
		
		Thread.sleep(1000);
		
//		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

		//Verification
		
		List<WebElement> Alldatas = driver.findElements(By.xpath("//table[contains(@class,'v-datatable')]//td[2]"));
		
		boolean flag = false;
		
		for (WebElement Data : Alldatas) {
			
			String value = Data.getText();
			
			if(value.contains(phno)) {
				
				flag = true;
			}
		}
		
		Assert.assertFalse(flag,"BlockList is Not Deleted..!");
	}



}
