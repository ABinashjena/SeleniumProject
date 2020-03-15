package Com.sb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.sb.qa.base.TestBase;

public class LoginPage extends TestBase{
	@FindBy(xpath="//*[@id=\'username\']")
	WebElement username;
	@FindBy(xpath="//*[@id=\'password\']")
	WebElement password;
	@FindBy(xpath="//*[@id=\'loginBtn\']")
	WebElement loginbutton;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifayloginpage()
	{
		return driver.getTitle();
	}
	public  DashboardPage login(String un,String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbutton.click();
		return new DashboardPage();
	}
	
	

}
