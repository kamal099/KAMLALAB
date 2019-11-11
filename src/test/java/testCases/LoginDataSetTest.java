package testCases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dataresource.mainClass;
import pageObject.BoostHomePage;
import pageObject.LoginPageObject;
import pageObject.PhonePageObjectInstock;

public class LoginDataSetTest  extends mainClass{

	static Logger log= LogManager.getLogger(LoginDataSetTest.class);
	BoostHomePage pg;
	LoginPageObject obj;
	@BeforeTest
	public void inxi() throws IOException {
		log.info("Browser insixie");
		driver=invokeBrowser();
		driver.navigate().to("https://www.boostmobile.com/?intnav=TopNav:Logo");
		log.info("Browser lunched");
	}
	@Test
	public void LoginTest() throws IOException, InterruptedException {
		
		log.error("Error here");
		log.info("test started");
		 pg= new BoostHomePage(driver);
		 String text1 = pg.CheckText().getText();
		Assert.assertEquals(text1, "Activate");
		pg.sigin().click();
	
		Thread.sleep(2000);
	   obj= new LoginPageObject(driver);
	  String text = obj.getAssetTest().getText();
	  Assert.assertEquals(text, "Forgot your PIN?");
	  obj.getNumber().sendKeys("7573587255");
	  obj.getPin().sendKeys("1987");
	  obj.getLogin().click();
	 // Assert.assertTrue(false);
	}
	@Test
	public void cliconPhoe() {
		String text = obj.getAssetTest().getText();
		  Assert.assertEquals(text, "Forgot your PIN?");
	}

	@AfterTest
	public void exitBroser() {
		driver.quit();
	}
}
