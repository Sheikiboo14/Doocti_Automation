package Timezone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
		
		driver.findElement(By.xpath("(//input[@aria-label='Zone Name'])[2]")).sendKeys(ZoneName);
		
		//Description
		
		driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")).sendKeys(Description);
		
		// Start Time
		
		driver.findElement(By.xpath("(//input[@aria-label='Start Time'])[2]")).click();
		
		Thread.sleep(1000);
		
		WebElement HourClock= driver.findElement(By.xpath("(//div[@class='v-time-picker-clock__container'])[1]"));
		
		HourClock.findElement(By.xpath("(//span[contains(text(),'"+StartHour+"')])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement MinuteClock= driver.findElement(By.xpath("(//div[@class='v-time-picker-clock__container'])[1]"));

		MinuteClock.findElement(By.xpath("(//span[contains(text(),'"+StartMinute+"')])[1]")).click();
		
//		TimeZonePopup.click();
		
		// End Time
		
		driver.findElement(By.xpath("(//input[@aria-label='End Time'])[2]")).click();
 		
		Thread.sleep(1000);
		
		WebElement EndHClock = driver.findElement(By.xpath("(//div[@class='v-time-picker-clock v-time-picker-clock--indeterminate theme--light'])[1]"));
		
		EndHClock.findElement(By.xpath("(//span[contains(text(),'"+EndHour+"')])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement EndMClock = driver.findElement(By.xpath("(//div[@class='v-time-picker-clock__container'])[1]"));

		
		EndMClock.findElement(By.xpath("(//span[contains(text(),'"+EndMinute+"')])[1]")).click();
		
//		TimeZonePopup.click();
	
		// Status
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[2]")).click();
		
		Thread.sleep(1000);
		
		WebElement StatusList = driver.findElement(By.xpath("(//div[@role='list'])[4]"));
		
		StatusList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+Status+"'])[3]")).click();
		
		// Create TimeZone
		
		driver.findElement(By.xpath("(//div[normalize-space()='Create'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

	}

}
