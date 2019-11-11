package testCases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataresource.mainClass;
import pageObject.PhonePageObjectOutStock;

public class OrderPhoneOutStockTest extends mainClass {
	
	@BeforeTest
	public void initizlie() throws IOException, InterruptedException {
		driver=invokeBrowser();
		driver.get("https://www.boostmobile.com/");
		Thread.sleep(2000);
	}
	
	@Test
	public void retrivephones() throws InterruptedException {
		
		
		PhonePageObjectOutStock obj= new PhonePageObjectOutStock(driver);
		WebElement phone = obj.getPhone();
		Actions act= new Actions(driver);
		act.moveToElement(phone).build().perform();
		Thread.sleep(2000);
		obj.getIphone().click();
		Thread.sleep(2000);
		obj.getIphoe11().click();
		Thread.sleep(2000);
		obj.getSize().click();
		obj.getColor().click();
		String text = obj.getOut().getText();
		if(text.equals("Out of Stock")) {
			System.out.println("Phone is Sold out");
		}else {
			obj.getOut().click();
		}
		
	}
	@AfterTest
	public void exitBroweser() {
		driver.quit();
		driver=null;
	}

}
