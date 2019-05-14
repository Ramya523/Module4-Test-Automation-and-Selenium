//runner file
package com.cg.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Home\\eclipse-workspace490\\TestAutomationandSelenium\\src\\main\\java\\com\\cg\\feature\\register.feature", glue = {
		"com.cg.stepDefinition" })
public class ConferenceRunner {

}
