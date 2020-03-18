package com.qa.stepdefinition;

import com.qa.utilities.*;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BaseClass extends FunctionalLibrary {

	@Before
	public static void beforeScenario() {

		FunctionalLibrary.driverInit("chrome");
	}

	@After
	public static void afterScenario() {
		FunctionalLibrary.closeBrowser();

	
	}

	
	
}
