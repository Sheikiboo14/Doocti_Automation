package Admin_Configuration_CreateFlow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;


public class Create_Tags extends AdminLogin {

	
	 String Tag_Name = "Test";
	
	 String Tag_Description = "Testing";
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Opening Block List Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Tags'])[1]")).click();
		
	}
	
	@Test
	public void Tags_Creation() throws InterruptedException {

		// Add Tag Popup
		
		driver.findElement(By.xpath("(//div[normalize-space()='Add Tag'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Tag Name
		
		driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")).sendKeys(Tag_Name);
		
		// Tag Description
		
		driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")).sendKeys(Tag_Description);
		
		// Tag Creating 
		
		driver.findElement(By.xpath("(//div[normalize-space()='Create'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[normalize-space()='Close'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Verification
		
		
	      List<WebElement> Alldatas = driver.findElements(By.xpath("//table[@class='v-datatable v-table theme--light']//tr//td[1]"));
	
	      System.out.println(Alldatas.size());
	      
	      boolean flag = false;
	      
	      for(WebElement Data : Alldatas) {
	    	  
	    	  String value=Data.getText();
	    	  
	    	  if(value.contains(Tag_Name))
	    			  {
	    		  
	    		  flag = true;
	    		  
	    		  break;
	    	  }
	      }
	  Assert.assertTrue(flag,"Tag is Not Created...!");	

	
	}
	
	
}
