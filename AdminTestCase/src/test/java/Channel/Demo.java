package Channel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Demo extends AdminLogin {
	
	@Test
	public void Demo() throws InterruptedException {
		
		//elevation-1 fixed-layout
		
		driver.findElement(By.xpath("(//div[contains(text(),'Users & Groups')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//span[normalize-space()='Channel'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement Table = driver.findElement(By.className("elevation-1 fixed-layout"));
		
		System.out.println(Table.getText());
		
		
		
		
		
	}

}
