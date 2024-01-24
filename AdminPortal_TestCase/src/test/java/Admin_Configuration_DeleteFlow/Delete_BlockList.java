package Admin_Configuration_DeleteFlow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Delete_BlockList extends AdminLogin{
	

	Long Phno =9090909091L;
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Opening Block List Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Block List'])[1]")).click();
		
	}
	
	@Test
	public void BlockList_Delete()throws InterruptedException {

		
		// Delete BlockList
		
		driver.findElement(By.xpath("//td[text()='"+Phno+"']//following-sibling::td[1]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light red--text']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//div[normalize-space()='Yes, Delete !'])[1]")).click();
		
		Thread.sleep(1000);
		
		//Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[2]")).click();
		
		Thread.sleep(1000);
		
//		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

		//Verification
		
		List<WebElement> Alldatas = driver.findElements(By.xpath("//table[contains(@class,'v-datatable')]//td[2]"));
		
		boolean flag = true;
		
		for (WebElement Data : Alldatas) {
			
			String value = Data.getText();
			
			if(value.contains(Long.toString(Phno))) {
				
				flag = false;
			}
		}
		
		Assert.assertFalse(flag,"BlockList is Not Deleted..!");
	}



}
