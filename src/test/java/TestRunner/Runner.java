package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".\\src\\test\\resources\\rolex.feature" ,
					glue = {"rolex"} ,
					monochrome = true ,
					dryRun = false ,
					plugin = {"json:target/reports.json"})
					
public class Runner {
		
}
