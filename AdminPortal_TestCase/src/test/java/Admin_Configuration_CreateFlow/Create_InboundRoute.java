package Admin_Configuration_CreateFlow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Create_InboundRoute extends AdminLogin {
	
	Long DID_Number = 9876543210L;
	
	String DID_Name ="Test";
	
	String Destination_Name ="queue";
	
	String Destination_Value="Testing";
	
	boolean BlockList = true;
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		// Configuration
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Inbound Route
		
		driver.findElement(By.xpath("(//span[normalize-space()='Inbound Route'])[1]")).click();
	}
	
	@Test
	public void InboundRoute_Create() throws InterruptedException {
		

		// New  Popup
		
		driver.findElement(By.xpath("(//div[normalize-space()='New'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement Popup =driver.findElement(By.xpath("(//div[@class='v-card__text'])[3]"));
		
		//DID Number
		
		WebElement DIDNumber =driver.findElement(By.xpath("(//input[@aria-label='DID Number'])[2]"));
		
		DIDNumber.sendKeys(Long.toString(DID_Number));
		
		// DID Name
		
		driver.findElement(By.xpath("(//input[@aria-label='DID Name'])[2]")).sendKeys(DID_Name);
		
		// Destination Name
		
		driver.findElement(By.xpath("(//i[@aria-hidden='true'][normalize-space()='arrow_drop_down'])[3]")).click();
		
		Thread.sleep(1000);
		
		WebElement destination_list = driver.findElement(By.xpath("(//div[@role='list'])[6]"));
		
		destination_list.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+Destination_Name+"'])[3]")).click();
		
		Popup.click();
		
		// Destination Value
		
		driver.findElement(By.xpath("(//i[@aria-hidden='true'][normalize-space()='arrow_drop_down'])[4]")).click();
	
		WebElement value_list = driver.findElement(By.xpath("(//div[@role='list'])[5]"));
		
		value_list.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+Destination_Value+"'])[2]")).click();
		
		Popup.click();
		
		// Block List 
		
		if(BlockList = true)
		{
			driver.findElement(By.xpath("(//label[@class='v-label theme--light'][normalize-space()='Blocklist'])[2]")).click();
		}

		
		// Create Inbound Route
		
		driver.findElement(By.xpath("(//div[normalize-space()='Create'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Verification
		
		
	      List<WebElement> Alldatas = driver.findElements(By.xpath("//table[@class='v-datatable v-table theme--light']//tr//td[1]"));
	
	      System.out.println(Alldatas.size());
	      
	      boolean flag = false;
	      
	      for(WebElement Data : Alldatas) {
	    	  
	    	  String value=Data.getText();
	    	  
	    	  if(value.contains(Long.toString(DID_Number)))
	    			  {
	    		  
	    		  flag = true;
	    		  
	    		  break;
	    	  }
	      }
	  Assert.assertTrue(flag,"DID_Number is Not Created...!");	

		
	}	
	
	

}
