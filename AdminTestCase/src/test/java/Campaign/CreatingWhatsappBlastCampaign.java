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

public class CreatingWhatsappBlastCampaign extends AdminLogin {
	
	String CampaignName="Test Whatsapp Blast";
	
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
	
	String WpType = "Text";
	
	String WpTemplate = "hello_world";
	
	String WpLanguage = "en_US";

	


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
		
		TemplateName.findElement(By.xpath("//div[contains(text(),'"+Template+"')]")).click();
		
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
		
// Whatsapp Tempalate
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[21]")).click();
		
		Thread.sleep(1000);
		
		WebElement WpTemp = driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@role='list']"));
		
		WpTemp.findElement(By.xpath("//div[contains(text(),'"+WpTemplate+"')]")).click();
		
		CampaignPopup.click();
		
//	Whatsapp Language
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[22]")).click();
		
		Thread.sleep(1000);
		
		WebElement WpLang = driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@role='list']"));
		
		WpLang.findElement(By.xpath("//div[contains(text(),'"+WpLanguage+"')]")).click();
		
	
// Creating Campaign
		
		driver.findElement(By.xpath("//div[normalize-space()='Create']")).click();
		
	}
	
	@AfterTest
	public void quit() {
		driver.quit();
	}
	

}
