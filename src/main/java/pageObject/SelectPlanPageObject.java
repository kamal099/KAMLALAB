package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectPlanPageObject {
	
	
	WebDriver driver;
	public SelectPlanPageObject(WebDriver driver) {
		this.driver=driver;
	}
	
	By plan=By.xpath("//span[contains(text(),'Plans')]");
	By phonePlan=By.xpath("//ul[@class='menu__submenu-children']//a[contains(text(),'Phone Plans')]");
	By shopPhone= By.xpath("(//div[@class='custom-wrapper aem-GridColumn--phone--none aem-GridColumn--phone--12 aem-GridColumn aem-GridColumn--offset--phone--0 aem-GridColumn--tablet--6 aem-GridColumn--default--3']//div[@class='banner-margin background-white-primary']//div[@class='cta aem-GridColumn--phone--none aem-GridColumn--phone--10 aem-GridColumn aem-GridColumn--offset--phone--1 aem-GridColumn--default--12'])[1]");
	By getItNOw= By.xpath("(//a[@class='tile tile--shadow'])[1]//button");
	By addToCart= By.xpath("//a[@class='btn solid orange color-white-primary lg']");
	
	
	public WebElement getPlan() {
	return	driver.findElement(plan);
	}
	public WebElement getPhonePlan() {
		return	driver.findElement(phonePlan);
		}
	public WebElement getShopPhone() {
		return	driver.findElement(shopPhone);
		}
	public WebElement getItNow() {
		return	driver.findElement(getItNOw);
		}
	public WebElement getAddInCart() {
		return	driver.findElement(addToCart);
		}
}
