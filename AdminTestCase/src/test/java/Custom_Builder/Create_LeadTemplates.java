package Custom_Builder;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login.AdminLogin;

public class Create_LeadTemplates extends AdminLogin {
	
	String Template_Industry ="IT";
	
	String Template_Domain ="Sales";
	
	String Template_Name = "Testing";
	
	boolean Show = true;
	
	boolean Required = true;
	
	boolean ReadOnly = true;
	
	boolean DefaultField = true;
	
	boolean Filter = false;
	
	boolean AgentFilter = false;
	
	boolean Disable = false;
	
	boolean Unique = false;
	
	boolean is_Linked = false;
	
	
	
	
	
	@BeforeMethod
	public void Setup() throws InterruptedException{
		
		driver.findElement(By.xpath("(//div[contains(text(),'Custom Builder')])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//span[normalize-space()='Lead Templates'])[1]")).click();
	}
	
	@Test
	public void Create_LeadTemplates() throws InterruptedException {
		
		Actions action = new Actions(driver);
		
		driver.findElement(By.xpath("(//div[normalize-space()='Add Template'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement EditPopup = driver.findElement(By.xpath("(//div[@class='container grid-list-md'])[2]"));
		
		// Select Industry
		
		driver.findElement(By.xpath("(//i[@aria-hidden='true'][normalize-space()='arrow_drop_down'])[1]")).click();
		
		Thread.sleep(1000);
		
		WebElement IndustryList = driver.findElement(By.xpath("(//div[@role='list'])[3]"));
		
		IndustryList.findElement(By.xpath("(//div[contains(text(),'"+Template_Industry+"')])[1]")).click();
		
		EditPopup.click();
		
		// Select Domain
		
		driver.findElement(By.xpath("(//i[@aria-hidden='true'][normalize-space()='arrow_drop_down'])[2]")).click();
		
		Thread.sleep(1000);
		
		WebElement DomainList = driver.findElement(By.xpath("(//div[@role='list'])[2]"));
		
		DomainList.findElement(By.xpath("(//div[contains(text(),'"+Template_Domain+"')])[1]")).click();
		
		EditPopup.click();
		
		driver.findElement(By.xpath("(//div[normalize-space()='Continue'])[1]")).click();
		
		Thread.sleep(1000);
		
		// Template Title
		
		driver.findElement(By.xpath("(//input[@placeholder='Please Enter Form Title'])[1]")).sendKeys(Template_Name);
		
		Thread.sleep(1000);		
		
		//Drag Text Box
		
		WebElement CustomTab =driver.findElement(By.xpath("(//div[@class='meta'])[1]"));
		
		WebElement TextBox =driver.findElement(By.xpath("(//button[@type='button'])[55]"));
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//		js.executeScript("CustomTab.scrollBy(0,20)");
		
		Actions actions = new Actions(driver);
		
		actions.dragAndDrop(TextBox,CustomTab).build().perform();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@aria-label='Text'])[1]")).click();
		
		WebElement Properties=driver.findElement(By.xpath("(//div[@class='right_custom'])[1]"));
		
		action.doubleClick(driver.findElement(By.xpath("(//input[@type='text'])[34]"))).sendKeys(Keys.BACK_SPACE).build().perform();
		
		//label Name
		
		driver.findElement(By.xpath("(//input[@type='text'])[34]")).sendKeys("Testing");
		
		Properties.click();
		
		//Input type
		
		driver.findElement(By.xpath("(//i[@class='el-select__caret el-input__icon el-icon-arrow-up'])[1]")).click();
		
		WebElement InputTypeList = driver.findElement(By.xpath("(//ul[@class='el-scrollbar__view el-select-dropdown__list'])[4]"));
		
		InputTypeList.findElement(By.xpath("(//span[normalize-space()='Others'])[1]")).click();
		
		Properties.click();
		
		// Model
		
		action.doubleClick(driver.findElement(By.xpath("(//input[@type='text'])[36]"))).sendKeys(Keys.BACK_SPACE).build().perform();

		driver.findElement(By.xpath("(//input[@type='text'])[36]")).sendKeys("Testing");

		Properties.click();
		
		// Model Type
		
		driver.findElement(By.xpath("(//i[@class='el-select__caret el-input__icon el-icon-arrow-up'])[2]")).click();
				
		WebElement ModelTypeList = driver.findElement(By.xpath("(//ul[@class='el-scrollbar__view el-select-dropdown__list'])[4]"));
		
		ModelTypeList.findElement(By.xpath("(//span[normalize-space()='Text'])[1]")).click();
		
		Properties.click();
		
		// Placeholder
		
		driver.findElement(By.xpath("(//input[@type='text'])[39]")).sendKeys("Testing");
		
		// Show on Form & Popup
		
		if(Show == true) {
			
			driver.findElement(By.xpath("(//span)[163]")).click();
			
			driver.findElement(By.xpath("(//span)[164]")).click();
		}
		
		// Required Filed
		
		if(Required == true) {
			
			driver.findElement(By.xpath("(//span)[165]")).click();
		}
		
		// Read Only 
		
		if(ReadOnly == true) {
			
			driver.findElement(By.xpath("(//span)[166]")).click();
		}
		
		//  Filter 
		
		if(Filter == true) {
			
			driver.findElement(By.xpath("(//span)[172]")).click();
		}
		
		// Agent Filter 
		
		if(AgentFilter == true) {
			
			driver.findElement(By.xpath("(//span)[173]")).click();
		}
		
		// Disabled 
		
		if(Disable == true) {
			
			driver.findElement(By.xpath("(//span)[174]")).click();
		}
	
		// Unique 
		
		if(Unique == true) {
			
			driver.findElement(By.xpath("(//span)[175]")).click();
		}
	
		// Is_Linked  
		
		if(is_Linked == true) {
			
			driver.findElement(By.xpath("(//span)[176]")).click();
		}
		
		Properties.click();
	
		// Element 
		
		driver.findElement(By.xpath("(//div[@class='bts_custom_form_change'])[1]")).click();
		
	}

}
