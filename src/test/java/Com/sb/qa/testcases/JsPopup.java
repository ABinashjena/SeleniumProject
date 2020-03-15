package Com.sb.qa.testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JsPopup {
	public static void main(String... args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(500);
		driver.findElement(By.name("proceed")).click();
		Alert alert = driver.switchTo().alert();

		if (alert.getText().equals("Please enter a valid user name")) {
			alert.accept();
		} else {
			System.out.println(alert.getText());
		}
       driver.quit();
	}

}
