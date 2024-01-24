package Admin_Configuration_CreateFlow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Create_MeetingTitle extends AdminLogin{
	
	String Meeting_Title = "Test";
	
	String Meeting_SubTitle = "Testing";
	
	String Meeting_Description = "Testing Purpose";
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Opening Meeting Title Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Meeting Title'])[1]")).click();
	}
	
	@Test
	public void MeetingTitle_Creation() throws InterruptedException {

		// Add Meeting Title Popup
		
		driver.findElement(By.xpath("(//div[normalize-space()='Add Meeting Title'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Meeting Title 
		
		driver.findElement(By.xpath("(//input[@aria-label='Meeting Title'])[2]")).sendKeys(Meeting_Title);
		
		//Meeting Sub Title
		
		driver.findElement(By.xpath("(//input[@aria-label='Meeting Sub Title'])[1]")).sendKeys(Meeting_SubTitle);
		
		// MeetingDescription
		
		driver.findElement(By.xpath("(//input[@aria-label='Description'])[3]")).sendKeys(Meeting_Description);
		
		// Creating Meeting
		
		driver.findElement(By.xpath("(//div[normalize-space()='Create'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		Thread.sleep(1000);
		
		// Verification
		
		
	      List<WebElement> Alldatas = driver.findElements(By.xpath("//table[@class='v-datatable v-table theme--light']//tr//td[1]"));
	
	      System.out.println(Alldatas.size());
	      
	      boolean flag = false;
	      
	      for(WebElement Data : Alldatas) {
	    	  
	    	  String value=Data.getText();
	    	  
	    	  if(value.contains(Meeting_Title))
	    			  {
	    		  
	    		  flag = true;
	    		  
	    		  break;
	    	  }
	      }
	  Assert.assertTrue(flag,"MeetingTitle is Not Created...!");	

		
	}
	
	

}
