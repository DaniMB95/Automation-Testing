package hooks;

import io.cucumber.core.backend.CucumberBackendException;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/",
        glue = {"steps"},
        plugin = {"pretty", "html:target/cucumber-Report.html"}, tags = "@Acceptance"
)
public class JunitRunner {

}
