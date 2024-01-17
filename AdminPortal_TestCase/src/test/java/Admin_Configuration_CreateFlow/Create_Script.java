package Admin_Configuration_CreateFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Create_Script extends AdminLogin{
	

	String Script_Name = "Test2";
	
	String Description ="Testing Purpose";
	
	String Type ="URL";
	
	String ScriptText="Hello Tevatel";
	
	String ScriptURL = "https://tevatel.com/";

	
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
	
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

	
	}	
	
	@Test()
	public void Script_Verification() throws InterruptedException {
		
		
		// filter
		
		driver.findElement(By.xpath("(//i[@class='fas fa-filter'])[1]")).click();
		
		
//		Thread.sleep(1000);
		
		WebElement Popup= driver.findElement(By.xpath("(//div[@class='container sidenavContainer'])[1]"));
		
		
		//Filter Name
		
		driver.findElement(By.xpath("(//input[@aria-label='Name'])[1]")).sendKeys(Script_Name);
		
		Thread.sleep(1000);
		
		WebElement NameList = driver.findElement(By.xpath("(//div[@role='list'])[1]"));
		
		NameList.findElement(By.xpath("(//div[@class='v-list__tile__title'])[1]")).click();
		
		Popup.click();
		
		// Applying Filter
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Filter'])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text'])[1]")).click();
		
		Thread.sleep(1000);
		
		String actualvalue = driver.findElement(By.xpath("(//input[@aria-label='Description'])[1]")).getAttribute("value");
		
//		System.out.println(driver.findElement(By.xpath("(//input[@aria-label='Name'])[1]")).getText());
		
		Assert.assertEquals(actualvalue ,Script_Description, "Script is Not Created");
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[1]")).click();
		
	}


}
