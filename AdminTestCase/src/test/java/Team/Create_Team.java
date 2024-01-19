package Team;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Create_Team extends AdminLogin {
	
	String Name = "Testing All";
	
	String Description = "Testing";
	
	String Type = "All";
	
	String Campaign ="Dialer";
	
	String LeadSource = "wp";
	
	String Channel = "Outlook";
	
	String UserAssign ="smibrahim_agent06@doocti.com";
	
	@BeforeTest
	public void Setip() throws InterruptedException {
		
		driver.findElement(By.xpath("//div[contains(text(),'Users & Groups')]")).click();
		
		Thread.sleep(1000);
		
		//Going to Team Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Team'])[1]")).click();
	

	}
	
	@Test(priority = 0)
	public void Create_Team() throws InterruptedException {
		
		// Opening Create Team Popup
		
		driver.findElement(By.xpath("(//div[normalize-space()='Add Team'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement TeamPopup = driver.findElement(By.xpath("(//div[@class='container grid-list-md'])[2]"));
		

		//Team Name
		
		driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")).sendKeys(Name);
		
		//Team Description
		
		driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")).sendKeys(Description);
		
		//Team Type
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[5]")).click();
		
		Thread.sleep(1000);
	
		driver.findElement(By.xpath("(//div[@role='list'])[8]"));
		
		driver.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+Type+"'])[2]")).click();
		
		TeamPopup.click();
		
		String TeamType = driver.findElement(By.xpath("(//div[@class='v-select__selections'])[5]")).getText();
		
		System.out.println(TeamType);
		
		//Lead Source
		
		if(TeamType.equalsIgnoreCase("Lead Source")) {
			
			
			driver.findElement(By.xpath("(//div[@class='v-select__selections'])[6]")).click();
			
			Thread.sleep(1000);
			
			WebElement Lead_Source =driver.findElement(By.xpath("(//div[@role='list'])[1]"));
			
			Lead_Source.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+LeadSource+"'])[1]")).click();
			
			TeamPopup.click();
			
			// Campaign 
			
			driver.findElement(By.xpath("(//i[@aria-hidden='true'][normalize-space()='arrow_drop_down'])[7]")).click();
			
			Thread.sleep(1000);
			
			WebElement CampaignList = driver.findElement(By.xpath("(//div[@role='list'])[8]"));
			
			CampaignList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+Campaign+"'])[2]")).click();
			
			TeamPopup.click();
			
			
			
		// User Assign
			
			driver.findElement(By.xpath("(//i[@class='v-icon material-icons theme--light'][normalize-space()='arrow_drop_down'])[8]")).click();
			
			Thread.sleep(1000);
			
			WebElement UserList = driver.findElement(By.xpath("(//div[@role='list'])[7]"));
			
			UserList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+UserAssign+"'])[2]")).click();
			
			Actions action = new Actions(driver);
			
			action.doubleClick(TeamPopup);
			
		// Team Creation
			
			driver.findElement(By.xpath("//div[normalize-space()='Create']")).click();
			
			Thread.sleep(5000);
			
		// Close the Snakbar
			
			driver.findElement(By.xpath("//button[@class='v-btn v-btn--flat theme--light pink--text']//div[@class='v-btn__content'][normalize-space()='Close']")).click();

		
		}
		
		//Channel 
		
		else if(TeamType.equalsIgnoreCase("Channel")) {
			
			driver.findElement(By.xpath("(//div[@class='v-select__selections'])[6]")).click();
			
			Thread.sleep(1000);
			
			WebElement ChannelList = driver.findElement(By.xpath("(//div[@role='list'])[1]"));
			
			ChannelList.findElement(By.xpath("(//div[contains(text(),'"+Channel+"')])[1]")).click();
			
			TeamPopup.click();
			
			// Campaign 
			
			driver.findElement(By.xpath("(//i[@aria-hidden='true'][normalize-space()='arrow_drop_down'])[7]")).click();
			
			Thread.sleep(1000);
			
			WebElement CampaignList = driver.findElement(By.xpath("(//div[@role='list'])[8]"));
			
			CampaignList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+Campaign+"'])[2]")).click();
			
			TeamPopup.click();
			
			
			
		// User Assign
			
			driver.findElement(By.xpath("(//i[@class='v-icon material-icons theme--light'][normalize-space()='arrow_drop_down'])[8]")).click();
			
			Thread.sleep(1000);
			
			WebElement UserList = driver.findElement(By.xpath("(//div[@role='list'])[7]"));
			
			UserList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+UserAssign+"'])[2]")).click();
			
			Actions action = new Actions(driver);
			
			action.doubleClick(TeamPopup);
			
		// Team Creation
			
			driver.findElement(By.xpath("//div[normalize-space()='Create']")).click();
			
			Thread.sleep(5000);
			
		// Close the Snakbar
			
			driver.findElement(By.xpath("//button[@class='v-btn v-btn--flat theme--light pink--text']//div[@class='v-btn__content'][normalize-space()='Close']")).click();

		
			
			
		}
		
		else if(TeamType.equalsIgnoreCase("All")) {
			
		//Lead Source
			
			driver.findElement(By.xpath("(//i[@aria-hidden='true'][normalize-space()='arrow_drop_down'])[6]")).click();
		
			Thread.sleep(1000);
			
			WebElement Lead = driver.findElement(By.xpath("(//div[@role='list'])[2]"));
			
			Lead.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+LeadSource+"'])[1]")).click();
			
			Thread.sleep(1000);
			
			TeamPopup.click();
			
		// Channel
			
			driver.findElement(By.xpath("(//i[@aria-hidden='true'][normalize-space()='arrow_drop_down'])[7]")).click();
			
			Thread.sleep(1000);
			
			WebElement Channel = driver.findElement(By.xpath("(//div[@role='list'])[1]"));
			
			Channel.findElement(By.xpath("(//div[contains(text(),'"+Channel+"')])[1]")).click();
			
			Thread.sleep(1000);
			
			TeamPopup.click();

		
	// Campaign 
		
		driver.findElement(By.xpath("(//i[@aria-hidden='true'][normalize-space()='arrow_drop_down'])[7]")).click();
		
		Thread.sleep(1000);
		
		WebElement CampaignList = driver.findElement(By.xpath("(//div[@role='list'])[8]"));
		
		CampaignList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+Campaign+"'])[2]")).click();
		
		TeamPopup.click();
		
		
		
	// User Assign
		
		driver.findElement(By.xpath("(//i[@class='v-icon material-icons theme--light'][normalize-space()='arrow_drop_down'])[8]")).click();
		
		Thread.sleep(1000);
		
		WebElement UserList = driver.findElement(By.xpath("(//div[@role='list'])[7]"));
		
		UserList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+UserAssign+"'])[2]")).click();
		
		Actions action = new Actions(driver);
		
		action.doubleClick(TeamPopup);
		
	// Team Creation
		
		driver.findElement(By.xpath("//div[normalize-space()='Create']")).click();
		
		Thread.sleep(5000);
		
	// Close the Snakbar
		
		driver.findElement(By.xpath("//button[@class='v-btn v-btn--flat theme--light pink--text']//div[@class='v-btn__content'][normalize-space()='Close']")).click();

		}
	}

}
