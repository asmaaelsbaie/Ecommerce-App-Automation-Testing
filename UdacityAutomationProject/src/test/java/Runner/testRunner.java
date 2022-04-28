package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
/*
@CucumberOptions(
        features ="src/main/resources/feature",
        glue = {"stepDefinitions"},

        monochrome = true,
        plugin ={
                "pretty",
        "html:target/cucumber-report/cucumber-pretty.html",
        "json:target/cucumber-report/cucumber-TestReport.json",
        "rerun:target/cucumber-reports/rerun.txt"

                "html:target/cucumber.html",
                "json:target/cucumber.json",
                "junit:target/cukes.xml",
                "rerun:target/rerun.txt"},
        dryRun = false ,
        tags = "@smoke"
)

public class testRunner extends AbstractTestNGCucumberTests {
}*/

@CucumberOptions(
        features = "src/main/resources/feature",
        glue = {"stepDefinitions"},
        monochrome = true,
        plugin = {"pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json",
                "junit:target/cukes.xml",
                "rerun:target/rerun.txt"},
        dryRun = false,
        tags = "@smoke"
)


public class testRunner extends AbstractTestNGCucumberTests{

}

