package test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features ="src/test/java/features" , glue="step_defs", tags="@navya",
plugin= {"pretty","html:target/forget.html"}
)
public class My_test {
	//test

}
