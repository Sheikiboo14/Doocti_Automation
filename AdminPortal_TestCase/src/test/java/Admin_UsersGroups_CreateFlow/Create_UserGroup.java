package Admin_UsersGroups_CreateFlow;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Create_UserGroup extends AdminLogin {
	
	String GroupName = "Testing";
	
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(text(),'Users & Groups')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//span[normalize-space()='User Group'])[1]")).click();
		
		// Add Group Name
		
		driver.findElement(By.xpath("(//i[@class='v-icon add_circle v-icon--link material-icons theme--light green--text'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Group Name
		
		driver.findElement(By.xpath("(//input[@aria-label='New Group'])[1]")).sendKeys(GroupName);
		
		// Save the group name
		
		driver.findElement(By.xpath("(//div[normalize-space()='Save'])[1]")).click();
		
		Thread.sleep(1000);
		
		//Close Snakbar
		
		driver.findElement(By.xpath("(//div[normalize-space()='Close'])[1]")).click();
		
		Thread.sleep(1000);
	}
	
	@Test
	public void Create_UserGroup() throws InterruptedException {
	
	//Real Time
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Real Time'])[1]")).click();
		
		//Live Agent
		
		driver.findElement(By.xpath("(//div[contains(text(),'Live Agents')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		
		// Live Calls
		
		driver.findElement(By.xpath("(//div[contains(text(),'Live Calls')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[7]")).click();
		
		// Live Status
		
		driver.findElement(By.xpath("(//div[contains(text(),'Live Status')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@id='event.name'])[3]")).click();
		
		//Save 
		
//		driver.findElement(By.xpath("(//i[@class='v-icon saveIcon v-icon--link material-icons theme--light'])[1]")).click();
//		
//		Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("(//div[normalize-space()='Yes, Save !'])[1]")).click();
		
		//Close Snakbar
		
//		driver.findElement(By.xpath("(//div[normalize-space()='Close'])[1]")).click();
		
	//Report
		
		driver.findElement(By.xpath("(//div[contains(text(),'reports')])[1]")).click();
		
		// Recordings
		
		driver.findElement(By.xpath("(//div[contains(text(),'Recording')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		
		// Call Details
		
		driver.findElement(By.xpath("(//div[contains(text(),'Call Detail')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[5]")).click();
		
		// Agent Performance
		
		driver.findElement(By.xpath("(//div[contains(text(),'Agent Performance')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).click();
		
		// Agent Activity
		
		driver.findElement(By.xpath("(//div[contains(text(),'Agent Activity')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[11]")).click();
		
		// Queue Performance
		
		driver.findElement(By.xpath("(//div[contains(text(),'Queue Performance')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[14]")).click();

		// Missed Call
		
		driver.findElement(By.xpath("(//div[contains(text(),'Missed Call')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[17]")).click();
		
		// Droped Call
		
		driver.findElement(By.xpath("(//div[contains(text(),'Droped Call')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[20]")).click();

		// Agent Pause
		
		driver.findElement(By.xpath("(//div[contains(text(),'Agent Pause')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[22]")).click();
		
		// Agent Disposition
		
		driver.findElement(By.xpath("(//div[contains(text(),'Agent Dispo')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[25]")).click();
		
		// Abandoned Summary
		
		driver.findElement(By.xpath("(//div[contains(text(),'Abandoned Summary')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[28]")).click();
		
		// Effective Abandon
		
		driver.findElement(By.xpath("(//div[contains(text(),'Effective Abandon')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[31]")).click();
		
		// Call Summary
		
		driver.findElement(By.xpath("(//div[contains(text(),'Call Summary')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[34]")).click();
		
		// Ticket By Agent
		
		driver.findElement(By.xpath("(//div[contains(text(),'Ticket By Agent')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[37]")).click();
		
		// Whatsapp By Agent
		
		driver.findElement(By.xpath("(//div[contains(text(),'Whatsapp By Agent')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[40]")).click();
		
		// Webapp Chatlog
		
		driver.findElement(By.xpath("(//div[contains(text(),'Whatsappchatlog')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[43]")).click();
		
		// Whatsapp Details
		
		driver.findElement(By.xpath("(//div[contains(text(),'Whatsappdetail')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[46]")).click();
		
	//Management
		
		driver.findElement(By.xpath("(//div[contains(text(),'management')])[1]")).click();
		
		//User
		
		driver.findElement(By.xpath("(//div[@class='sub-menu'][normalize-space()='User'])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		
		//Queue
		
		driver.findElement(By.xpath("(//div[contains(text(),'Queue')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).click();
		
		//Tags
		
		driver.findElement(By.xpath("(//div[contains(text(),'Tags')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[10]")).click();
		
		//Team
		
		driver.findElement(By.xpath("(//div[contains(text(),'Team')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[12]")).click();
		
		//Channel
		
		driver.findElement(By.xpath("(//div[contains(text(),'Channel')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[17]")).click();
		
		//Source
		
		driver.findElement(By.xpath("(//div[contains(text(),'Source')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[22]")).click();
		
	// Configuration
		
		driver.findElement(By.xpath("(//div[contains(text(),'configurations')])[1]")).click();
		
		// User Group
		
		driver.findElement(By.xpath("(//div[@class='sub-menu'][normalize-space()='User Group'])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[6]")).click();
		
		// Pause Code
		
		driver.findElement(By.xpath("(//div[contains(text(),'Pause Code')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[11]")).click();
		
		// Disposition
		
		driver.findElement(By.xpath("(//div[@class='sub-menu'][normalize-space()='Disposition'])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[16]")).click();
		
		// Audio Store
		
		driver.findElement(By.xpath("(//div[contains(text(),'Audio Store')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[21]")).click();
		
		// Block List
		
		driver.findElement(By.xpath("(//div[contains(text(),'Block List')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[26]")).click();
		
		// Inbound Route
		
		driver.findElement(By.xpath("(//div[contains(text(),'Inbound Route')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[32]")).click();
		
		// Sub-Disposition
		
		driver.findElement(By.xpath("(//div[contains(text(),'Sub-Disposition')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[42]")).click();
		
		// Announcement
		
		driver.findElement(By.xpath("(//div[contains(text(),'Announcement')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[47]")).click();
		
		// Script
		
		driver.findElement(By.xpath("(//div[contains(text(),'Script')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[52]")).click();
		
		// DID Number
		
		driver.findElement(By.xpath("(//div[contains(text(),'DID Number')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[67]")).click();
		
		// Lead Status
		
		driver.findElement(By.xpath("(//div[contains(text(),'Lead Status')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[73]")).click();
	
		// Ticketstatus
		
		driver.findElement(By.xpath("(//div[contains(text(),'Ticketstatus')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[88]")).click();
		
	//Leads
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Leads'])[1]")).click();
		
		//Tickets
		
		driver.findElement(By.xpath("(//div[contains(text(),'Tickets')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		
		//Contacts
		
		driver.findElement(By.xpath("(//div[contains(text(),'Contacts')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[9]")).click();
		
		//Campaigns
		
		driver.findElement(By.xpath("(//div[contains(text(),'Campaigns')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[16]")).click();
		
		//List
		
		driver.findElement(By.xpath("(//div[contains(text(),'List')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[21]")).click();
		
		//Lead
		
		driver.findElement(By.xpath("(//div[@class='sub-menu'][normalize-space()='Lead'])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[27]")).click();
		
		//Custom Form
		
		driver.findElement(By.xpath("(//div[contains(text(),'Custom Form')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[36]")).click();
		
		//Token Generation
		
		driver.findElement(By.xpath("(//div[contains(text(),'Token Generation')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[41]")).click();
		
		//Meetings
		
		driver.findElement(By.xpath("(//div[contains(text(),'Meetings')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[43]")).click();
		
	//Form Builder
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Form Builder'])[1]")).click();
		
		//Form
		
		driver.findElement(By.xpath("(//div[@class='sub-menu'])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@id='event.name'])[1]")).click();
		
	//Save 
		
		driver.findElement(By.xpath("(//i[@class='v-icon saveIcon v-icon--link material-icons theme--light'])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//div[normalize-space()='Yes, Save !'])[1]")).click();
		
		Thread.sleep(1000);
		
	//Close Snakbar
		
		driver.findElement(By.xpath("(//div[normalize-space()='Close'])[1]")).click();
	}

}
