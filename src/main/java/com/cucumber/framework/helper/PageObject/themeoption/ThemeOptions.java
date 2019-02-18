package com.cucumber.framework.helper.PageObject.themeoption;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.PageObject.homepage.HomePage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ThemeOptions {

	private AndroidDriver<MobileElement> driver;
	private final Logger log = LoggerHelper.getLogger(HomePage.class);

	public ThemeOptions(AndroidDriver<MobileElement> driver) {
		// super(driver);
		this.driver = driver;
	}

	@FindBy(how = How.ID, using = "theme_white")
	public MobileElement themeWhite;

	@FindBy(how = How.ID, using = "theme_sepia")
	public MobileElement themeSepia;

	@FindBy(how = How.ID, using = "theme_dark")
	public MobileElement themeDark;

	@FindBy(how = How.ID, using = "ok")
	public MobileElement btnOk;

	public void selectWhiteTheme() {
		if (themeWhite.isDisplayed()) {
			themeWhite.click();
			btnOk.click();
			log.info("");
		} else {
			log.info("White theme is not displayed");
			driver.close();
		}
	}

	public void selectSepiaTheme() {
		if (themeSepia.isDisplayed()) {
			themeSepia.click();
			btnOk.click();
		} else {
			log.info("White theme is not displayed");
			driver.close();
		}
	}

	public void selectDarkTheme() {
		if (themeDark.isDisplayed()) {
			themeDark.click();
			btnOk.click();
		} else {
			log.info("White theme is not displayed");
			driver.close();
		}
	}

}
