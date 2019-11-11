package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	
	public WebDriver driver;
	
	public LoginPageObject(WebDriver driver) {
		this.driver=driver;
	}
	
	By number=By.id("phoneID");
	By pin = By.id("pinID");
	By login= By.cssSelector(".btn.standard.btn-primary");
	By AssertText = By.linkText("Forgot your PIN?");
	
	
	
	public WebElement getNumber() {
		
		return driver.findElement(number);
	}
	
	
public WebElement getPin() {
		
		return driver.findElement(pin);
	}

public WebElement getLogin() {
	
	return driver.findElement(login);
}

public WebElement getAssetTest() {
	
	return driver.findElement(AssertText);
}

}
