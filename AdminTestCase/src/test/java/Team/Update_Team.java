package Team;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Update_Team extends AdminLogin{
	
	@Test
	public void Test() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(text(),'Users & Groups')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//span[normalize-space()='Team'])[1]")).click();
		
		System.out.println(driver.findElement(By.xpath("(//td[normalize-space()='Test'])[1]")).getText());
	}

}
