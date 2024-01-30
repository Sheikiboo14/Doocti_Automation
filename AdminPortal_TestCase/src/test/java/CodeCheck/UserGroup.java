package CodeCheck;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class UserGroup extends AdminLogin {


	String userGroups_Name = "Quality";
	
	String updated_UsergroupName = "QA";

	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(text(),'Users & Groups')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//span[normalize-space()='User Group'])[1]")).click();
		
	}
	
	
	@Test(priority=0)
	public void Update_UserGroupName() throws InterruptedException {
		
		
		Actions action =new Actions(driver);
		
		// UserGroup list
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement UserGroups_List = driver.findElement(By.xpath("(//div[@class='v-list theme--light'])[1]"));
		
		UserGroups_List.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+userGroups_Name+"'])[1]")).click();
	
		action.click().build().perform();
		
		Thread.sleep(1000);
		
		// Update Name
				
		action.doubleClick(driver.findElement(By.xpath("(//input[@aria-label='Group'])[1]"))).sendKeys(Keys.BACK_SPACE).build().perform();
		
		driver.findElement(By.xpath("(//input[@aria-label='Group'])[1]")).sendKeys(updated_UsergroupName);
		
		//save name
		
		driver.findElement(By.xpath("(//i[@class='v-icon saveIcon v-icon--link material-icons theme--light'])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//div[normalize-space()='Yes, Save !'])[1]")).click();
		
		Thread.sleep(1000);
		
		//Close Snakbar
		
		driver.findElement(By.xpath("(//div[normalize-space()='Close'])[1]")).click();
		
		driver.findElement(By.xpath("(//div[contains(text(),'Users & Groups')])[1]")).click();

		
	}
	

}
