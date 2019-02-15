package com.cucumber.framework.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "classpath:featurefile/Theme.feature" }, glue = {
		"classpath:com.cucumber.framework.stepdefinition",
		"classpath:com.cucumber.framework.helper" }, plugin = { "pretty", "json:target/TabletFeatureRunner.json" })
public class ThemeFeatureRunner extends AbstractTestNGCucumberTests {

}
