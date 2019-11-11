package dataresource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mainClass {
	
	private static FileInputStream file;
	public static Properties pro;
	public static WebDriver driver;
	
	public WebDriver invokeBrowser() throws IOException {
		
		 pro= new Properties();
			 file= new FileInputStream("./src/main/java/dataresource/data.properties");
				pro.load(file);
				String bname = pro.getProperty("browser");
				//String bname=System.getProperty("browser");
				
				if(bname.contains("chrome")) {
					System.setProperty("webdriver.chrome.driver", "F:\\Selenium Jar file\\chrome77\\chromedriver.exe");
					driver = new ChromeDriver();
					
				}else {System.out.println("Browser not valid");}
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
				driver.manage().window().maximize();
				return driver;
		
	}
	
	public void takeScreenShot(String result) throws IOException {
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./FieldScreenshot/"+result+"screeen.png"));
	}

}
