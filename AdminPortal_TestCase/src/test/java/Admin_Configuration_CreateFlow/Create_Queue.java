package Admin_Configuration_CreateFlow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Create_Queue extends AdminLogin {


	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Opening Queue Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Queues'])[1]")).click();
		
	}
	
	@Parameters({"queue_Name","queue_WaitTime","queue_Strategy"})
	@Test
	public void Create_Queue(String queue_Name,String queue_WaitTime,String queue_Strategy ) throws InterruptedException {

		Actions action =new Actions(driver);
		
		//Add Queue Popup
		
		driver.findElement(By.xpath("(//div[normalize-space()='Add Queue'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement QueuePopup = driver.findElement(By.xpath("(//div[@class='container grid-list-md'])[2]"));
		
		//Queue Name
		
		driver.findElement(By.xpath("(//input[@aria-label='Queues'])[2]")).sendKeys(queue_Name);
		
		// Queue WaitTime
		
		action.doubleClick(driver.findElement(By.xpath("(//input[@aria-label='Wait TimeOut'])[2]"))).sendKeys(Keys.BACK_SPACE).build().perform();
		
		driver.findElement(By.xpath("(//input[@aria-label='Wait TimeOut'])[2]")).sendKeys(queue_WaitTime);
		
		// Ring Startegy
		
		driver.findElement(By.xpath("(//i[@aria-hidden='true'][normalize-space()='arrow_drop_down'])[6]")).click();
		
		Thread.sleep(1000);
		
		WebElement Ring_Strategy = driver.findElement(By.xpath("(//div[@role='list'])[8]"));
		
		Ring_Strategy.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+queue_Strategy+"'])[2]")).click();

		QueuePopup.click();
		
		// Creating Queue
		
		driver.findElement(By.xpath("(//div[normalize-space()='Create'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		Thread.sleep(1000);
		
		// Verification
		
		
	      List<WebElement> Alldatas = driver.findElements(By.xpath("//table[@class='v-datatable v-table theme--light']//tr//td[1]"));
	
	      
	      boolean flag = false;
	      
	      for(WebElement Data : Alldatas) {
	    	  
	    	  String value=Data.getText();
	    	  
	    	  if(value.contains(queue_Name))
	    			  {
	    		  
	    		  flag = true;
	    		  
	    		  break;
	    	  }
	      }
	  Assert.assertTrue(flag,"Queue is Not Created...!");	

	}
	
	
	
}
