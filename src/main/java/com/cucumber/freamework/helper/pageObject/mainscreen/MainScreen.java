package com.cucumber.freamework.helper.pageObject.mainscreen;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.PageObject.PageBase;
import com.cucumber.framework.helper.PageObject.homepage.HomePage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class MainScreen extends PageBase {

	public AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(null);

	// public static AndroidDriver<MobileElement> driver;
	private final Logger log = LoggerHelper.getLogger(HomePage.class);

	public MainScreen(AndroidDriver<MobileElement> driver) {
		super(driver);
		this.driver = driver;
	}

	/** MobileElements **/

	@FindBy(how = How.ID, using = "title")
	public MobileElement titleNewGame;

	@FindBy(how = How.ID, using = "action_theme")
	public MobileElement imgTheme;

	@FindBy(how = How.ID, using = "dc_custom_imge_view_star")
	public MobileElement imgStar;

	@FindBy(how = How.ID, using = "action_pause_resume")
	public MobileElement btnPausePlay;

	@FindBy(how = How.ID, using = "action_more")
	public MobileElement btnMoreOption;

	@FindBy(how = How.ID, using = "game_complexity")
	public MobileElement txtComplexity;

	@FindBy(how = How.ID, using = "game_over_mistakes")
	public MobileElement txtMistakes;

	@FindBy(how = How.ID, using = "game_time")
	public MobileElement txtGameTime;

	@FindBy(how = How.ID, using = "sudoku_board")
	public MobileElement frmGameBoard;

	@FindBy(how = How.ID, using = "button_undo")
	public MobileElement btnUndo;

	@FindBy(how = How.ID, using = "button_erase")
	public MobileElement btnEarse;

	@FindBy(how = How.ID, using = "button_pencil")
	public MobileElement btnPencil;

	@FindBy(how = How.ID, using = "button_hint")
	public MobileElement btnHint;

	@FindBy(how = How.ID, using = "button_1")
	public MobileElement btn1;

	@FindBy(how = How.ID, using = "button_2")
	public MobileElement btn2;

	@FindBy(how = How.ID, using = "button_3")
	public MobileElement btn3;

	@FindBy(how = How.ID, using = "button_4")
	public MobileElement btn4;

	@FindBy(how = How.ID, using = "button_5")
	public MobileElement btn5;

	@FindBy(how = How.ID, using = "button_6")
	public MobileElement btn6;

	@FindBy(how = How.ID, using = "button_7")
	public MobileElement btn7;

	@FindBy(how = How.ID, using = "button_8")
	public MobileElement btn8;

	@FindBy(how = How.ID, using = "button_9")
	public MobileElement btn9;

	public void installAndLaunchApplication() throws MalformedURLException {
		new DesiredCapabilities();
		DesiredCapabilities capabilities = DesiredCapabilities.android();
		capabilities.setCapability("no", true);
		capabilities.setCapability("newCommandTimeout", 100);
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("appium-version", "1.10.0");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "6.0");
		capabilities.setCapability("deviceName", "A67PVGQCIZMBAMDQ");
		capabilities.setCapability("app", "/Users/vaibhav.bhapkar/Downloads/Sudoku.apk");
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.findElement(By.id("btnAccept")).click();
		driver.findElement(By.id("btnAccept")).click();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.findElement(By.id("skip")).click();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	}

	public void clickTheme() {
		if (imgTheme.isDisplayed()) {
			imgTheme.click();
			log.info("");
		} else {
			log.info("Theme option does not displayed");
			driver.close();
		}
	}

}
