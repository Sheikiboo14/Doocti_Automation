package Admin_Configuration_CreateFlow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Login.AdminLogin;


public class Create_PauseCode extends AdminLogin {

		
		@BeforeMethod
		public void Setup() throws InterruptedException {
			
			driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
			
			Thread.sleep(1000);
			
			// Opening Ticket Status page
			
			driver.findElement(By.xpath("(//span[normalize-space()='Pause Codes'])[1]")).click();
			
		}
		
		@Parameters({"pauseCode_Name","pauseCode_Description","pauseCode_hour","pauseCode_minutes"})
		@Test
		public void Create_PauseCode(String pauseCode_Name ,String pauseCode_Description ,int pauseCode_hour ,int pauseCode_minutes ) throws InterruptedException {
			
			
			// Add PauseCode Popup
			
			driver.findElement(By.xpath("(//div[normalize-space()='Add Pause Code'])[1]")).click();
			
			Thread.sleep(1000);
			
			WebElement Popup = driver.findElement(By.xpath("(//div[@class='v-card__text'])[3]"));
			
			// Pause Code Name
			
			driver.findElement(By.xpath("(//input[@aria-label='Pause Code'])[2]")).sendKeys(pauseCode_Name);
			
			// Pause Code Description
			
			driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")).sendKeys(pauseCode_Description);
			
			//Time
			
			driver.findElement(By.xpath("(//input[@aria-label='Time'])[2]")).click();
			
			Thread.sleep(1000);
			
			WebElement Clock = driver.findElement(By.xpath("(//div[@class='v-time-picker-clock v-time-picker-clock--indeterminate theme--light'])[1]"));
			
			Clock.findElement(By.xpath("(//span[contains(text(),'"+pauseCode_hour+"')])[1]")).click();
			
			Clock.findElement(By.xpath("(//span[contains(text(),'"+pauseCode_minutes+"')])[1]")).click();
			
			//Set Time
			
			driver.findElement(By.xpath("(//div[normalize-space()='OK'])[1]")).click();
			
			//Create PauseCode
			
			driver.findElement(By.xpath("(//div[normalize-space()='Create'])[1]")).click();
			
			Thread.sleep(3000);
			
			// Close Snakbar
			
			driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
			
			// Verification
			
		      List<WebElement> Alldatas = driver.findElements(By.xpath("//table[@class='v-datatable v-table theme--light']//tr//td[1]"));
				
		      
		      boolean flag = false;
		      
		      for(WebElement Data : Alldatas) {
		    	  
		    	  String value=Data.getText();
		    	  
		    	  if(value.contains(pauseCode_Name)) {
		    		  
		    		  flag = true;
		    		  
		    		  break;
		    	  }
		      }
		      
		    Assert.assertTrue(flag,"PauseCode is Not Created...!");	
			
			driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

		}

		
		
	}


