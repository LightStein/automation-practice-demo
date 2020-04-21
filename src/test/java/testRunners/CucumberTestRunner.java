package testRunners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        glue = {"stepDefs"},
        features = {"src/test/resources/features"},
        tags = {"@MainScenario"}
)
public class CucumberTestRunner extends AbstractTestNGCucumberTests {

}
