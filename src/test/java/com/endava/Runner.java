package com.endava;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\cbohorquez\\IdeaProjects\\framework\\src\\test\\resources\\features", glue = {"stepDefinition"})
public class Runner {
}
