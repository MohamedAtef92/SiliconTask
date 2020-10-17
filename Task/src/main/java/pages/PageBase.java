package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
	protected WebDriver driver;
	public Actions action;
	public PageBase(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
}}
