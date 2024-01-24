package Admin_UsersGroups_CreateFlow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Create_Source extends AdminLogin {
	
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
	
	@Parameters({"source_name" ,"source_description"})

	@Test
	public void Create_Source(String source_name ,String source_description) throws InterruptedException {
		
	// Add Source Popup
		
		driver.findElement(By.xpath("(//div[normalize-space()='Add Source'])[1]")).click();
		
		Thread.sleep(1000);
		
	// Source Name
		
		driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")).sendKeys(source_name);
		
	// Source Description
		
		driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")).sendKeys(source_description);
		
	// Create Source
		
		driver.findElement(By.xpath("(//div[normalize-space()='Create'])[1]")).click();
		
		Thread.sleep(1000);
		
	// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
	// Verification
		
	    List<WebElement> Alldatas = driver.findElements(By.xpath("//table[@class='v-datatable v-table theme--light']//tr//td[1]"));
	    
	    boolean flag = false;
	    
	   for(WebElement Data : Alldatas) {
		   
		   String value = Data.getText();
		   
		   if(value.contains(source_name)) {
			   
			   flag = true;
		   }
	   }
	   
	   Assert.assertTrue(flag,"Source is Not Created...!");

		
		
	}
}
