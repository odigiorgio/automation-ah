package com.ahproject.cucumber.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:cucumberFeatures"
		,glue={"com.ahproject.cucumber.steps"}
		,monochrome = true
		,tags={"@ContactForm"}
		,plugin={"pretty","junit:c:/temp/cucumber.xml"}
		)

public class TestRunner01 {
	
}
