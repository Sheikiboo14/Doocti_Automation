package Admin_Configuration_UpdateFlow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Update_Announcement extends AdminLogin {


	String Announcement_Name= "Testing";
	
	String Announcement_Status = "Inactive";
	
	String Updated_Announcement ="Hi Doocti";
	
	String Announcement_Campaign = "Dialer";
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		// Configuration
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Announcement 
		
		driver.findElement(By.xpath("(//span[normalize-space()='Announcements'])[1]")).click();
		
		
		
	}
	
	@Test(enabled=false)
	public void Update_Announcement() throws InterruptedException {
		

		//Update popup
		
		driver.findElement(By.xpath("//td[text()='"+Announcement_Name+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light']")).click();
		
		Thread.sleep(1000);
		
		WebElement UpdatePopup = driver.findElement(By.xpath("(//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text'])[1]"));
		
		// Announcement
		
		driver.findElement(By.xpath("(//textarea[@aria-label='Announcement'])[1]")).sendKeys(Updated_Announcement);
		
		
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
	    	  
	    	  if(value.contains(Announcement_Name)) {
	    		  
	    		  flag = true;
	    		  
	    		  break;
	    	  }
	      }
	  Assert.assertTrue(flag,"Announcement is Not Created...!");	
		
		
	}
	
	@Test(priority=1)
	public void Update_Status() throws InterruptedException {
		

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
		
		
		//Update popup
		
		driver.findElement(By.xpath("(//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement UpdatePopup = driver.findElement(By.xpath("(//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text'])[1]"));
		
		//Announcement Status
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[1]")).click();
		
		WebElement StatusList = driver.findElement(By.xpath("(//div[@role='list'])[4]"));
		
		StatusList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+Announcement_Status+"'])[2]")).click();
		
		// Update Status
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[4]]")).click();
		
		//Verification
		
		String actualvalue = driver.findElement(By.xpath("//td[text()='"+Announcement_Name+"']//following-sibling::td[1]")).getText();
		
		Assert.assertEquals(actualvalue, Announcement_Status, "Announcement_Status is Not Updated");
		
		
//		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
	}
	@Test(priority=2)
	public void Update_Campaign() throws InterruptedException {
		

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
		
		
		//Update popup
		
		driver.findElement(By.xpath("(//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement UpdatePopup = driver.findElement(By.xpath("(//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text'])[1]"));

		// Campaign
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[2]")).click();
		
		Thread.sleep(1000);
		
		WebElement CampaignList=driver.findElement(By.xpath("(//div[@role='list'])[3]"));
		
		CampaignList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+Announcement_Campaign+"'])[1]")).click();
		
		// Update Campaign
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[4]]")).click();
		
		Thread.sleep(1000);
		
		//Verification
		
		String actualvalue = driver.findElement(By.xpath("//td[text()='"+Announcement_Name+"']//following-sibling::td[2]")).getText();
		
		Assert.assertEquals(actualvalue, Announcement_Campaign," Announcement Campaign is Not Updated");
		
		
		
//		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
	}

}
