package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BoostHomePage {
	
	
	public WebDriver driver;
	
	public BoostHomePage(WebDriver driver) {
	
		this.driver=driver;
	}
	
	By signin=By.id("signInPrimaryNavLink");
	By AssText=By.xpath("//div[@class='header-transfer__col header-hide-mobile']//a[contains(text(),'Activate')]");
	
	public WebElement sigin() {
		return driver.findElement(signin);
	}
	
	public WebElement CheckText() {
		return driver.findElement(AssText);
	}

}
