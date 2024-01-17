package Admin_Configuration_UpdateFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Update_TimeZone extends AdminLogin{
	

	String TimeZone_Name =	"sksls";
	
	String Updated_Timezone ="Test";
	
	int StartHour = 1;
	
	int StartMinute = 55;
	
	int EndHour= 12;
	
	int EndMinute = 55;
	
	String TimeZone_Status = "Inactive";
	
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		// Configuration
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Time Zone
		
		driver.findElement(By.xpath("(//span[normalize-space()='Timezone'])[1]")).click();
		
	}
	
	@Test(priority =0)
	public void Update_Timezone() throws InterruptedException {
		
		//Filter Tab
		
		driver.findElement(By.xpath("(//i[@class='fas fa-filter'])[1]")).click();
		
//		Thread.sleep(1000);
		
		WebElement Popup= driver.findElement(By.xpath("(//div[@class='container sidenavContainer'])[1]"));
		
		
		//Filter Timexone
		
		driver.findElement(By.xpath("(//input[@aria-label='Timezone'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement TimeZoneList = driver.findElement(By.xpath("(//div[@role='list'])[2]"));
		
		TimeZoneList.findElement(By.xpath("(//div[contains(text(),'"+TimeZone_Name+"')])[1]")).click();
		
		Popup.click();
		
		// Applying Filter
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Filter'])[1]")).click();
		
		// Update popup
		
		driver.findElement(By.xpath("//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
		
		Thread.sleep(1000);
		
		WebElement UpdatePopup = driver.findElement(By.xpath("(//div[@class='container grid-list-md'])[1]"));
		
		// Name 
		
		driver.findElement(By.xpath("(//input[@aria-label='Zone Name'])[1]")).sendKeys(Updated_Timezone);
		
		// Update Name
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		//Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

	}

	
	@Test(priority =1)
	public void Update_Time() throws InterruptedException {
		
		//Filter Tab
		
		driver.findElement(By.xpath("(//i[@class='fas fa-filter'])[1]")).click();
		
//		Thread.sleep(1000);
		
		WebElement Popup= driver.findElement(By.xpath("(//div[@class='container sidenavContainer'])[1]"));
		
		
		//Filter Timexone
		
		driver.findElement(By.xpath("(//input[@aria-label='Timezone'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement TimeZoneList = driver.findElement(By.xpath("(//div[@role='list'])[2]"));
		
		TimeZoneList.findElement(By.xpath("(//div[contains(text(),'"+TimeZone_Name+"')])[1]")).click();
		
		Popup.click();
		
		// Applying Filter
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Filter'])[1]")).click();
		
		// Update popup
		
		driver.findElement(By.xpath("//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
		
		Thread.sleep(1000);
		
		WebElement UpdatePopup = driver.findElement(By.xpath("(//div[@class='container grid-list-md'])[1]"));
		
		// Update Start Time
		
		driver.findElement(By.xpath("(//input[@aria-label='Start Time'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement StartClock = driver.findElement(By.xpath("(//div[@class='v-time-picker-clock__container'])[1]"));
		
		StartClock.findElement(By.xpath("(//span[contains(text(),'"+StartHour+"')])[1]")).click();
		
		StartClock.findElement(By.xpath("(//span[contains(text(),'"+StartMinute+"')])[1]")).click();
		
		UpdatePopup.click();
		
		// Update End Time
		
		driver.findElement(By.xpath("(//input[@aria-label='End Time'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement EndClock = driver.findElement(By.xpath("//div[@class='v-time-picker-clock__container']"));
		
		EndClock.findElement(By.xpath("(//span[contains(text(),'"+EndHour+"')])[1]")).click();
		
		EndClock.findElement(By.xpath("(//span[contains(text(),'"+EndMinute+"')])[1]")).click();
		
		UpdatePopup.click();
		
		// Update Name
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		//Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

	}
	
	@Test(priority = 2)
	public void Update_Status() throws InterruptedException {
		
		//Filter Tab
		
		driver.findElement(By.xpath("(//i[@class='fas fa-filter'])[1]")).click();
		
//		Thread.sleep(1000);
		
		WebElement Popup= driver.findElement(By.xpath("(//div[@class='container sidenavContainer'])[1]"));
		
		
		//Filter Timexone
		
		driver.findElement(By.xpath("(//input[@aria-label='Timezone'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement TimeZoneList = driver.findElement(By.xpath("(//div[@role='list'])[2]"));
		
		TimeZoneList.findElement(By.xpath("(//div[contains(text(),'"+TimeZone_Name+"')])[1]")).click();
		
		Popup.click();
		
		// Applying Filter
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Filter'])[1]")).click();
		
		// Update popup
		
		driver.findElement(By.xpath("//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
		
		Thread.sleep(1000);
		
		WebElement UpdatePopup = driver.findElement(By.xpath("(//div[@class='container grid-list-md'])[1]"));
		
		// Status
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement StatusList = driver.findElement(By.xpath("(//div[@role='list'])[3]"));
		
		StatusList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+TimeZone_Status+"'])[2]")).click();
		
		UpdatePopup.click();
		
		// Update Name
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		//Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

		
		
	}
	


}
