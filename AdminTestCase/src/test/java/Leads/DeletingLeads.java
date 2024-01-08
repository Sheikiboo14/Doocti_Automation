package Leads;


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

public class DeletingLeads extends AdminLogin {
	
	String Expected ="No data available";
	
	String Fname = "";
	
	Long PhoneNumber = null;
	
	@BeforeTest
	public void SetUp() throws InterruptedException {
		
		driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[normalize-space()='Leads']")).click();
		
		Thread.sleep(1000);

		
	}
	

	
	@Test(priority = 0 ,enabled = false)
	public void FilterandDelete() throws InterruptedException {
		
		driver.findElement(By.xpath("//i[@title='Filter']")).click();
		
		Thread.sleep(1000);
		
//Filter by FirstName
		
		if(Fname != "") {
		
		driver.findElement(By.xpath("//input[@aria-label='First Name']")).sendKeys(Fname);
		
		driver.findElement(By.xpath("//div[@class='v-btn__content'][normalize-space()='Filter']")).click();

		}

// Filter by PhoneNumber
		
		else if(PhoneNumber != null){
			
		WebElement phno = driver.findElement(By.xpath("//input[@aria-label='Phone Number']"));
		
		phno.sendKeys(Long.toString(PhoneNumber));
			
		driver.findElement(By.xpath("//div[@class='v-btn__content'][normalize-space()='Filter']")).click();

		}
		
		else {
			
// Filter By ListId
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[12]")).click();
		
		Thread.sleep(1000);
		
		WebElement ListFilter = driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@role='list']"));
		
		ListFilter.findElement(By.xpath("//div[contains(text(),'1234')]")).click();
		
		driver.findElement(By.xpath("//div[@class='v-btn__content'][normalize-space()='Filter']")).click();
		
		}
		
//Selecting Leads On the Page
		
		driver.findElement(By.xpath("//div[@class='v-input v-input--selection-controls v-input--checkbox theme--light']//div[@class='v-input--selection-controls__ripple']")).click();

// Deleting the Leads
				
		driver.findElement(By.xpath("//i[@title='Bulk Delete']")).click();
				
		Thread.sleep(1000);
				
		driver.findElement(By.xpath("//div[normalize-space()='Delete']")).click();
		
		
	}
	
	@Test(priority = 1 ,enabled = false)
	public void DeleteDisplayPageLeads() throws InterruptedException {
		
//Selecting Leads On the Page
		
		driver.findElement(By.xpath("//div[@class='v-input v-input--selection-controls v-input--checkbox theme--light']//div[@class='v-input--selection-controls__ripple']")).click();

// Deleting the Leads
		
		driver.findElement(By.xpath("//i[@title='Bulk Delete']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[normalize-space()='Delete']")).click();
		
	}
	
	@Test(priority = 2 ,enabled = true)
	public void BulkDeleteLeads() throws InterruptedException {
		
//Selecting Leads On the Page
				
		driver.findElement(By.xpath("//div[@class='v-input v-input--selection-controls v-input--checkbox theme--light']//div[@class='v-input--selection-controls__ripple']")).click();

// Bulk Deleting the Leads
				
		driver.findElement(By.xpath("//i[@title='Bulk Delete']")).click();
				
		Thread.sleep(1000);
				
		driver.findElement(By.xpath("//div[@class='v-dialog__content v-dialog__content--active']//button[2]")).click();
		
		Thread.sleep(1000);
		
		String TableElement = driver.findElement(By.xpath("//td[@class='text-xs-center']")).getText();
		
//		System.out.println(TableElement);
		
//Assertion		
		Assert.assertEquals(TableElement, Expected);
				
	}
	
	@AfterTest
	public void quit() {
		
		driver.quit();
	}
}
	

