package Admin_Configuration_UpdateFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Update_Script extends AdminLogin {


	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		// Configuration
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Script 
		
		driver.findElement(By.xpath("(//span[normalize-space()='Scripts'])[1]")).click();
	
		Thread.sleep(1000);
	}

	@Parameters({"script_Name","script_Status"})
	@Test
	public void Update_ScriptStatus(String script_Name, String script_Status) throws InterruptedException {
		
		Actions action = new Actions(driver);
		
		// Update Script Status
		
		driver.findElement(By.xpath("//td[text()='"+script_Name+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//i[@class='v-icon material-icons theme--light'][normalize-space()='arrow_drop_down'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement StatusList =driver.findElement(By.xpath("(//div[@role='list'])[2]"));
		
		StatusList.findElement(By.xpath("//div[@class='v-list__tile__title'][normalize-space()='"+script_Status+"']")).click();
		
		action.click().build().perform();
		
		// Update
		
		driver.findElement(By.xpath("//div[normalize-space()='Update']")).click();
		
		Thread.sleep(1000);
		
		// Close snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		// Verification 
		
		driver.findElement(By.xpath("//td[text()='"+script_Name+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
		
		Thread.sleep(1000);
		
		String actualvalue = driver.findElement(By.xpath("(//div[@class='v-select__selections'])[1]")).getText();
		
		System.out.println(actualvalue);
		
		Assert.assertEquals(actualvalue, script_Status , "Script Status is not Updated...!");
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[1]")).click();
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
	}
	

	@Parameters({"script_Name","script_URL","script_Text"})
	@Test
	public void Update_ScriptContent(String script_Name, String script_URL , String script_Text) throws InterruptedException {
		
		Actions action = new Actions(driver);
		
		String script_Type= driver.findElement(By.xpath("//td[text()='"+script_Name+"']//following-sibling::td[2]")).getText();
		
		if(script_Type.equalsIgnoreCase("URL")) {
		
		// Update Script Content
		
		driver.findElement(By.xpath("//td[text()='"+script_Name+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
		
		Thread.sleep(1000);
		
		action.click(driver.findElement(By.xpath("(//input[@aria-label='URL'])[1]")))
		.keyDown(Keys.CONTROL)
		.sendKeys("a")
		.keyUp(Keys.CONTROL)
		.sendKeys(Keys.BACK_SPACE)
		.build().perform();
	
		driver.findElement(By.xpath("(//input[@aria-label='URL'])[1]")).sendKeys(script_URL);
		
		// Update
		
		driver.findElement(By.xpath("//div[normalize-space()='Update']")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		//Verification
		
		driver.findElement(By.xpath("//td[text()='"+script_Name+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
		
		Thread.sleep(1000);
		
		String actualvalue = driver.findElement(By.xpath("(//input[@aria-label='URL'])[1]")).getAttribute("value");
		
		Assert.assertEquals(actualvalue,script_URL,"Script Content is not Updated...!");
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[1]")).click();
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		}
		
		else if(script_Type.equalsIgnoreCase("TEXT")) {
			
			
			// Update Script Content
			
			driver.findElement(By.xpath("//td[text()='"+script_Name+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
			
			Thread.sleep(1000);
			
			action.click(driver.findElement(By.xpath("(//textarea[@aria-label='Text'])[1]")))
			.keyDown(Keys.CONTROL)
			.sendKeys("a")
			.keyUp(Keys.CONTROL)
			.sendKeys(Keys.BACK_SPACE)
			.build().perform();
			
			driver.findElement(By.xpath("(//textarea[@aria-label='Text'])[1]")).sendKeys(script_Text);
			
			// Update
			
			driver.findElement(By.xpath("//div[normalize-space()='Update']")).click();
			
			Thread.sleep(1000);
			
			// Close Snakbar
			
			driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
			
			//Verification
			
			driver.findElement(By.xpath("//td[text()='"+script_Name+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
			
			Thread.sleep(1000);
			
			String actualvalue = driver.findElement(By.xpath("(//textarea[@aria-label='Text'])[1]")).getAttribute("value");
			
			Assert.assertEquals(actualvalue,script_Text,"Script Content is not Updated...!");
			
			driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[1]")).click();
			
			driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
			
		}
		
		
	}
}
