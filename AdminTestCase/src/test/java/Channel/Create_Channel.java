package Channel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Create_Channel extends AdminLogin {
	
	String ChannelName ="Outlook";
	
	String Description ="Testing";
	
	
	@BeforeMethod
	public void Setip() throws InterruptedException {
		
		driver.findElement(By.xpath("//div[contains(text(),'Users & Groups')]")).click();
		
		Thread.sleep(1000);
		
		//Going to Channel Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Channel'])[1]")).click();
	

	}
	
	@Test(priority = 0)
	public void Create_Channel() throws InterruptedException {
		
	
	// Add Channel Popup
		
		driver.findElement(By.xpath("//div[normalize-space()='Add Channel']")).click();
	
		Thread.sleep(1000);
	
	// Channel Name
		
		driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")).sendKeys(ChannelName);
	
	// Description
		
		driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")).sendKeys(Description);
		
	// Create Channel
		
		driver.findElement(By.xpath("(//div[normalize-space()='Create'])[1]")).click();
		
		Thread.sleep(1000);
		
	//Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
	// Verification

		Thread.sleep(1000);
		
	      List<WebElement> Alldatas = driver.findElements(By.xpath("//table[@class='v-datatable v-table theme--light']//tr//td[1]"));
	
	      System.out.println(Alldatas.size());
	      
	      boolean flag = false;
	      
	      for(WebElement Data : Alldatas) {
	    	  
	    	  String value=Data.getText();
	    	  
	    	  if(value.contains(ChannelName)) {
	    		  
	    		  flag = true;
	    		  
	    		  break;
	    	  }
	      }
    	  Assert.assertTrue(flag,"Channel is Not Created...!");	
	}
	
}
	
		      
//	      driver.findElement(By.xpath("//td[text()='Mail']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
	





