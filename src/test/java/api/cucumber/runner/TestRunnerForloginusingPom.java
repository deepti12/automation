package api.cucumber.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/api/cucumber/features/LoginDemo.feature"
        ,glue= {"steps"},
        monochrome = true,
        plugin={"pretty","html:target/JUnitReports/report.xml","json:target/JSONReports/report.json","html:target/HtmlReports"})

public class TestRunnerForloginusingPom {
}
