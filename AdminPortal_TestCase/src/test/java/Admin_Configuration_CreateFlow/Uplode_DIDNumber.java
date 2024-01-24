package Admin_Configuration_CreateFlow;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Uplode_DIDNumber extends AdminLogin {
	
	String DID_Path = "C:\\Users\\User\\Downloads\\sample_did (1).csv";
	
	String DID_Number="9876543217";

	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Opening DID Number Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='DID Number'])[1]")).click();
		
		
	}
	
	@Test(priority =0)
	public void Uplode_DID() throws InterruptedException, AWTException {
		
		// Uplode Popup
		
		driver.findElement(By.xpath("(//div[normalize-space()='Upload'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Uplode DID Number
		
		driver.findElement(By.xpath("(//div[@class='file-dummy'])[1]")).click();
		
		Thread.sleep(1000);
		
		Robot rb = new Robot();
		
		StringSelection Filepath = new StringSelection(DID_Path);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Filepath, null);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(1000);
		
		String Info = driver.findElement(By.xpath("(//div[@class='file-dummy'])[1]")).getText();
		
		Thread.sleep(1000);
		
		// Assertion
		
		Assert.assertEquals(Info, "Uploaded Successfully");
		
		if(Info.equalsIgnoreCase("Uploaded Successfully")) {
			
			// Close Popup
			
			driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[1]")).click();
			
			driver.navigate().refresh();
			
			// Verification
			
			
		      List<WebElement> Alldatas = driver.findElements(By.xpath("//table[@class='v-datatable v-table theme--light']//tr//td[2]"));
		
		      System.out.println(Alldatas.size());
		      
		      boolean flag = false;
		      
		      for(WebElement Data : Alldatas) {
		    	  
		    	  String value=Data.getText();
		    	  
		    	  if(value.contains(DID_Number))
		    			  {
		    		  
		    		  flag = true;
		    		  
		    		  break;
		    	  }
		      }
		  Assert.assertTrue(flag," DID_Number is Not Created...!");
		}
		

		
	}
	

}
