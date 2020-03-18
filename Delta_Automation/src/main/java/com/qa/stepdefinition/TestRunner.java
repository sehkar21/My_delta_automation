 package com.qa.stepdefinition;

import java.io.File;
import org.joda.time.LocalDateTime;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import com.qa.utilities.*;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
					features ="S:\\New folder\\projectworkplace\\Delta_Automation\\feature\\BookAflight",
						glue = {"com.qa.stepdefinition"}, 
							//plugin = {"com.resources.ExtentCucumberFormatter:" ,"json:src/main/resources/AutomationSuite/jsonReport.json","html:target"},
								dryRun = false,
									monochrome = true)

public class TestRunner {
	@BeforeClass
	public static void beforeClass() {
		LocalDateTime now = LocalDateTime.now();
		int year = now.getYear();
		int month = now.getMonthOfYear();
		int day = now.getDayOfMonth();
		int hour = now.getHourOfDay();
		int minute = now.getMinuteOfHour();
		int second = now.getSecondOfMinute();
		String snewFilename1 = year + "_" + month + "_" + day + "_" + hour + "_" + minute + "_" + second;
		String filePath = System.getProperty("user.dir") + "/src/main/resources/AutomationSuite/Report_" + snewFilename1
				+ ".html";
		File file = new File(filePath);
		ExtentCucumberFormatter.setExtentHtmlReport(file); 
	}

}