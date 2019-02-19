package com.cucumber.framework.stepdefinition;

import com.cucumber.framework.helper.PageObject.themeoption.ThemeOptions;
import com.cucumber.freamework.helper.pageObject.mainscreen.MainScreen;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ChangeTheme {

	private MainScreen mScreen;
	private ThemeOptions tOption;

	@Given("^I have installed and open Sudoku android app$")
	public void i_have_installed_and_open_Sudoku_android_app() throws Throwable {
		mScreen.installAndLaunchApplication();

	}

	@When("^I tap on the theme option$")
	public void i_tap_on_the_theme_option() throws Throwable {
		mScreen.clickTheme();

	}

	@Then("^I can change the current theme to Dark$")
	public void i_can_change_the_current_theme_to_Dark() throws Throwable {
		tOption.selectDarkTheme();
	}

}
