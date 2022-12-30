package testRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"FeatureFile"},glue = "stepDefinations",monochrome = true,
plugin = {"pretty", "html:target/cucumber-reports"})
public class Runner
{

}
