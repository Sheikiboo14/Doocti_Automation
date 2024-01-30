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
	public void Update_AudioStoreStatus(String audio_Name,String audio_Status) throws InterruptedException {
		
		
		Actions action = new Actions(driver);
		
		//Update Audio Store
		
		driver.findElement(By.xpath("//td[text()='"+audio_Name+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//i[contains(@class,'v-icon material-icons theme--light')][normalize-space()='arrow_drop_down'])[1]")).click();
		
		WebElement StatusList = driver.findElement(By.xpath("(//div[contains(@role,'list')])[11]"));
		
		StatusList.findElement(By.xpath("(//div[contains(@class,'v-list__tile__title')][normalize-space()='"+audio_Status+"'])[2]")).click();
		
		action.click().build().perform();
		
		// Update
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close snakbar
		
		driver.findElement(By.xpath("(//div[contains(@class,'v-btn__content')][normalize-space()='Close'])[3]")).click();
		
		// Verification
		
//		String actualvalue = driver.findElement(By.xpath("//td[text()='"+audio_Name+"']//following-sibling::td[2]")).getText();
//		
//		Assert.assertEquals(actualvalue, audio_Status, "Audio Store Status is not Updated...!");
		
		
		List<WebElement> Alldatas = driver.findElements(By.xpath("//table[contains(@class,'v-datatable')]//tr//td[1]"));
		
		boolean flag = false;
		
		for(WebElement Data : Alldatas) {
			
			String value = Data.getText();
			
			if(value.contains(audio_Name)) {
				
				flag = true;
			}
		}
		
		Assert.assertFalse(flag,"AudioStore is not Updated...!");
	}
}
