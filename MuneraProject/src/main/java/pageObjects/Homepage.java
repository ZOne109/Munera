package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class Homepage extends BasePage{

	public WebDriver driver;

	By selectAnAccountType_DropDown = By.id("view-select");
	By userTypePublicAgency_Option = By.xpath("//li[text()='Public Agency']");
	By userTypeVendor_Option = By.xpath("//li[text()='Vendor']");
	By userTypeInvestor_Option = By.xpath("//li[text()='Investor ']");
	By signUp_Button = By.xpath("//span[text()='Sign Up']");
	

	public Homepage() throws IOException {
		super();
	}

	public WebElement getselectAnAccountType_DropDown() throws IOException {
		this.driver = getDriver();
		return driver.findElement(selectAnAccountType_DropDown);
	}

	public WebElement getuserTypePublicAgency_Option() throws IOException {
		this.driver = getDriver();
		return driver.findElement(userTypePublicAgency_Option);
	}

	public WebElement getuserTypeVendor_Option() throws IOException {
		this.driver = getDriver();
		return driver.findElement(userTypeVendor_Option);
	}

	public WebElement getuserTypeInvestor_Option() throws IOException {
		this.driver = getDriver();
		return driver.findElement(userTypeInvestor_Option);
	}

	public WebElement getsignUp_Button() throws IOException {
		this.driver = getDriver();
		return driver.findElement(signUp_Button);
	}

	

}
