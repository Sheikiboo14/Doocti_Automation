package Admin_UsersGroups_CreateFlow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Create_Team extends AdminLogin {
	/*
	String team_name ;
	
	String team_description ;
	
	String team_type ;
	
	String team_campaign ;
	
	String team_leadsource ;
	
	String team_channel ;
	
	String team_user ;
	
	*/
	
	@BeforeTest
	public void Setip() throws InterruptedException {
		
		driver.findElement(By.xpath("//div[contains(text(),'Users & Groups')]")).click();
		
		Thread.sleep(1000);
		
		//Going to Team Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Team'])[1]")).click();

	

	}
	
	@Parameters({"team_name","team_description","team_type","team_campaign","team_leadsource","team_channel","team_user"})
	@Test
	public void Create_Team(String team_name , String team_description , String team_type , String team_campaign ,String team_leadsource ,String team_channel , String team_user ) throws InterruptedException {
		
		// Opening Create Team Popup
		
		Actions action = new Actions(driver);
		
		// Opening Create Team Popup
		
		driver.findElement(By.xpath("(//div[normalize-space()='Add Team'])[1]")).click();
		
		Thread.sleep(1000);		

		//Team Name
		
		driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")).sendKeys(team_name);
		
		//Team Description
		
		driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")).sendKeys(team_description);
		
		//Team Type
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[5]")).click();
		
		Thread.sleep(1000);
	
		driver.findElement(By.xpath("(//div[@role='list'])[8]"));
		
		driver.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+team_type+"'])[2]")).click();
		
		action.click().build().perform();		
		
		String TeamType = driver.findElement(By.xpath("(//div[@class='v-select__selections'])[5]")).getText();
		
		System.out.println(TeamType);
		
		//Lead Source
		
		if(TeamType.equalsIgnoreCase("Lead Source")) {
			
			
			driver.findElement(By.xpath("(//div[@class='v-select__selections'])[6]")).click();
			
			Thread.sleep(1000);
			
			WebElement Lead_Source =driver.findElement(By.xpath("(//div[@role='list'])[1]"));
			
			Lead_Source.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+team_leadsource+"'])[1]")).click();
			
			action.click().build().perform();
			// Campaign 
			
			driver.findElement(By.xpath("(//i[@aria-hidden='true'][normalize-space()='arrow_drop_down'])[7]")).click();
			
			Thread.sleep(1000);
			
			WebElement CampaignList = driver.findElement(By.xpath("(//div[@role='list'])[8]"));
			
			CampaignList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+team_campaign+"'])[2]")).click();
			
			action.click().build().perform();			
			
			
		// User Assign
			
			driver.findElement(By.xpath("(//i[@class='v-icon material-icons theme--light'][normalize-space()='arrow_drop_down'])[8]")).click();
			
			Thread.sleep(1000);
			
			WebElement UserList = driver.findElement(By.xpath("(//div[@role='list'])[7]"));
			
			UserList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+team_user+"'])[2]")).click();
			
			
			action.doubleClick().build().perform();
			
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
			
			ChannelList.findElement(By.xpath("(//div[contains(text(),'"+team_channel+"')])[1]")).click();
			
			action.click().build().perform();			
			// Campaign 
			
			driver.findElement(By.xpath("(//i[@aria-hidden='true'][normalize-space()='arrow_drop_down'])[7]")).click();
			
			Thread.sleep(1000);
			
			WebElement CampaignList = driver.findElement(By.xpath("(//div[@role='list'])[8]"));
			
			CampaignList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+team_campaign+"'])[2]")).click();
			
			action.click().build().perform();			
			
			
		// User Assign
			
			driver.findElement(By.xpath("(//i[@class='v-icon material-icons theme--light'][normalize-space()='arrow_drop_down'])[8]")).click();
			
			Thread.sleep(1000);
			
			WebElement UserList = driver.findElement(By.xpath("(//div[@role='list'])[7]"));
			
			UserList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+team_user+"'])[2]")).click();
			
			
			action.doubleClick().build().perform();
			
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
			
			Lead.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+team_leadsource+"'])[1]")).click();
			
			Thread.sleep(1000);
			
			action.click().build().perform();
			
		// Channel
			
			driver.findElement(By.xpath("(//i[@aria-hidden='true'][normalize-space()='arrow_drop_down'])[7]")).click();
			
			Thread.sleep(1000);
			
			WebElement ChannelList = driver.findElement(By.xpath("(//div[@role='list'])[1]"));
			
			ChannelList.findElement(By.xpath("(//div[contains(text(),'"+team_channel+"')])[1]")).click();
			
			Thread.sleep(1000);
			
			action.click().build().perform();
		
	// Campaign 
		
		driver.findElement(By.xpath("(//i[@class='v-icon material-icons theme--light'][normalize-space()='arrow_drop_down'])[8]")).click();
		
		Thread.sleep(1000);
		
		WebElement CampaignList = driver.findElement(By.xpath("(//div[@role='list'])[8]"));
		
		CampaignList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+team_campaign+"'])[2]")).click();
		
		action.click().build().perform();		
		
		
	// User Assign
		
		driver.findElement(By.xpath("(//i[@class='v-icon material-icons theme--light'][normalize-space()='arrow_drop_down'])[9]")).click();
		
		Thread.sleep(1000);
		
		WebElement UserList = driver.findElement(By.xpath("(//div[@role='list'])[7]"));
		
		UserList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+team_user+"'])[2]")).click();
		
		
		action.doubleClick().build().perform();
		
	// Team Creation
		
		driver.findElement(By.xpath("//div[normalize-space()='Create']")).click();
		
		Thread.sleep(5000);
		
	// Close the Snakbar
		
		driver.findElement(By.xpath("//button[@class='v-btn v-btn--flat theme--light pink--text']//div[@class='v-btn__content'][normalize-space()='Close']")).click();
				
				
		}
	// Verification
		
		List<WebElement> Alldatas = driver.findElements(By.xpath("//table[contains(@class,'v-datatable')]//tr//td[1]"));
		
		boolean flag = false;
		
		for(WebElement Data : Alldatas) {
			
			String value = Data.getText();
			
			if(value.contains(team_name)) {
				
				flag = true;
			}
		}
		
		Assert.assertTrue(flag,"Team is Not Created...!");

	}
}
