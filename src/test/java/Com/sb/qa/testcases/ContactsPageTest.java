package Com.sb.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.sb.qa.base.TestBase;
import Com.sb.qa.pages.ContactsPage;
import Com.sb.qa.pages.DashboardPage;
import Com.sb.qa.pages.LandingPage;
import Com.sb.qa.pages.LoginPage;

public class ContactsPageTest extends TestBase {
	static LandingPage landing;
	static LoginPage loginpage;
	static DashboardPage dashboardpage;
	static ContactsPage contactspage;

	public ContactsPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		Intilization();
		landing = new LandingPage();
		Thread.sleep(10000);
		landing.Acceptpop();
		loginpage = landing.Clicklogingbutton();
		dashboardpage = loginpage.login(prop.getProperty("Email"), prop.getProperty("password"));
		Thread.sleep(5000);
		contactspage = dashboardpage.ClickonContacts();
	}

	@Test(priority = 1, enabled = false)
	public void DashboardPagetitleTest() throws InterruptedException {
		Thread.sleep(5000);
		String title = contactspage.VerifyContactsPageTitle();
		Assert.assertEquals(title, "Contacts");

	}

	@Test(priority = 2,enabled = false)
	public void CreatecontactTest() throws InterruptedException {
		String title = contactspage.CreateContact();
		Assert.assertEquals(title, "Demo 1");

	}

	@Test(priority = 3)
	public void DeleteContactTest() throws InterruptedException {
		Thread.sleep(10000);
		contactspage.ClickDeleteContact();

	}

	@AfterMethod
	public void teardown() {
		//driver.quit();
	}

}
