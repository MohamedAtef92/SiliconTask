package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeScreen  extends PageBase{

	public HomeScreen(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	

	@FindBy (css = "#\\/\\/header-waypoint-sticky > div.header-top > div > div > div.col-md-4.col-3.o2")
	WebElement homeBtn;
	@FindBy(css  ="body > div.body-inner > div.main-wrapper.scrollspy-action > div.container > div.container.mt25.offset-0 > div > div.row.mywishlist > div.col-12.col-md-4.col-lg-4.o2 > aside > nav > ul > li:nth-child(2) > a")
    WebElement myProfile;
	@FindBy(css="#search > div > div > div > div > div > nav > ul > li:nth-child(2) > a")
	WebElement flightBtn; 
	@FindBy (name = "firstname")
	WebElement firstName;
	public String assertName()   {
		myProfile.click();

		System.out.println("FirstName is:" + firstName.getAttribute("value"));
		return firstName.getAttribute("value");
	}
	public void homeNav() {

		homeBtn.click();		
}
	public void flightNav() {

		flightBtn.click();		
}
}
