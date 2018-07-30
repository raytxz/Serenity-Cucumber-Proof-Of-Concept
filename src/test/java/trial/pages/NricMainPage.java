package trial.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

public class NricMainPage extends PageObject {
	
	public void goToMainPage() {
		Screen screen = new Screen();
		Pattern homePageImg = new Pattern(System.getProperty("user.dir") + "/src/test/resources/images/NricGeneratorPage/homePageImg.PNG");

		try {
			screen.wait(homePageImg, 30);

			screen.click(homePageImg);

		} catch (FindFailed e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public boolean checkValidNric() {
		boolean exist = false;
		Screen screen = new Screen();
		Pattern mainPageChecker = new Pattern(System.getProperty("user.dir") + "/src/test/resources/images/NricGeneratorPage/mainPageChecker.PNG");
		
		try {
			screen.wait(mainPageChecker, 3);

			if(screen.exists(mainPageChecker) != null) {
				exist = true;
			}

		} catch (FindFailed e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return exist;
	}
	
	public void closePage() {
		Screen screen = new Screen();
		Pattern mainPageChecker = new Pattern(System.getProperty("user.dir") + "/src/test/resources/images/NricGeneratorPage/mainPageChecker.PNG");

		try {
			screen.wait(mainPageChecker, 30);

			getDriver().quit();

		} catch (FindFailed e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
