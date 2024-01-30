package Admin_Configuration_CreateFlow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Create_Dispo extends AdminLogin{
	

	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Opening Disposition page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Dispositions'])[1]")).click();
	}
	
	@Parameters({"dispo_Name","dispo_Description","dispo_Action"})
	@Test
	public void Create_Disposition(String dispo_Name, String dispo_Description, String dispo_Action  ) throws InterruptedException {

		// Add Disposition
		
		driver.findElement(By.xpath("(//div[normalize-space()='Add Disposition'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Disposition Name
		
		driver.findElement(By.xpath("(//input[@aria-label='Disposition'])[2]")).sendKeys(dispo_Name);
		
		// Description
		
		driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")).sendKeys(dispo_Description);
		
		// Action
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[3]")).click();
		
		Thread.sleep(1000);
		
		WebElement ActionList = driver.findElement(By.xpath("(//div[@role='list'])[5]"));
		
		ActionList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+dispo_Action+"'])[2]")).click();
				
		// Create Disposition
		
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
	    	  
	    	  if(value.contains(dispo_Name))
	    			  {
	    		  
	    		  flag = true;
	    		  
	    		  break;
	    	  }
	      }
	  Assert.assertTrue(flag,"Disposition is Not Created...!");	

	
	}
	
}
