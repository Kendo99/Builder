package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Created by Jess on 05/06/2017.
 */
//@RunWith(Cucumber.class) this works with junit

@CucumberOptions(features = {"src/test/java/features"}, format = {"json:target/cucumber.json","html:target/site/cucumber-pretty" }, glue = "Steps2")

// the following would run TestNG
public class TestRunner extends AbstractTestNGCucumberTests{
}
