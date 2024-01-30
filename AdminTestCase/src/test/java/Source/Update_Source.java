package Source;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Update_Source extends AdminLogin {
	
	
	String source_Name= "Source";
	
	String source_Status = "Active";
	
	
	@BeforeTest
	public void Setup() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//div[contains(text(),'Users & Groups')]")).click();
		
		Thread.sleep(1000);
		
		//Going to Source Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Source'])[1]")).click();
	}
	
	@Test
	public void Update_Source() throws InterruptedException{
		
		Thread.sleep(1000);
		
		Actions action = new Actions(driver);
		
		// Edit Popup
		
		driver.findElement(By.xpath("//td[text()='"+source_Name+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
		
		Thread.sleep(1000);
		
		WebElement EditPopup = driver.findElement(By.xpath("(//div[@class='container grid-list-md'])[2]"));
		
		// Update Source Status
		
		driver.findElement(By.xpath("(//i[@class='v-icon material-icons theme--light'][normalize-space()='arrow_drop_down'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement statusList = driver.findElement(By.xpath("(//div[@role='list'])[2]"));
		
		statusList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+source_Status+"'])[1]")).click();
		
		action.click().build().perform();
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		// verification
		
		String actualvalue = driver.findElement(By.xpath("//td[text()='"+source_Name+"']//following-sibling::td[2]")).getText();

//		System.out.println(actualvalue);
		   
		Assert.assertEquals(actualvalue, source_Status  , "Source Status is not Updated");
		
	}

}
