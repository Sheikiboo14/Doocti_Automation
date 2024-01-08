package Campaign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Login.AdminLogin;
public class CreateCamapign extends AdminLogin{

	String Campaign1="Preview 3";
	
	String Campaign2="Inbound 1";

	String Campaign3="Predictive 1";

	String Campaign4="Power 1";

	String Campaign5="Voice Blast 1";

	String Campaign6="Whatsapp Blast 1";

	
	int dialprefix = 3;
	
	String Industry = "IT";
 	
	String Template ="Testing";
	
	String Queue = "smibrahim_8071893401";

	String PauseCode ="Meeting";
	
	String PauseCode1 ="Lunch";
	
	String PauseCode2 ="Tea Break";
	
	String Dispo ="ANSWER";
	
	String Dispo1 ="CALLBACK";
	
	String Dispo2 ="Reassign";
	
	String script ="Testing";
	
	
	int BfLevel = 100;
	
	float dialratio = 1.4f;
	
	String WpType = "Text";
	
	String WpTemplate = "hello_world";
	
	String WpLanguage = "en_US";

	
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
			
	driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();
	
	driver.findElement(By.xpath("//span[normalize-space()='Campaigns']")).click();
	
	}
	
	@Test(priority = 0 , enabled = true)
	public void PreviewCampaign() throws InterruptedException {
		
		driver.findElement(By.xpath("//div[normalize-space()='Add Campaign']")).click();
		
		Thread.sleep(1000);
		
		//Adding Preview Campaign 
		
				driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']//input[@aria-label='Name']")).sendKeys(Campaign1);
				
				System.out.println(driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']//input[@aria-label='Name']")).getAttribute("value"));
				
				Thread.sleep(1000);
				
		//Selecting Process
				
				WebElement CampaignPopup = driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']//div[@class='container grid-list-md']"));
				
				
				driver.findElement(By.xpath("//body/div[@id='app']/div[@class='v-dialog__content v-dialog__content--active']/div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']/div[@class='v-card v-sheet theme--light']/div[@class='v-card__text']/form[@class='v-form']/div[@class='container grid-list-md']/div[@class='layout wrap']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
				
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='v-list__tile__title'][normalize-space()='Leads']")).click();
				
				Thread.sleep(1000);
				
				CampaignPopup.click();
				
				driver.findElement(By.xpath("//body/div[@id='app']/div[@class='v-dialog__content v-dialog__content--active']/div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']/div[@class='v-card v-sheet theme--light']/div[@class='v-card__text']/form[@class='v-form']/div[@class='container grid-list-md']/div[@class='layout wrap']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
				
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='v-list__tile__title'][normalize-space()='Tickets']")).click();

				CampaignPopup.click();
				
				driver.findElement(By.xpath("//body/div[@id='app']/div[@class='v-dialog__content v-dialog__content--active']/div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']/div[@class='v-card v-sheet theme--light']/div[@class='v-card__text']/form[@class='v-form']/div[@class='container grid-list-md']/div[@class='layout wrap']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
				
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='v-list__tile__title'][normalize-space()='Meetings']")).click();

				CampaignPopup.click();

		//Selecting Type
				
				driver.findElement(By.xpath("(//div[@class='v-select__selections'])[15]")).click();
				
				Thread.sleep(1000);
				
				WebElement TypeList = driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@role='list']")); 
				
				TypeList.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='v-list__tile__title'][normalize-space()='PREVIEW']")).click();
				
			/*
		//Selecting Outbound Caller ID
				
				WebElement OBCallerID = driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']//input[@aria-label='Outbound Caller ID']"));
				
				OBCallerID.click();
				
				Thread.sleep(1000);
				
				WebElement OBCallerIDValue = driver.findElement(By.xpath("(//div[@class='v-list__tile__content'])[141]"));
				
				OBCallerIDValue.click();
				
				CampaignPopup.click();
			
				Thread.sleep(1000);
				
				*/
		//Industry Selection
				
				driver.findElement(By.xpath("(//div[@class='v-select__selections'])[16]")).click();
				
				Thread.sleep(1000);
				
				WebElement IndustryOption = driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@role='list']"));
				
				IndustryOption.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='v-list__tile__title'][normalize-space()='"+Industry+"']")).click();
				
				CampaignPopup.click();

		//Template Name
				
				driver.findElement(By.xpath("(//div[@class='v-select__selections'])[17]")).click();
				
				Thread.sleep(1000);
				
				WebElement TemplateName =driver.findElement(By.xpath("(//div[@role='list'])[28]"));
				
				TemplateName.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+Template+"'])[3]")).click();
				
				CampaignPopup.click();
				

		//Add Queue
				
				driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Add Queue')]")).click();
				
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]//div[contains(@class,'v-list__tile__title')][normalize-space()='"+Queue+"']")).click();
				
				CampaignPopup.click();
				
				
				
		//Pause Code Selection
				
				driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Pause Code')]")).click();
				
				Thread.sleep(1000);
					
				driver.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]//div[contains(@class,'v-list__tile__title')][normalize-space()='"+PauseCode+"']")).click();
			
				CampaignPopup.click();

				driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Pause Code')]")).click();
				
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]//div[contains(@class,'v-list__tile__title')][normalize-space()='"+PauseCode1+"']")).click();
			
				CampaignPopup.click();
				
				driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Pause Code')]")).click();
				
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]//div[contains(@class,'v-list__tile__title')][normalize-space()='"+PauseCode2+"']")).click();
			
				CampaignPopup.click();
			
				/*	
		//Dial Status Selection
				
				driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Dial Status')]")).click();
				
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]//div[contains(@class,'v-list__tile__title')][normalize-space()='ANSWER']")).click();
				
				CampaignPopup.click();
				
				driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Dial Status')]")).click();
				
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]//div[contains(@class,'v-list__tile__title')][normalize-space()='CALLBACK']")).click();
				
				CampaignPopup.click();
				
				driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Dial Status')]")).click();
				
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]//div[contains(@class,'v-list__tile__title')][normalize-space()='Not Reachable']")).click();
				
				CampaignPopup.click();
				*/
				
				
				
		//Dispo Status Selection
				
				driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Dispo Status')]")).click();
				
				Thread.sleep(1000);
				
				
				driver.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]//div[contains(@class,'v-list__tile__title')][normalize-space()='"+Dispo+"']")).click();
				
				CampaignPopup.click();
				
				driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Dispo Status')]")).click();
				
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]//div[contains(@class,'v-list__tile__title')][normalize-space()='"+Dispo1+"']")).click();
				
				CampaignPopup.click();
				
				driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Dispo Status')]")).click();
				
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]//div[contains(@class,'v-list__tile__title')][normalize-space()='"+Dispo2+"']")).click();
				
				CampaignPopup.click();
					
		//On Demand Enabling
				
				driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//label[contains(@class,'v-label theme--light')][normalize-space()='On Demand Recording']")).click();

		//Dial Prefix
				
