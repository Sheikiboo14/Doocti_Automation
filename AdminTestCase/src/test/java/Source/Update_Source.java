package Source;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Update_Source extends AdminLogin {
	
	String Source_Status = "Inactive";
	
	
	@BeforeTest
	public void Setup() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//div[contains(text(),'Users & Groups')]")).click();
		
		Thread.sleep(1000);
		
		//Going to Source Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Source'])[1]")).click();
	}
	
	@Test
	public void Update_Source() throws InterruptedException{
		
		
		// Edit Popup
		
		driver.findElement(By.xpath("(//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement EditPopup = driver.findElement(By.xpath("(//div[@class='container grid-list-md'])[2]"));
		
		// Update Source
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement StatusList = driver.findElement(By.xpath("(//div[@role='list'])[2]"));
		
		StatusList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+Source_Status+"'])[1]"));
		
		EditPopup.click();
		
		Thread.sleep(3000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		// Verification
		
		driver.findElement(By.xpath("(//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text'])[1]")).click();
		
		Thread.sleep(1000);
		
		String actualvalue = driver.findElement(By.xpath("(//div[@class='v-select__selections'])[1]")).getAttribute("Value");
		
		Assert.assertEquals(actualvalue, Source_Status);
	
		
	}

}
