package Leads;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class CreatingLeads extends AdminLogin {
	

	
	String first_Name="Testing Leads";

	String phone_Number ="9514380499";
	
	String description ="Testing Purpose";
	
	String list_Id = "123";
	
	String lead_Source = "FaceBook";
	
	boolean permission = false;
	
	String file_Path = "D:\\Testing File\\Dialer.csv"; 
	

	@BeforeTest
	public void SetUp() throws InterruptedException {
		
		driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();
		
		Thread.sleep(1000);
				
		driver.findElement(By.xpath("//span[normalize-space()='Leads']")).click();
		
		
	}
	
	@Test
	public void Create_ManualLead() throws InterruptedException {
		
		Actions action = new Actions(driver);
		
		driver.findElement(By.xpath("//i[@title='Create Leads']")).click();
		
		Thread.sleep(5000);

// Lead Name
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(first_Name);

// Lead Number
		
		WebElement Phno = driver.findElement(By.xpath("//input[@placeholder='Phone Number']"));
		
		Phno.sendKeys((phone_Number));

		
// Lead List
		
		driver.findElement(By.xpath("(//input[@placeholder='List ID'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement ListId = driver.findElement(By.xpath("(//div[@role='list'])[3]"));
		
		ListId.findElement(By.xpath("//div[contains(text(),'"+list_Id+"')]")).click();
				
	
// Lead Source
		
		driver.findElement(By.xpath("//input[@placeholder='source']")).click();
		
		Thread.sleep(1000);
		
		WebElement LeadSource = driver.findElement(By.xpath("(//div[@role='list'])[1]"));
		
		LeadSource.findElement(By.xpath("//div[contains(text(),'"+lead_Source+"')]")).click();


// Manual Lead Creation
		
		driver.findElement(By.xpath("(//i[@class='fa fa-floppy-o savefont'])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[normalize-space()='Yes, Create !']")).click();
		
		Thread.sleep(1000);
		
// Verification
		
		List<WebElement> Alldatas = driver.findElements(By.xpath("//table[contains(@class,'v-datatable')]//tr//td[2]"));
		
		int size = Alldatas.size();
		
		System.out.println("Manual Lead : "+size);
		
		boolean flag = false;
		
		for(WebElement Data : Alldatas) {
			
			String value = Data.getText();
			
			if(value.contains(phone_Number)) {
				
				flag = true;
			}
		}
		
		Assert.assertTrue(flag,"Lead is not Created...!");
		
		driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();

	}
	
	@Test(priority = 1)
	public void Uplode_LeadWithoutDuplicate() throws InterruptedException, AWTException {
				
		driver.findElement(By.xpath("(//i[@title='Upload Leads'])[1]")).click();
		
		Thread.sleep(1000);
		
// List Selection
		
		driver.findElement(By.xpath("(//input[@aria-label='List'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement List = driver.findElement(By.xpath("(//div[@role='list'])[14]"));
		
		Thread.sleep(1000);
		
		List.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+list_Id+"'])[3]")).click();
		
		Thread.sleep(1000);
		
// Permission for duplicate number
		
		driver.findElement(By.xpath("//label[normalize-space()='No']")).click();

		
// Upload Leads
		
		driver.findElement(By.xpath("//div[@class='file-dummy']")).click();
		
		Thread.sleep(1000);

// Robot Class
		
		Robot rb = new Robot();
		
		StringSelection FilePath = new StringSelection(file_Path);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(FilePath, null);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(1000);
		
//		WebElement UploadCart = driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']//div[@class='v-card__text']"));
		
		driver.findElement(By.xpath("(//div[@class='nextbutton-innerdiv'])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//span[normalize-space()='Upload'])[1]")).click();
		
		Thread.sleep(2000);

// Verfication
		
		
		List<WebElement> Alldatas = driver.findElements(By.xpath("//table[contains(@class,'v-datatable')]//tr//td[2]"));
		
		int size = Alldatas.size();
		
		System.out.println("Without Duplicate Lead : "+size);
		
		boolean flag = false;
		
		for(WebElement Data : Alldatas) {
			
			String value = Data.getText();
			
			if(value.contains(phone_Number)) {
				
				flag = true;
			}
		}
		
		Assert.assertTrue(flag,"Lead is not Created...!");
		
		driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();
		
	}
	
	@Test(priority = 2)
	public void Uplode_LeadWithDuplicate() throws InterruptedException, AWTException {
				
		driver.findElement(By.xpath("(//i[@title='Upload Leads'])[1]")).click();
		
		Thread.sleep(1000);
		
// List Selection
		
		driver.findElement(By.xpath("(//input[@aria-label='List'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement List = driver.findElement(By.xpath("(//div[@role='list'])[14]"));
		
		Thread.sleep(1000);
		
		List.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+list_Id+"'])[3]")).click();
		
		Thread.sleep(1000);
		
// Permission for duplicate number
		
		driver.findElement(By.xpath("//label[normalize-space()='Yes']")).click();

		
// Upload Leads
		
		driver.findElement(By.xpath("//div[@class='file-dummy']")).click();
		
		Thread.sleep(1000);

// Robot Class
		
		Robot rb = new Robot();
		
		StringSelection FilePath = new StringSelection(file_Path);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(FilePath, null);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(1000);
		
//		WebElement UploadCart = driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']//div[@class='v-card__text']"));
		
		driver.findElement(By.xpath("(//div[@class='nextbutton-innerdiv'])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//span[normalize-space()='Upload'])[1]")).click();
		
		Thread.sleep(2000);

// Verfication
		
		
		List<WebElement> Alldatas = driver.findElements(By.xpath("//table[contains(@class,'v-datatable')]//tr//td[2]"));
		
		int size = Alldatas.size();
		
		System.out.println("With Duplicate Lead : "+size);
		
		boolean flag = false;
		
		for(WebElement Data : Alldatas) {
			
			String value = Data.getText();
			
			if(value.contains(phone_Number)) {
				
				flag = true;
			}
		}
		
		Assert.assertTrue(flag,"Lead is not Created...!");
		
		driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();
		
	}
}


