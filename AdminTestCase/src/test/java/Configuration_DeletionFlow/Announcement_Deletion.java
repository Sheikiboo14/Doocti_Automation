package Configuration_DeletionFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Announcement_Deletion extends AdminLogin {
	

	String Announcement_Name= "Testing";

	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		// Configuration
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Announcement 
		
		driver.findElement(By.xpath("(//span[normalize-space()='Announcements'])[1]")).click();
			
	}
	
	@Test
	public void Announcement_Delete() throws InterruptedException {
		
		
		//Filter Tab
		
		driver.findElement(By.xpath("(//i[@class='fas fa-filter'])[1]")).click();
		
//		Thread.sleep(1000);
		
		WebElement Popup= driver.findElement(By.xpath("(//div[@class='container sidenavContainer'])[1]"));
		
		
		//Filter Name
		
		driver.findElement(By.xpath("(//input[@role='combobox'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement NameList = driver.findElement(By.xpath("(//div[@role='list'])[2]"));
		
		NameList.findElement(By.xpath("(//div[contains(text(),'"+Announcement_Name+"')])[1]")).click();
		
		Popup.click();
		
		// Applying Filter
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Filter'])[1]")).click();
		
		// Delete Announcement
		
		driver.findElement(By.xpath("(//i[@class='v-icon mr-4 v-icon--link material-icons theme--light red--text'])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//div[normalize-space()='Yes, Delete !'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[4]")).click();
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

	}


}
