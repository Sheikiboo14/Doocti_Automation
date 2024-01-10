package Configuration_CreationFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Creat_PauseCode extends AdminLogin {
	
	String PauseCodeName = "Testing";
	
	String PauseCodeDescription = "Testing Purpose";
	
	int hour = 1;
	
	int minutes =30;
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Opening Ticket Status page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Pause Codes'])[1]")).click();
		
	}
	
	@Test
	public void Create_PauseCode() throws InterruptedException {
		
		// Add PauseCode Popup
		
		driver.findElement(By.xpath("(//div[normalize-space()='Add Pause Code'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement Popup = driver.findElement(By.xpath("(//div[@class='v-card__text'])[3]"));
		
		// Pause Code Name
		
		driver.findElement(By.xpath("(//input[@aria-label='Pause Code'])[2]")).sendKeys(PauseCodeName);
		
		// Pause Code Description
		
		driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")).sendKeys(PauseCodeDescription);
		
		//Time
		
		driver.findElement(By.xpath("(//input[@aria-label='Time'])[2]")).click();
		
		Thread.sleep(1000);
		
		WebElement Clock = driver.findElement(By.xpath("(//div[@class='v-time-picker-clock v-time-picker-clock--indeterminate theme--light'])[1]"));
		
		Clock.findElement(By.xpath("(//span[contains(text(),'"+hour+"')])[1]")).click();
		
		Clock.findElement(By.xpath("(//span[contains(text(),'"+minutes+"')])[1]")).click();
		
		//Set Time
		
		driver.findElement(By.xpath("(//div[normalize-space()='OK'])[1]")).click();
		
		//Create PauseCode
		
		driver.findElement(By.xpath("(//div[normalize-space()='Create'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

		
		
	}
	
}
