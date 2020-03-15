package Com.sb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.sb.qa.base.TestBase;
import io.qameta.allure.Step;

public class LandingPage extends TestBase {
	@FindBy(xpath = "//a[@class='cta--secondary cta--small']")
	WebElement signin;
	@FindBy(xpath = "//*[@id=\"hs-eu-confirmation-button\"]")
	WebElement accept;

	public LandingPage() {
		PageFactory.initElements(driver, this);
	}

	@Step("getting landing page Title....")
	public String verifayLandingpageTest() {
		//accept.click();
		return driver.getTitle();
	}

	public LoginPage Clicklogingbutton() {
		signin.click();
		return new LoginPage();

	}

	public void Acceptpop() {
		boolean ans = accept.isDisplayed();
		if(ans == true)
		{
			accept.click();
		}
		if(ans==false)
		{
			System.out.println(ans);
		}
	}

}
