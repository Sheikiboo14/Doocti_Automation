package Inbound_Route;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Delete_InboundRouter extends AdminLogin{
	
	String IR_Application="queue";
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		// Configuration
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Inbound Route 
		
		driver.findElement(By.xpath("(//span[normalize-space()='Inbound Route'])[1]")).click();
		
	}
	
	@Test
	public void Delete_InboundRouter() throws InterruptedException{
		
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
		
		Thread.sleep(1000);
		
		// Delete Inbound Router
		
		driver.findElement(By.xpath("(//i[@class='v-icon mr-4 v-icon--link material-icons theme--light red--text'][normalize-space()='delete'])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//button[@type='button'])[12]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

		
		
	}

}
