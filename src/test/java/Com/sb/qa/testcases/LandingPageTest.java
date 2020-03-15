package Com.sb.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.sb.qa.base.TestBase;
import Com.sb.qa.pages.LandingPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class LandingPageTest extends TestBase {

	static LandingPage landing;

	public LandingPageTest() {
		super();

	}

	@BeforeMethod()
	public void setUP() throws InterruptedException {
		Intilization();
		landing = new LandingPage();
		Thread.sleep(10000);
	}

	@Test(priority = 1)
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Desc: verifayLandingpageTitle test ")
	@Story(" Story Nmae : verifayLandingpageTitle ")

	public void LandingPagetitleTest() throws InterruptedException {
		Thread.sleep(5000);
		landing.Acceptpop();
		String landingpagetite = landing.verifayLandingpageTest();
		System.out.println(landingpagetite);
		Assert.assertEquals("HubSpot | Inbound Marketing, Sales, and Service Software", landingpagetite);
	}
	
	@Test(priority=1)
	public void Clicklogingbutton()
	{
		
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
