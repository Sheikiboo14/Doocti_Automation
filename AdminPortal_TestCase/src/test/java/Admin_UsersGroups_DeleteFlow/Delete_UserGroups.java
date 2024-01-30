package Admin_UsersGroups_DeleteFlow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Delete_UserGroups extends AdminLogin{

//	String UserGroups_Name = "Testing";

	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(text(),'Users & Groups')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//span[normalize-space()='User Group'])[1]")).click();
		
	}
	
	@Parameters({"UserGroups_Name"})
	@Test
	public void Delete_UserGroups(String UserGroups_Name) throws InterruptedException{
		
		
//		WebElement UserGroups_Window = driver.findElement(By.xpath("(//div[@class='v-content__wrap'])[1]"));
		
		// UserGroup list
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement UserGroups_List = driver.findElement(By.xpath("(//div[@class='v-list theme--light'])[1]"));
		
		UserGroups_List.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+UserGroups_Name+"'])[1]")).click();
	
		Actions action = new Actions(driver);
		
		action.click().build().perform();
		
		// delete UserGroups
		
		driver.findElement(By.xpath("(//i[@class='v-icon deleteIcon v-icon--link material-icons theme--light'])[1]")).click();
	
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//div[normalize-space()='Yes, Delete !'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[normalize-space()='Close'])[1]")).click();
		
		
	//Verifiaction
		
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//i[normalize-space()='arrow_drop_down']")).click();
		
		Thread.sleep(1000);
		
		List<WebElement> Alldatas = driver.findElements(By.xpath("//div[@class='v-select-list v-card theme--light']//div[@role='listitem']"));
		
		boolean flag = false;
		
		for(WebElement Data : Alldatas) {
			
			String value = Data.getText();
				
			if(value.contains(UserGroups_Name)) {
				
				flag = true;
			}
		}
		
		Assert.assertFalse(flag,"Group is Not Deleted..!");
	}
}
