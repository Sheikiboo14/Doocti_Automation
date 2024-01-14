package Configuration_CreationFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Queue_Creation extends AdminLogin{
	
	String QueueName ="Test1";
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Opening Queue Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Queues'])[1]")).click();
		
	}
	
	@Test
	public void Create_Queue() throws InterruptedException {

		//Add Queue Popup
		
		driver.findElement(By.xpath("(//div[normalize-space()='Add Queue'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement QueuePopup = driver.findElement(By.xpath("(//div[@class='container grid-list-md'])[2]"));
		
		//Queue Name
		
		driver.findElement(By.xpath("(//input[@aria-label='Queues'])[2]")).sendKeys(Queue_Name);
		
		// Queue WaitTime
		
		WebElement WaitTime = driver.findElement(By.xpath("(//input[@aria-label='Wait TimeOut'])[2]"));
		
		WaitTime.sendKeys(Integer.toString(Queue_WaitTime));
		
		// Ring Startegy
		
		driver.findElement(By.xpath("(//i[@aria-hidden='true'][normalize-space()='arrow_drop_down'])[6]")).click();
		
		Thread.sleep(1000);
		
		WebElement Ring_Strategy = driver.findElement(By.xpath("(//div[@role='list'])[8]"));
		
		Ring_Strategy.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+Queue_Strategy+"'])[2]")).click();

		QueuePopup.click();
		
		// Creating Queue
		
		driver.findElement(By.xpath("(//div[normalize-space()='Create'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

	}
	
	@Test(priority=1)
	public void Queue_Verification() throws InterruptedException {
	

		//Filter Tab
		
		driver.findElement(By.xpath("(//i[@class='fas fa-filter'])[1]")).click();
		
//		Thread.sleep(1000);
		
		WebElement Popup= driver.findElement(By.xpath("(//div[@class='container sidenavContainer'])[1]"));
		
		
		//Filter Title
		
		driver.findElement(By.xpath("(//input[@role='combobox'])[1]")).sendKeys(Queue_Name);
		
		Thread.sleep(1000);
		
		WebElement TitleList = driver.findElement(By.xpath("(//div[@role='list'])[1]"));
		
		TitleList.findElement(By.xpath("(//div[@class='v-list__tile__title'])[1]")).click();
		
		Popup.click();
		
		// Applying Filter
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Filter'])[1]")).click();
		
		Thread.sleep(1000);
		
		//Edit Popup
		
		driver.findElement(By.xpath("(//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text'])[1]")).click();
		
		Thread.sleep(1000);
		
		String actualvalue = driver.findElement(By.xpath("(//input[@aria-label='Queues'])[1]")).getAttribute("value");
		
		Assert.assertEquals(actualvalue, Queue_Name , "Queue is Not Created");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[1]")).click();
	}
	

}
