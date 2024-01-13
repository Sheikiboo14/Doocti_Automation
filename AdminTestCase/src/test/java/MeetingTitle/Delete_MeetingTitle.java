package MeetingTitle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Delete_MeetingTitle extends AdminLogin {
	
	String Title_Name = "Testing Title";
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		// Configuration
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Meeting Title Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Meeting Title'])[1]")).click();
		
	}
	
	@Test
	public void Delete_MeetingTitle() throws InterruptedException {
		
		
		//Filter Tab
		
		driver.findElement(By.xpath("(//i[@class='fas fa-filter'])[1]")).click();
		
//		Thread.sleep(1000);
		
		WebElement Popup= driver.findElement(By.xpath("(//div[@class='container sidenavContainer'])[1]"));
		
		
		//Filter Title
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[2]")).click();
		
		Thread.sleep(1000);
		
		WebElement TitleList = driver.findElement(By.xpath("(//div[@role='list'])[2]"));
		
		TitleList.findElement(By.xpath("(//div[contains(text(),'"+Title_Name+"')])[1]")).click();
		
		Popup.click();
		
		// Applying Filter
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Filter'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Delete Meeting
		
		driver.findElement(By.xpath("(//i[@class='v-icon mr-4 v-icon--link material-icons theme--light red--text'][normalize-space()='delete'])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//div[normalize-space()='Yes, Delete !'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
			
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
	}

}
