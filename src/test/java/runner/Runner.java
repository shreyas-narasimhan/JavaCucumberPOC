package runner;

import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"utility", "stepDefinition" },
        plugin = {"pretty", "html:target/cucumber-html-report/index.html","json:target/cucumber.json" }
)
public class Runner {

}
