package com.Walmart_Base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Walmart_BasePage {

	public static WebDriver driver;
	public static Walmart_Libraries mylibrary;

	@BeforeClass  ( groups ="regrassion_Test")
	public void beforclass() {

		mylibrary = new Walmart_Libraries(driver);

	}

	@BeforeMethod ( groups ="regrassion_Test")
	public void beforMethod() {

		mylibrary.chromedriver();

	}

	@AfterMethod  ( groups ="regrassion_Test")
	public void afterMethod() throws IOException {

		mylibrary.screenshot("Screenshotpaht");
		mylibrary.teardown();

	}

}
