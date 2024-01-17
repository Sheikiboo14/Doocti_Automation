package Admin_Configuration_UpdateFlow;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Update_AudioStore extends AdminLogin{
	

	String Description = "Testing";
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Opening Ticket Status page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Audio Store'])[1]")).click();
		
	}
	
	@Test
	public void Uplode_Audio() throws InterruptedException, AWTException {
		
		// Uplode Popup
		
		driver.findElement(By.xpath("(//div[normalize-space()='Upload'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Description
		
		driver.findElement(By.xpath("(//input[@aria-label='Description'])[1]")).sendKeys(Description);
		
		//Uplode Audio
		
		driver.findElement(By.xpath("(//div[@class='file-dummy'])[1]")).click();
		
		Thread.sleep(1000);
		
		Robot rb = new Robot();
		
		StringSelection FilePath = new StringSelection("D:\\Audio Store\\Leo Ratata BGM.mp3");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(FilePath, null);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(1000);
		
		// Close Popup
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[1]")).click();
		
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

		
	}


}
