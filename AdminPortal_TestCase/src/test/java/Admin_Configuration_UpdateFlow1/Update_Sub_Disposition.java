package Admin_Configuration_UpdateFlow1;

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
	
	@Parameters({"sub_Dispo","subdispo_Status"})
	@Test
	public void Update_SubdispoStatus(String sub_Dispo,String subdispo_Status) throws InterruptedException {
		
		
		Actions action = new Actions(driver);
		
		// Update Popup
		
		driver.findElement(By.xpath("//td[text()='"+sub_Dispo+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
		
		Thread.sleep(1000);
				
		// Status
		
		driver.findElement(By.xpath("(//i[@aria-hidden='true'][normalize-space()='arrow_drop_down'])[2]")).click();
		
		Thread.sleep(1000);
		
		WebElement StatusList = driver.findElement(By.xpath("(//div[@role='list'])[3]"));
		
		StatusList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+subdispo_Status+"'])[2]")).click();
		
		action.click().build().perform();
		
		// Update Status
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		// Verification
		
		String actualvalue = driver.findElement(By.xpath("//td[text()='"+sub_Dispo+"']//following-sibling::td[2]")).getText();
		
		Assert.assertEquals(actualvalue,subdispo_Status, "Sub Disposition Status is Not Updated...!");
		

		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

	}
	
	/*
	
	@Parameters({"sub_Dispo","updated_disposition"})
	@Test
	public void Update_Disposition(String sub_Dispo,String updated_disposition) throws InterruptedException {
		
		Actions action = new Actions(driver);
		
		// Update Popup
		
		driver.findElement(By.xpath("//td[text()='"+sub_Dispo+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
		
		Thread.sleep(1000);
				
		// Disposition
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement DispoList = driver.findElement(By.xpath("(//div[@role='list'])[4]"));
		
		DispoList.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+updated_disposition+"'])[1]")).click();
		
		action.click().build().perform();
		
		// Update Disposition
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		//Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		//Verification
		
		String atualvalue = driver.findElement(By.xpath("//td[text()='"+sub_Dispo+"']//preceding-sibling::td[1]")).getText();
		
		Assert.assertEquals(atualvalue, updated_disposition ,"Sub Dispo Disposition is Not Updated...!");
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

	}
	
	@Parameters({"sub_Dispo","update_SubDispo"})
	@Test
	public void Update_SubDisposition(String sub_Dispo,String update_SubDispo) throws InterruptedException {
		
		Actions action = new Actions(driver);
		
		// Update Popup
		
		driver.findElement(By.xpath("//td[text()='"+sub_Dispo+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
		
		Thread.sleep(1000);
				
		// Sub Disposition Name
		
		driver.findElement(By.xpath("(//input[@aria-label='SubDisposition'])[1]")).sendKeys(update_SubDispo);
		
		
		// Update Sub dispo name
		
		driver.findElement(By.xpath("(//div[normalize-space()='Update'])[1]")).click();
		
		Thread.sleep(1000);
		
		//Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
		
		// Verification
		
		List<WebElement> Alldatas = driver.findElements(By.xpath("//table[contains(@class,'v-datatable')]//tr//td[2]"));
		
		boolean flag = false;
		
		for(WebElement Data : Alldatas) {
			
			String value = Data.getText();
			
			if(value.contains(update_SubDispo)) {
				
				flag = true;
			}
		}
	
		Assert.assertTrue(flag,"Sub Dispo Name is not Updated...!");
		
		driver.findElement(By.xpath("(//div[contains(text(),'Configurations')])[1]")).click();

	}
	*/
}
