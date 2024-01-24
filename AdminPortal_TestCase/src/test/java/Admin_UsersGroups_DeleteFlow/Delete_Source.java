package Admin_UsersGroups_DeleteFlow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Delete_Source extends AdminLogin{
	
	
	/*
	String source_name ;
	
	String source_description ;
*/
	 
	@BeforeTest
	public void Setup() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//div[contains(text(),'Users & Groups')]")).click();
		
		Thread.sleep(1000);
		
		//Going to Source Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Source'])[1]")).click();
	}
	
	@Parameters({"Source_Name"})
	@Test
	public void Delete_Source(String Source_Name ) throws InterruptedException{
		

		Thread.sleep(1000);
		
		// Delete Source
		
		driver.findElement(By.xpath("//td[text()='"+Source_Name+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light red--text']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='v-btn theme--light primary']//div[text()='Yes, Delete !']")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		Thread.sleep(1000);
		
		// Verification
		
		List<WebElement> Alldatas = driver.findElements(By.xpath("//table[contains(@class,'v-datatable')]//tr//td[1]"));


	      boolean flag = false;
	      
	      for(WebElement Data : Alldatas) {
	    	  
	    	  String value=Data.getText();
	    	  
	    	  if(value.contains(Source_Name)) {
	    		  
	    		  flag = true;
	    		  
	    		  break;
	    	  }
	      }
  	  Assert.assertFalse(flag,"Source is Not Deleted...!");	
	}
	

}
