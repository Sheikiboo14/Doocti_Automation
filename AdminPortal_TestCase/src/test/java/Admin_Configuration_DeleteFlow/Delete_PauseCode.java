package Admin_Configuration_DeleteFlow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Delete_PauseCode extends AdminLogin{
	
	
	

	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Opening Pause Code Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Pause Codes'])[1]")).click();
		Thread.sleep(1000);		

	}
	
	@Parameters({"pauseCode_Name"})
	@Test
	public void Delete_PauseCode(String pauseCode_Name) throws InterruptedException {
		
		
		// Delete PauseCode
		
		driver.findElement(By.xpath("//td[text()='"+pauseCode_Name+"']//following-sibling::td[4]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light red--text']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//div[normalize-space()='Yes, Delete !'])[1]")).click();
		
		Thread.sleep(1000);
		
		//Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		Thread.sleep(1000);
		
		//Verification
		
		List<WebElement> Alldatas = driver.findElements(By.xpath("//table[contains(@class,'v-datatable')]//td[1]"));
		
		boolean flag = false;
		
		for (WebElement Data : Alldatas) {
			
			String value = Data.getText();
			
			if(value.contains(pauseCode_Name)) {
				
				flag = true;
			}
		}
		
		Assert.assertFalse(flag,"PauseCode is Not Deleted..!");
	}


}
