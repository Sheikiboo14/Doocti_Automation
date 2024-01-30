package Admin_Configuration_UpdateFlow1;

import org.openqa.selenium.By;
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
	
	
	@Parameters({"queue_Name","waitTimeOut"})
	@Test(priority = 0)
	public void Update_WaitTime(String queue_Name, int waitTimeOut) throws InterruptedException {
		
		
		// update Popup
		
		driver.findElement(By.xpath("//td[text()='"+queue_Name+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
		
		Thread.sleep(1000);
				
		// Wait
		
		WebElement WaitTime =driver.findElement(By.xpath("(//input[@aria-label='Wait TimeOut'])[1]"));
		
		WaitTime.sendKeys(Integer.toString(waitTimeOut));
		
		//Update 
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		// Verification
		
		String actualvalue = driver.findElement(By.xpath("//td[text()='"+queue_Name+"']//following-sibling::td[2]")).getText();
		
		Assert.assertEquals(actualvalue,waitTimeOut,"Queue Wait Timeout is Not Updated...!");
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

	}
	
	@Parameters({"queue_Name","queue_Strategy"})
	@Test(priority = 1)
	public void Update_Strategy(String queue_Name, String queue_Strategy ) throws InterruptedException {

		Actions action = new Actions(driver);

		// update Popup		
		
		driver.findElement(By.xpath("//td[text()='"+queue_Name+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
		
		Thread.sleep(1000);
		
		
		// Ring Strategy
		
		driver.findElement(By.xpath("(//i[@aria-hidden='true'][normalize-space()='arrow_drop_down'])[2]")).click();
		
		Thread.sleep(1000);
		
		WebElement StrategyList = driver.findElement(By.xpath("(//div[@role='list'])[4]"));
		
		StrategyList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+queue_Strategy+"'])[1]")).click();
		
		action.click().build().perform();
		
		//Update 
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		// Verification
		
		String actualvalue = driver.findElement(By.xpath("//td[text()='"+queue_Name+"']//following-sibling::td[1]")).getText();
		
		Assert.assertEquals(actualvalue,queue_Strategy,"Queue Wait Timeout is Not Updated...!");
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

	}
	
	@Parameters({"queue_Name","timeoutRestart"})
	@Test(priority =2)
	public void Update_Restart(String queue_Name,String timeoutRestart) throws InterruptedException {

		Actions action = new Actions(driver);

		// update Popup
		
		driver.findElement(By.xpath("//td[text()='"+queue_Name+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
		
		Thread.sleep(1000);
				
		//Restart
		
		driver.findElement(By.xpath("(//i[@aria-hidden='true'][normalize-space()='arrow_drop_down'])[4]")).click();
		
		Thread.sleep(1000);
		
		WebElement RestartList = driver.findElement(By.xpath("(//div[@role='list'])[2]"));
		
		RestartList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+timeoutRestart+"'])[1]")).click();
		
		action.click().build().perform();
		
		//Update 
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		// Verification
		
		driver.findElement(By.xpath("//td[text()='"+queue_Name+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();

		Thread.sleep(1000);
		
				
		String actualvalue = driver.findElement(By.xpath("(//div[@class='v-select__selections'])[4]")).getText();
				
		Assert.assertEquals(actualvalue,timeoutRestart,"QueueTimeout Restart is Not Updated...!");	
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

		
	}



}
