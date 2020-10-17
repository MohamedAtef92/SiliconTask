package tests;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pages.HomeScreen;


public class AssertLogin extends TestBase {
	HomeScreen HomeScreenObject;

@Test
public void assertLogin ()  {
	
		HomeScreenObject = new HomeScreen(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
assertEquals(HomeScreenObject.assertName(), "MOHAMED");		
}

	
}
