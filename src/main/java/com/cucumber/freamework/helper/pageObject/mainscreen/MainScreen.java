package com.cucumber.freamework.helper.pageObject.mainscreen;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.PageObject.homepage.HomePage;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;

public class MainScreen {

	private MobileDriver<MobileElement> driver;
	private final Logger log = LoggerHelper.getLogger(HomePage.class);

	public MainScreen(MobileDriver<MobileElement> driver) {
		// super(driver);
		this.driver = driver;
	}

	@FindBy(how = How.ID, using = "title")
	public MobileElement optionNewGame;

	@FindBy(how = How.ID, using = "action_theme")
	MobileElement imgTheme;

	@FindBy(how = How.ID, using = "dc_custom_imge_view_star")
	MobileElement imgStar;

	@FindBy(how = How.ID, using = "action_pause_resume")
	MobileElement btnPausePlay;

	@FindBy(how = How.ID, using = "action_more")
	MobileElement btnMoreOption;

	@FindBy(how = How.ID, using = "game_complexity")
	MobileElement txtComplexity;

	@FindBy(how = How.ID, using = "game_over_mistakes")
	MobileElement txtMistakes;

	@FindBy(how = How.ID, using = "game_time")
	MobileElement txtGameTime;

	@FindBy(how = How.ID, using = "sudoku_board")
	MobileElement frmGameBoard;

	@FindBy(how = How.ID, using = "button_undo")
	MobileElement btnUndo;

	@FindBy(how = How.ID, using = "button_erase")
	MobileElement btnEarse;

	@FindBy(how = How.ID, using = "button_pencil")
	MobileElement btnPencil;

	@FindBy(how = How.ID, using = "button_hint")
	MobileElement btnHint;

	@FindBy(how = How.ID, using = "button_1")
	MobileElement btn1;

	@FindBy(how = How.ID, using = "button_2")
	MobileElement btn2;

	@FindBy(how = How.ID, using = "button_3")
	MobileElement btn3;

	@FindBy(how = How.ID, using = "button_4")
	MobileElement btn4;

	@FindBy(how = How.ID, using = "button_5")
	MobileElement btn5;

	@FindBy(how = How.ID, using = "button_6")
	MobileElement btn6;

	@FindBy(how = How.ID, using = "button_7")
	MobileElement btn7;

	@FindBy(how = How.ID, using = "button_8")
	MobileElement btn8;

	@FindBy(how = How.ID, using = "button_9")
	MobileElement btn9;

	public void click_NewGame() {
		if (optionNewGame.isDisplayed()) {
			optionNewGame.click();
			log.info("");
		} else {
			System.out.println("New game title is not visible");

		}

	}

}
