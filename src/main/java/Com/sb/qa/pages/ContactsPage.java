package Com.sb.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.sb.qa.base.TestBase;

public class ContactsPage extends TestBase {
	@FindBy(xpath = "//span[contains(text(),'Create contact')]")
	WebElement createcontactNutton;

	@FindBy(xpath = "//h3[@class='m-all-0']")
	WebElement createcontactpopup;

	@FindBy(xpath = "//input[@id='uid-ctrl-1']")
	WebElement email;

	@FindBy(xpath = "//*[@id=\'uid-ctrl-2\']")
	WebElement firstname;

	@FindBy(xpath = "//*[@id=\'uid-ctrl-3\']")
	WebElement lastname;
	
	@FindBy(xpath = "//span[contains(text(),'Actions')]")
	WebElement action;

	@FindBy(xpath = "//*[@id=\'uid-ctrl-5\']")
	WebElement jobtitle;

	@FindBy(xpath = "/html/body/div[6]/div/div/div/div/footer/div/div/div/ul/li[1]/button/span")
	WebElement clickcreatecontact;
	
	@FindBy(xpath = "//span[contains(text(),'Actions')]")
	WebElement Action;
	
	@FindBy(xpath="/html/body/div[6]/div/div/div/div/footer/div/button[1]")
	WebElement delete;

	
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}

	public String VerifyContactsPageTitle() {
		return driver.getTitle();
	}

	public String CreateContact() throws InterruptedException {
		createcontactNutton.click();
		String var = "Create contact";
		var.equals(createcontactpopup.getText());
		email.sendKeys("Test1@gmail.com");
		Thread.sleep(1000);
		firstname.sendKeys("Demo");
		lastname.sendKeys("1");
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", jobtitle);
		Thread.sleep(1000);
		jobtitle.sendKeys("SDET");
		clickcreatecontact.click();
		Thread.sleep(1000);
		return driver.getTitle();

	}
	
    public void ClickDeleteContact()
    {
    	
    	
    	
    	Action.click();
    	List<WebElement> count =driver.findElements(By.xpath("//ul[contains(@class,'uiList private-list--unstyled')]//li//button"));
    	{
			//System.out.println(count.get(i).getText());
    		for(int i=0;i<count.size();i++)
    		{
			if(count.get(i).getText().contains("Delete"))
			{
				count.get(i).click();
				break;
			}
		}
    		delete.click();
		//return new ContactsPage();
    	}
    }

}
