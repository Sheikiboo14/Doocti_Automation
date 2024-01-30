package Admin_Configuration_UpdateFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Update_TimeZone extends AdminLogin{
	
		
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		// Configuration
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Time Zone
		
		driver.findElement(By.xpath("(//span[normalize-space()='Timezone'])[1]")).click();
		
		Thread.sleep(1000);
	}

	@Parameters({"timezone_Name","timezone_Status"})
	@Test
	public void Update_TimezoneStatus(String timezone_Name, String timezone_Status) throws InterruptedException {
		
		Actions action = new Actions(driver);
		
		// Update TimeZone Status
		
		driver.findElement(By.xpath("//td[text()='"+timezone_Name+"']//following-sibling::td[5]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//i[@class='v-icon material-icons theme--light'][normalize-space()='arrow_drop_down'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement StatusList =  driver.findElement(By.xpath("(//div[@role='list'])[3]"));
		
		StatusList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+timezone_Status+"'])[2]")).click();
	
		action.click().build().perform();
		
		// Update
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		// CLose Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		// Verification
		
		String actualvalue = driver.findElement(By.xpath("//td[text()='"+timezone_Name+"']//following-sibling::td[4]")).getText();
		
		Assert.assertEquals(actualvalue, timezone_Status, "Timezone Status is not Updated...!");
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

	}
	
	


}
