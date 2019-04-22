package CucumberTests.TestRunner;

import org.junit.runner.RunWith; // tell unit what the runner class is , this is a cucumber class
import cucumber.api.CucumberOptions; // to be able to use the  cucumber options like pretty format etc...
import cucumber.api.junit.Cucumber; // use junit with cucumber

@RunWith(Cucumber.class) // this works with junit
/*@CucumberOptions(features = {"src/test/java/features"}, format = {"json:target/cucumber.json","html:target/site/cucumber-pretty" }, glue = "Steps")*/

@CucumberOptions(features = {"src/test/java/features"}, format = {"json:target/cucumber.json","html:target/site/cucumber-pretty" }, glue = {"CucumberTests" }, tags = {"@tag5", "~@ignore"} )


//@CucumberOptions(features = {"src/test/java/features"}, format = {"json:target/cucumber.json","html:target/site/cucumber-pretty" })

/**
 * Created by Jess on 17/06/2017.
 */
public class RunTestRunner {
}
