package Admin_Configuration_CreateFlow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Create_TicketStatus extends AdminLogin {
	
	 
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Opening Ticket Status page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Ticket Status'])[1]")).click();
		
	}
	
	@Parameters({"ticketStatus_Name","ticketStatus_Description"})
	@Test
	public void Create_TicketStatus(String ticketStatus_Name , String ticketStatus_Description) throws InterruptedException {
		
		// Add Popup
		
				driver.findElement(By.xpath("(//div[normalize-space()='Add New'])[1]")).click();
				
				Thread.sleep(1000);
				
				// Status Name
				
				driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")).sendKeys(ticketStatus_Name);
				
				//Status Description
				
				driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")).sendKeys(ticketStatus_Description);
				
				// Create Status
				
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
			    	  
			    	  if(value.contains(ticketStatus_Name))
			    			  {
			    		  
			    		  flag = true;
			    		  
			    		  break;
			    	  }
			      }
			  Assert.assertTrue(flag,"Ticket Status is Not Created...!");	
				
			}
			
		


}
