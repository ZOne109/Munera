package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class AgencyPublicProfile extends BasePage {
	public WebDriver driver;

	public AgencyPublicProfile() throws IOException {
		super();

	}

	By departmentNameEdit = By.xpath("//div[@class='profile-title edit-block']/span");
	By departmentNameTextfield = By.name("name");
	By departmentNameSave = By.xpath("//div[@class='btn-wrap after-edit']/span[1]");
	By departmentNameCancel = By.xpath("//div[@class='btn-wrap after-edit']/span[2]");
	By typeOfAgencyEdit = By.xpath("//div[@class='edit-block'][1]/span");
	By typeOfAgencyDropdown = By.id("demo-mutiple-name");
	By typeOfAgencySave = By.xpath("//div[@class='edit-block'][1]/span[1]");
	By typeOfAgencyCancel = By.xpath("//div[@class='edit-block'][1]/span[2]");
	By locationEdit = By.xpath("//div[@class='edit-block'][2]/span");
	By cityTextField = By.name("city");
	By stateTextField = By.name("state");
	By locationSave = By.xpath("//div[@class='btn-wrap after-edit']/span[1]");
	By locationCancel = By.xpath("//div[@class='btn-wrap after-edit']/span[2]");
	// By emailEdit = By.xpath("//div[@class='link-wrap']/div[1]/span");
	// ----------------------------------------------------------------
	By agencyIntroductionAdd = By.xpath("//span[text()='Add Overview']");
	By agencyIntroTextField = By.name("overview");
	By agencyIntroSave = By.xpath("//div[@class='profile-content']/div[1]/div/span[1]");
	By agencyIntroCancel = By.xpath("//div[@class='profile-content']/div[1]/div/span[2]");

	public WebElement getdepartmentNameEdit() throws IOException {
		this.driver = getDriver();
		return driver.findElement(departmentNameEdit);
	}

	public WebElement getdepartmentNameTextfield() throws IOException {
		this.driver = getDriver();
		return driver.findElement(departmentNameTextfield);
	}

	public WebElement getdepartmentNameSaved() throws IOException {
		this.driver = getDriver();
		return driver.findElement(departmentNameSave);
	}

	public WebElement getdepartmentNameCancel() throws IOException {
		this.driver = getDriver();
		return driver.findElement(departmentNameCancel);
	}

	public WebElement gettypeOfAgencyEdit() throws IOException {
		this.driver = getDriver();
		return driver.findElement(typeOfAgencyEdit);
	}

	public WebElement gettypeOfAgencyDropdown() throws IOException {
		this.driver = getDriver();
		return driver.findElement(typeOfAgencyDropdown);
	}

	public WebElement gettypeOfAgencySave() throws IOException {
		this.driver = getDriver();
		return driver.findElement(typeOfAgencySave);
	}

	public WebElement gettypeOfAgencyCancel() throws IOException {
		this.driver = getDriver();
		return driver.findElement(typeOfAgencyCancel);
	}

	public WebElement getlocationEdit() throws IOException {
		this.driver = getDriver();
		return driver.findElement(locationEdit);
	}

	public WebElement getcityTextField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(cityTextField);
	}

	public WebElement getstateTextField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(stateTextField);
	}

	public WebElement getlocationSave() throws IOException {
		this.driver = getDriver();
		return driver.findElement(locationSave);
	}

	public WebElement getlocationCancel() throws IOException {
		this.driver = getDriver();
		return driver.findElement(locationCancel);
	}

	public WebElement getagencyIntroductionAdd() throws IOException {
		this.driver = getDriver();
		return driver.findElement(agencyIntroductionAdd);
	}

	public WebElement getagencyIntroTextField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(agencyIntroTextField);
	}

	public WebElement getagencyIntroSave() throws IOException {
		this.driver = getDriver();
		return driver.findElement(agencyIntroSave);
	}

	public WebElement getagencyIntroCancel() throws IOException {
		this.driver = getDriver();
		return driver.findElement(agencyIntroCancel);
	}
}
