package tests;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.HomeScreen;
import pages.SearchFlightScreen;

public class AssertBook extends TestBase {
	HomeScreen HomeScreenObject;
	SearchFlightScreen SearchFlightObject;
	@Test 
	public void assertBook () throws InterruptedException {

		HomeScreenObject = new HomeScreen(driver);
		SearchFlightObject = new SearchFlightScreen(driver);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		HomeScreenObject.homeNav();
		HomeScreenObject.flightNav();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 500)");
		SearchFlightObject.searching();

WebElement date = driver.findElement(By.id("FlightsDateStart"));
date.click();
driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
date.sendKeys(Keys.ENTER);
SearchFlightObject.booking();
assertTrue(SearchFlightObject.assertFrom().contains("ZRH"));	
	assertTrue(SearchFlightObject.assertTo().contains("BVA"));
	driver.findElement(By.xpath("//*[@id=\"mobileMenuMain\"]/nav/ul[1]/li/a")).click();

	}
	
}
