package Admin_Configuration_UpdateFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Update_Queue extends AdminLogin{
	
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		// Configuration
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Queue Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Queues'])[1]")).click();
		
		Thread.sleep(1000);
		
	}
	
	@Parameters({"queue_Name","queue_Strategy"})
	@Test
	public void Update_QueueStrategy(String queue_Name,String queue_Strategy) throws InterruptedException {
		
		Actions action = new Actions(driver);
		
		//Update Popup
		
		driver.findElement(By.xpath("//td[text()='"+queue_Name+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//i[@class='v-icon material-icons theme--light'][normalize-space()='arrow_drop_down'])[2]")).click();
		
		Thread.sleep(1000);
		
		WebElement Strategy_Popup = driver.findElement(By.xpath("(//div[@role='list'])[4]"));
		
		Strategy_Popup.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+queue_Strategy+"'])[1]")).click();
		
		action.click().build().perform();
		
		// Update Strategy
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		//Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		//Verification
		
		String actualvalue = driver.findElement(By.xpath("//td[text()='"+queue_Name+"']//following-sibling::td[1]")).getText();
	
		Assert.assertEquals(actualvalue, queue_Strategy,"Queue Strategy is not Updated...!");
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

	}
	
	@Parameters({"queue_Name","queue_WaitTimeOut"})
	@Test
	public void Update_QueueWaitTime(String queue_Name,String queue_WaitTimeOut) throws InterruptedException {
		
		Actions action = new Actions(driver);
		
		//Update Popup
		
		driver.findElement(By.xpath("//td[text()='"+queue_Name+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
		
		Thread.sleep(1000);
		
		action.doubleClick(driver.findElement(By.xpath("(//input[@aria-label='Wait TimeOut'])[1]"))).sendKeys(Keys.BACK_SPACE).build().perform();
		
		driver.findElement(By.xpath("(//input[@aria-label='Wait TimeOut'])[1]")).sendKeys(queue_WaitTimeOut);
		
		// Update Wait Time
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		//Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		//Verification
		
		String actualvalue = driver.findElement(By.xpath("//td[text()='"+queue_Name+"']//following-sibling::td[2]")).getText();
	
		Assert.assertEquals(actualvalue, queue_WaitTimeOut,"Queue Wait Timeout is not Updated...!");
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

	}
	
	@Parameters({"queue_Name","queue_Restart"})
	@Test
	public void Update_QueueRestart(String queue_Name,String queue_Restart) throws InterruptedException {
		
		Actions action = new Actions(driver);
		
		//Update Popup
		
		driver.findElement(By.xpath("//td[text()='"+queue_Name+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
		
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//i[@class='v-icon material-icons theme--light'][normalize-space()='arrow_drop_down'])[4]")).click();
		
		Thread.sleep(1000);
		
		WebElement RestartList = driver.findElement(By.xpath("(//div[@role='list'])[2]"));
		
		RestartList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+queue_Restart+"'])[1]")).click();
		
		action.click().build().perform();
		
		// Update Restart
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		//Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		// Verification
		
		driver.findElement(By.xpath("//td[text()='"+queue_Name+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
		
		Thread.sleep(1000);

		String actualvalue = driver.findElement(By.xpath("(//div[@class='v-select__selections'])[4]")).getText();
		
		Assert.assertEquals(actualvalue, queue_Restart,"Queue Restart is not Updated...!");
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		
		
	}
}