//				WebElement DialPrefix = driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Dial Prefix')]"));
//				
//				DialPrefix.sendKeys(Integer.toString(dialprefix));
				
		//Script Selection
				
				driver.findElement(By.xpath("//body/div[@id='app']/div[contains(@class,'v-dialog__content v-dialog__content--active')]/div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]/div[contains(@class,'v-card v-sheet theme--light')]/div[contains(@class,'v-card__text')]/form[contains(@class,'v-form')]/div[contains(@class,'container grid-list-md')]/div[contains(@class,'layout wrap')]/div[16]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
				
				Thread.sleep(1000);
				
				WebElement Script = driver.findElement(By.xpath("//body/div[@id='app']/div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active')]/div[contains(@class,'v-select-list v-card theme--light')]/div[1]"));
				
				Script.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active')]//div[contains(@class,'v-list__tile__title')][normalize-space()='"+script+"']")).click();
			
		//DNC Check
				
				driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//label[contains(@class,'v-label theme--light')][normalize-space()='DNC check']")).click();
				
		//Call Masking
				
				driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//label[contains(@class,'v-label theme--light')][normalize-space()='Call Masking']")).click();
				
		//Time Zone
				
				driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//label[contains(@class,'v-label theme--light')][normalize-space()='Timezone']")).click();
				
		// Creating Campaign
				
				
				driver.findElement(By.xpath("//div[normalize-space()='Create']")).click();
				
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();

				
	}
	
	@Test(priority = 1, enabled = true)
	public void InboundCampaign() throws InterruptedException {
		
		driver.findElement(By.xpath("//div[normalize-space()='Add Campaign']")).click();
		
		Thread.sleep(1000);
		
		
		//Adding Inbound Campaign 
		
				driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']//input[@aria-label='Name']")).sendKeys(Campaign2);
				
				System.out.println(driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']//input[@aria-label='Name']")).getAttribute("value"));
				
				Thread.sleep(1000);
				
		//Selecting Process
				
				WebElement CampaignPopup = driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']//div[@class='container grid-list-md']"));
				
				
				driver.findElement(By.xpath("//body/div[@id='app']/div[@class='v-dialog__content v-dialog__content--active']/div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']/div[@class='v-card v-sheet theme--light']/div[@class='v-card__text']/form[@class='v-form']/div[@class='container grid-list-md']/div[@class='layout wrap']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
				
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='v-list__tile__title'][normalize-space()='Leads']")).click();
				
				Thread.sleep(1000);
				
				CampaignPopup.click();
				
				driver.findElement(By.xpath("//body/div[@id='app']/div[@class='v-dialog__content v-dialog__content--active']/div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']/div[@class='v-card v-sheet theme--light']/div[@class='v-card__text']/form[@class='v-form']/div[@class='container grid-list-md']/div[@class='layout wrap']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
				
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='v-list__tile__title'][normalize-space()='Tickets']")).click();

				CampaignPopup.click();
				
				driver.findElement(By.xpath("//body/div[@id='app']/div[@class='v-dialog__content v-dialog__content--active']/div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']/div[@class='v-card v-sheet theme--light']/div[@class='v-card__text']/form[@class='v-form']/div[@class='container grid-list-md']/div[@class='layout wrap']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
				
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='v-list__tile__title'][normalize-space()='Meetings']")).click();

				CampaignPopup.click();

		//Selecting Type
				
				driver.findElement(By.xpath("(//div[@class='v-select__selections'])[15]")).click();
				
				Thread.sleep(1000);
				
				WebElement TypeList = driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@role='list']")); 
				
				TypeList.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='v-list__tile__title'][normalize-space()='INBOUND']")).click();
				
			/*
		//Selecting Outbound Caller ID
				
				WebElement OBCallerID = driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']//input[@aria-label='Outbound Caller ID']"));
				
				OBCallerID.click();
				
				Thread.sleep(1000);
				
				WebElement OBCallerIDValue = driver.findElement(By.xpath("(//div[@class='v-list__tile__content'])[141]"));
				
				OBCallerIDValue.click();
				
				CampaignPopup.click();
				
				Thread.sleep(1000);
				*/
				
		//Industry Selection
				
				driver.findElement(By.xpath("(//div[@class='v-select__selections'])[16]")).click();
				
				Thread.sleep(1000);
				
				WebElement IndustryOption = driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@role='list']"));
				
				IndustryOption.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='v-list__tile__title'][normalize-space()='"+Industry+"']")).click();
				
				CampaignPopup.click();

		//Template Name
				
				driver.findElement(By.xpath("(//div[@class='v-select__selections'])[17]")).click();
				
				Thread.sleep(1000);
				
				WebElement TemplateName = driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@role='list']"));
				
				TemplateName.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+Template+"'])[3]")).click();
				
				CampaignPopup.click();
				
		//Add Queue
				
				driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Add Queue')]")).click();
				
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]//div[contains(@class,'v-list__tile__title')][normalize-space()='"+Queue+"']")).click();
				
				CampaignPopup.click();
				
		//Pause Code Selection
				
				driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Pause Code')]")).click();
				
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]//div[contains(@class,'v-list__tile__title')][normalize-space()='"+PauseCode+"']")).click();
			
				CampaignPopup.click();
				
				driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Pause Code')]")).click();
				
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]//div[contains(@class,'v-list__tile__title')][normalize-space()='"+PauseCode1+"']")).click();
			
				CampaignPopup.click();
				
				driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Pause Code')]")).click();
				
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]//div[contains(@class,'v-list__tile__title')][normalize-space()='"+PauseCode2+"']")).click();
			
				CampaignPopup.click();
			
		//Dial Status Selection
				
				driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Dial Status')]")).click();
				
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]//div[contains(@class,'v-list__tile__title')][normalize-space()='"+Dispo+"']")).click();
				
				CampaignPopup.click();
				
				driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Dial Status')]")).click();
				
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]//div[contains(@class,'v-list__tile__title')][normalize-space()='"+Dispo1+"']")).click();
				
				CampaignPopup.click();
				
				driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Dial Status')]")).click();
				
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]//div[contains(@class,'v-list__tile__title')][normalize-space()='"+Dispo2+"']")).click();
				
				CampaignPopup.click();
				
		//Dispo Status Selection
				
				driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Dispo Status')]")).click();
				
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]//div[contains(@class,'v-list__tile__title')][normalize-space()='"+Dispo+"']")).click();
				
				CampaignPopup.click();
				
				driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Dispo Status')]")).click();
				
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]//div[contains(@class,'v-list__tile__title')][normalize-space()='"+Dispo1+"']")).click();
				
				CampaignPopup.click();
				
				driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Dispo Status')]")).click();
				
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]//div[contains(@class,'v-list__tile__title')][normalize-space()='"+Dispo2+"']")).click();
				
				CampaignPopup.click();
				
		//On Demand Enabling
				
				driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//label[contains(@class,'v-label theme--light')][normalize-space()='On Demand Recording']")).click();

		//Dial Prefix
				
