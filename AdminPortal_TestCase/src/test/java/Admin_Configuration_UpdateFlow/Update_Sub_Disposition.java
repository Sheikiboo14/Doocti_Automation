package Admin_Configuration_UpdateFlow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Update_Sub_Disposition extends AdminLogin {
	

	
	@BeforeMethod
	public void Setup( ) throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();
		
		Thread.sleep(1000);
		
		// Opening Dispo Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Sub-Dispositions'])[1]")).click();
		
		Thread.sleep(1000);
		
	}

	@Parameters({"subdispo_Name","subdispo_Status"})
	@Test
	public void Update_SubDispoStatus(String subdispo_Name, String subdispo_Status) throws InterruptedException
	{
		
		Actions action = new Actions(driver);
		
		// Update status
		
		driver.findElement(By.xpath("//td[text()='"+subdispo_Name+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//i[@aria-hidden='true'][normalize-space()='arrow_drop_down'])[2]")).click();
		
		Thread.sleep(1000);
		
		WebElement StatusList = driver.findElement(By.xpath("(//div[@role='list'])[3]"));
		
		StatusList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+subdispo_Status+"'])[2]")).click();
		
		action.click().build().perform();
		
		// Update
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		// close snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		// Verification
		
		String actualvalue = driver.findElement(By.xpath("//td[text()='"+subdispo_Name+"']//following-sibling::td[2]")).getText();
		
		Assert.assertEquals(actualvalue, subdispo_Status,"Sub-Dispo Status is not Updated...!");
	
	}
}
