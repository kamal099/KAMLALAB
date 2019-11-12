package stepDefinations;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataresource.mainClass;
import pageObject.BoostHomePage;
import pageObject.LoginPageObject;

public class LoginDataDefination extends mainClass {
	BoostHomePage pg;
	LoginPageObject obj;
	
	@Given("^Inializaing browser$")
	public void inializaing_browser() throws Throwable {
		driver=invokeBrowser();
		System.out.println("Brwosser inxilized");
	    
	}
	@Given("^user enter \"([^\"]*)\"$")
	public void user_enter(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.navigate().to(arg1);
	}

	@Given("^User cllik on login in button$")
	public void user_cllik_on_login_in_button() throws Throwable {
		pg= new BoostHomePage(driver);
		 String text1 = pg.CheckText().getText();
		Assert.assertEquals(text1, "Activate");
		pg.sigin().click();
	    
	}
	  @When("^User put (.+) and (.+)$")
	    public void user_put_and(String phone, String pin) throws Throwable {
	    
		  Thread.sleep(2000);
		   obj= new LoginPageObject(driver);
		  //String text = obj.getAssetTest().getText();
		  //Assert.assertEquals(text, "Forgot your PIN?");
		  obj.getNumber().sendKeys(phone);
		  
		  obj.getPin().sendKeys(pin);
		  Thread.sleep(1000);
		  obj.getLogin().click();
	    }


	@Then("^user access account page$")
	public void user_access_account_page() throws Throwable {
	   
		driver.quit();
	
	}


}
