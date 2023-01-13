package hooks;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/",
        glue = {"steps"},
        plugin = {"json:target/cucumber-reports/CucumberTestReport.json"},
        tags = "@Acceptance"
)
public class runner extends AbstractTestNGCucumberTests {
}
