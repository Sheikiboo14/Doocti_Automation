package Channel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Update_Channel extends AdminLogin{
	
	String channel_Status = "Inactive";
	
	String channel_Name = "Mail";
	
	
	@BeforeMethod
	public void Setip() throws InterruptedException {
		
		driver.findElement(By.xpath("//div[contains(text(),'Users & Groups')]")).click();
		
		Thread.sleep(1000);
		
		//Going to Channel Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Channel'])[1]")).click();
	

	}
	
	@Test
	public void Update_Status() throws InterruptedException{
		
		Thread.sleep(1000);
		
		
	      driver.findElement(By.xpath("//td[text()='"+channel_Name+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
		
		Thread.sleep(1000);
		
		WebElement EditPopup = driver.findElement(By.xpath("(//div[@class='container grid-list-md'])[2]"));
		
		// Update Status
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement StatusList = driver.findElement(By.xpath("(//div[@role='list'])[2]"));
		
		StatusList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+channel_Name+"'])[1]")).click();
		
		EditPopup.click();
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(3000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		
		// Verification
		
		Thread.sleep(1000);
		
		String actualvalue = driver.findElement(By.xpath("//td[text()='"+channel_Name+"']//following-sibling::td[2]")).getText();

		System.out.println(actualvalue);
		   
		Assert.assertEquals(actualvalue, channel_Status, "Channel Status is not Updated");
		
	
	}
	

}
