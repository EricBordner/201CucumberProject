package com.eric.cucumber.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions(
		features = "src/main/resources/features/",
		glue = {"com.eric.cucumber"}
		)

@RunWith(Cucumber.class)
public class TestRunner {

}
