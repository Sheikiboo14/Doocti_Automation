package Inbound_Route;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Inbound_Updation extends AdminLogin {

	
	String IR_Application="queue";
	
	Long DID_Number = 9090909090L;
	
	boolean BlockList = false;
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		// Configuration
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Inbound Route 
		
		driver.findElement(By.xpath("(//span[normalize-space()='Inbound Route'])[1]")).click();
		
	}
	
	@Test
	public void Update_IR() throws InterruptedException {
		
		//Filter Tab
		
		driver.findElement(By.xpath("(//i[@class='fas fa-filter'])[1]")).click();
		
//		Thread.sleep(1000);
		
		WebElement Popup= driver.findElement(By.xpath("(//div[@class='container sidenavContainer'])[1]"));
		
		
		//Filter Application
		
		driver.findElement(By.xpath("(//input[@aria-label='Application'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement NameList = driver.findElement(By.xpath("(//div[@role='list'])[2]"));
		
		NameList.findElement(By.xpath("(//div[contains(text(),'"+IR_Application+"')])[1]")).click();
		
		Popup.click();
		
		// Applying Filter
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Filter'])[1]")).click();
		
		// Update Popup
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Filter'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement UpdatePopup= driver.findElement(By.xpath("(//div[@class='v-card__text'])[2]"));
		
		//DID Number
		WebElement Did_Number = driver.findElement(By.xpath("(//input[@aria-label='DID Number'])[1]"));
		
		Did_Number.sendKeys(Long.toString(DID_Number));
		
		// Update DID Number
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

		
	}

}