//				WebElement DialPrefix = driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Dial Prefix')]"));
//				
//				DialPrefix.sendKeys(Integer.toString(dialprefix));
				
		//Script Selection
				
				driver.findElement(By.xpath("//body/div[@id='app']/div[contains(@class,'v-dialog__content v-dialog__content--active')]/div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]/div[contains(@class,'v-card v-sheet theme--light')]/div[contains(@class,'v-card__text')]/form[contains(@class,'v-form')]/div[contains(@class,'container grid-list-md')]/div[contains(@class,'layout wrap')]/div[16]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
				
				Thread.sleep(1000);
				
				WebElement Script = driver.findElement(By.xpath("//body/div[@id='app']/div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active')]/div[contains(@class,'v-select-list v-card theme--light')]/div[1]"));
				
				Script.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active')]//div[contains(@class,'v-list__tile__title')][normalize-space()='"+script+"']")).click();
				
		//DNC Check
				
				driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//label[contains(@class,'v-label theme--light')][normalize-space()='DNC check']")).click();
				
		//Call Masking
				
				driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//label[contains(@class,'v-label theme--light')][normalize-space()='Call Masking']")).click();
				
		//Time Zone
				
				driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//label[contains(@class,'v-label theme--light')][normalize-space()='Timezone']")).click();
				
		// Creating Campaign
				
				
				driver.findElement(By.xpath("//div[normalize-space()='Create']")).click();
				
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();

	}
	
	@Test(priority = 2 , enabled = true)
	public void PredictiveCampaign() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//div[normalize-space()='Add Campaign']")).click();
		
		Thread.sleep(1000);
		
//Adding Predictive Campaign 
		
		driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']//input[@aria-label='Name']")).sendKeys(Campaign3);
		
		System.out.println(driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']//input[@aria-label='Name']")).getAttribute("value"));
		
		Thread.sleep(1000);
		
//Selecting Process
		
		WebElement CampaignPopup = driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']//div[@class='container grid-list-md']"));
		
		
		driver.findElement(By.xpath("//body/div[@id='app']/div[@class='v-dialog__content v-dialog__content--active']/div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']/div[@class='v-card v-sheet theme--light']/div[@class='v-card__text']/form[@class='v-form']/div[@class='container grid-list-md']/div[@class='layout wrap']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='v-list__tile__title'][normalize-space()='Leads']")).click();
		
		Thread.sleep(1000);
		
		CampaignPopup.click();
		
		driver.findElement(By.xpath("//body/div[@id='app']/div[@class='v-dialog__content v-dialog__content--active']/div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']/div[@class='v-card v-sheet theme--light']/div[@class='v-card__text']/form[@class='v-form']/div[@class='container grid-list-md']/div[@class='layout wrap']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='v-list__tile__title'][normalize-space()='Tickets']")).click();

		CampaignPopup.click();
		
		driver.findElement(By.xpath("//body/div[@id='app']/div[@class='v-dialog__content v-dialog__content--active']/div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']/div[@class='v-card v-sheet theme--light']/div[@class='v-card__text']/form[@class='v-form']/div[@class='container grid-list-md']/div[@class='layout wrap']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='v-list__tile__title'][normalize-space()='Meetings']")).click();

		CampaignPopup.click();

//Selecting Type
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[15]")).click();
		
		Thread.sleep(1000);
		
		WebElement TypeList = driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@role='list']")); 
		
		TypeList.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='v-list__tile__title'][normalize-space()='PREDICTIVE']")).click();
		
	/*
//Selecting Outbound Caller ID
		
		WebElement OBCallerID = driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']//input[@aria-label='Outbound Caller ID']"));
		
		OBCallerID.click();
		
		Thread.sleep(1000);
		
		WebElement OBCallerIDValue = driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content']//div[@class='v-list__tile__title'][normalize-space()='8071893319']"));
		
		OBCallerIDValue.click();
		
		CampaignPopup.click();
		
		Thread.sleep(1000);
		*/
