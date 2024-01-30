package Admin_Configuration_UpdateFlow1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Update_AudioStore extends AdminLogin{
	
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		// Configuration
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Audio Store
		
		driver.findElement(By.xpath("(//span[normalize-space()='Audio Store'])[1]")).click();
	
		Thread.sleep(1000);
	}
	
	@Parameters({"audio_Name","audio_Status"})
	@Test
	public void Update_AudioStoreStatus(String audio_Name, String audio_Status) throws InterruptedException {
				
		//Open Update Popup
		
		driver.findElement(By.xpath("//td[text()='"+audio_Name+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
		
		Thread.sleep(1000);
		
		WebElement UpdatePopup = driver.findElement(By.xpath("(//div[@class='container grid-list-md'])[2]"));
		
		//Status
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[1]")).click();
		
		WebElement StatusList = driver.findElement(By.xpath("(//div[@role='list'])[3]"));
		
		StatusList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+audio_Status+"'])[2]")).click();
		
		// Update Status
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		Thread.sleep(1000);
		
		// Verification
		
		String actualvalue = driver.findElement(By.xpath("//td[text()='tum-mile-dil-khile-flute-instrum']//following-sibling::td[2]")).getText();
		
		Assert.assertEquals(actualvalue,audio_Status,"Status is Not Updated" );
		
//		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

	}

}
