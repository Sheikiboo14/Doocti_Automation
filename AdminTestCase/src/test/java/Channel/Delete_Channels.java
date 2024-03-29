package Channel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Delete_Channels extends AdminLogin {

		
		String Channel_Name ="Mail";	
		
		@BeforeMethod
		public void Setip() throws InterruptedException {
			
			driver.findElement(By.xpath("//div[contains(text(),'Users & Groups')]")).click();
			
			Thread.sleep(1000);
			
			//Going to Channel Page
			
			driver.findElement(By.xpath("(//span[normalize-space()='Channel'])[1]")).click();
		

		}
		
		@Test
		public void Delete_Channel() throws InterruptedException{
			
			Thread.sleep(1000);
			
			// Delete Column
		
			driver.findElement(By.xpath("//td[text()='"+Channel_Name+"']//following-sibling::td[3]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light red--text']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("(//div[normalize-space()='Yes, Delete !'])[1]")).click();
			
			Thread.sleep(1000);
			
			//Close Snakbar
			
			driver.findElement(By.xpath("(//div[@class='v-btn__content'][normalize-space()='Close'])[3]")).click();
			
			Thread.sleep(1000);
			
			// Verification
			
			List<WebElement> Alldatas = driver.findElements(By.xpath("//table[contains(@class,'v-datatable')]//tr//td[1]"));
			
			boolean flag = false;
			
			for(WebElement Data : Alldatas) {
				
				String value = Data.getText();
				
				if(value.contains(Channel_Name)) {
					
					flag =true;
				}
			}
			
			Assert.assertFalse(flag,"Channel is Not Deleted..!");
		}

	}



