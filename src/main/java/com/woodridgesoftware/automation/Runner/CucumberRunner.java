package com.woodridgesoftware.automation.Runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/features/login.feature",
        glue= "com/woodridgesoftware/automation/StepDefs",
        dryRun=false,
        tags="@SPR-464",
        publish=true
)

public class CucumberRunner {

}
