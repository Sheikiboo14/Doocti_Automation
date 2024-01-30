package Admin_Configuration_UpdateFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
		
		Thread.sleep(1000);
		
		
	}
	
	@Parameters({"tag_Name","tag_Status"})
	@Test
	public void Update_TagStatus(String tag_Name,String tag_Status) throws InterruptedException{
		
		Actions action = new Actions(driver);
		
		//Update Tags
		
		driver.findElement(By.xpath("//td[text()='"+tag_Name+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light green--text']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//i[@class='v-icon material-icons theme--light'][normalize-space()='arrow_drop_down'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement StatusList = driver.findElement(By.xpath("(//div[@role='list'])[2]"));
		
		StatusList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='inactive'])[1]")).click();
		
		action.click(driver.findElement(By.xpath("(//div[@class='v-card__text'])[3]"))).build().perform();
		
		// Update
		
		driver.findElement(By.xpath("//div[normalize-space()='Update']")).click();
		
		Thread.sleep(1000);
		
		// Close snakbar
		
		driver.findElement(By.xpath("//div[normalize-space()='Close']")).click();
		
		//Verification
		
		String actualvalue = driver.findElement(By.xpath("//td[text()='"+tag_Name+"']//following-sibling::td[2]")).getText();
		
		Assert.assertEquals(actualvalue, tag_Status, "Tag Status is not Updated...!");
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
	
	}
}