//Industry Selection
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[16]")).click();
		
		Thread.sleep(1000);
		
		WebElement IndustryOption = driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@role='list']"));
		
		IndustryOption.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='v-list__tile__title'][normalize-space()='"+Industry+"']")).click();
		
		CampaignPopup.click();

//Template Name
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[17]")).click();
		
		Thread.sleep(1000);
		
		WebElement TemplateName = driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@role='list']"));
		
		TemplateName.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+Template+"'])[3]")).click();
		
		CampaignPopup.click();
		
//Add Queue
	
		driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Add Queue')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]//div[contains(@class,'v-list__tile__title')][normalize-space()='"+Queue+"']")).click();
		
		CampaignPopup.click();
		
//Pause Code Selection
		
		driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Pause Code')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]//div[contains(@class,'v-list__tile__title')][normalize-space()='"+PauseCode+"']")).click();
	
		CampaignPopup.click();
		
		driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Pause Code')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]//div[contains(@class,'v-list__tile__title')][normalize-space()='"+PauseCode1+"']")).click();
	
		CampaignPopup.click();
		
		driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Pause Code')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]//div[contains(@class,'v-list__tile__title')][normalize-space()='"+PauseCode2+"']")).click();
	
		CampaignPopup.click();
	
//Dial Status Selection
		
		driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Dial Status')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]//div[contains(@class,'v-list__tile__title')][normalize-space()='"+Dispo+"']")).click();
		
		CampaignPopup.click();
		
		driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Dial Status')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]//div[contains(@class,'v-list__tile__title')][normalize-space()='"+Dispo1+"']")).click();
		
		CampaignPopup.click();
		
		driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Dial Status')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]//div[contains(@class,'v-list__tile__title')][normalize-space()='"+Dispo2+"']")).click();
		
		CampaignPopup.click();
		
//Dispo Status Selection
		
		driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Dispo Status')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]//div[contains(@class,'v-list__tile__title')][normalize-space()='"+Dispo+"']")).click();
		
		CampaignPopup.click();
		
		driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Dispo Status')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]//div[contains(@class,'v-list__tile__title')][normalize-space()='"+Dispo1+"']")).click();
		
		CampaignPopup.click();
		
		driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Dispo Status')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]//div[contains(@class,'v-list__tile__title')][normalize-space()='"+Dispo2+"']")).click();
		
		CampaignPopup.click();
		
//Buffer Level
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[23]")).click();
		
		Thread.sleep(1000);
		
		WebElement BufferLevel = driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@role='list']"));
		
		BufferLevel.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+BfLevel+"'])[1]")).click();
		

