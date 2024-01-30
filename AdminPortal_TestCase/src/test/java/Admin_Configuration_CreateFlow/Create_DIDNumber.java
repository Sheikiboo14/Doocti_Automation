package Admin_Configuration_CreateFlow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Create_DIDNumber extends AdminLogin{
	

//	Long DID_Number = 9876543215L;
//	
//	String Trunk ="Testing";
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Opening DID Number Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='DID Number'])[1]")).click();
		
	}
	
	@Parameters({"dID_Number","trunk"})
	@Test
	public void Manual_DID_Creation(String dID_Number, String trunk) throws InterruptedException {
		//Opening Manual DID Popup
		
		driver.findElement(By.xpath("(//i[@class='v-icon addWidget material-icons theme--light primary--text'])[1]")).click();
		
		Thread.sleep(1000);
		
		//DID Number
		
		WebElement DIDNumber = driver.findElement(By.xpath("(//input[@aria-label='DID Number'])[2]"));
		
		DIDNumber.sendKeys(dID_Number);
		
		// Trunk
		
		driver.findElement(By.xpath("(//input[@aria-label='Trunk'])[1]")).sendKeys(trunk);
		
		// Create DID Number
		
		driver.findElement(By.xpath("(//div[normalize-space()='Create'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[4]")).click();
		
		driver.navigate().refresh();
		
		// Verification
		
		List<WebElement> Alldatas = driver.findElements(By.xpath("//table[contains(@class,'v-datatable')]//tr//td[2]"));
		
		boolean flag = false;
		
		for(WebElement Data : Alldatas) {
			
			String value = Data.getText();
			
			
			if(value.contains(dID_Number)) {
				
				flag = true;
			}
		}
		
		Assert.assertTrue(flag, " DID Number is Not Created...!");	}


}
