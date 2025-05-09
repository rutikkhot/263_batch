package Test_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "/Users/apple/Documents/Java by Kiran/Automation Testing/cucumber/FeatureFIle/login.feature",
    glue = "Step_Definations",
    tags = "@RunThis",
    dryRun = false,
    monochrome = true,
    plugin = "html:target/cucumber-reports/htmlReports.html")
public class Login_Runner {

	
}
