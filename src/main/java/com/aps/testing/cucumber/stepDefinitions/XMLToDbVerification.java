package com.aps.testing.cucumber.stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class XMLToDbVerification {
	
	@Given("^I upload xml file using a shell script$")
	public void i_have_Spring_boot_application_running() throws Throwable {

    	XMLToDbVerificationHelper xmlToDbVerificationHelper = new XMLToDbVerificationHelper();
    	xmlToDbVerificationHelper.runBat();
		System.out.println("Spring boot application is running.");
	}
	
	@When("^I query the curr database  for the provider <provider>$")
	public void i_query_the_curr_database_for_the_provider_provider() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("database queries will happen here");
	}

	@Then("^the <firstName>,  <lastName>, <SSN> and <DOB> from the XML should match with the output of the DB$")
	public void the_firstName_lastName_SSN_and_DOB_from_the_XML_should_match_with_the_output_of_the_DB() throws Throwable {
		System.out.println("Asserting the Database data against the XML data will happen here");
	}
}
