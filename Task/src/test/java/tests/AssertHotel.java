package tests;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.HomeScreen;

public class AssertHotel extends TestBase {
	@Test
	public void assertHotel()
	{	HomeScreen HomeScreenObject;
	HomeScreenObject = new HomeScreen(driver);
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	HomeScreenObject.homeNav();
	JavascriptExecutor js = (JavascriptExecutor)driver;
    WebElement HotelElement = driver.findElement(By.xpath("//*[@id=\"MenuHorizon28_01\"]/div/div/div[6]/div/a/div[2]/div[4]/div/span"));
    js.executeScript("arguments[0].scrollIntoView();", HotelElement);

    List<WebElement> elements = driver.findElements(By.className("text-secondary"));
    int temp=50000000;
    int[] price = new int[8];
    for (int i=0; i<8;i++){
    
    	String priceWithDollars = elements.get(i).getText();
    	String priceString = priceWithDollars.replaceAll("[$]", "");
   for (int j =0 ; j <8 ; j++) {
    	 price [j]= Integer.parseInt(priceString);    
   	}
   for (int x= 0 ; x<8 ; x++){
	   if (temp>price[x]) {
		   temp = price [x]; 
	   	}
   		}
    	{	
    	}
    	}
System.out.println("Lowest hotel value is: "  + temp);
  assertEquals(Integer.parseInt(HotelElement.getText().replaceAll("[$]", "")), temp);
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

}}
