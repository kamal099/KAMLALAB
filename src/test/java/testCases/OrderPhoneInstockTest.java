package testCases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dataresource.mainClass;
import pageObject.PhonePageObjectInstock;

public class OrderPhoneInstockTest extends mainClass {

	private static Logger log= LogManager.getLogger(OrderPhoneInstockTest.class);
	
	@BeforeTest
	public void initizlie() throws IOException {
		driver=invokeBrowser();
		driver.get("https://www.boostmobile.com/");
		log.info("browser start working");
	}
	
	@Test
	public void retrivephones() throws IOException, InterruptedException {
		
	
		PhonePageObjectInstock obj= new PhonePageObjectInstock(driver);
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
	public void exitBrowser() {
		driver.quit();
		driver=null;
	}

}
