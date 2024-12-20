package step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccount {
	@Given("I visit the magento website")
	public void i_visit_the_magento_website() {
	    System.out.println("one");
	}

	@Given("I click on {string} linktext")
	public void i_click_on_linktext(String string) {
	    System.out.println(string);
	}

	@When("I enter the frist name {string}")
	public void i_enter_the_frist_name(String string) {
	    System.out.println(string);
	}

	@When("I enter the last name {string}")
	public void i_enter_the_last_name(String string) {
System.out.println(string);
	}

	@When("I enter the email {string}")
	public void i_enter_the_email(String string) {
	    System.out.println(string);
	}

	@When("I enter the password {string}")
	public void i_enter_the_password(String string) {
	    System.out.println(string);
	}

	@When("I enter the confirm password {string}")
	public void i_enter_the_confirm_password(String string) {
	    System.out.println(string);
	}

	@Then("I click on {string} button")
	public void i_click_on_button(String string) {
	    System.out.println(string);
	}




}
