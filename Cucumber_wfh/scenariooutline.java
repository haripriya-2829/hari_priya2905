package Cucumber_wfh;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class scenariooutline 
{
	@Given("the employee name is {string}")
	public void the_employee_name_is(String emp) {
		System.out.println("the employee name is "+emp);
	}
	@When("he gets rating as {int}")
	public void he_gets_rating_as(Integer rating1) {
	   System.out.println("the rating of emp is "+rating1);
	}

	@Then("he shall recieve the hike percent as {int}")
	public void he_shall_recieve_the_hike_percent_as(Integer hike) {
		System.out.println("the hike percent is "+hike);
	}


}
