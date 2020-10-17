package tests;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import pages.LoginPage;


public class TestBase {
	public static WebDriver driver;
	LoginPage loginobjects;

	@BeforeSuite
	public void StartDriver() {
		//Start Driver
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Rigester with new account
		driver.navigate().to("https://www.phptravels.net/register");
		driver.findElement(By.name("firstname")).sendKeys("MOHAMED");
		driver.findElement(By.name("lastname")).sendKeys("Atef");
		driver.findElement(By.name("phone")).sendKeys("01123741700");
		driver.findElement(By.name("email")).sendKeys("m.atef@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Flash2k1");
		driver.findElement(By.name("confirmpassword")).sendKeys("Flash2k1");
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    WebElement SignElement = driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[8]/button"));
	    js.executeScript("arguments[0].scrollIntoView();", SignElement);
		SignElement.click();
		//Logout after making new account to start our tests..
try {
	Thread.sleep(7000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.xpath("(//A[@id='dropdownCurrency']/../../..//A[@id='dropdownCurrency'])[2]")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"//header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[3]/div/div/div/a[2]")).click();
	}
	
	@BeforeTest
	public void StartLogin() {
	
		driver.navigate().to("https://www.phptravels.net/login");
		loginobjects = new LoginPage(driver);
		loginobjects.userLogin("m.atef@gmail.com", "Flash2k1");

	}
	@AfterMethod
	public void StopDriver() {
	driver.findElement(By.xpath("(//A[@id='dropdownCurrency']/../../..//A[@id='dropdownCurrency'])[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"//header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[3]/div/div/div/a[2]")).click();
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	
	}

}