//On Demand Enabling
				
		driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//label[contains(@class,'v-label theme--light')][normalize-space()='On Demand Recording']")).click();

//Dial Ratio 
				
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[24]")).click();
		
		Thread.sleep(1000);
				
		WebElement DialRatio = driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@role='list']"));
				
		DialRatio.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+dialratio+"'])[1]")).click();
		
//Script Selection
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[25]")).click();
		
		Thread.sleep(1000);
		
		WebElement Script = driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@role='list']"));
		
		Script.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='v-list__tile__title'][normalize-space()='"+script+"']")).click();
				
//DNC Check
		
		driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//label[contains(@class,'v-label theme--light')][normalize-space()='DNC check']")).click();
				
//Call Masking
				
		driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//label[contains(@class,'v-label theme--light')][normalize-space()='Call Masking']")).click();
				
//Time Zone
				
		driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//label[contains(@class,'v-label theme--light')][normalize-space()='Timezone']")).click();
				
// Creating Campaign
								
		driver.findElement(By.xpath("//div[normalize-space()='Create']")).click();
				
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();

	}
	
	@Test(priority = 3, enabled = true)
	public void PowerCampaign() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//div[normalize-space()='Add Campaign']")).click();
		
		Thread.sleep(1000);
		
//Adding Power Campaign 
		
		driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']//input[@aria-label='Name']")).sendKeys(Campaign4);
		
		System.out.println(driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']//input[@aria-label='Name']")).getAttribute("value"));
		
		Thread.sleep(1000);
		
//Selecting Process
		
		WebElement CampaignPopup = driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']//div[@class='container grid-list-md']"));
		
		
		driver.findElement(By.xpath("//body/div[@id='app']/div[@class='v-dialog__content v-dialog__content--active']/div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']/div[@class='v-card v-sheet theme--light']/div[@class='v-card__text']/form[@class='v-form']/div[@class='container grid-list-md']/div[@class='layout wrap']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='v-list__tile__title'][normalize-space()='Leads']")).click();
		
		Thread.sleep(1000);
		
		CampaignPopup.click();
		
		driver.findElement(By.xpath("//body/div[@id='app']/div[@class='v-dialog__content v-dialog__content--active']/div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']/div[@class='v-card v-sheet theme--light']/div[@class='v-card__text']/form[@class='v-form']/div[@class='container grid-list-md']/div[@class='layout wrap']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='v-list__tile__title'][normalize-space()='Tickets']")).click();

		CampaignPopup.click();
		
		driver.findElement(By.xpath("//body/div[@id='app']/div[@class='v-dialog__content v-dialog__content--active']/div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']/div[@class='v-card v-sheet theme--light']/div[@class='v-card__text']/form[@class='v-form']/div[@class='container grid-list-md']/div[@class='layout wrap']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='v-list__tile__title'][normalize-space()='Meetings']")).click();

		CampaignPopup.click();

//Selecting Type
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[15]")).click();
		
		Thread.sleep(1000);
		
		WebElement TypeList = driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@role='list']")); 
		
		TypeList.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='v-list__tile__title'][normalize-space()='POWER']")).click();
		
	/*
//Selecting Outbound Caller ID
		
		WebElement OBCallerID = driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']//input[@aria-label='Outbound Caller ID']"));
		
		OBCallerID.click();
		
		Thread.sleep(1000);
		
		WebElement OBCallerIDValue = driver.findElement(By.xpath("(//div[@class='v-list__tile__content'])[175]"));
		
		OBCallerIDValue.click();
		
		CampaignPopup.click();
		
		Thread.sleep(1000);
		*/
//Industry Selection
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[16]")).click();
		
		Thread.sleep(1000);
		
		WebElement IndustryOption = driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@role='list']"));
		
		IndustryOption.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='v-list__tile__title'][normalize-space()='"+Industry+"']")).click();
		
		CampaignPopup.click();

//Template Name
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[17]")).click();
		
		Thread.sleep(1000);
		
		WebElement TemplateName = driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@role='list']"));
		
		TemplateName.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+Template+"'])[3]")).click();
		
		CampaignPopup.click();
		
//Add Queue
		
		driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Add Queue')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]//div[contains(@class,'v-list__tile__title')][normalize-space()='"+Queue+"']")).click();
		
		CampaignPopup.click();
		
//Pause Code Selection
		
		driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Pause Code')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]//div[contains(@class,'v-list__tile__title')][normalize-space()='"+PauseCode+"']")).click();
	
		CampaignPopup.click();
		
		driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Pause Code')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]//div[contains(@class,'v-list__tile__title')][normalize-space()='"+PauseCode1+"']")).click();
	
		CampaignPopup.click();
		
		driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Pause Code')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]//div[contains(@class,'v-list__tile__title')][normalize-space()='"+PauseCode2+"']")).click();
	
		CampaignPopup.click();
	
