package com.Walmart_Page;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Walmart_Base.Walmart_BasePage;
import com.Walmart_Elements.Walmart_mainPage_Elements;

public class Walmart_MainPage_Search extends Walmart_BasePage {

	
	public static Walmart_mainPage_Elements obj;

	@Test ( priority=0, groups ="regrassion_Test")
	public void browser() throws InterruptedException {
		
		obj = new Walmart_mainPage_Elements();
		
		driver.get("http://www.walmart.com");
		String webTitle = driver.getTitle();
		Dimension resize = new Dimension(1296, 696);
		driver.manage().window().setSize(resize);
		System.out.println(driver.manage().window().getSize());
		System.out.println("This is webpage Title:\t" + webTitle);
		SoftAssert sofassert = new SoftAssert();
		sofassert.assertEquals(webTitle, "Walmart.com | Save Money. Live Better.");
	

	}

	@Test(priority = 1 , groups ="regrassion_Test")
	public void searchoptisdfon() {

		mylibrary.waitforvisibalityofelements(obj.searchmainpage).click();

	}

	@Test(priority = 2 , groups ="regrassion_Test")
	public void jewalry() {

		mylibrary.waitforvisibalityofelements(obj.selectjewalry).click();
		mylibrary.waitforvisibalityofelements(obj.search).sendKeys(Keys.SHIFT, "daimond");
		

	}
	
	
	
	
	
	
	

	/*
	 * Actions act = new Actions(driver);
	 * act.moveToElement(elem).click().build().perform();
	 * 
	 * List<WebElement> myListElement = driver
	 * .findElements(By.cssSelector("button[class='f_a n_a n_aw n_l n_b a2_c']"));
	 * myListElement.get(5).click(); for (WebElement webElement : myListElement) {
	 * act.moveToElement(webElement).build().perform(); Thread.sleep(300); if
	 * (webElement.getAttribute("data-catid").equals("3891")) { webElement.click();
	 * break; } else {
	 * 
	 * }
	 * 
	 * } Thread.sleep(8000);
	 */

	/*
	 * List<WebElement> dropdownelements =driver.findElements(By.xpath(
	 * "//button[contains(@id,'global-search-dropdown-toggle')]"));
	 * 
	 * for (WebElement elem : dropdownelements) {
	 * 
	 * Thread.sleep(5000); if (elem.getText().contains("Home")) {
	 * 
	 * System.out.println(elem.getText());
	 * 
	 * break; } }
	 * 
	 * System.out.println("*****************************");
	 * 
	 * for (int i = 0; i < dropdownelements.size(); i++){
	 * 
	 * WebElement elem = dropdownelements.get(i);
	 * 
	 * System.out.println(elem.getText());
	 * 
	 * if(elem.getText().contains("Home"))
	 * 
	 * {
	 * 
	 * System.out.println(elem.getText());
	 * 
	 * break; }
	 * 
	 * }
	 */

}
