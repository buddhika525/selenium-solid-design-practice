package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/test/resources/features"},
		glue={"steps"},
		plugin= {"pretty", "summary"},
		monochrome=true
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}
