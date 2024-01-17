package Channel;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Create_Channel extends AdminLogin {
	
	String ChannelName ="Facebook Chat";
	
	String Description ="Testing";
	
	
	@BeforeMethod
	public void Setip() throws InterruptedException {
		
		driver.findElement(By.xpath("//div[contains(text(),'Users & Groups')]")).click();
		
		Thread.sleep(1000);
		
		//Going to Channel Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Channel'])[1]")).click();
	

	}
	
	@Test(priority = 0)
	public void Create_Channel() throws InterruptedException {
		
	
	// Add Channel Popup
		
		driver.findElement(By.xpath("//div[normalize-space()='Add Channel']")).click();
		
		Thread.sleep(1000);
	
	// Channel Name
		
		driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")).sendKeys(ChannelName);
	
	// Description
		
		driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")).sendKeys(Description);
		
	// Create Channel
		
		driver.findElement(By.xpath("(//div[normalize-space()='Create'])[1]")).click();
		
		Thread.sleep(1000);
		
	//Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		
		
	}

}
