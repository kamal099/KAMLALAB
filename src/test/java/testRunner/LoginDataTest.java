package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/LoginData.feature",
glue= {"stepDefinations"})
public class LoginDataTest extends AbstractTestNGCucumberTests {

}
