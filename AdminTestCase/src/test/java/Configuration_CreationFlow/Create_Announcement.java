package Configuration_CreationFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Create_Announcement extends AdminLogin{
	
	String Name ="Testing";
	
	String Announcement = "Good Morning";
	
	String Campaign ="Preview 2";
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Opening Announcement Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Announcements'])[1]")).click();
		
	}
	
	@Test
	public void Create_Announcement() throws InterruptedException {
		
		// Add Announcement Popup
		
		driver.findElement(By.xpath("(//div[normalize-space()='Add Announcement'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement Popup = driver.findElement(By.xpath("(//div[@class='container grid-list-md'])[2]"));
		
		// Name
		
		driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")).sendKeys(Name);
		
		// Announcement
		
		driver.findElement(By.xpath("(//textarea[@aria-label='Announcement'])[2]")).sendKeys(Announcement);
		
		// Campaign
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[3]")).click();
		
		Thread.sleep(1000);
		
		WebElement CampaignList = driver.findElement(By.xpath("(//div[@role='list'])[5]"));
		
		CampaignList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+Campaign+"'])[2]")).click();
		
		Popup.click();
		
		// Create Announcement
		
		driver.findElement(By.xpath("(//div[normalize-space()='Create'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[4]")).click();
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

	}
	

}
