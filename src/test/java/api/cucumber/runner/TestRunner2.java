package api.cucumber.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/api/cucumber/features//loginWithMuultipleData.feature"
        ,glue= {"api.cucumber.steps"},dryRun=false


)
public class TestRunner2 {
}
