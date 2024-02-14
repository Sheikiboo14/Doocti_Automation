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

public class CreatingWhatsappBlastCampaign extends AdminLogin {
	
	/*
	String campaign_Name="VoiceBlast Campaign";

	int dialprefix = 3;

	String industry_Name = "IT";

	String template_Name ="Dialer";

	int bfLevel = 100;
	
	float dialratio = 1.4f;
	
	String wpType = "Text";
	
	String wpTemplate = "hello_world";
	
	String wpLanguage = "en_US";
	*/
	
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
	@Parameters({"campaign_Name","dialprefix","industry_Name","template_Name","bfLevel","dialratio","wpType","wpTemplate","wpLanguage"})

	@Test(priority = 0)
	public void Create_WhatsappBlastCampaign(String campaign_Name, int dialprefix, String industry_Name, String  template_Name, int bfLevel, float dialratio, String wpType , String wpTemplate, String wpLanguage ) throws InterruptedException {
		
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
		
		TypeList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='VOICE BLAST'])[3]")).click();
		
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
						
		TemplateName.findElement(By.xpath("(//div[text()='"+template_Name+"'])[3]")).click();
						
		action.click().build().perform();
		
//Start Time
		
		driver.findElement(By.xpath("(//input[@aria-label='Start Time'])[1]")).click();
	
		Thread.sleep(1000);
		
		WebElement clock = driver.findElement(By.xpath("//div[@class='v-time-picker-clock__container']"));
		
		clock.findElement(By.xpath("(//span[contains(text(),'1')])[1]")).click();
		
		clock.findElement(By.xpath("//span[contains(text(),'00')]")).click();
		
		action.click().build().perform();
//Day
		
		driver.findElement(By.xpath("(//input[@aria-label='Days'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement daysList = driver.findElement(By.xpath("(//div[@role='list'])[2]"));
		
		daysList.findElement(By.xpath("//div[contains(text(),'Sunday')]")).click();
		
		daysList.findElement(By.xpath("//div[contains(text(),'Monday')]")).click();
		
		daysList.findElement(By.xpath("//div[contains(text(),'Tuesday')]")).click();
		
		daysList.findElement(By.xpath("//div[contains(text(),'Wednesday')]")).click();
		
		daysList.findElement(By.xpath("//div[contains(text(),'Thursday')]")).click();
		
		daysList.findElement(By.xpath("//div[contains(text(),'Friday')]")).click();
		
		daysList.findElement(By.xpath("//div[contains(text(),'Saturday')]")).click();
		
		action.click().build().perform();
		
//End Time
		
		driver.findElement(By.xpath("(//input[@aria-label='End Time'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement endClock = driver.findElement(By.xpath("//div[@class='v-time-picker-clock__container']"));
		
		endClock.findElement(By.xpath("//span[contains(text(),'10')]")).click();
		
		endClock.findElement(By.xpath("//span[contains(text(),'00')]")).click();
		
		
//Dial Prefix
		
		WebElement dialPrefix = driver.findElement(By.xpath("(//input[@aria-label='Dial Prefix'])[2]"));
		
		dialPrefix.sendKeys(Integer.toString(dialprefix));	

//Whatsapp Type
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[20]")).click();
		
		Thread.sleep(1000);
		
		WebElement WhatsappType = driver.findElement(By.xpath("(//div[@role='list'])[3]"));
		
		WhatsappType.findElement(By.xpath("//div[contains(text(),'"+wpType+"')]")).click();
		
		action.click().build().perform();
		
// Whatsapp Tempalate
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[21]")).click();
		
		Thread.sleep(1000);
		
		WebElement WpTempList = driver.findElement(By.xpath("(//div[@role='list'])[2]"));
		
		WpTempList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+wpTemplate+"'])[1]")).click();
		
		action.click().build().perform();
		
		
//	Whatsapp Language
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[22]")).click();
		
		Thread.sleep(1000);
		
		WebElement WpLangList = driver.findElement(By.xpath("(//div[@role='list'])[1]"));
		
		WpLangList.findElement(By.xpath("//div[contains(text(),'"+wpLanguage+"')]")).click();
		
		action.click().build().perform();
	
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

		Assert.assertTrue(flag, "Power Campaign is not Created...!");
	}
	

}
