package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PhonePageObjectInstock {

	WebDriver driver;
	
	public PhonePageObjectInstock(WebDriver driver) {
	
		this.driver=driver;
	}

	By phone = By.xpath(
			"//*[@class='menu__root js-nav-link-root menu__root--has-megamenu']/span[contains(text(),'Phones')]");
	
	By Iphone=By.xpath("//ul[@class='menu__submenu-children']//a[contains(text(),'iPhone')]");
	
	By Iphone11= By.xpath("//a[@data-sku='IPH11BT64RED']//button");
	
	By Size= By.xpath("//button[contains(text(),'64GB')]");
	By Color= By.xpath("//button[@aria-label='PRODUCT (RED)™']");
	By outStock=By.xpath("//a[contains(@class,'lg')]");
	
	
	public WebElement getPhone() {
		return driver.findElement(phone);
	}
	public WebElement getIphone() {
		return driver.findElement(Iphone);
	}
	public WebElement getIphoe11() {
		return driver.findElement(Iphone11);
	}
	public WebElement getSize() {
		return driver.findElement(Size);
	}
	public WebElement getColor() {
		return driver.findElement(Color);
	}
	public WebElement getOut() {
		return driver.findElement(outStock);
	}
}
