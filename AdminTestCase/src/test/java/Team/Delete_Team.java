package Team;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Delete_Team extends AdminLogin {
	
//	String Team_Name = "Testing Channel";
	
	@BeforeTest
	public void Setip() throws InterruptedException {
		
		driver.findElement(By.xpath("//div[contains(text(),'Users & Groups')]")).click();
		
		Thread.sleep(1000);
		
		//Going to Team Page
		
		driver.findElement(By.xpath("(//span[normalize-space()='Team'])[1]")).click();
	
		Thread.sleep(1000);


	}
	
	@Parameters({"Team_Name"})
	@Test
	public void Delete_Team(String Team_Name) throws InterruptedException{
		
		// Delete Team
		
		driver.findElement(By.xpath("//td[text()='"+Team_Name+"']//following-sibling::td[4]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light red--text']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[text()='Yes, Delete !']")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		// Verification
		
		List<WebElement> Alldatas = driver.findElements(By.xpath("//table[contains(@class,'v-datatable')]//tr//td[1]"));
		
		boolean flag = false;
		
		for(WebElement Data : Alldatas) {
			
			String value = Data.getText();
			
			if(value.contains(Team_Name)) {
				
				flag = true;
			}
		}
		
		Assert.assertFalse(flag, "Team is Not Deleted...!");
		
	}

}
