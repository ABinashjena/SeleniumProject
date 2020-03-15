package Com.sb.qa.pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Com.sb.qa.base.TestBase;

public class DashboardPage extends TestBase{
	@FindBy(id="nav-primary-contacts-branch")
	WebElement contactsDropdown;
	
	
	public DashboardPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifayDashboardPage()
	{
		return driver.getTitle();
	}
	
	public ContactsPage ClickonContacts()
	{
		contactsDropdown.click();
		List<WebElement> count = driver.findElements(By.xpath("//li[contains(@class,'expandable active')]//li"));
		for(int i=0;i<count.size();i++)
		{
			//System.out.println(count.get(i).getText());
			if(count.get(i).getText().contains("Contacts"))
			{
				count.get(i).click();
				break;
			}
		}
		return new ContactsPage();
	}

}
