package com.Walmart_Base;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class Walmart_Libraries extends Walmart_BasePage {

	public Walmart_Libraries(WebDriver _driver) {

		driver = _driver;

	}

	public WebDriver chromedriver() {
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Drivers\\chromedriver1.exe");
		// System.getProperty("webdriver.chrome.driver",
		// "src\\test\\resources\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		Dimension rezize = new Dimension(400, 500);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		return null;

	}

	public static WebElement waiting(WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		return null;
	}

	

	/***
	 * Explicit wait
	 *  Elemements
	 * @param by
	 *            Basir
	 * @return
	 */
	public WebElement waitforvisibalityofelements(WebElement element) {
		WebElement elements = null;

		elements = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(element));

		return elements;

	}

	/***
	 * 
	 * @param Screenshotpaht
	 * @throws IOException
	 */
	public void screenshot(String Screenshotpaht) throws IOException {

		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(scr, new File(Screenshotpaht));

	}

	public void teardown() {

		driver.close();
		driver.quit();

	}

}
