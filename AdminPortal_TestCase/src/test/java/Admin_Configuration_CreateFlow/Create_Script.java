package Admin_Configuration_CreateFlow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Create_Script extends AdminLogin{
	

	 String Script_Name = "Test2";
	
	 String Script_Description ="Testing Purpose";
	
	 String Script_Type ="URL";
	
	 String Script_Text="Hello Tevatel";
	
	 String Script_URL = "https://tevatel.com/";

	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Opening Script Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Scripts'])[1]")).click();
	}
	
	@Test
	public void Create_Script() throws InterruptedException {

		// Add Script Popup
		
		driver.findElement(By.xpath("(//div[normalize-space()='Add Script'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Script Name
		
		driver.findElement(By.xpath("(//input[@aria-label='Script_name'])[1]")).sendKeys(Script_Name);
		
		//Script Description
		
		driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")).sendKeys(Script_Description);
		
		//Script Type
		
		driver.findElement(By.xpath("(//label[normalize-space()='"+Script_Type+"'])[1]")).click();
		
		if(Script_Type.equalsIgnoreCase("Text")) {
			
			driver.findElement(By.xpath("(//textarea[@placeholder='Text here...'])[1]")).sendKeys(Script_Text);
		}
		
		else if (Script_Type.equalsIgnoreCase("URL")) {
			
			driver.findElement(By.xpath("(//input[@type='url'])[1]")).sendKeys(Script_URL);
		}
		
		// Create Script
		
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
	    	  
	    	  if(value.contains(Script_Name))
	    			  {
	    		  
	    		  flag = true;
	    		  
	    		  break;
	    	  }
	      }
	  Assert.assertTrue(flag,"Script is Not Created...!");	

	
	}	
	
	


}
