package Admin_Configuration_CreateFlow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Create_TimeZone extends AdminLogin{
	
	
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Opening TimeZone Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Timezone'])[1]")).click();
	}
	
	@Parameters({"timeZone_Name","timeZone_Description","timeZone_StartHour","timeZone_StartMinute","timeZone_EndHour","timeZone_EndMinute","timeZone_Status"})
	@Test
	public void TimeZone_Creation(String timeZone_Name ,String timeZone_Description ,int timeZone_StartHour ,int timeZone_StartMinute ,int timeZone_EndHour ,int timeZone_EndMinute ,String timeZone_Status) throws InterruptedException {


		// Add TimeZone
		
		driver.findElement(By.xpath("(//div[normalize-space()='Add Timezone'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement TimeZonePopup = driver.findElement(By.xpath("(//div[@class='container grid-list-md'])[2]"));
		
		// Zone Name
		
		driver.findElement(By.xpath("(//input[@aria-label='Zone Name'])[2]")).sendKeys(timeZone_Name);
		
		//Description
		
		driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")).sendKeys(timeZone_Description);
		
		// Start Time
		
		driver.findElement(By.xpath("(//input[@aria-label='Start Time'])[2]")).click();
		
		Thread.sleep(1000);
		
		WebElement HourClock= driver.findElement(By.xpath("(//div[@class='v-time-picker-clock__container'])[1]"));
		
		HourClock.findElement(By.xpath("(//span[contains(text(),'"+timeZone_StartHour+"')])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement MinuteClock= driver.findElement(By.xpath("(//div[@class='v-time-picker-clock__container'])[1]"));

		MinuteClock.findElement(By.xpath("(//span[contains(text(),'"+timeZone_StartMinute+"')])[1]")).click();
		
//		TimeZonePopup.click();
		
		// End Time
		
		driver.findElement(By.xpath("(//input[@aria-label='End Time'])[2]")).click();
 		
		Thread.sleep(1000);
		
		WebElement EndHClock = driver.findElement(By.xpath("(//div[@class='v-time-picker-clock v-time-picker-clock--indeterminate theme--light'])[1]"));
		
		EndHClock.findElement(By.xpath("(//span[contains(text(),'"+timeZone_EndHour+"')])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement EndMClock = driver.findElement(By.xpath("(//div[@class='v-time-picker-clock__container'])[1]"));

		
		EndMClock.findElement(By.xpath("(//span[contains(text(),'"+timeZone_EndMinute+"')])[1]")).click();
		
//		TimeZonePopup.click();
	
		// Status
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[2]")).click();
		
		Thread.sleep(2000);
		
		WebElement StatusList = driver.findElement(By.xpath("(//div[@role='list'])[4]"));
		
		StatusList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+timeZone_Status+"'])[3]")).click();
		
		// Create TimeZone
		
		driver.findElement(By.xpath("(//div[normalize-space()='Create'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		Thread.sleep(1000);
		
		// Verification
		
		
	      List<WebElement> Alldatas = driver.findElements(By.xpath("//table[@class='v-datatable v-table theme--light']//tr//td[1]"));
	
	      
	      boolean flag = false;
	      
	      for(WebElement Data : Alldatas) {
	    	  
	    	  String value=Data.getText();
	    	  
	    	  if(value.contains(timeZone_Name))
	    			  {
	    		  
	    		  flag = true;
	    		  
	    		  break;
	    	  }
	      }
	  Assert.assertTrue(flag," Timezone is Not Created...!");	
	}
	
	
}
