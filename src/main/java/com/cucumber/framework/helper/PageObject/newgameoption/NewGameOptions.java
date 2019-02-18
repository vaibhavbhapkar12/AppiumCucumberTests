package com.cucumber.framework.helper.PageObject.newgameoption;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.PageObject.homepage.HomePage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class NewGameOptions {

	private AndroidDriver<MobileElement> driver;
	private final Logger log = LoggerHelper.getLogger(HomePage.class);

	public NewGameOptions(AndroidDriver<MobileElement> driver) {
		// super(driver);
		this.driver = driver;
	}

	@FindBy(how = How.ID, using = "bottom_sheet_click_dc")
	public MobileElement titleDailyChallenges;

	@FindBy(how = How.ID, using = "level_easy")
	public MobileElement titleEasy;

	@FindBy(how = How.ID, using = "level_medium")
	public MobileElement titleMedium;

	@FindBy(how = How.ID, using = "level_hard")
	public MobileElement titleHard;

	@FindBy(how = How.ID, using = "level_expert")
	public MobileElement titleExpert;

	@FindBy(how = How.ID, using = "level_reset")
	public MobileElement titleRestart;

	public void selectEasyLevel() {
		if (titleEasy.isDisplayed()) {
			titleEasy.click();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
			log.info("");

			// Check for the Advertisement screen

			if (driver.findElement(By.className("android.widget.ImageButton")).isDisplayed()) {
				driver.findElement(By.className("android.widget.ImageButton")).click();
			}
		} else {
			log.info("Easy option is not displayed");
			driver.quit();
		}
	}

	public void selectMediumLevel() {
		if (titleMedium.isDisplayed()) {
			titleMedium.click();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
			log.info("");

			// Check for the Advertisement screen

			if (driver.findElement(By.className("android.widget.ImageButton")).isDisplayed()) {
				driver.findElement(By.className("android.widget.ImageButton")).click();
			}
		} else {
			log.info("Medium option is not displayed");
			driver.quit();
		}
	}

	public void selectHardLevel() {
		if (titleHard.isDisplayed()) {
			titleHard.click();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
			log.info("");

			// Check for the Advertisement screen

			if (driver.findElement(By.className("android.widget.ImageButton")).isDisplayed()) {
				driver.findElement(By.className("android.widget.ImageButton")).click();
			}
		} else {
			log.info("Hard option is not displayed");
			driver.quit();
		}
	}

	public void selectExpertLevel() {
		if (titleExpert.isDisplayed()) {
			titleExpert.click();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
			log.info("");

			// Check for the Advertisement screen

			if (driver.findElement(By.className("android.widget.ImageButton")).isDisplayed()) {
				driver.findElement(By.className("android.widget.ImageButton")).click();
			}
		} else {
			log.info("Expert option is not displayed");
			driver.quit();
		}
	}

}
