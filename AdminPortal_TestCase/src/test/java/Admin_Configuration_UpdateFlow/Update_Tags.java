package Admin_Configuration_UpdateFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Update_Tags extends AdminLogin{
	

	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		// Configuration
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Tags 
		
		driver.findElement(By.xpath("(//span[normalize-space()='Tags'])[1]")).click();
		
		
		
	}

	@Parameters({"tag_Name","tag_Status"})
	@Test
	public void Update_TagsStatus(String tag_Name, String tag_Status) throws InterruptedException {

		
		//Update popup
		
		driver.findElement(By.xpath("//td[text()='"+tag_Name+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light green--text']")).click();
		
		Thread.sleep(1000);
				
		//Tag Status
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[1]")).click();
		
		WebElement StatusList = driver.findElement(By.xpath("(//div[@role='list'])[2]"));
		
		StatusList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+tag_Status+"'])[1]")).click();
		
		// Update Status
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[normalize-space()='Close'])[1]")).click();
		
		// Verification
		
		String actualvalue = driver.findElement(By.xpath("//td[text()='Test']//following-sibling::td[2]")).getText();
		
		Assert.assertEquals(actualvalue,tag_Status, "Tag Status is not Updated...!");
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
	
	
	}


}
