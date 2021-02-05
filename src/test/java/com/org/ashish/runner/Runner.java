package com.org.ashish.runner;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/features/"},glue="com/org/ashish/stepDefinitions", dryRun = false,tags = "@LoginSuccess",
        monochrome = true,plugin = { "pretty" }, publish = true

)
//
public class Runner {


}
