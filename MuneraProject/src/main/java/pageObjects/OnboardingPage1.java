package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class OnboardingPage1 extends BasePage{

	public WebDriver driver;

	By companyName_TextField = By.name("companyName");
	By jobTitle_TextField = By.name("jobTitle");
	By firstName_TextField = By.name("firstName");
	By lastName_TextField = By.name("lastName");
	By workEmail_TextField = By.name("workEmail");
	By zipcode_TextField = By.name("zipcode");
	By password_TextField = By.name("password");
	By confirmPassword_TextField = By.name("confirmPassword");
	By agreeAndCreateAnAccount_Button = By.xpath("//span[text()='Agree & Create an Account']");

	public OnboardingPage1() throws IOException {
		super();
	}

	public WebElement getcompanyName_TextField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(companyName_TextField);
	}

	public WebElement getjobTitle_TextField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(jobTitle_TextField);
	}

	public WebElement getfirstName_TextField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(firstName_TextField);
	}

	public WebElement getlastName_TextField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(lastName_TextField);
	}

	public WebElement getworkEmail_TextField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(workEmail_TextField);
	}

	public WebElement getzipcode_TextField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(zipcode_TextField);
	}

	public WebElement getpassword_TextField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(password_TextField);
	}

	public WebElement getconfirmPassword_TextField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(confirmPassword_TextField);
	}

	public WebElement getagreeAndCreateAnAccount_Button() throws IOException {
		this.driver = getDriver();
		return driver.findElement(agreeAndCreateAnAccount_Button);
	}

}
