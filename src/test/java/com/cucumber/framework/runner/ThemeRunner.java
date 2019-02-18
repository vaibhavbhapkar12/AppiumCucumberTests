package com.cucumber.framework.runner;

import cucumber.api.CucumberOptions;

@CucumberOptions(features = { "classpath:featurefile/Theme.feature" }, glue = {
		"classpath:com.cucumber.framework.stepdefinition",
		"classpath:com.cucumber.framework.helper" }, plugin = { "pretty", "json:target/ThemeRunner.json" })
public class ThemeRunner {

}
