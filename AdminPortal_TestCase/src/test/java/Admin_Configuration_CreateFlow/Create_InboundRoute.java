package Admin_Configuration_CreateFlow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Create_InboundRoute extends AdminLogin {
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		// Configuration
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Inbound Route
		
		driver.findElement(By.xpath("(//span[normalize-space()='Inbound Route'])[1]")).click();
	}
	
	@Parameters({"dID_Number","dID_Name","destination_Name","destination_Value","blockList"})
	@Test
	public void InboundRoute_Create(String dID_Number,String dID_Name ,String destination_Name ,String destination_Value,boolean blockList) throws InterruptedException {
		Actions action = new Actions(driver);
		
		// New  Popup
		
		driver.findElement(By.xpath("(//div[normalize-space()='New'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement Popup =driver.findElement(By.xpath("(//div[@class='v-card__text'])[3]"));
		
		//DID Number
		
		WebElement DIDNumber =driver.findElement(By.xpath("(//input[@aria-label='DID Number'])[2]"));
		
		DIDNumber.sendKeys(dID_Number);
		
		// DID Name
		
		driver.findElement(By.xpath("(//input[@aria-label='DID Name'])[2]")).sendKeys(dID_Name);
		
		// Destination Name
		
		driver.findElement(By.xpath("(//i[@aria-hidden='true'][normalize-space()='arrow_drop_down'])[3]")).click();
		
		Thread.sleep(1000);
		
		WebElement destination_list = driver.findElement(By.xpath("(//div[@role='list'])[6]"));
		
		destination_list.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+destination_Name+"'])[3]")).click();
		
		action.click().build().perform();
		
		// Destination Value
		
		driver.findElement(By.xpath("(//i[@aria-hidden='true'][normalize-space()='arrow_drop_down'])[4]")).click();
	
		WebElement value_list = driver.findElement(By.xpath("(//div[@role='list'])[5]"));
		
		value_list.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+destination_Value+"'])[2]")).click();
		
		action.click().build().perform();
		
		// Block List 
		
		if(blockList = true)
		{
			driver.findElement(By.xpath("(//label[@class='v-label theme--light'][normalize-space()='Blocklist'])[2]")).click();
		}

		
		// Create Inbound Route
		
		driver.findElement(By.xpath("(//div[normalize-space()='Create'])[1]")).click();
		
		Thread.sleep(1000);
		
		//Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		driver.navigate().refresh();
		
		Thread.sleep(1000);

		
		// Verification
		
		List<WebElement> Alldatas = driver.findElements(By.xpath("//table[contains(@class,'v-datatable')]//tr//td[1]"));
		
		boolean flag = false;
		
		for(WebElement Data : Alldatas) {
			
			String value = Data.getText();
			
			
			if(value.contains(dID_Number)) {
				
				flag = true;
			}
		}
		
		Assert.assertTrue(flag, "Inbound Route is Not Created...!");
	}	
	
	

}
