package MeetingTitle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Create_MeetingTitle extends AdminLogin{
	
	String Meeting_Title = "Test3";
	
	String Meeting_SubTitle = "Testing";
	
	String Meeting_Description = "Testing Purpose";
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Opening Meeting Title Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Meeting Title'])[1]")).click();
	}
	
	@Test
	public void MeetingTitle_Creation() throws InterruptedException {
		
		// Add Meeting Title Popup
		
		driver.findElement(By.xpath("(//div[normalize-space()='Add Meeting Title'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Meeting Title 
		
		driver.findElement(By.xpath("(//input[@aria-label='Meeting Title'])[2]")).sendKeys(Meeting_Title);
		
		//Meeting Sub Title
		
		driver.findElement(By.xpath("(//input[@aria-label='Meeting Sub Title'])[1]")).sendKeys(Meeting_SubTitle);
		
		// MeetingDescription
		
		driver.findElement(By.xpath("(//input[@aria-label='Description'])[3]")).sendKeys(Meeting_Description);
		
		// Creating Meeting
		
		driver.findElement(By.xpath("(//div[normalize-space()='Create'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
	}
	
	@Test(priority=1)
	public void MeetingTitle_Verfication() throws InterruptedException {
		


		//Filter Tab
		
		driver.findElement(By.xpath("(//i[@class='fas fa-filter'])[1]")).click();
		
//		Thread.sleep(1000);
		
		WebElement Popup= driver.findElement(By.xpath("(//div[@class='container sidenavContainer'])[1]"));
		
		
		//Filter Title
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[2]")).click();
		
		Thread.sleep(1000);
		
		WebElement TitleList = driver.findElement(By.xpath("(//div[@role='list'])[2]"));
		
		TitleList.findElement(By.xpath("(//div[contains(text(),'"+Meeting_Title+"')])[1]")).click();
		
		Popup.click();
		
		// Applying Filter
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Filter'])[1]")).click();
		
		Thread.sleep(1000);
		
		//Edit Popup
		
		driver.findElement(By.xpath("(//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text'])[1]")).click();
		
		Thread.sleep(1000);
		
		String actualvalue = driver.findElement(By.xpath("(//input[@aria-label='Meeting Title'])[1]")).getAttribute("value");
		
		Assert.assertEquals(actualvalue, Meeting_Title , "Meeting Title is Not Created");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[1]")).click();

	}
	

}
