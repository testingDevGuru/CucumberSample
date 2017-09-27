package com.aps.testing.stepDefinitions;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.hamcrest.CoreMatchers;
import org.hibernate.Session;
import org.junit.Assert;

import com.aps.testing.entity.EmployeeEntity;
import com.aps.testing.util.HibernateUtil;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class XMLToDbVerification {
	
	@Given("^I upload xml file using a shell script$")
	public void i_have_Spring_boot_application_running() throws Throwable {

    	XMLToDbVerificationHelper xmlToDbVerificationHelper = new XMLToDbVerificationHelper();
    	xmlToDbVerificationHelper.runBat("test.bat");
		System.out.println("Spring boot application is running.");
	}
	@Given("^I upload xml file using a <shell> script$")
	public void i_upload_xml_file_using_a_shell_script(DataTable shellFile) throws Throwable {
		
		List<List<String>> data = shellFile.raw();
		
    	XMLToDbVerificationHelper xmlToDbVerificationHelper = new XMLToDbVerificationHelper();
    	String result = xmlToDbVerificationHelper.runBat(data.get(0).get(0));
    	Assert.assertThat( result,CoreMatchers.containsString("Person.xml"));
    	Assert.assertThat( result,CoreMatchers.containsString("100%"));
    	
	}
	
	@When("^I run a write to the DB$")
	public void i_run_a_write_to_the_DB() throws Throwable {
		  {
		      Session session = HibernateUtil.getSessionFactory().openSession();
		      session.beginTransaction();
		      // Add new Employee object
		      EmployeeEntity emp = new EmployeeEntity();
		      emp.setEmployeeId(1);
		      emp.setEmail("demo-user@mail.com");
		      emp.setFirstName("demo");
		      emp.setLastName("user");
		      session.save(emp);
		      session.getTransaction().commit();
		      HibernateUtil.shutDown();
		   }
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
