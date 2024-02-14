package List;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Delete_List extends AdminLogin{
	
	
	int list_Id = 124;
	
	@BeforeTest()
	public void Setup() {
		
		
		driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();
				
		driver.findElement(By.xpath("//span[normalize-space()='Lists']")).click();
	

	}
	
	@Test
	public void Delete_List() throws InterruptedException {
		
		// Delete List
		
		driver.findElement(By.xpath("//td[text()='"+list_Id+"']//following-sibling::td[6]//i[@title='Delete']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[normalize-space()='Yes, Delete !']")).click();
		
		Thread.sleep(1000);
		
		//Close Snakbar
		
		driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[4]")).click();
		
		// Verification
		
		
		List<WebElement> Alldatas = driver.findElements(By.xpath("//table[contains(@class,'v-datatable')]//tr//td[1]"));
		
		boolean flag = false;
		
		for (WebElement Data : Alldatas) {
			
			String value = Data.getText();

			if(value.contains(Integer.toString(list_Id))) {
				
				flag = true ;
				
			}
		}
		
		Assert.assertFalse(flag,"List is not Deleted...!");
		
		
		driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();

		
		
		
		
		
		
	}
		

}
