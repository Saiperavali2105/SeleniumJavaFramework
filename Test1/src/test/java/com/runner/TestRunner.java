package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="",features="Resources\\Sample.feature",glue="com.loginPage")
public class TestRunner extends AbstractTestNGCucumberTests {

}

