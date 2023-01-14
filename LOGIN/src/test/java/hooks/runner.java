package hooks;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/",
        glue = {"steps"},
        plugin = {"html:target/cucumber-reports/cucumber-Report.html" },
        tags = "@Acceptance"
)
public class runner extends AbstractTestNGCucumberTests {
}
