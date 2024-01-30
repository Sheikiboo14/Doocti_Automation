package Admin_UsersGroups_UpdateFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Update_Team extends AdminLogin{
	
//	String Team_Status = "Inactive";
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(text(),'Users & Groups')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//span[normalize-space()='Team'])[1]")).click();
		
		Thread.sleep(1000);
	}
	
	@Parameters({"team_Name","team_Status"})
	@Test
	public void Update_Team(String team_Name, String team_Status) throws InterruptedException {
		
		Actions action = new Actions(driver);
		
		// Update Teams
		
		driver.findElement(By.xpath("//td[text()='"+team_Name+"']//following-sibling::td[4]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
		
		Thread .sleep(1000);
		
		WebElement EditPopup = driver.findElement(By.xpath("(//div[@class='container grid-list-md'])[1]"));
		
		//Scroll Popup
		
		WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(EditPopup);
        
		new Actions(driver)
                .scrollFromOrigin(scrollOrigin, 0, 200)
                .perform();

		
		// Team Status
		
		driver.findElement(By.xpath("(//i[@aria-hidden='true'][normalize-space()='arrow_drop_down'])[6]")).click();
		
		Thread.sleep(1000);
		
		WebElement StatusList = driver.findElement(By.xpath("(//div[@role='list'])[2]"));
		
		StatusList.findElement(By.xpath("(//div[contains(text(),'"+team_Status+"')])[1]")).click();
		
		action.click().build().perform();		
		
		// Update Status
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(3000);
		
		//Close the Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		// Verification
				
		Thread.sleep(1000);
		
		String actualvalue = driver.findElement(By.xpath("//td[text()='"+team_Name+"']//following-sibling::td[3]")).getText();

		System.out.println(actualvalue);
		   
		Assert.assertEquals(actualvalue, team_Status  , "Team Status is not Updated");
	}

}
