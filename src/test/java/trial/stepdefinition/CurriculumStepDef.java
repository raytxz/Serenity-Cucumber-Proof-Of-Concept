package trial.stepdefinition;


import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import trial.steps.CurriculumSteps;

public class CurriculumStepDef {
	
	@Steps
	CurriculumSteps curriculumSteps;
		
	@Given("^I go to marathonoflearning website$")
	public void go_to_marathon_of_learning_page() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		curriculumSteps.go_to_marathon_of_learning_page();
	}

	@When("^I click on Personalised Master$")
	public void i_click_on_personalised_master_tab() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		curriculumSteps.click_on_personalised_master_tab();
	}

	@Then("^I get redirected to the curriculum page$")
	public void i_should_get_the_curriculum_page() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		curriculumSteps.check_for_page();
	}
}
