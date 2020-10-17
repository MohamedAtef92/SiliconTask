package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SearchFlightScreen extends PageBase{

	public SearchFlightScreen(WebDriver driver) {
		super(driver);
	}
@FindBy (css="#s2id_location_from > a")
WebElement from;
@FindBy (xpath ="//*[@id=\"select2-drop\"]/div/input" )
WebElement fromText;
@FindBy (xpath="//*[@id=\"s2id_location_to\"]/a")
WebElement to;
@FindBy (xpath ="//*[@id=\"select2-drop\"]/div/input" )
WebElement toText;
@FindBy (id="FlightsDateStart")
WebElement date;
@FindBy (xpath= "//*[@id=\"LIST\"]/li[1]/div/div[1]/div[2]/form/div[2]/div/button")
WebElement bookBtn;
@FindBy (css = "body > div.body-inner > div.main-wrapper.scrollspy-action > div > div > div > div.acc_section > div > div.col-md-4.summary > div > ul > li:nth-child(1)")
WebElement fromLine;
@FindBy (css= "body > div.body-inner > div.main-wrapper.scrollspy-action > div > div > div > div.acc_section > div > div.col-md-4.summary > div > ul > li:nth-child(2)")
WebElement toLine;
public void searching() throws InterruptedException {
	from.click();
Thread.sleep(1000);
fromText.sendKeys("Zurich");
Thread.sleep(3000);
fromText.sendKeys(Keys.ENTER);
Thread.sleep(2000);
to.click();
Thread.sleep(1000);
toText.sendKeys("Paris");
Thread.sleep(3000);
toText.sendKeys(Keys.ENTER);

}
public void booking() {
	bookBtn.click();
}
public String assertFrom() {
	return fromLine.getText();
}
public String assertTo() {

return toLine.getText();
}}
