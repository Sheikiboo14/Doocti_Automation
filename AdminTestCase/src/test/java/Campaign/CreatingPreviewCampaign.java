package Campaign;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Login.AdminLogin;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatingPreviewCampaign extends AdminLogin {

		
	String CampaignName="Preview 1";
	
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
		
//		WebElement DialPrefix = driver.findElement(By.xpath("//div[contains(@class,'v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable')]//input[contains(@aria-label,'Dial Prefix')]"));
//		
//		DialPrefix.sendKeys(Integer.toString(dialprefix));
		
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
		

	}
	
	@Test(priority=1,enabled=false)
	public void Assert()
	{
		String Message = driver.findElement(By.xpath("//div[contains(@class,'v-snack__content')]")).getText();
		
		String []Msg = Message.split(" ",5);
		System.out.println(Msg[0] + Msg[1]);	
		
		Assert.assertEquals(Message, "Created Successfully\r\n"
				+ "Close");

	}
	
	@AfterTest
	public void quit() {
		driver.quit();
	}
	
}
