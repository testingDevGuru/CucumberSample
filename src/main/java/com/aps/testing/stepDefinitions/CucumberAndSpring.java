package com.aps.testing.stepDefinitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

import org.junit.Assert;

public class CucumberAndSpring {
	Response res;

	@Given("^I have Spring boot application running$")
	public void i_have_Spring_boot_application_running() throws Throwable {
		System.out.println("Spring boot application is running.");
	}

	@When("^I send GET request to /about$")
	public void i_send_GET_request_to_topics() throws Throwable {
		System.out.println("Sent request to /topics.");
		res = when().get("http://localhost:7777/about");

	}

	@SuppressWarnings("deprecation")
	@Then("^I should get (\\d+)OK$")
	public void i_should_get_OK(int arg1) throws Throwable {
		System.out.println("Expected : " + arg1 + " from response.");
		Assert.assertEquals(res.getStatusCode(), arg1);

	}

	@Then("^I should get about message$")
	public void i_should_get_list_of_topics() throws Throwable {
		System.out.println("Received all topics from response.");
		Assert.assertEquals(res.asString(), "You are on about us page.");

	}

}
