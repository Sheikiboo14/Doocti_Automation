package Admin_UsersGroups_DeleteFlow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Delete_User extends AdminLogin{
	
//	String UserId = "";
//	
//	String MobNo ="";
//	
//	String Email ="smibrahim_agent01@doocti.com";
	
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("//div[contains(text(),'Users & Groups')]")).click();
		
		Thread.sleep(1000);
		
		//Going to User Page
		
		driver.findElement(By.xpath("//span[normalize-space()='Users']")).click();
		
		Thread.sleep(1000);
		
	}
	
	@Parameters({"user_emailid"})
	@Test
	public void Delete_User(String user_emailid) throws InterruptedException {
		
		//Deleting the User
		
		driver.findElement(By.xpath("//td[text()='"+user_emailid+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light red--text']")).click();
				
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[text()='Yes, Delete !']")).click();
		
		Thread.sleep(1000);
		
		//Close the Snackbar
		
		driver.findElement(By.xpath("//button[@class='v-btn v-btn--flat theme--light pink--text']//div[@class='v-btn__content'][normalize-space()='Close']")).click();
		
		// Verification
		
		List<WebElement> Alldatas = driver.findElements(By.xpath("//table[contains(@class,'v-datatable')]//tr//td[3]"));
		
		boolean flag = false;
		
		for(WebElement Data : Alldatas) {
			
			String value = Data.getText();
			
			if(value.contains(user_emailid)) {
				
				flag = true;
			}
		}
		
		Assert.assertFalse(flag,"User is Not Deleted...!");
	}
	


}
