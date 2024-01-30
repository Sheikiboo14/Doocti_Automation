package Admin_Configuration_UpdateFlow;

import javax.swing.Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Update_PauseCode extends AdminLogin {

	
	

	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Opening Pause Code Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Pause Codes'])[1]")).click();
		
		Thread.sleep(1000);
	}

	@Parameters({"pausecode_Name","pausecode_Hour","pausecode_Minute","expectedtime"})
	@Test
	public void Update_PausecodeTime(String pausecode_Name, String pausecode_Hour,String pausecode_Minute , String expectedtime) throws InterruptedException
	{
		
		Actions action = new Actions(driver);
		
		// Update status
		
		driver.findElement(By.xpath("//td[text()='"+pausecode_Name+"']//following-sibling::td[4]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@aria-label='Time'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement Clock = driver.findElement(By.xpath("(//div[@class='v-time-picker-clock__container'])[1]"));
		
		Clock.findElement(By.xpath("(//span[contains(text(),'"+pausecode_Hour+"')])[1]")).click();
		
		Clock.findElement(By.xpath("(//span[contains(text(),'"+pausecode_Minute+"')])[1]")).click();
			
		driver.findElement(By.xpath("(//div[normalize-space()='OK'])[1]")).click();
		
		// Update
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		// close snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		// Verification
		
		String actualvalue = driver.findElement(By.xpath("//td[text()='"+pausecode_Name+"']//following-sibling::td[3]")).getText();
		
		Assert.assertEquals(actualvalue, expectedtime,"PauseCode Time  is not Updated...!");
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

	}
	
	@Parameters({"pausecode_Name","pausecode_Status"})
	@Test
	public void Update_PausecodeStatus(String pausecode_Name, String pausecode_Status) throws InterruptedException {
		
		Actions action = new Actions(driver);
		
		// Update status
		
		driver.findElement(By.xpath("//td[text()='"+pausecode_Name+"']//following-sibling::td[4]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//i[@class='v-icon material-icons theme--light'][normalize-space()='arrow_drop_down'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement StatusList = driver.findElement(By.xpath("(//div[@role='list'])[2]"));
		
		StatusList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+pausecode_Status+"'])[1]")).click();
		
		action.click().build().perform();
		
		// Update
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		// close snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		// Verification
		
		String actualvalue = driver.findElement(By.xpath("//td[text()='"+pausecode_Name+"']//following-sibling::td[2]")).getText();
		
		Assert.assertEquals(actualvalue, pausecode_Status,"Pausecode Status is not Updated...!");
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

	
	}
}
