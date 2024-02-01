package Admin_Configuration_UpdateFlow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Update_Announcement extends AdminLogin {


	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		// Configuration
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Announcement 
		
		driver.findElement(By.xpath("(//span[normalize-space()='Announcements'])[1]")).click();
		
		Thread.sleep(1000);	
		
	}

	@Parameters({"announcement_Name","announcement_Status"})
	@Test
	public void Update_AnnouncementStatus(String announcement_Name, String announcement_Status) throws InterruptedException {
		
		Actions action = new Actions(driver);
		
		//Update Announcement Status
		
		driver.findElement(By.xpath("//td[text()='"+announcement_Name+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//i[@aria-hidden='true'][normalize-space()='arrow_drop_down'])[1]")).click();
		
		WebElement Statuslist = driver.findElement(By.xpath("(//div[@role='list'])[4]"));
		
		Statuslist.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+announcement_Status+"'])[2]")).click();
		
		action.click().build().perform();
		
		// Update
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[4]")).click();
		
		// Verification
		
		String actualvalue = driver.findElement(By.xpath("//td[text()='"+announcement_Name+"']//following-sibling::td[1]")).getText();
		
		Assert.assertEquals(actualvalue, announcement_Status, "Announcement Status is not Updated...!");
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

	}
	
	@Parameters({"announcement_Name","announcement_Message"})
	@Test
	public void Update_AnnouncementMessage(String announcement_Name, String announcement_Message) throws InterruptedException {
		
		Actions action = new Actions(driver);
		
		//Update Announcement Status
		
		driver.findElement(By.xpath("//td[text()='"+announcement_Name+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
		
		Thread.sleep(1000);
	
		action.doubleClick(driver.findElement(By.xpath("(//textarea[@aria-label='Announcement'])[1]")))
		.keyDown(Keys.CONTROL)
		.sendKeys("a")
		.keyUp(Keys.CONTROL)
		.sendKeys(Keys.BACK_SPACE)
		.build().perform();
		
		driver.findElement(By.xpath("(//textarea[@aria-label='Announcement'])[1]")).sendKeys(announcement_Message);
		
		// Update
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[4]")).click();
		
		// Verfication
		
		driver.findElement(By.xpath("//td[text()='"+announcement_Name+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();

		Thread.sleep(1000);
		
		String actualvalue = driver.findElement(By.xpath("(//textarea[@aria-label='Announcement'])[1]")).getAttribute("value");
		
//		System.out.println(actualvalue);
		
		Assert.assertEquals(actualvalue, announcement_Message, "Announcement Message is not Updated...!");
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[1]")).click();
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

		
	}
	
	@Parameters({"announcement_Name","announcement_Campaign"})
	@Test
	public void Update_AnnouncementCampaign(String announcement_Name, String announcement_Campaign) throws InterruptedException {
		
		Actions action = new Actions(driver);
		
		//Update Announcement Status
		
		driver.findElement(By.xpath("//td[text()='"+announcement_Name+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//i[@aria-hidden='true'][normalize-space()='arrow_drop_down'])[2]")).click();
		
		Thread.sleep(1000);
		
		WebElement CampaignList =driver.findElement(By.xpath("(//div[@role='list'])[3]"));
		
		CampaignList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+announcement_Campaign+"'])[1]")).click();
		
		action.click().build().perform();
		
		// Update
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[4]")).click();
		
		// Verfication
		
		driver.findElement(By.xpath("//td[text()='"+announcement_Name+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();

		Thread.sleep(1000);
		
		String actualvalue = driver.findElement(By.xpath("(//div)[76]")).getText();
		
		List<WebElement> Alldatas = driver.findElements(By.xpath("(//div)[76]"));
		
		boolean flag = false;
		
		for(WebElement Data : Alldatas) {
			
			String value = Data.getText();
			
//			System.out.println(actualvalue);
			
			if(value.contains(announcement_Campaign)) {
				
				flag = true;
				
				break;
			}
		}
		
		Assert.assertTrue(flag, "Announcement Campaign is not Updated...!");
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[1]")).click();
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

		
	}
	
}