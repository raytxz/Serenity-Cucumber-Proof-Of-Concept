package trial.steps;

import org.junit.Assert;

import Data.DataModel;
import Utility.NricGenerator;
import net.thucydides.core.annotations.Step;
import trial.pages.NricMainPage;
import trial.pages.NricValidationPage;

public class ValidatorSteps {
	DataModel data = new DataModel();
	
	NricValidationPage nricValidationPage;
	NricMainPage nricMainPage;
	
	@Step
	public void open_validation_page_and_get_nric() {
		nricValidationPage.openNricPage();
		NricGenerator gen = new NricGenerator();
		data.setNric(gen.generateNric());
	}
	
	@Step
	public void enter_NRIC() {
//		NricGenerator gen = new NricGenerator();
//		
//		while(nricValidationPage.checkValidNric() != true) {
//			nricValidationPage.inputNric(gen.generateNric());
//		}
		
		while(nricValidationPage.checkValidNric() != true) {
			nricValidationPage.inputNric(data.getNric());
		}	
	}
	
	@Step
	public void open_generator_page() {
		nricMainPage.goToMainPage();
	}
	
	@Step
	public void check_for_page() {
		Assert.assertTrue(nricMainPage.checkValidNric());
	}
	
	@Step
	public void close_page() {
		nricMainPage.closePage();
	}
}
