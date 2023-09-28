package runners;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-reports"},
        features = "src/test/resources/features",
        glue = "steps",
        tags = "@login"
)
public class HrkaTestRunner extends BaseTestRunner {}
