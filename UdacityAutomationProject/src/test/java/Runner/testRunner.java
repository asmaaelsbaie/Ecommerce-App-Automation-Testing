package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features ="src/main/resources/feature",
        glue="stepDefinitions",
        tags = "@smoke",
        plugin ={
                "pretty",
        "html:target/cucumber-report/cucumber-pretty.html",
"json:target/cucumber-report/cucumber-TestReport.json",
        "rerun:target/cucumber-reports/rerun.txt"
        }
)

public class testRunner extends AbstractTestNGCucumberTests {
}
