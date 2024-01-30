package Script;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Script_Creation extends AdminLogin {
	
	String script_Name = "Test Test";
	
	String script_Description ="Testing Purpose";
	
	String script_Type ="URL";
	
	String script_Text="Hello Tevatel";
	
	String script_URL = "https://tevatel.com/";

	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Opening Script Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Scripts'])[1]")).click();
	}
	
	@Test()
	public void Create_Script() throws InterruptedException {
		
		// Add Script Popup
		
		driver.findElement(By.xpath("(//div[normalize-space()='Add Script'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Script Name
		
		driver.findElement(By.xpath("(//input[@aria-label='Script_name'])[1]")).sendKeys(script_Name);
		
		//Script Description
		
		driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")).sendKeys(script_Description);
		
		//Script Type
		
		driver.findElement(By.xpath("(//label[normalize-space()='"+script_Type+"'])[1]")).click();
		
		if(script_Type.equalsIgnoreCase("Text")) {
			
			driver.findElement(By.xpath("(//textarea[@placeholder='Text here...'])[1]")).sendKeys(script_Text);
		}
		
		else if (script_Type.equalsIgnoreCase("URL")) {
			
			driver.findElement(By.xpath("(//input[@type='url'])[1]")).sendKeys(script_URL);
		}
		
		// Create Script
		
		driver.findElement(By.xpath("(//div[normalize-space()='Create'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		driver.navigate().refresh();
		
		// Verification
		
		List<WebElement> Alldatas = driver.findElements(By.xpath("//table[contains(@class,'v-datatable')]//tr//td[1]"));
		
		boolean flag = false;
		
		for(WebElement Data : Alldatas) {
			
			String value = Data.getText();
			
			
			if(value.contains(script_Name)) {
				
				flag = true;
			}
		}
		
		Assert.assertTrue(flag, " Script is Not Created...!");
	
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

	
	}	
	
	}
