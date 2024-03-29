package Admin_Configuration_CreateFlow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Create_SubDisposition extends AdminLogin {
	
	
	 
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Opening Sub Disposition page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Sub-Dispositions'])[1]")).click();
		
	}
	
	@Parameters({"disposition","sub_Disposition","subDispo_Description"})
	@Test
	public void Create_SubDisposition(String disposition,String sub_Disposition, String subDispo_Description) throws InterruptedException {

		// Sub disposition Popup
		
		driver.findElement(By.xpath("(//div[normalize-space()='Add'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement Popup = driver.findElement(By.xpath("(//div[@class='v-card__text'])[3]"));
		
		//Disposition
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[3]")).click();
		
		Thread.sleep(1000);
		
		WebElement DispoList = driver.findElement(By.xpath("(//div[@role='list'])[5]"));
		
		DispoList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+disposition+"'])[2]")).click();
	
		Popup.click();
		
		// Sub - disposition
		
		driver.findElement(By.xpath("(//input[@aria-label='Sub-Disposition'])[1]")).sendKeys(sub_Disposition);
		
		//Description
		
		driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")).sendKeys(subDispo_Description);
		
		// Create Sub Disposition
		
		driver.findElement(By.xpath("(//div[normalize-space()='Create'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
	
		Thread.sleep(1000);
		
		// Verification
		
		
	      List<WebElement> Alldatas = driver.findElements(By.xpath("//table[@class='v-datatable v-table theme--light']//tr//td[2]"));
	
	      
	      boolean flag = false;
	      
	      for(WebElement Data : Alldatas) {
	    	  
	    	  String value=Data.getText();
	    	  
	    	  if(value.contains(sub_Disposition))
	    			  {
	    		  
	    		  flag = true;
	    		  
	    		  break;
	    	  }
	      }
	  Assert.assertTrue(flag,"Sub Disposition is Not Created...!");	

	

	}
	
	
}
