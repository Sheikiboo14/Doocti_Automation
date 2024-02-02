package Admin_CRM_CreateFlow;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class CreatingPreviewCampaign extends AdminLogin {

//		
//	String campaign_Name="Preview 1";
//	
//	int dialprefix = 3;
//	
//	String industry_Name = "IT";
// 
//	String template_Name ="Dialer";
//	
//	String queue_Name = "smibrahim_8071893401";
//
//	String pauseCode1 ="Meeting";
//	
//	String pauseCode2 ="Lunch";
//	
//	String pauseCode3 ="Tea Break";
//	
//	String dispo1 ="Reassign";
//	
//	String dispo2 ="CALLBACK";
//	
//	String dispo3 ="Interested";
//	
//	String dial1 = "CALLBACK";
//	
//	String dial2 = "Reassign";
//	
//	String dial3 = "Interested";
//	
//	String script ="Testing";
	
	
	@BeforeTest
	public void Setup() {
		
		driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();
		
		driver.findElement(By.xpath("(//span[normalize-space()='Campaigns'])[1]")).click();
		
		driver.findElement(By.xpath("//div[normalize-space()='Add Campaign']")).click();
		
		try {
			
			Thread.sleep(1000);
		
		} 
		
		catch (InterruptedException e) {
		
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}

	}
	
	@Parameters({"campaign_Name","dialprefix","industry_Name","template_Name","queue_Name","pauseCode1","pauseCode2","pauseCode3","dispo1","dispo2","dispo3","dial1","dial2","dial3","script"})
	@Test
	public void Create_PreviewCampaign(String campaign_Name, int dialprefix, String industry_Name, String template_Name, String queue_Name, String pauseCode1, String pauseCode2, String pauseCode3, String dispo1, String dispo2, String dispo3,String dial1, String dial2,String dial3, String script ) throws InterruptedException {
		
		Actions action = new Actions(driver);	
		
//Adding Campaign Name
		
		driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")).sendKeys(campaign_Name);
		
		
//Selecting Process
				
		
		driver.findElement(By.xpath("(//i[@aria-hidden='true'][normalize-space()='arrow_drop_down'])[15]")).click();
		
		Thread.sleep(1000);
		
		WebElement processList = driver.findElement(By.xpath("(//div[@role='list'])[32]"));
		
		processList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='Leads'])[2]")).click();
		
		processList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='Tickets'])[2]")).click();
		
		processList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='Meetings'])[2]")).click();
		
		action.click().build().perform();

//Selecting Type
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[15]")).click();
		
		Thread.sleep(1000);
		
		WebElement TypeList = driver.findElement(By.xpath("(//div[@role='list'])[30]")); 
		
		TypeList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='PREVIEW'])[3]")).click();
		
		action.click().build().perform();
		
	/*
//Selecting Outbound Caller ID
 	
 		driver.findElement(By.xpath("(//input[@aria-label='Outbound Caller ID'])[2]").click();
		
		WebElement OBCallerID = driver.findElement(By.xpath("(//div[@role='list'])[29]"));
		
		OBCallerID.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='9876543217'])[2]")).click();
		
		action.click().build().perform();
				
		*/
//Industry Selection
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[16]")).click();
		
		Thread.sleep(1000);
		
		WebElement IndustryOption = driver.findElement(By.xpath("(//div[@role='list'])[28]"));
		
		IndustryOption.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+industry_Name+"'])[2]")).click();
		
		action.click().build().perform();

//Template Name
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[17]")).click();
		
		Thread.sleep(1000);
		
		WebElement TemplateName =driver.findElement(By.xpath("(//div[@role='list'])[27]"));
		
		TemplateName.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+template_Name+"'])[2]")).click();
		
		action.click().build().perform();
		

//Add Queue
		
		driver.findElement(By.xpath("(//input[@aria-label='Add Queue'])[2]")).click();
		
		Thread.sleep(1000);
		
		WebElement queueList = driver.findElement(By.xpath("(//div[@role='list'])[25]"));
		
		queueList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+queue_Name+"'])[2]")).click();
		
		action.click().build().perform();
		
		
		
//Pause Code Selection
		
		driver.findElement(By.xpath("(//input[@aria-label='Pause Code'])[2]")).click();
		
		Thread.sleep(1000);
		
		WebElement pausecodeList = driver.findElement(By.xpath("(//div[@role='list'])[24]"));
			
		pausecodeList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+pauseCode1+"'])[2]")).click();
		
		pausecodeList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+pauseCode2+"'])[2]")).click();
		
		pausecodeList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+pauseCode3+"'])[2]")).click();
	
		action.click().build().perform();

		
//Dial Status Selection
		
		driver.findElement(By.xpath("(//input[@aria-label='Dial Status'])[2]")).click();
		
		Thread.sleep(1000);
		
		WebElement dialList  = driver.findElement(By.xpath("(//div[@role='list'])[23]"));
		
		dialList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+dial1+"'])[4]")).click();
		
		dialList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+dial2+"'])[4]")).click();
		
		dialList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+dial3+"'])[4]")).click();

		action.click().build().perform();
		
		
//Dispo Status Selection
		
		driver.findElement(By.xpath("(//input[@aria-label='Dispo Status'])[2]")).click();
		
		Thread.sleep(1000);
		
		WebElement dispolist = driver.findElement(By.xpath("(//div[@role='list'])[22]"));
		
		driver.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+dispo1+"'])[3]")).click();
		
		driver.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+dispo2+"'])[3]")).click();
		
		driver.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+dispo3+"'])[3]")).click();
		
		action.click().build().perform();

			
//On Demand Enabling
		
		driver.findElement(By.xpath("(//label[@class='v-label theme--light'][normalize-space()='On Demand Recording'])[2]")).click();
		
		
		
//Dial Prefix
		
//		WebElement dialPrefix = driver.findElement(By.xpath("(//input[@aria-label='Dial Prefix'])[2]"));
//		
//		dialPrefix.sendKeys(Integer.toString(dialprefix));
		
//Script Selection
		
		driver.findElement(By.xpath("(//i[@aria-hidden='true'][normalize-space()='arrow_drop_down'])[27]")).click();
		
		Thread.sleep(1000);
		
		WebElement Script = driver.findElement(By.xpath("(//div[@role='list'])[20]"));
		
		Script.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+script+"'])[2]")).click();
	
//DNC Check
		
		driver.findElement(By.xpath("(//label[@class='v-label theme--light'][normalize-space()='DNC check'])[2]")).click();
		
//Call Masking
		
		driver.findElement(By.xpath("(//label[@class='v-label theme--light'][normalize-space()='Call Masking'])[2]")).click();
		
//Time Zone
		
		driver.findElement(By.xpath("(//label[@class='v-label theme--light'][normalize-space()='Timezone'])[2]")).click();
		
// Creating Campaign
		
		
		driver.findElement(By.xpath("//div[normalize-space()='Create']")).click();
		
		Thread.sleep(1000);
		
	//Close the snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[4]")).click();
		
	// Verification
		
		List<WebElement> Alldatas = driver.findElements(By.xpath("//table[contains(@class,'v-datatable')]//tr//td[1]"));
		
		boolean flag = false;
		
		for(WebElement Data : Alldatas) {
			
			String value = Data.getText();
			
			if(value.contains(campaign_Name)) {
				
				flag = true;
			}
		}
		
		Assert.assertTrue(flag, "Campaign is not Created...!");

	}
	
	

	
}
