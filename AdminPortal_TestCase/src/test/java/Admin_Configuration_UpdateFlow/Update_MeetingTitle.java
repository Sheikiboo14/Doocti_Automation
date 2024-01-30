package Admin_Configuration_UpdateFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Update_MeetingTitle extends AdminLogin {
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		// Configuration
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Meeting Title Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Meeting Title'])[1]")).click();
		
		Thread.sleep(1000);
	}
	
	@Parameters({"meetingtitle_Name","meetingtitle_Status"})
	@Test
	public void Update_MeetingTitleStatus(String meetingtitle_Name, String meetingtitle_Status ) throws InterruptedException {
		
		Actions action = new Actions(driver);
		
		// Update Meeting Title Status
		
		driver.findElement(By.xpath("//td[text()='"+meetingtitle_Name+"']//following-sibling::td[4]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//i[@class='v-icon material-icons theme--light'][normalize-space()='arrow_drop_down'])[1]")).click();
		
		WebElement StatusList = driver.findElement(By.xpath("(//div[@role='list'])[3]"));
		
		StatusList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+meetingtitle_Status+"'])[2]")).click();
		
		action.click().build().perform();
		
		//Update
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar

		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		// Verification
		
		String actualvalue = driver.findElement(By.xpath("//td[text()='"+meetingtitle_Name+"']//following-sibling::td[3]")).getText();
		
		Assert.assertEquals(actualvalue, meetingtitle_Status, "Meeting Title Status is not Updated...!");
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

		
		
	}
}
