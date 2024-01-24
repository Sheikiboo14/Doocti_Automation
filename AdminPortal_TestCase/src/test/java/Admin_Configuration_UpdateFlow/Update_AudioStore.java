package Admin_Configuration_UpdateFlow;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Update_AudioStore extends AdminLogin{
	
String Audio_Status = "Inactive";
	
	String Audio_Name ="7120-download-iphone-6-original-";
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		// Configuration
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Audio Store
		
		driver.findElement(By.xpath("(//span[normalize-space()='Audio Store'])[1]")).click();
		
	}
	
	@Test
	public void Update_AudioStore() throws InterruptedException {
		
		Thread.sleep(1000);
		
		//Open Update Popup
		
		driver.findElement(By.xpath("//td[text()='tum-mile-dil-khile-flute-instrum']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
		
		Thread.sleep(1000);
		
		WebElement UpdatePopup = driver.findElement(By.xpath("(//div[@class='container grid-list-md'])[2]"));
		
		//Status
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[1]")).click();
		
		WebElement StatusList = driver.findElement(By.xpath("(//div[@role='list'])[3]"));
		
		StatusList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+Audio_Status+"'])[2]")).click();
		
		// Update Status
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		Thread.sleep(1000);
		
		// Verification
		
		String actualvalue = driver.findElement(By.xpath("//td[text()='tum-mile-dil-khile-flute-instrum']//following-sibling::td[2]")).getText();
		
		Assert.assertEquals(actualvalue,Audio_Status,"Status is Not Updated" );
		
//		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

	}

}
