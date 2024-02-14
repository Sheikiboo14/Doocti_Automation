package Admin_CRM_CreateFlow;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class CreatingList extends AdminLogin{
	
/*
	
	String campaign_Name="Dialer";

	String list_Name ="Testing";
	
	String description ="Testing Purpose";
	
	int list_ID = 108;
	
	int list_Recycle =5;
	
	*/
	
	@BeforeSuite()
	public void Setup() {
		
		
		driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();
				
		driver.findElement(By.xpath("//span[normalize-space()='Lists']")).click();
	

		
		
	}
	
	@Parameters({"campaign_Name","list_Name","description","list_ID","list_Recycle"})
	@Test
	public void Create_List(String campaign_Name,String list_Name, String description, int list_ID, int list_Recycle  ) throws InterruptedException {
				
		
		Actions action = new Actions(driver);

// Add List Popup
		
		driver.findElement(By.xpath("//div[normalize-space()='Add List']")).click();
		
		Thread.sleep(1000);

// List ID
		
		WebElement listid = driver.findElement(By.xpath("(//input[@aria-label='List ID'])[2]"));
		
		listid.sendKeys(Integer.toString(list_ID));
		
// List Name
		
		WebElement listname = driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]"));
		
		listname.sendKeys(list_Name);
		
// List Description
		
		WebElement listdescription = driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]"));
		
		listdescription.sendKeys(description);
		
// List Campaign
		
		driver.findElement(By.xpath("(//i[@aria-hidden='true'][normalize-space()='arrow_drop_down'])[4]")).click();
		
		Thread.sleep(1000);
		
		WebElement ListCampaign = driver.findElement(By.xpath("(//div[@role='list'])[8]"));
		
		ListCampaign.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+campaign_Name+"'])[3]")).click();

		action.click().build().perform();
		
// List Recycling
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[5]")).click();
		
		Thread.sleep(1000);
		
		WebElement listRecycling = driver.findElement(By.xpath("(//div[@role='list'])[7]"));
		
		listRecycling.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='"+list_Recycle+"'])[2]")).click();
		
		action.click().build().perform();

// Create List
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Create'])[1]")).click();
		
		Thread.sleep(1000);
		
// Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[4]")).click();
		
// Verification
		
		List<WebElement> Alldatas = driver.findElements(By.xpath("//table[contains(@class,'v-datatable')]//tr//td[1]"));
		
		boolean flag = false;
		
		for (WebElement Data : Alldatas) {
			
			String value = Data.getText();

			if(value.contains(Integer.toString(list_ID))) {
				
				flag = true ;
				
			}
		}
		
		Assert.assertTrue(flag,"List is not Created...!");
		
		
		driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();

		
		
	}
}

