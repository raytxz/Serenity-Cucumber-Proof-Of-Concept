package trial.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

public class MarathonOfLearningPage extends PageObject {
	
	public void goToMarathonOfLearningPage() {
		Screen screen = new Screen();
		Pattern addressBarImg = new Pattern(System.getProperty("user.dir") + "/src/test/resources/images/MarathonOfLearningPage/addressbar.PNG");

		try {
			screen.wait(addressBarImg, 30);

			screen.click(addressBarImg);
			screen.type("http://marathonoflearning.com/");
			screen.keyDown(Key.ENTER);

		} catch (FindFailed e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public boolean checkCurriculumPage() {
		boolean exist = false;
		Screen screen = new Screen();
		Pattern curriculumChecker = new Pattern(System.getProperty("user.dir") + "/src/test/resources/images/MarathonOfLearningPage/aiCurriculum.PNG");
		
		try {
			screen.wait(curriculumChecker, 3);

			if(screen.exists(curriculumChecker) != null) {
				exist = true;
			}

		} catch (FindFailed e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return exist;
	}
	
	public void clickOnPersonalisedMasterTab() {
		Screen screen = new Screen();
		Pattern personalisedMasterTab = new Pattern(System.getProperty("user.dir") + "/src/test/resources/images/MarathonOfLearningPage/personalisedmastertab.PNG");

		try {
			screen.wait(personalisedMasterTab, 30);

			screen.click(personalisedMasterTab);
		} catch (FindFailed e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public void closePage() {
		Screen screen = new Screen();
		screen.keyDown(Key.ALT + Key.F4);
	}
}
