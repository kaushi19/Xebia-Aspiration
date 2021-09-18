package testRunner;

import org.junit.runner.RunWith;

//import cucumber.api.junit;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/Features/aspirationScenario.feature"
		,glue={"stepDefinitions"}
		)

public class aspirationTestRunner {

}