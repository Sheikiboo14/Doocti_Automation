package Admin_CRM_CreateFlow;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

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

public class Create_Leads extends AdminLogin {
	

	
	String FirstName="Testing Leads";

	long PhoneNumber =9514380497L;
	
	String Description ="Testing Purpose";
	
	boolean Permission = false;
	

	@BeforeTest
	public void SetUp() throws InterruptedException {
		
		driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[normalize-space()='Leads']")).click();
		
		
	}
	
	@Test(priority=0, enabled=false)
	public void CreateLead() throws InterruptedException {
		
		driver.findElement(By.xpath("//i[@title='Create Leads']")).click();
		
		Thread.sleep(5000);

// Lead Name
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(FirstName);

// Lead Number
		
		WebElement Phno = driver.findElement(By.xpath("//input[@placeholder='Phone Number']"));
		
		Phno.sendKeys(Long.toString(PhoneNumber));

// Lead List
		
		driver.findElement(By.xpath("//input[@placeholder='List ID']")).click();
		
		Thread.sleep(1000);
		
		WebElement ListId = driver.findElement(By.xpath("//div[@class='v-menu__content theme--light menuable__content__active v-autocomplete__content']//div[@role='list']"));
		
		ListId.findElement(By.xpath("//div[contains(text(),'1234')]")).click();
		

	
// Lead Source
		
		driver.findElement(By.xpath("//input[@placeholder='source']")).click();
		
		Thread.sleep(1000);
		
		WebElement LeadSource = driver.findElement(By.xpath("//div[@class='v-menu__content theme--light menuable__content__active v-autocomplete__content']//div[@role='list']"));
		
		LeadSource.findElement(By.xpath("//div[contains(text(),'AlphaSource')]")).click();
		


// Manual Lead Creation
		
		driver.findElement(By.xpath("//i[@class='fa fa-floppy-o savefont']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[normalize-space()='Yes, Create !']")).click();
		
		Thread.sleep(1000);
		
	
	}
	
	@Test(priority = 1,enabled=true, invocationCount=1 )
	public void UplodeLeadsWithoutDuplication() throws InterruptedException, AWTException {
				
		driver.findElement(By.xpath("//i[@title='Upload Leads']")).click();
		
		Thread.sleep(1000);
		
// List Selection
		
		driver.findElement(By.xpath("//input[@aria-label='List']")).click();
		
		Thread.sleep(1000);
		
		WebElement List = driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content']//div[@role='list']"));
		
		Thread.sleep(1000);
		
		List.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content']//div[@class='v-list__tile__title'][normalize-space()='1234']")).click();
		
		Thread.sleep(1000);
		
// Permission for duplicate number
		
		if(Permission == true)
		{
			driver.findElement(By.xpath("//label[normalize-space()='YES']")).click();
		}
		else
		{
			driver.findElement(By.xpath("//label[normalize-space()='NO']")).click();

		}
		
// Upload Leads
		
		driver.findElement(By.xpath("//div[@class='file-dummy']")).click();
		
		Thread.sleep(1000);

// Robot Class
		
		Robot rb = new Robot();
		
		StringSelection FilePath = new StringSelection("C:\\Users\\User\\Desktop\\Dialer.csv");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(FilePath, null);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(1000);
		
		WebElement UploadCart = driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']//div[@class='v-card__text']"));
		
		UploadCart.findElement(By.xpath("//div[@class='nextbutton-innerdiv']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[normalize-space()='Upload']")).click();
		
		Thread.sleep(2000);
		
		if(Permission == false) {
			
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			
		
		}
		Permission = !Permission;
	}
	
	@AfterTest
	public void quit() {
		
		driver.quit();
	}

//		@Test(priority = 2, enabled= false )
//		
//	public void UplodeLeadWithDuplication() throws InterruptedException, AWTException {
//			
//		 Permission = true;
//		
//		driver.findElement(By.xpath("//i[@title='Upload Leads']")).click();
//			
//		Thread.sleep(1000);
//		
//// List Selection
//		
//		driver.findElement(By.xpath("//input[@aria-label='List']")).click();
//				
//		Thread.sleep(1000);
//			
//		WebElement List = driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content']//div[@role='list']"));
//				
//		Thread.sleep(1000);
//				
//		List.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content']//div[@class='v-list__tile__title'][normalize-space()='1234']")).click();
//				
//		Thread.sleep(1000);
//
//// Permission for duplicate number
//		
//		if(Permission == true)
//		
//		{
//			driver.findElement(By.xpath("//label[normalize-space()='YES']")).click();
//			
//		}
//		
//		else
//		{
//			driver.findElement(By.xpath("//label[normalize-space()='NO']")).click();
//
//		}		
//		
//// Upload Leads
//		
//		driver.findElement(By.xpath("//div[@class='file-dummy']")).click();
//				
//		Thread.sleep(1000);		
//
//// Robot Class
//		
//		Robot rb = new Robot();
//				
//		StringSelection FilePath = new StringSelection("C:\\Users\\User\\Desktop\\Dialer.csv");
//				
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(FilePath, null);
//				
//		rb.keyPress(KeyEvent.VK_CONTROL);
//		rb.keyPress(KeyEvent.VK_V);
//				
//		rb.keyRelease(KeyEvent.VK_CONTROL);
//		rb.keyRelease(KeyEvent.VK_V);
//				
//		rb.keyPress(KeyEvent.VK_ENTER);
//		rb.keyRelease(KeyEvent.VK_ENTER);
//				
//		Thread.sleep(1000);
//				
//		WebElement UploadCart = driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']//div[@class='v-card__text']"));
//				
//		UploadCart.findElement(By.xpath("//div[@class='nextbutton-innerdiv']")).click();
//				
//		Thread.sleep(1000);
//				
//		driver.findElement(By.xpath("//span[normalize-space()='Upload']")).click();
//				
//		Thread.sleep(2000);
//
//		
//	}
}


