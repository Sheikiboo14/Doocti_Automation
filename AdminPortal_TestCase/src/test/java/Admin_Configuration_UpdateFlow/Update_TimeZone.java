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

public class Update_TimeZone extends AdminLogin{
	
		
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		// Configuration
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Time Zone
		
		driver.findElement(By.xpath("(//span[normalize-space()='Timezone'])[1]")).click();
		
		Thread.sleep(1000);
	}
	
	@Parameters({"timeZone_Name","timeZone_Status"})
	@Test(priority = 0)
	public void Update_Status(String timeZone_Name, String timeZone_Status) throws InterruptedException {
		
		Actions action = new Actions(driver);
		
		// Update popup
		
		driver.findElement(By.xpath("//td[text()='"+timeZone_Name+"']//following-sibling::td[5]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
		
		Thread.sleep(1000);
		
		
		// Status
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement StatusList = driver.findElement(By.xpath("(//div[@role='list'])[3]"));
		
		StatusList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+timeZone_Status+"'])[2]")).click();
		
		action.click().build().perform();
		
		// Update Name
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		//Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		// Verification
		
		String actualvalue = driver.findElement(By.xpath("//td[text()='"+timeZone_Name+"']//following-sibling::td[4]")).getText();
		
		Assert.assertEquals(actualvalue, timeZone_Name, "Timezone Status is not Updated...!");
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

		
		
	}
	/*
	@Parameters({"timeZone_Name","updated_Timezone"})
	@Test(priority =1)
	public void Update_Timezone(String timeZone_Name, String updated_Timezone) throws InterruptedException {
		

		// Update popup
		
		driver.findElement(By.xpath("//td[text()='"+timeZone_Name+"']//following-sibling::td[5]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
		
		Thread.sleep(1000);
				
		// Name 
		
		driver.findElement(By.xpath("(//input[@aria-label='Zone Name'])[1]")).sendKeys(updated_Timezone);
		
		// Update Name
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		//Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		// Verification
		
		
		List<WebElement> Alldatas = driver.findElements(By.xpath("//table[contains(@class,'v-datatable')]//tr//td[1]"));
		
		boolean flag = false;
		
		for(WebElement Data : Alldatas) {
			
			String value = Data.getText();
			
			if(value.contains(updated_Timezone)) {
				
				flag = true;
			}
		}
	
		Assert.assertTrue(flag,"Timezone Name is not Updated...!");
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

	}

	@Parameters({"updated_Timezone","startHour","startMinute","endHour","endMinute"})
	@Test(priority =2)
	public void Update_Time(String updated_Timezone, int startHour, int startMinute, int endHour, int endMinute  ) throws InterruptedException {
		

		// Update popup
		
		driver.findElement(By.xpath("//td[text()='"+updated_Timezone+"']//following-sibling::td[5]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
		
		Thread.sleep(1000);
		
		WebElement UpdatePopup = driver.findElement(By.xpath("(//div[@class='container grid-list-md'])[1]"));
		
		// Update Start Time
		
		driver.findElement(By.xpath("(//input[@aria-label='Start Time'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement StartClock = driver.findElement(By.xpath("(//div[@class='v-time-picker-clock__container'])[1]"));
		
		StartClock.findElement(By.xpath("(//span[contains(text(),'"+startHour+"')])[1]")).click();
		
		StartClock.findElement(By.xpath("(//span[contains(text(),'"+startMinute+"')])[1]")).click();
		
		UpdatePopup.click();
		
		// Update End Time
		
		driver.findElement(By.xpath("(//input[@aria-label='End Time'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement EndClock = driver.findElement(By.xpath("//div[@class='v-time-picker-clock__container']"));
		
		EndClock.findElement(By.xpath("(//span[contains(text(),'"+endHour+"')])[1]")).click();
		
		EndClock.findElement(By.xpath("(//span[contains(text(),'"+endMinute+"')])[1]")).click();
		
		UpdatePopup.click();
		
		// Update Name
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		//Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

	}
	
	
*/
	


}
