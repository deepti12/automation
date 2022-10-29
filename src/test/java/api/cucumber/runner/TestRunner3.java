package api.cucumber.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/api/cucumber/features/Login.feature"
        ,glue= {"api.cucumber.steps,api.cucumber.hooks"},
        plugin={"pretty","html:target/HtmlReports"}


)
public class TestRunner3 {
}