//Dial Status Selection
		
		driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Dial Status')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]//div[contains(@class,'v-list__tile__title')][normalize-space()='"+Dispo+"']")).click();
		
		CampaignPopup.click();
		
		driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Dial Status')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]//div[contains(@class,'v-list__tile__title')][normalize-space()='"+Dispo1+"']")).click();
		
		CampaignPopup.click();
		
		driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Dial Status')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]//div[contains(@class,'v-list__tile__title')][normalize-space()='"+Dispo2+"']")).click();
		
		CampaignPopup.click();
		
//Dispo Status Selection
		
		driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Dispo Status')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]//div[contains(@class,'v-list__tile__title')][normalize-space()='"+Dispo+"']")).click();
		
		CampaignPopup.click();
		
		driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Dispo Status')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]//div[contains(@class,'v-list__tile__title')][normalize-space()='"+Dispo1+"']")).click();
		
		CampaignPopup.click();
		
		driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Dispo Status')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]//div[contains(@class,'v-list__tile__title')][normalize-space()='"+Dispo2+"']")).click();
		
		CampaignPopup.click();
		
//Buffer Level
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[23]")).click();
		
		Thread.sleep(1000);
		
		WebElement BufferLevel = driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@role='list']"));
		
		BufferLevel.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+BfLevel+"'])[1]")).click();
		

//On Demand Enabling
				
		driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//label[contains(@class,'v-label theme--light')][normalize-space()='On Demand Recording']")).click();

//Dial Ratio 
				
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[24]")).click();
		
		Thread.sleep(1000);
				
		WebElement DialRatio = driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@role='list']"));
				
		DialRatio.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+dialratio+"'])[1]")).click();
		
//Script Selection
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[25]")).click();
		
		Thread.sleep(1000);
		
		WebElement Script = driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@role='list']"));
		
		Script.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='v-list__tile__title'][normalize-space()='"+script+"']")).click();
				
//DNC Check
		
		driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//label[contains(@class,'v-label theme--light')][normalize-space()='DNC check']")).click();
				
//Call Masking
				
		driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//label[contains(@class,'v-label theme--light')][normalize-space()='Call Masking']")).click();
				
//Time Zone
				
		driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//label[contains(@class,'v-label theme--light')][normalize-space()='Timezone']")).click();
				
// Creating Campaign
								
		driver.findElement(By.xpath("//div[normalize-space()='Create']")).click();
				
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();


	}
	
	@Test(priority = 4 , enabled = true)
	public void VoiceBlastCampaign() throws InterruptedException {
		
		driver.findElement(By.xpath("//div[normalize-space()='Add Campaign']")).click();
		
		Thread.sleep(1000);
		
//Adding Voice Blast Campaign 
		
		driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']//input[@aria-label='Name']")).sendKeys(Campaign5);
		
		System.out.println(driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']//input[@aria-label='Name']")).getAttribute("value"));
		
		Thread.sleep(1000);
		
//Selecting Process
		
		WebElement CampaignPopup = driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']//div[@class='container grid-list-md']"));
		
		
		driver.findElement(By.xpath("//body/div[@id='app']/div[@class='v-dialog__content v-dialog__content--active']/div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']/div[@class='v-card v-sheet theme--light']/div[@class='v-card__text']/form[@class='v-form']/div[@class='container grid-list-md']/div[@class='layout wrap']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='v-list__tile__title'][normalize-space()='Leads']")).click();
		
		Thread.sleep(1000);
		
		CampaignPopup.click();
		
		driver.findElement(By.xpath("//body/div[@id='app']/div[@class='v-dialog__content v-dialog__content--active']/div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']/div[@class='v-card v-sheet theme--light']/div[@class='v-card__text']/form[@class='v-form']/div[@class='container grid-list-md']/div[@class='layout wrap']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='v-list__tile__title'][normalize-space()='Tickets']")).click();

		CampaignPopup.click();
		
		driver.findElement(By.xpath("//body/div[@id='app']/div[@class='v-dialog__content v-dialog__content--active']/div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']/div[@class='v-card v-sheet theme--light']/div[@class='v-card__text']/form[@class='v-form']/div[@class='container grid-list-md']/div[@class='layout wrap']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='v-list__tile__title'][normalize-space()='Meetings']")).click();

		CampaignPopup.click();

//Selecting Type
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[15]")).click();
		
		Thread.sleep(1000);
		
		WebElement TypeList = driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@role='list']")); 
		
		TypeList.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='v-list__tile__title'][normalize-space()='VOICE BLAST']")).click();
		
	/*
//Selecting Outbound Caller ID
		
		WebElement OBCallerID = driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']//input[@aria-label='Outbound Caller ID']"));
		
		OBCallerID.click();
		
		Thread.sleep(1000);
		
		WebElement OBCallerIDValue = driver.findElement(By.xpath("(//div[@class='v-list__tile__content'])[175]"));
		
		OBCallerIDValue.click();
		
		CampaignPopup.click();
		
		Thread.sleep(1000);
		*/
//Industry Selection
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[16]")).click();
		
		Thread.sleep(1000);
		
		WebElement IndustryOption = driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@role='list']"));
		
		IndustryOption.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='v-list__tile__title'][normalize-space()='"+Industry+"']")).click();
		
		CampaignPopup.click();

