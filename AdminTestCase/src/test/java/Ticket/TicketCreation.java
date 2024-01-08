package Ticket;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Login.AdminLogin;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TicketCreation extends AdminLogin {

	
	String URL ="https://sandboxv2.doocti.com";

	String AdminEmail = "devsandbox_admin@doocti.com";
	
	String AdminPassword = "Doocti@123";
	

	@Test(priority = 0)
	public void TicketExport() throws InterruptedException {
		

		driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[normalize-space()='Tickets']")).click();
		
		//Export Tickets
		
		driver.findElement(By.xpath("//i[@class='fas fa-download']")).click();
		
		WebElement ExportTicket = driver.findElement(By.xpath("(//div[@class='v-card__text'])[2]"));
		
		ExportTicket.findElement(By.xpath("//div[contains(text(),'CSV')]")).click();
		
		Thread.sleep(1000);
		
		WebElement TicketColumn = driver.findElement(By.xpath("(//div[@id='scroll-target'])[4]"));
		
		TicketColumn.findElement(By.xpath("(//div[@class='v-input--selection-controls__ripple'])[26]")).click();
		
		driver.findElement(By.xpath("//div[normalize-space()='Export']")).click();
	}
}
