package gbhRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src/gbhFeatures"},
		glue = {"GBH-Automation/src/gbhMain"},
		tags = {"@GBHAutomation"},
		monochrome = true, 
		plugin = {"junit:GBH-Automation/Reports/GBHReport.xml"}
		
		)


public class GBHCucumberRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
