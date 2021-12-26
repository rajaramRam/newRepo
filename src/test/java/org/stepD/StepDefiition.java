package org.stepD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\adactin.feature",monochrome = true,dryRun=false,glue = "org.stepR")
public class StepDefiition {

	
}
