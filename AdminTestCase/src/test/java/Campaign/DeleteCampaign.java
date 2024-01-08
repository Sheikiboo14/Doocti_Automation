package Campaign;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Login.AdminLogin;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteCampaign extends AdminLogin 

{	
	String DeleteCampaignName = "Preview 1";
	
	String Expected = "Campaign Deleted Successfully\r\n"
			+ "Close";
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();
		
		Thread.sleep(1000);
		
	}
	
	@Test(priority = 0)
	public void DeleteCampaign() throws InterruptedException {

		
		driver.findElement(By.xpath("//span[normalize-space()='Campaigns']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@title='Filter']")).click();
		
		Thread.sleep(1000);
		
		// Filter with name 
		
		driver.findElement(By.xpath("(//input[@aria-label='Name'])[3]")).click();
		
		Thread.sleep(1000);
		
		WebElement NameList = driver.findElement(By.xpath("(//div[@role='list'])[6]"));
		
		NameList.findElement(By.xpath("//div[contains(text(),'"+DeleteCampaignName+"')]")).click();
		
		driver.findElement(By.xpath("//div[@class='v-btn__content'][normalize-space()='Filter']")).click();
		
		Thread.sleep(1000);
		
		//Deleting the Campaign
		
		driver.findElement(By.xpath("//i[@class='v-icon mr-2 v-icon--link material-icons theme--light red--text']")).click();
		
		driver.findElement(By.xpath("//div[normalize-space()='Yes, Delete !']")).click();
		
		Thread.sleep(1000);
		
		// Assertion
		
		System.out.println(driver.findElement(By.xpath("//div[@class='v-snack__content']")).getText());
		
		String Snackbar = driver.findElement(By.xpath("//div[@class='v-snack__content']")).getText();
		
		Snackbar.equals(Expected);
		
		driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();

		
	}
	
	
	
	
}

