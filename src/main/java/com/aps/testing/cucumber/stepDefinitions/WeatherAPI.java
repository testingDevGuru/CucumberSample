package com.aps.testing.cucumber.stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WeatherAPI {
	String cityName="Baltimore";
	@Given("^I have a city name as Baltimore$")
	public String i_have_a_city_name_as_Baltimore(){
		return cityName;
	}

	@When("^I send request to weather API$")
	public void i_send_request_to_weather_API(){
		System.out.println("Sending API request for city of: "+ cityName);
	  
	}

	@Then("^I should receive weather information about Baltimore$")
	public void i_should_receive_weather_information_about_Baltimore(){
	    System.out.println("Received weather information for city of: "+ cityName);
	}

}