//Template Name
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[17]")).click();
		
		Thread.sleep(1000);
		
		WebElement TemplateName = driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@role='list']"));
		
		TemplateName.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+Template+"'])[3]")).click();
		
		CampaignPopup.click();
		
//Add Queue
		
		driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Add Queue')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]//div[contains(@class,'v-list__tile__title')][normalize-space()='"+Queue+"']")).click();
		
		CampaignPopup.click();
		
//Pause Code Selection
		
		driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Pause Code')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]//div[contains(@class,'v-list__tile__title')][normalize-space()='"+PauseCode+"']")).click();
	
		CampaignPopup.click();
		
		driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Pause Code')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]//div[contains(@class,'v-list__tile__title')][normalize-space()='"+PauseCode1+"']")).click();
	
		CampaignPopup.click();
		
		driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Pause Code')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]//div[contains(@class,'v-list__tile__title')][normalize-space()='"+PauseCode2+"']")).click();
	
		CampaignPopup.click();
	
//Dial Status Selection
		
		driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Dial Status')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]//div[contains(@class,'v-list__tile__title')][normalize-space()='"+Dispo+"']")).click();
		
		CampaignPopup.click();
		
		driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Dial Status')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]//div[contains(@class,'v-list__tile__title')][normalize-space()='"+Dispo1+"']")).click();
		
		CampaignPopup.click();
		
		driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Dial Status')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]//div[contains(@class,'v-list__tile__title')][normalize-space()='"+Dispo2+"']")).click();
		
		CampaignPopup.click();
		
//Dispo Status Selection
		
		driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Dispo Status')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]//div[contains(@class,'v-list__tile__title')][normalize-space()='"+Dispo+"']")).click();
		
		CampaignPopup.click();
		
		driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Dispo Status')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]//div[contains(@class,'v-list__tile__title')][normalize-space()='"+Dispo1+"']")).click();
		
		CampaignPopup.click();
		
		driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Dispo Status')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(@class,'v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content')]//div[contains(@class,'v-list__tile__title')][normalize-space()='"+Dispo2+"']")).click();
		
		CampaignPopup.click();
		
//Buffer Level
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[23]")).click();
		
		Thread.sleep(1000);
		
		WebElement BufferLevel = driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@role='list']"));
		
		BufferLevel.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='v-list__tile__title'][normalize-space()='"+BfLevel+"']")).click();
		

//On Demand Enabling
				
		driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//label[contains(@class,'v-label theme--light')][normalize-space()='On Demand Recording']")).click();
		
//Channels Selection
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[24]")).click();
		
		Thread.sleep(1000);
		
		WebElement Channels = driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@role='list']"));
		
		Channels.findElement(By.xpath("//div[contains(text(),'15')]")).click(); 	
		
//Dial Prefix
		
		WebElement DialPrefix =driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']//input[@aria-label='Dial Prefix']"));
		
		DialPrefix.sendKeys(Integer.toString(dialprefix));
		
//Script Selection
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[26]")).click();
		
		Thread.sleep(1000);
		
		WebElement Script = driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@role='list']"));
		
		Script.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='v-list__tile__title'][normalize-space()='Testing']")).click();
	
		
//DNC Check

		driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//label[contains(@class,'v-label theme--light')][normalize-space()='DNC check']")).click();
		
//Call Masking
		
		driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//label[contains(@class,'v-label theme--light')][normalize-space()='Call Masking']")).click();
		
//Time Zone
		
		driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//label[contains(@class,'v-label theme--light')][normalize-space()='Timezone']")).click();
		
// Creating Campaign
						
		driver.findElement(By.xpath("//div[normalize-space()='Create']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();



	}
	
@Test(priority = 5 , enabled = false)
	public void WhatsappBlastCampaign() throws InterruptedException {
	
	
	driver.findElement(By.xpath("//div[normalize-space()='Add Campaign']")).click();
	
	Thread.sleep(1000);
	
//Adding Whatsapp Blast Campaign Name
	
	driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']//input[@aria-label='Name']")).sendKeys(Campaign6);
	
	System.out.println(driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']//input[@aria-label='Name']")).getAttribute("value"));
	
	Thread.sleep(1000);
	
//Selecting Process
	
	WebElement CampaignPopup = driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']//div[@class='container grid-list-md']"));
	
	
	driver.findElement(By.xpath("//body/div[@id='app']/div[@class='v-dialog__content v-dialog__content--active']/div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']/div[@class='v-card v-sheet theme--light']/div[@class='v-card__text']/form[@class='v-form']/div[@class='container grid-list-md']/div[@class='layout wrap']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='v-list__tile__title'][normalize-space()='Leads']")).click();
	
	Thread.sleep(1000);
	
	CampaignPopup.click();
	
	driver.findElement(By.xpath("//body/div[@id='app']/div[@class='v-dialog__content v-dialog__content--active']/div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']/div[@class='v-card v-sheet theme--light']/div[@class='v-card__text']/form[@class='v-form']/div[@class='container grid-list-md']/div[@class='layout wrap']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='v-list__tile__title'][normalize-space()='Tickets']")).click();

	CampaignPopup.click();
	
	driver.findElement(By.xpath("//body/div[@id='app']/div[@class='v-dialog__content v-dialog__content--active']/div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']/div[@class='v-card v-sheet theme--light']/div[@class='v-card__text']/form[@class='v-form']/div[@class='container grid-list-md']/div[@class='layout wrap']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='v-list__tile__title'][normalize-space()='Meetings']")).click();

	CampaignPopup.click();

//Selecting Type
	
	driver.findElement(By.xpath("(//div[@class='v-select__selections'])[15]")).click();
	
	Thread.sleep(1000);
	
	WebElement TypeList = driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@role='list']")); 
	
	TypeList.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='v-list__tile__title'][normalize-space()='WHATSAPP BLAST']")).click();
	
	/*

//Selecting Outbound Caller ID
	
	WebElement OBCallerID = driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']//input[@aria-label='Outbound Caller ID']"));
	
	OBCallerID.click();
	
	Thread.sleep(1000);
	
	WebElement OBCallerIDValue = driver.findElement(By.xpath("(//div[@class='v-list__tile__content'])[175]"));
	
	OBCallerIDValue.click();
	
	CampaignPopup.click();
	
	Thread.sleep(1000);
	
	*/
//Industry Selection
	
	driver.findElement(By.xpath("(//div[@class='v-select__selections'])[16]")).click();
	
	Thread.sleep(1000);
	
	WebElement IndustryOption = driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@role='list']"));
	
	IndustryOption.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='v-list__tile__title'][normalize-space()='"+Industry+"']")).click();
	
	CampaignPopup.click();

