package Admin_Configuration_UpdateFlow1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
	public void Update_Status(String announcement_Name,String announcement_Status) throws InterruptedException {
		

		//Update popup
		
		driver.findElement(By.xpath("//td[text()='"+announcement_Name+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light']")).click();
		
		Thread.sleep(1000);
		
		WebElement UpdatePopup = driver.findElement(By.xpath("(//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text'])[1]"));
		
		//Announcement Status
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[1]")).click();
		
		WebElement StatusList = driver.findElement(By.xpath("(//div[@role='list'])[4]"));
		
		StatusList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+announcement_Status+"'])[2]")).click();
		
		// Update Status
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[4]]")).click();
		
		//Verification
		
		String actualvalue = driver.findElement(By.xpath("//td[text()='"+announcement_Name+"']//following-sibling::td[1]")).getText();
		
		Assert.assertEquals(actualvalue, announcement_Status, "Announcement_Status is Not Updated");
		
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
	}
	
/*
	
	@Parameters({"announcement_Name","updated_Announcement"})
	@Test(priority=0)
	public void Update_Announcement(String announcement_Name,String updated_Announcement ,String announcement_Campaign ) throws InterruptedException {
		

		//Update popup
		
		driver.findElement(By.xpath("//td[text()='"+announcement_Name+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light']")).click();
		
		Thread.sleep(1000);
		
		WebElement UpdatePopup = driver.findElement(By.xpath("(//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text'])[1]"));
		
		// Announcement
		
		driver.findElement(By.xpath("(//textarea[@aria-label='Announcement'])[1]")).sendKeys(updated_Announcement);
		
		
		// Update Announcement
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[4]]")).click();
		
		//Verification
		
	      List<WebElement> Alldatas = driver.findElements(By.xpath("//table[@class='v-datatable v-table theme--light']//tr//td[1]"));
	
	      System.out.println(Alldatas.size());
	      
	      boolean flag = false;
	      
	      for(WebElement Data : Alldatas) {
	    	  
	    	  String value=Data.getText();
	    	  
	    	  if(value.contains(announcement_Name)) {
	    		  
	    		  flag = true;
	    		  
	    		  break;
	    	  }
	      }
	  Assert.assertTrue(flag,"Announcement is Not Created...!");	
		
	  driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

		
	}
		@Parameters({"announcement_Name","announcement_Campaign"})
	@Test(priority=2)
	public void Update_Campaign(String announcement_Name,String announcement_Campaign) throws InterruptedException {
		

		//Update popup
		
		driver.findElement(By.xpath("//td[text()='"+announcement_Name+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light']")).click();
		
		Thread.sleep(1000);
		
		WebElement UpdatePopup = driver.findElement(By.xpath("(//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text'])[1]"));
		
		// Campaign
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[2]")).click();
		
		Thread.sleep(1000);
		
		WebElement CampaignList=driver.findElement(By.xpath("(//div[@role='list'])[3]"));
		
		CampaignList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+announcement_Campaign+"'])[1]")).click();
		
		// Update Campaign
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[4]]")).click();
		
		Thread.sleep(1000);
		
		//Verification
		
		String actualvalue = driver.findElement(By.xpath("//td[text()='"+announcement_Name+"']//following-sibling::td[2]")).getText();
		
		Assert.assertEquals(actualvalue, announcement_Campaign," Announcement Campaign is Not Updated");
		
		
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
	}
*/
}
