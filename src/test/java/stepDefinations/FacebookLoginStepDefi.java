package stepDefinations;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginStepDefi {
	WebDriver driver;

    @Given("^when User access his account$")
    public void when_user_access_his_account() throws Throwable {
        
    	System.setProperty("webdriver.chrome.driver", "F:\\Selenium Jar file\\chrome77\\chromedriver.exe");
		driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    	driver.navigate().to("http://www.googl.com");
    	System.out.println("This is new code");
    	System.out.println("New code form GIt folder");
    	System.out.println("New code form GIt folder");
    	System.out.println("New code form GIt folder");
    	System.out.println("New code form GIt folder");
    	System.out.println("New code form GIt folder");
    	
    }

    @When("^he put their facebook password and username$")
    public void he_put_their_facebook_password_and_username() throws Throwable {
        
    	String title = driver.getTitle();
        System.out.println("Actual title is "+title);
       WebElement el= driver.findElement(By.name("q"));
       el.sendKeys("Java Tutorial");
       el.sendKeys(Keys.ARROW_DOWN);
       Thread.sleep(2000);
       el.sendKeys(Keys.ARROW_DOWN);
       el.sendKeys(Keys.ARROW_DOWN);
       Thread.sleep(2000);
       el.sendKeys(Keys.ENTER);
    }

    @Then("^access the home page$")
    public void access_the_home_page() throws Throwable {
    
    	String title = driver.getTitle();
        System.out.println(title);
        driver.quit();
    }

}