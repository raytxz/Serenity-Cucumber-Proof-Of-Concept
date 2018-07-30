package trial.stepdefinition;


import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import trial.steps.ValidatorSteps;

public class NricValidationStepDef {
	
	@Steps
	ValidatorSteps validatorSteps;
		
	@Given("^I go to NRIC checker website$")
	public void i_go_to_NRIC_checker_website() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		validatorSteps.open_validation_page_and_get_nric();
	}

	@When("^I enter the NRIC number$")
	public void i_enter_the_NRIC_number() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		validatorSteps.enter_NRIC();
		validatorSteps.open_generator_page();
	}

	@Then("^I get redirected to the main page because of valid NRIC$")
	public void i_should_get_a_confirmation_that_it_is_valid() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		validatorSteps.check_for_page();
	}
}
