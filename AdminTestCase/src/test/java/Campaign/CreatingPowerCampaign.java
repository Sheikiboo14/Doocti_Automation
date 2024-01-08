package Campaign;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Login.AdminLogin;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatingPowerCampaign extends AdminLogin {


	
	String CampaignName="Test Power";
	
	int dialprefix = 3;
 	
	String Industry = "IT";
 	
	String Template ="TestingQA";
	
	String Queue = "demo_01";

	String PauseCode ="Meeting";
	
	String PauseCode1 ="Lunch";
	
	String PauseCode2 ="Tea Break";
	
	String Dispo ="ANSWER";
	
	String Dispo1 ="CALLBACK";
	
	String Dispo2 ="Reassign";
	
	String script ="Testing";
	
	int BfLevel = 100;
	
	float dialratio = 1.4f;
	

	

	@Test(priority = 0)
	public void CreateCampaign() throws InterruptedException {
		
//		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();
		
		driver.findElement(By.xpath("//div[@class='v-list__group v-list__group--active']//span[contains(text(),'CA')]")).click();
		
		driver.findElement(By.xpath("//div[normalize-space()='Add Campaign']")).click();
		
		Thread.sleep(1000);
		
//Adding Campaign Name
		
		driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']//input[@aria-label='Name']")).sendKeys(CampaignName);
		
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
		
		TemplateName.findElement(By.xpath("//div[contains(text(),'"+Template+"')]")).click();
		
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
		

	}
	
	@AfterTest
	public void quit() {
		driver.quit();
	}
}