//Tempalte Name
	
	driver.findElement(By.xpath("(//div[@class='v-select__selections'])[17]")).click();
	
	Thread.sleep(1000);
	
	WebElement TemplateName = driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@role='list']"));
	
	TemplateName.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+Template+"'])[3]")).click();
	
	CampaignPopup.click();
	
//Strat Time
	
	driver.findElement(By.xpath("//input[@aria-label='Start Time']")).click();

	Thread.sleep(1000);
	
	WebElement Clock = driver.findElement(By.xpath("//div[@class='v-time-picker-clock__container']"));
	
	Clock.findElement(By.xpath("(//span[contains(text(),'1')])[1]")).click();
	
	Clock.findElement(By.xpath("//span[contains(text(),'00')]")).click();
	
	CampaignPopup.click();
	
//Day
	
	driver.findElement(By.xpath("//input[@aria-label='Days']")).click();
	
	Thread.sleep(1000);
	
	WebElement Days = driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content']//div[@role='list']"));
	
	Days.findElement(By.xpath("//div[contains(text(),'Sunday')]")).click();
	
	Days.findElement(By.xpath("//div[contains(text(),'Monday')]")).click();
	
	Days.findElement(By.xpath("//div[contains(text(),'Tuesday')]")).click();
	
	Days.findElement(By.xpath("//div[contains(text(),'Wednesday')]")).click();
	
	Days.findElement(By.xpath("//div[contains(text(),'Thursday')]")).click();
	
	Days.findElement(By.xpath("//div[contains(text(),'Friday')]")).click();
	
	Days.findElement(By.xpath("//div[contains(text(),'Saturday')]")).click();
	
	CampaignPopup.click();
	
//End Time
	
	driver.findElement(By.xpath("//input[@aria-label='End Time']")).click();
	
	Thread.sleep(1000);
	
	WebElement EndTime = driver.findElement(By.xpath("//div[@class='v-time-picker-clock__container']"));
	
	EndTime.findElement(By.xpath("//span[contains(text(),'10')]")).click();
	
	EndTime.findElement(By.xpath("//span[contains(text(),'00')]")).click();
	
	
//Dial Prefix
	
	WebElement DialPrefix = driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Dial Prefix')]"));
	
	DialPrefix.sendKeys(Integer.toString(dialprefix));
	

//Whatsapp Type
	
	driver.findElement(By.xpath("(//div[@class='v-select__selections'])[20]")).click();
	
	Thread.sleep(1000);
	
	WebElement WhatsappType = driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@role='list']"));
	
	WhatsappType.findElement(By.xpath("//div[contains(text(),'"+WpType+"')]")).click();
	
	CampaignPopup.click();
	
//Whatsapp Tempalate
	
	driver.findElement(By.xpath("(//div[@class='v-select__selections'])[21]")).click();
	
	Thread.sleep(1000);
	
	WebElement WpTemp = driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@role='list']"));
	
	WpTemp.findElement(By.xpath("//div[contains(text(),'"+WpTemplate+"')]")).click();
	
	CampaignPopup.click();
	
//Whatsapp Language
	
	driver.findElement(By.xpath("(//div[@class='v-select__selections'])[22]")).click();
	
	Thread.sleep(1000);
	
	WebElement WpLang = driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@role='list']"));
	
	WpLang.findElement(By.xpath("//div[contains(text(),'"+WpLanguage+"')]")).click();
	

//Creating Campaign
	
	driver.findElement(By.xpath("//div[normalize-space()='Create']")).click();
	
	Thread.sleep(1000);
	

}

//@AfterTest
//	public void Quit() {
//	
//	driver.quit();
//}
}


