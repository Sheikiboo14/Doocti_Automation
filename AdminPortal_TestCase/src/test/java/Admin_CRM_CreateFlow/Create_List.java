package Admin_CRM_CreateFlow;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Login.AdminLogin;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Create_List extends AdminLogin{
	

	
	String CampaignName="Test Preview";

	String ListName ="TestList";
	
	String Description ="Testing Purpose";
	
	int ListID = 11;
	
	
	@Test(priority=0)
	public void CreatingList() throws InterruptedException {
		
//		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[normalize-space()='Lists']")).click();
	
		driver.findElement(By.xpath("//div[normalize-space()='Add List']")).click();
		
		Thread.sleep(1000);
		
		WebElement ListPopup = driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']//div[@class='v-card__text']"));

// List ID
		
		WebElement listid = driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']//input[@aria-label='List ID']"));
		
		listid.sendKeys(Integer.toString(ListID));
		
// List Name
		
		WebElement listname = driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']//input[@aria-label='Name']"));
		
		listname.sendKeys(ListName);
		
// List Description
		
		WebElement listdescription = driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']//input[@aria-label='Description']"));
		
		listdescription.sendKeys(Description);
		
// List Campaign
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[4]")).click();
		
		Thread.sleep(1000);
		
		WebElement ListCampaign = driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@role='list']"));
		
		ListCampaign.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='v-list__tile__title'][normalize-space()='Dialer']")).click();

		ListPopup.click();
		
// List Recycling
		
		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[5]")).click();
		
		Thread.sleep(1000);
		
		WebElement ListRecycling = driver.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@role='list']"));
		
		ListRecycling.findElement(By.xpath("//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active']//div[@class='v-list__tile__title'][normalize-space()='3']")).click();
		
		ListPopup.click();

// Create List
		
		driver.findElement(By.xpath("//div[@class='v-dialog v-dialog--active v-dialog--persistent v-dialog--scrollable']//div[@class='v-btn__content'][normalize-space()='Create']")).click();
		
		ListName = ListName + ListID;
		
		ListID = ListID + 1;
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();

		
		
	}
}

