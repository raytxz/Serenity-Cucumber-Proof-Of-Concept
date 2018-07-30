package trial.steps;

import org.junit.Assert;

import net.thucydides.core.annotations.Step;
import trial.pages.MarathonOfLearningPage;

public class CurriculumSteps {
	
	MarathonOfLearningPage marathonOfLearningPage;

	@Step
	public void go_to_marathon_of_learning_page() {
		marathonOfLearningPage.goToMarathonOfLearningPage();
	}
	
	@Step
	public void click_on_personalised_master_tab() {
		marathonOfLearningPage.clickOnPersonalisedMasterTab();
	}
	
	@Step
	public void check_for_page() {
		Assert.assertTrue(marathonOfLearningPage.checkCurriculumPage());
		marathonOfLearningPage.closePage();
	}
}
