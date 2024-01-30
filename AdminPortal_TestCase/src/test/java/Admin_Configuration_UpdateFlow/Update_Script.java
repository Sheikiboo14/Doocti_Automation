package Admin_Configuration_UpdateFlow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Update_Script extends AdminLogin {


	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		// Configuration
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Script 
		
		driver.findElement(By.xpath("(//span[normalize-space()='Scripts'])[1]")).click();
	
		Thread.sleep(1000);
	}

	@Parameters({"script_Name","script_Status"})
	@Test
	public void Update_Status(String script_Name, String script_Status) throws InterruptedException {
	
		Actions action = new Actions(driver);

		//Update popup
		
		driver.findElement(By.xpath("//td[text()='"+script_Name+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
		
		Thread.sleep(1000);
		
		
		// Status
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement StatusList = driver.findElement(By.xpath("(//div[@role='list'])[2]"));
		
		StatusList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+script_Status+"'])[1]")).click();
		
		action.click().build().perform();
		
		// Update Script_Status
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		// Verification
		
		String actualvalue = driver.findElement(By.xpath("(//div[@class='v-select__selections'])[1]")).getText();
		
		Assert.assertEquals(actualvalue,script_Status, "Script Status is Not Updated...!");
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
	
		
		
		
		
	}
	/*
	
	@Parameters({"script_Name","updated_Script"})
	@Test(priority =0)
	public void Update_Script(String script_Name, String updated_Script) throws InterruptedException {
		
		
		
		// Update Script
		
		driver.findElement(By.xpath("//td[text()='"+script_Name+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
		
		Thread.sleep(1000);
				
		// Script
		
		driver.findElement(By.xpath("(//textarea[@aria-label='Text'])[1]")).sendKeys(updated_Script);
		
		
		// Update Script
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		// Verification
		
		driver.findElement(By.xpath("//td[text()='"+script_Name+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
		
		Thread.sleep(1000);
		
		String actualvalue = driver.findElement(By.xpath("//textarea[@aria-label='Text']")).getText();
		
		Assert.assertEquals(actualvalue, updated_Script,"Script is Not Updated...!");
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
	
		
	}
	
*/
	
		

}
