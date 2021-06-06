package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\test\\resources\\com\\feature"},
		glue = {"stepdefinitions", "AppHooks"},
		dryRun=false,
		monochrome=true,
		plugin = {"pretty"}
		//tags = "@OrangeHrm"
		
		)


public class testrunner {

}
