package com.ahproject.cucumber.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		strict = false
		,features = "classpath:cucumberFeatures"
		,glue={"com.ahproject.cucumber.steps"}
		,monochrome = true
		,tags={"@ContactPage"}
		//,plugin={"pretty","junit:c:/temp/cucumber.xml"}
		//,plugin={"pretty","html:target/Destination"} // <--- Format HTML dans répertoire Workspace\..\target\Destination
		,plugin={"pretty","json:target/Destination/cucumber.json"} // <--- Format JSON dans répertoire Workspace\..\target\Destination
		)

public class TestRunner01 {
	
}
