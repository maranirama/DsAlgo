package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)

@CucumberOptions(features={"C:\\Rama\\workspace\\DSAlgo\\src\\test\\resources\\Featurefiles\\home.feature"},glue={"com.stepdefenitions"})

public class DSAlgo_Start_Runner extends AbstractTestNGCucumberTests {

}
