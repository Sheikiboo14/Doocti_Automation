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

public class Upload_BlockList extends AdminLogin{
	

	String BlockList_Path = "C:\\Users\\User\\Downloads\\sample_blocklist.csv";
	
	String Phno ="9090909092";
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Opening Block List Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Block List'])[1]")).click();
		
	}
	
	@Test
	public void Uplode_BlockList() throws InterruptedException, AWTException {
		
		//Uplode Popup
		
		driver.findElement(By.xpath("(//div[normalize-space()='Upload'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Uplode Block List
		
		driver.findElement(By.xpath("(//div[@class='file-dummy'])[1]")).click();
		
		Thread.sleep(1000);
		
		Robot rb = new Robot();
		
		StringSelection FilePath = new StringSelection(BlockList_Path);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(FilePath, null);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(1000);
		
		String Info = driver.findElement(By.xpath("(//div[@class='file-dummy'])[1]")).getText();
		
		if(Info.equalsIgnoreCase("Uploaded Successfully")) {
		
			//Close Popup
			
			driver.findElement(By.xpath("(//div[contains(text(),'Close')])[1]")).click();
			
			driver.navigate().refresh();
		}
		
		// Assertion
		
		Assert.assertEquals(Info, "Uploaded Successfully");
		
		Thread.sleep(1000);
		
		// Verification
		
		
	      List<WebElement> Alldatas = driver.findElements(By.xpath("//table[@class='v-datatable v-table theme--light']//tr//td[2]"));
	
	      System.out.println(Alldatas.size());
	      
	      boolean flag = false;
	      
	      for(WebElement Data : Alldatas) {
	    	  
	    	  String value=Data.getText();
	    	  
	    	  if(value.contains(Phno))
	    			  {
	    		  
	    		  flag = true;
	    		  
	    		  break;
	    	  }
	      }
	  Assert.assertTrue(flag," BlockList is Not Created...!");


		
	}


}
