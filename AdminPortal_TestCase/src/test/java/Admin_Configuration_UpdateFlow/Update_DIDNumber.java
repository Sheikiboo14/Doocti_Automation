package Admin_Configuration_UpdateFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Update_DIDNumber extends AdminLogin {

	
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		// Configuration
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// DID Number Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='DID Number'])[1]")).click();
	
		Thread.sleep(1000);
	
	}
	
	@Parameters({"did_Number","did_Status"})
	@Test
	public void Update_DIDNumberStatus(String did_Number, String did_Status) throws InterruptedException{
		
		Actions action = new Actions(driver);	
		
		// Update Did Number
		
		driver.findElement(By.xpath("//td[text()='"+did_Number+"']//following-sibling::td[4]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//i[contains(@aria-hidden,'true')][normalize-space()='arrow_drop_down'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement StatusList = driver.findElement(By.xpath("(//div[contains(@role,'list')])[4]"));
		
		StatusList.findElement(By.xpath("//div[contains(text(),'"+did_Status+"')]")).click();
		
		action.click().build().perform();
		
		// Update
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[normalize-space()='Update']")).click();
		
		Thread.sleep(1000);
		
		// Close snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[4]")).click();
		
		// Verification
		
		String actualvalue = driver.findElement(By.xpath("//td[text()='"+did_Number+"']//following-sibling::td[2]")).getText();
		
		Assert.assertEquals(actualvalue, did_Status, " DID Number Status is not Updated...!");
	
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

	}
	
	@Parameters({"did_Number","did_Live"})
	@Test
	public void Update_DIDNumberLive(String did_Number, String did_Live) throws InterruptedException{
		
		Actions action = new Actions(driver);	
		
		// Update Did Number
		
		driver.findElement(By.xpath("//td[text()='"+did_Number+"']//following-sibling::td[4]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//i[@aria-hidden='true'][normalize-space()='arrow_drop_down'])[2]")).click();
		
		Thread.sleep(1000);
		
		WebElement LiveList = driver.findElement(By.xpath("(//div[@role='list'])[1]"));
		
		LiveList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+did_Live+"'])[1]")).click();
		
		action.click().build().perform();
		
		// Update
		
		driver.findElement(By.xpath("//div[normalize-space()='Update']")).click();
		
		Thread.sleep(1000);
		
		// Close snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[4]")).click();
		
		// Verofication
		
		String actualvalue = driver.findElement(By.xpath("//td[text()='"+did_Number+"']//following-sibling::td[3]")).getText();
		
		Assert.assertEquals(actualvalue, did_Live, "DID Live Status is not Updated...!");
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

		
	}
}
