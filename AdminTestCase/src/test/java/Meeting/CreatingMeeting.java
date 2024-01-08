package Meeting;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Login.AdminLogin;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatingMeeting extends AdminLogin {
	
	WebDriver driver;
	
	String MeetingTitle1 = "Decision-making meeting";
	
	String MeetingTitle2 = "others";
	
	String OthersTitle = "Testing";

	String MeetingTitle3 = "Team-building meetings";
	
	String MeetingTitle4 ="Quarterly planning meetings";
	
	String Description = "Testing";
	
	Long Phno = 9514380497L;
	
	String agent = "devsandbox_agent02@doocti.com";
	
	int MeetingDate = 3;
	
	String module ="lead";
	
	String Template = "TestingQA";
	
	@BeforeTest
	public void SetUp() throws InterruptedException {
		
		driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[normalize-space()='Meetings']")).click();
		
		Thread.sleep(1000);
	}
	
	@Test(priority = 0, enabled = true)
	public void MeetingCreation() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[normalize-space()='Add Meetings'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement MeetingPopup = driver.findElement(By.xpath("(//div[@class='v-card__text'])[3]"));
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[3]")).click();
		
		Thread.sleep(1000);
		
		WebElement Title = driver.findElement(By.xpath("(//div[@role='list'])[8]"));
		
		Title.findElement(By.xpath("(//div[contains(text(),'"+MeetingTitle1+"')])[1]")).click();
		
		MeetingPopup.click();
		
	//Description
		
		driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")).sendKeys(Description);
		
		MeetingPopup.click();

	//Phone Number
		
		WebElement Phone=driver.findElement(By.xpath("(//input[@aria-label='Phone Number'])[1]"));
		
		Phone.sendKeys(Phno.toString(Phno));
		
		MeetingPopup.click();
	
	//Agent Selection
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[5]")).click();
		
		Thread.sleep(1000);
		
		WebElement Agent = driver.findElement(By.xpath("(//div[@role='list'])[6]"));
		
		Agent.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+agent+"'])[3]")).click();
		
	//Meeting Date
		
		driver.findElement(By.xpath("(//input[@type='text'])[10]")).click();
		
		Thread.sleep(1000);
		
		WebElement Date = driver.findElement(By.xpath("(//div[@class='vdatetime-popup'])[1]"));
		
		Date.findElement(By.xpath("(//span[contains(text(),'"+MeetingDate+"')])[1]")).click();
		
		driver.findElement(By.xpath("//div[@class='vdatetime-popup__actions__button vdatetime-popup__actions__button--confirm']")).click();

		Thread.sleep(1000);
		
	// Meeting Time
		
		driver.findElement(By.xpath("(//div[@class='vdatetime-popup__actions__button vdatetime-popup__actions__button--confirm'])[1]")).click();
	
	// Module
	
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[6]")).click();
		
		Thread.sleep(1000);
		
		WebElement Module = driver.findElement(By.xpath("(//div[@role='list'])[5]"));
		
		Module.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+module+"'])[2]")).click();
		
	// Template
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[7]")).click();
		
		Thread.sleep(1000);
		
		WebElement template = driver.findElement(By.xpath("(//div[@role='list'])[1]"));
		
		template.findElement(By.xpath("//div[@class='v-list__tile__title'][normalize-space()='"+Template+"']")).click();
		
		
	// Create Meeting
		
		driver.findElement(By.xpath("//div[normalize-space()='Create']")).click();
		
		Thread.sleep(1000);
		
	}
	
	@Test(priority = 1 ,enabled = true)
	public void OthersMeeting() throws InterruptedException {
		

		driver.findElement(By.xpath("(//div[normalize-space()='Add Meetings'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement MeetingPopup = driver.findElement(By.xpath("(//div[@class='v-card__text'])[3]"));
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[3]")).click();
		
		Thread.sleep(1000);
		
		WebElement Title = driver.findElement(By.xpath("(//div[@role='list'])[8]"));
		
		Title.findElement(By.xpath("(//div[contains(text(),'"+MeetingTitle2+"')])[1]")).click();
		
		MeetingPopup.click();
		
		driver.findElement(By.xpath("//input[@aria-label='Title']")).sendKeys(OthersTitle);
		
		MeetingPopup.click();
		
	//Description
		
		driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")).sendKeys(Description);
		
		MeetingPopup.click();

	//Phone Number
		
		WebElement Phone=driver.findElement(By.xpath("(//input[@aria-label='Phone Number'])[1]"));
		
		Phone.sendKeys(Phno.toString(Phno));
		
		MeetingPopup.click();
	
	//Agent Selection
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[4]")).click();
		
		Thread.sleep(1000);
		
		WebElement Agent = driver.findElement(By.xpath("(//div[@role='list'])[6]"));
		
		Agent.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+agent+"'])[3]")).click();
		
	//Meeting Date
		
		driver.findElement(By.xpath("(//input[@type='text'])[10]")).click();
		
		Thread.sleep(1000);
		
		WebElement Date = driver.findElement(By.xpath("(//div[@class='vdatetime-popup'])[1]"));
		
		Date.findElement(By.xpath("(//span[contains(text(),'"+MeetingDate+"')])[1]")).click();
		
		driver.findElement(By.xpath("//div[@class='vdatetime-popup__actions__button vdatetime-popup__actions__button--confirm']")).click();

		Thread.sleep(1000);
		
	// Meeting Time
		
		driver.findElement(By.xpath("(//div[@class='vdatetime-popup__actions__button vdatetime-popup__actions__button--confirm'])[1]")).click();
	
	// Module
	
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[5]")).click();
		
		Thread.sleep(1000);
		
		
		
		WebElement Module = driver.findElement(By.xpath("(//div[@role='list'])[5]"));
		
		Module.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+module+"'])[2]")).click();
		
	// Template
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[6]")).click();
		
		Thread.sleep(1000);
		
		WebElement template = driver.findElement(By.xpath("(//div[@role='list'])[1]"));
		
		template.findElement(By.xpath("(//div[contains(text(),'"+Template+"')])[1]")).click();
		
		
	// Create Meeting
		
		driver.findElement(By.xpath("//div[normalize-space()='Create']")).click();
		
		Thread.sleep(1000);

		
	}
	
	@Test(priority = 2 ,enabled=true)
	public void Teambuildingmeetings() throws InterruptedException{
		
		driver.findElement(By.xpath("(//div[normalize-space()='Add Meetings'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement MeetingPopup = driver.findElement(By.xpath("(//div[@class='v-card__text'])[3]"));
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[3]")).click();
		
		Thread.sleep(1000);
		
		WebElement Title = driver.findElement(By.xpath("(//div[@role='list'])[8]"));
		
		Title.findElement(By.xpath("(//div[contains(text(),'"+MeetingTitle3+"')])[1]")).click();
		
		MeetingPopup.click();
		
	//Description
		
		driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")).sendKeys(Description);
		
		MeetingPopup.click();

	//Phone Number
		
		WebElement Phone=driver.findElement(By.xpath("(//input[@aria-label='Phone Number'])[1]"));
		
		Phone.sendKeys(Phno.toString(Phno));
		
		MeetingPopup.click();
	
	//Agent Selection
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[5]")).click();
		
		Thread.sleep(1000);
		
		WebElement Agent = driver.findElement(By.xpath("(//div[@role='list'])[6]"));
		
		Agent.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+agent+"'])[3]")).click();
		
	//Meeting Date
		
		driver.findElement(By.xpath("(//input[@type='text'])[10]")).click();
		
		Thread.sleep(1000);
		
		WebElement Date = driver.findElement(By.xpath("(//div[@class='vdatetime-popup'])[1]"));
		
		Date.findElement(By.xpath("(//span[contains(text(),'"+MeetingDate+"')])[1]")).click();
		
		driver.findElement(By.xpath("//div[@class='vdatetime-popup__actions__button vdatetime-popup__actions__button--confirm']")).click();

		Thread.sleep(1000);
		
	// Meeting Time
		
		driver.findElement(By.xpath("(//div[@class='vdatetime-popup__actions__button vdatetime-popup__actions__button--confirm'])[1]")).click();
	
	// Module
	
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[6]")).click();
		
		Thread.sleep(1000);
		
		WebElement Module = driver.findElement(By.xpath("(//div[@role='list'])[5]"));
		
		Module.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+module+"'])[2]")).click();
		
	// Template
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[7]")).click();
		
		Thread.sleep(1000);
		
		WebElement template = driver.findElement(By.xpath("(//div[@role='list'])[1]"));
		
		template.findElement(By.xpath("//div[@class='v-list__tile__title'][normalize-space()='"+Template+"']")).click();
		
		
	// Create Meeting
		
		driver.findElement(By.xpath("//div[normalize-space()='Create']")).click();
		
		Thread.sleep(1000);
		
	}
	
	@Test(priority = 3 , enabled = true)
	public void Quarterlyplanningmeetings() throws InterruptedException {
		
		
		driver.findElement(By.xpath("(//div[normalize-space()='Add Meetings'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement MeetingPopup = driver.findElement(By.xpath("(//div[@class='v-card__text'])[3]"));
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[3]")).click();
		
		Thread.sleep(1000);
		
		WebElement Title = driver.findElement(By.xpath("(//div[@role='list'])[8]"));
		
		Title.findElement(By.xpath("(//div[contains(text(),'"+MeetingTitle3+"')])[1]")).click();
		
		MeetingPopup.click();
		
	//Description
		
		driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")).sendKeys(Description);
		
		MeetingPopup.click();

	//Phone Number
		
		WebElement Phone=driver.findElement(By.xpath("(//input[@aria-label='Phone Number'])[1]"));
		
		Phone.sendKeys(Phno.toString(Phno));
		
		MeetingPopup.click();
	
	//Agent Selection
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[5]")).click();
		
		Thread.sleep(1000);
		
		WebElement Agent = driver.findElement(By.xpath("(//div[@role='list'])[6]"));
		
		Agent.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+agent+"'])[3]")).click();
		
	//Meeting Date
		
		driver.findElement(By.xpath("(//input[@type='text'])[10]")).click();
		
		Thread.sleep(1000);
		
		WebElement Date = driver.findElement(By.xpath("(//div[@class='vdatetime-popup'])[1]"));
		
		Date.findElement(By.xpath("(//span[contains(text(),'"+MeetingDate+"')])[1]")).click();
		
		driver.findElement(By.xpath("//div[@class='vdatetime-popup__actions__button vdatetime-popup__actions__button--confirm']")).click();

		Thread.sleep(1000);
		
	// Meeting Time
		
		driver.findElement(By.xpath("(//div[@class='vdatetime-popup__actions__button vdatetime-popup__actions__button--confirm'])[1]")).click();
	
	// Module
	
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[6]")).click();
		
		Thread.sleep(1000);
		
		WebElement Module = driver.findElement(By.xpath("(//div[@role='list'])[5]"));
		
		Module.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+module+"'])[2]")).click();
		
	// Template
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[7]")).click();
		
		Thread.sleep(1000);
		
		WebElement template = driver.findElement(By.xpath("(//div[@role='list'])[1]"));
		
		template.findElement(By.xpath("//div[@class='v-list__tile__title'][normalize-space()='"+Template+"']")).click();
		
		
	// Create Meeting
		
		driver.findElement(By.xpath("//div[normalize-space()='Create']")).click();
		
		Thread.sleep(1000);
	}
	
}

