package Admin_Configuration_DeleteFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Delete_Timezone extends AdminLogin{
	

	String TimeZone_Name =	"Testing";
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		// Configuration
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Time Zone
		
		driver.findElement(By.xpath("(//span[normalize-space()='Timezone'])[1]")).click();
		
	}
	
	@Test
	public void Delete_Timezone() throws InterruptedException {
		

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
		
		Thread.sleep(1000);
		
		//Delete Timezone
		
		driver.findElement(By.xpath("(//i[@class='v-icon mr-4 v-icon--link material-icons theme--light red--text'])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

		
	}


}
