package Cucumber_wfh;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class tags 
{
	@Given("Amy launched chrome browser")
	public void amy_launched_chrome_browser() {
	    System.out.println("launched chrome browser");
	}

	@And("provided valid URL")
	public void provided_valid_URL() {
	    System.out.println("valid url");
	}

	@When("Amy provides valid credentials")
	public void amy_provides_valid_credentials() {
	    System.out.println("valid crendentials");
	}

	@And("click on login")
	public void click_on_login() {
	    System.out.println("login");
	}

	@Then("Amy shall see the home page")
	public void amy_shall_see_the_home_page() {
	    System.out.println("home page");
	}

	@Given("Amy is on home page")
	public void amy_is_on_home_page() {
		System.out.println("on home page");
	}

	@When("Amy searches for a product")
	public void amy_searches_for_a_product() {
		System.out.println("searches for a product");
	}

	@Then("she shall see list of products displayed")
	public void she_shall_see_list_of_products_displayed() {
		System.out.println("products displayed");
	}

	@Given("Amy is on registration page")
	public void amy_is_on_registration_page() {
		System.out.println("on registration page");
	}

	@When("Amy provides all the details")
	public void amy_provides_all_the_details() {
		System.out.println("provides all details");
	}

	@Then("she shall be registered successfully")
	public void she_shall_be_registered_successfully() {
		System.out.println("registered successfully");	
		}

}
