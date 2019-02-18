package com.cucumber.framework.stepdefinition;

import com.cucumber.freamework.helper.pageObject.mainscreen.MainScreen;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StartNewGame {

	private MainScreen mScreen;

	@Given("^I sudoku android app is installed and open$")
	public void i_sudoku_android_app_is_installed_and_open() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		mScreen.installAndLaunchApplication();
	}

	@When("^I tap on the New Game option$")
	public void i_tap_on_the_New_Game_option() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^I can start new game by selecting the dificulty level$")
	public void i_can_start_new_game_by_selecting_the_dificulty_level() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

}
