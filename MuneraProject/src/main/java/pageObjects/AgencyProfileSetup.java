package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class AgencyProfileSetup extends BasePage {
	public WebDriver driver;

	By agencyDepartmentName = By.name("distName");
	By jobTitle = By.name("jobTitle");
	By agencyWebsite = By.name("website");
	By continueButton = By.xpath("//button[@type='button']");
	By continueToDashboard = By.xpath("//span[text()='Continue to your Dashboard']");

	public AgencyProfileSetup() throws IOException {
		super();
	}

	public WebElement getagencyDepartmentName() throws IOException {
		this.driver = getDriver();
		return driver.findElement(agencyDepartmentName);
	}

	public WebElement getjobTitle() throws IOException {
		this.driver = getDriver();
		return driver.findElement(jobTitle);
	}

	public WebElement getagencyWebsite() throws IOException {
		this.driver = getDriver();
		return driver.findElement(agencyWebsite);
	}

	public WebElement getcontinueButton() throws IOException {
		this.driver = getDriver();
		return driver.findElement(continueButton);
	}

	public WebElement getcontinueToDashboard() throws IOException {
		this.driver = getDriver();
		return driver.findElement(continueToDashboard);
	}

}
