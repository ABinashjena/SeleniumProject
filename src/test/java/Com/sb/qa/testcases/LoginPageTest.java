package Com.sb.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.sb.qa.base.TestBase;
import Com.sb.qa.pages.LandingPage;
import Com.sb.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	static LandingPage landing;
	static LoginPage loginpage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod()
	public void setup() throws InterruptedException {
		Intilization();
		landing = new LandingPage();
		Thread.sleep(5000);
		landing.Acceptpop();
		loginpage = landing.Clicklogingbutton();
	}

	@Test(priority = 1)
	public void LoginPagetitleTest() throws InterruptedException {
		Thread.sleep(10000);
		String title = loginpage.verifayloginpage();
		Assert.assertEquals(title, "HubSpot Login");

	}

	@Test(priority = 2)
	public void LoginTest() throws InterruptedException {
		loginpage.login(prop.getProperty("Email"), prop.getProperty("password"));
		Thread.sleep(5000);
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
