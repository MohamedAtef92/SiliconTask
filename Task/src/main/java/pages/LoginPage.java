package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(name="username")
    WebElement username;
	@FindBy(name="password")
	WebElement password;
	@FindBy(xpath  ="//*[@id=\"loginfrm\"]/button")
	WebElement loginbtn;
	public void userLogin (String Username , String Password ) {
	username.sendKeys(Username);
	password.sendKeys(Password);
	loginbtn.click();
	}
}
