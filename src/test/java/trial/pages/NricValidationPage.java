package trial.pages;


import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

public class NricValidationPage extends PageObject {
	
	public void openNricPage() {
//		ChromeOptions chromeOptions = new ChromeOptions();
//		chromeOptions.addArguments("--headless");
//		chromeOptions.addArguments("disable-infobars");
//		chromeOptions.addArguments("--start-maximized");
//		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver= new ChromeDriver(chromeOptions);
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("disable-infobars");
		chromeOptions.addArguments("--start-maximized");
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(chromeOptions);
		
		setDriver(driver);
		getDriver().navigate().to("https://samliew.com/singapore-nric-validator");
	}
	
	public void inputNric(String nric) {
		Screen screen = new Screen();
		Pattern nricTextBox = new Pattern(
				System.getProperty("user.dir") + "/src/test/resources/images/NricValidationPage/nricTextBox.PNG");

		try {
			screen.wait(nricTextBox, 30);

			screen.click(nricTextBox);
			screen.type(nric);

		} catch (FindFailed e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public boolean checkValidNric() {
		boolean exist = false;
		Screen screen = new Screen();
		Pattern succeedImg = new Pattern(System.getProperty("user.dir") + "/src/test/resources/images/NricValidationPage/succeedImg.PNG");
		
		try {
			screen.wait(succeedImg, 3);

			if(screen.exists(succeedImg) != null) {
				exist = true;
			}

		} catch (FindFailed e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return exist;
	}
}
