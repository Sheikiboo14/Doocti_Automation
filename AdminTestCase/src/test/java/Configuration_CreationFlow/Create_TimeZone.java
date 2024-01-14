package Configuration_CreationFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Create_TimeZone extends AdminLogin{
	
	
	String ZoneName = "Test" ;
	
	String Description ="Testing Purpose";
	
	int StartHour = 1;
	
	int StartMinute = 00;
	
	int EndHour = 10;
	
	int EndMinute = 00;
	
	String Status = "Active";
	
	
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Opening TimeZone Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Timezone'])[1]")).click();
	}
	
	@Test
	public void TimeZone_Creation() throws InterruptedException {


		// Add TimeZone
		
		driver.findElement(By.xpath("(//div[normalize-space()='Add Timezone'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement TimeZonePopup = driver.findElement(By.xpath("(//div[@class='container grid-list-md'])[2]"));
		
		// Zone Name
		
		driver.findElement(By.xpath("(//input[@aria-label='Zone Name'])[2]")).sendKeys(TimeZone_Name);
		
		//Description
		
		driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")).sendKeys(TimeZone_Description);
		
		// Start Time
		
		driver.findElement(By.xpath("(//input[@aria-label='Start Time'])[2]")).click();
		
		Thread.sleep(1000);
		
		WebElement HourClock= driver.findElement(By.xpath("(//div[@class='v-time-picker-clock__container'])[1]"));
		
		HourClock.findElement(By.xpath("(//span[contains(text(),'"+TimeZone_StartHour+"')])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement MinuteClock= driver.findElement(By.xpath("(//div[@class='v-time-picker-clock__container'])[1]"));

		MinuteClock.findElement(By.xpath("(//span[contains(text(),'"+TimeZone_StartMinute+"')])[1]")).click();
		
//		TimeZonePopup.click();
		
		// End Time
		
		driver.findElement(By.xpath("(//input[@aria-label='End Time'])[2]")).click();
 		
		Thread.sleep(1000);
		
		WebElement EndHClock = driver.findElement(By.xpath("(//div[@class='v-time-picker-clock v-time-picker-clock--indeterminate theme--light'])[1]"));
		
		EndHClock.findElement(By.xpath("(//span[contains(text(),'"+TimeZone_EndHour+"')])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement EndMClock = driver.findElement(By.xpath("(//div[@class='v-time-picker-clock__container'])[1]"));

		
		EndMClock.findElement(By.xpath("(//span[contains(text(),'"+TimeZone_EndMinute+"')])[1]")).click();
		
//		TimeZonePopup.click();
	
		// Status
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[2]")).click();
		
		Thread.sleep(1000);
		
		WebElement StatusList = driver.findElement(By.xpath("(//div[@role='list'])[4]"));
		
		StatusList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+TimeZone_Status+"'])[3]")).click();
		
		// Create TimeZone
		
		driver.findElement(By.xpath("(//div[normalize-space()='Create'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

	}
	
	
	@Test(priority=1)
	public void TimeZone_Verfication() throws InterruptedException {
		


		//Filter Tab
		
		driver.findElement(By.xpath("(//i[@class='fas fa-filter'])[1]")).click();
		
//		Thread.sleep(1000);
		
		WebElement Popup= driver.findElement(By.xpath("(//div[@class='container sidenavContainer'])[1]"));
		
		
		//Filter Title
		
		driver.findElement(By.xpath("(//input[@aria-label='Timezone'])[1]")).sendKeys(TimeZone_Name);
		
		Thread.sleep(1000);
		
		WebElement TitleList = driver.findElement(By.xpath("(//div[@role='list'])[2]"));
		
		TitleList.findElement(By.xpath("(//span[@class='v-list__tile__mask'])[1]")).click();
		
		Popup.click();
		
		// Applying Filter
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Filter'])[1]")).click();
		
		Thread.sleep(1000);
		
		//Edit Popup
		
		driver.findElement(By.xpath("(//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text'])[1]")).click();
		
		Thread.sleep(1000);
		
		String actualvalue = driver.findElement(By.xpath("(//input[@aria-label='Zone Name'])[1]")).getAttribute("value");
		
		Assert.assertEquals(actualvalue, TimeZone_Name , "TimeZone is Not Created");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[1]")).click();

	}

}
