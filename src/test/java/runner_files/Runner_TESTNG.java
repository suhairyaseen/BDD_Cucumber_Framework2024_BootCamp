package runner_files;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		dryRun = false ,
		monochrome = true ,
		features = {"src/test/resources/feature_files"} ,
		glue = {"Step_definition_files", "com.tutorialninja.Hooks"} ,
		tags = "@TutorialsNinjalogin or @TutorialsNinjaRegister or @TutotrialNinjaLogout or @TutorialNinjaSearchProduct or @TutorileNinjaAddToCart",
		//plugin = {"html:test-output\\ExtentReportBDD.html"}
		
		plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)








public class Runner_TESTNG extends AbstractTestNGCucumberTests{
	
	
	
	
	
	
	
	
	
	
	

}
