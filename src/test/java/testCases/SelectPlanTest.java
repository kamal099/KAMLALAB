package testCases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dataresource.mainClass;
import pageObject.SelectPlanPageObject;

public class SelectPlanTest extends mainClass {
	
	
	@BeforeTest
	public void initizlie() throws IOException {
		driver=invokeBrowser();
		driver.get("https://www.boostmobile.com/");
	}
	@Test
	public void selectPlan() throws InterruptedException {
		
		
		SelectPlanPageObject obj= new SelectPlanPageObject(driver);
		WebElement plan = obj.getPlan();
		Actions ac= new Actions(driver);
		ac.moveToElement(plan).build().perform();
		Thread.sleep(2000);
		obj.getPhonePlan().click();
		Thread.sleep(2000);
		obj.getShopPhone().click();
		obj.getItNow().click();
		Thread.sleep(2000);
		obj.getAddInCart().click();
		
	}
	@AfterTest
	public void exitBrowser() {
		driver.quit();
		driver=null;
	}

}
