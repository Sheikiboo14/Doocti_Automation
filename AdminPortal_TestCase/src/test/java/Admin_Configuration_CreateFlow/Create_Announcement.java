package Admin_Configuration_CreateFlow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Login.AdminLogin;
	

public class Create_Announcement extends AdminLogin {
	
	
//	String announcement_Name ="Testing3";
//	
//	String announcement = "Good Morning";
//	
//	String announcement_Campaign ="Preview 2";
	
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Opening Announcement Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Announcements'])[1]")).click();
		
	}
	
	@Parameters({"announcement_Name","announcement","announcement_Campaign"})
	@Test
	public void Create_Announcement(String announcement_Name, String announcement, String announcement_Campaign  ) throws InterruptedException {
		Actions action = new Actions(driver);
		
		// Add Announcement Popup
		
		driver.findElement(By.xpath("(//div[normalize-space()='Add Announcement'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement Popup = driver.findElement(By.xpath("(//div[@class='container grid-list-md'])[2]"));
		
		// Name
		
		driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")).sendKeys(announcement_Name);
		
		// Announcement
		
		driver.findElement(By.xpath("(//textarea[@aria-label='Announcement'])[2]")).sendKeys(announcement);
		
		// Campaign
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[3]")).click();
		
		Thread.sleep(1000);
		
		WebElement CampaignList = driver.findElement(By.xpath("(//div[@role='list'])[5]"));
		
		CampaignList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+announcement_Campaign+"'])[2]")).click();
		
		action.click().build().perform();
		
		// Create Announcement
		
		driver.findElement(By.xpath("(//div[normalize-space()='Create'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[4]")).click();
		
		driver.navigate().refresh();
		
		//Verification
		
		
		List<WebElement> Alldatas = driver.findElements(By.xpath("//table[contains(@class,'v-datatable')]//tr//td[1]"));
		
		boolean flag = false;
		
		for(WebElement Data : Alldatas) {
			
			String value = Data.getText();
			
			
			if(value.contains(announcement_Name)) {
				
				flag = true;
				
			}
		}
		
		Assert.assertTrue(flag, "Announcement is Not Created...!");
	}
	

}

