package Com.sb.qa.testcases;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popup {

	private static final boolean String = false;

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","C:/Users/avije/Downloads/chromedriver_win32/chromedriver.exe");
	/*	WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.popuptest.com");
		driver.manage().window().maximize();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		jse.executeScript("window.scrollBy(0,250)");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Modeless Window')]")).click();
		Set<String> windo = driver.getWindowHandles();
		Iterator<String> it = windo.iterator();
		String parentwindow = it.next();
		String chiled = it.next();
		System.out.println(parentwindow);
		System.out.println(chiled);
		driver.switchTo().window(chiled);
		driver.close();
		driver.switchTo().window(parentwindow);
		driver.close(); */
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://freecrm.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a/span[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("bapikamila10051995@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Santosh.1");
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div/div[2]/div[1]/div/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/span/a")).click();
		driver.findElement(By.xpath("//*[@id=\"main-nav\"]/a[3]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/a/button")).click();
		Thread.sleep(1000);
		String Name1 = driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[1]")).getText();
		Thread.sleep(1000);
		System.out.println(Name1);
		Assert.assertEquals(Name1, "Create New Contact");
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[1]/div[1]/div/div/input")).sendKeys("Test");
		Thread.sleep(1000);
	     driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[2]/div[1]/div/div/input")).sendKeys("Auto");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]")).click();
		Thread.sleep(1000);
		  List<WebElement> keywords = driver.findElements(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[1]"));	
		  
		for (WebElement Word : keywords) {
			
			System.out.println(Word.getText());
			
		}
		  
		  
		  
		  
		  
		  
		  
		//Assert.assertEquals(Name2, "Test Auto");
     	//System.out.println(Name2);
		
		
		//List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\'dashboard-toolbar\']/div[1]/text()"));
//		String Name = driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[1]")).getText();
//		Assert.assertEquals(Name, "Santosh Kamila");
//		System.out.println(Name);
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
