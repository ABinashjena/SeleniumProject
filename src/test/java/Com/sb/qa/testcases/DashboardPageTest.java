package Com.sb.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.sb.qa.base.TestBase;
import Com.sb.qa.pages.DashboardPage;
import Com.sb.qa.pages.LandingPage;
import Com.sb.qa.pages.LoginPage;

public class DashboardPageTest extends TestBase {
	static LandingPage landing;
	static LoginPage loginpage;
	static DashboardPage dashboardpage;

	public DashboardPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		Intilization();
		landing = new LandingPage();
		Thread.sleep(5000);
		landing.Acceptpop();
		loginpage = landing.Clicklogingbutton();
		dashboardpage = loginpage.login(prop.getProperty("Email"), prop.getProperty("password"));
	}

	@Test(priority = 1)
	public void DashboardPagetitleTest() throws InterruptedException {
		Thread.sleep(10000);
		String title = dashboardpage.verifayDashboardPage();
		Assert.assertEquals(title, "Getting Started | HubSpot");

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
