package com.Walmart_Test;

import org.testng.annotations.Test;

import com.Walmart_Base.Walmart_BasePage;
import com.Walmart_Page.Walmart_MainPage_Search;

public class Call_Methods extends Walmart_BasePage {

	Walmart_MainPage_Search jewalry = new Walmart_MainPage_Search();
	
	
	@Test (priority=0, groups ="regrassion_Test")
	public void call_methods() throws Exception  {
		jewalry.browser();
		jewalry.searchoptisdfon();
		jewalry.jewalry();
		
	}
	

		
		
		
		
	

}
