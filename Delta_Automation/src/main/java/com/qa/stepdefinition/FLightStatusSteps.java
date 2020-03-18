package com.qa.stepdefinition;

import org.junit.Assert;

import com.qa.objectRepo.FlightStatus;
import com.qa.utilities.FunctionalLibrary;

import cucumber.api.java.en.Then;

public class FLightStatusSteps extends FunctionalLibrary {

	@Then("^The user should see the flight number \"([^\"]*)\" ,source \"([^\"]*)\" and destination \"([^\"]*)\"$")
	public void the_user_should_see_the_flight_number_source_and_destination(String flightNum, String source,
			String destination) throws Throwable {
		FlightStatus flight = new FlightStatus();
		Assert.assertEquals(flightNum, getText(flight.getFlightNumber()));
		Assert.assertEquals(source, getText(flight.getSourceLocation()));
		Assert.assertEquals(destination, getText(flight.getDestinationLocation()));
	}
}
