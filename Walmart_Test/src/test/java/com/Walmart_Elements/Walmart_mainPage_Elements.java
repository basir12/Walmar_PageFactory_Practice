package com.Walmart_Elements;

import java.util.Collection;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Walmart_Base.Walmart_BasePage;

public class Walmart_mainPage_Elements extends Walmart_BasePage {

	@FindBy(how = How.XPATH, using = "//button[@id='global-search-dropdown-toggle']")
	public WebElement searchmainpage;

	@FindBy(how =How.XPATH, using ="//button[@data-catid='3891']")
	public WebElement selectjewalry;
	
	@FindBy (how =How.XPATH, using ="//input[@id='global-search-input']")
	public WebElement search;

     
	
	
	public Walmart_mainPage_Elements() {

		PageFactory.initElements(driver, this);

	}




	
}
