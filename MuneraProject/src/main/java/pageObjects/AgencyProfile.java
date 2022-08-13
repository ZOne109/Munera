package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class AgencyProfile extends BasePage {
	public WebDriver driver;

	public AgencyProfile() throws IOException {
		super();

	}

	By agencyProfileOption = By.xpath("//span[text()='My Profile']");
	By websiteEdit = By.xpath("//div[@class='link-wrap']/div[2]/span");
	By websiteEditTextField = By.name("websiteURL");
	By linkedINEdit = By.xpath("//div[@class='link-wrap']/div[3]/span");
	By linkedInEditTextField = By.name("linkedInURL");
	By twitterEdit = By.xpath("//div[@class='link-wrap']/div[4]/span");
	By twitterEditTextField = By.name("twitterURL");
	By bioEditIcon = By.xpath("//div[@class='profile-content']/div/div/span");
	By bioEditTextField = By.name("bio");
	By bioeditTextFiledNew = By.xpath("//div[@class='que-body']/button/span");
	By bioEditSave = By.xpath("//div[@class='profile-content']/div/div/span[2]");
	By bioEditCancel = By.xpath("//div[@class='profile-content']/div/div/span[3]");
	By nameEdit = By.xpath("//div[@class='profile-title edit-block']/span");
	By jobTitleEdit = By.xpath("//div[@class='edit-block']/span");
	By profilePicEdit = By.xpath("//div[@class='upload-block']/label/span[1]");
	By toggleButton = By.className("menu-toggle");
	By websiteEditSave = By.xpath("//div[@class='btn-wrap after-edit']/span[1]");
	By websiteEditCancel = By.xpath("//div[@class='btn-wrap after-edit']/span[2]");
	By linkedInEditSave = By.xpath("//div[@class='btn-wrap after-edit']/span[1]");
	By linkedInEditCancel = By.xpath("//div[@class='btn-wrap after-edit']/span[2]");
	By twitterEditSave = By.xpath("//div[@class='btn-wrap after-edit']/span[1]");
	By twitterEditCancel = By.xpath("//div[@class='btn-wrap after-edit']/span[2]");

	public WebElement getagencyProfileOption() throws IOException {
		this.driver = getDriver();
		return driver.findElement(agencyProfileOption);
	}

	public WebElement getwebsiteEdit() throws IOException {
		this.driver = getDriver();
		return driver.findElement(websiteEdit);
	}

	public WebElement getlinkedINEdit() throws IOException {
		this.driver = getDriver();
		return driver.findElement(linkedINEdit);
	}

	public WebElement gettwitterEdit() throws IOException {
		this.driver = getDriver();
		return driver.findElement(twitterEdit);
	}

	public WebElement getbioEditIcon() throws IOException {
		this.driver = getDriver();
		return driver.findElement(bioEditIcon);
	}

	public WebElement getnameEdit() throws IOException {
		this.driver = getDriver();
		return driver.findElement(nameEdit);
	}

	public WebElement getjobTitleEdit() throws IOException {
		this.driver = getDriver();
		return driver.findElement(jobTitleEdit);
	}

	public WebElement getprofilePicEdit() throws IOException {
		this.driver = getDriver();
		return driver.findElement(profilePicEdit);
	}

	public WebElement gettoggleButton() throws IOException {
		this.driver = getDriver();
		return driver.findElement(toggleButton);
	}

	public WebElement getwebsiteEditSave() throws IOException {
		this.driver = getDriver();
		return driver.findElement(websiteEditSave);
	}

	public WebElement getwebsiteEditCancel() throws IOException {
		this.driver = getDriver();
		return driver.findElement(websiteEditCancel);
	}

	public WebElement getlinkedInEditSave() throws IOException {
		this.driver = getDriver();
		return driver.findElement(linkedInEditSave);
	}

	public WebElement getlinkedInEditCancel() throws IOException {
		this.driver = getDriver();
		return driver.findElement(linkedInEditCancel);
	}

	public WebElement gettwitterEditSave() throws IOException {
		this.driver = getDriver();
		return driver.findElement(twitterEditSave);
	}

	public WebElement gettwitterEditCancel() throws IOException {
		this.driver = getDriver();
		return driver.findElement(twitterEditCancel);
	}

	public WebElement getbioEditTextField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(bioEditTextField);
	}

	public WebElement getbioEditSave() throws IOException {
		this.driver = getDriver();
		return driver.findElement(bioEditSave);
	}

	public WebElement getbioEditCancel() throws IOException {
		this.driver = getDriver();
		return driver.findElement(bioEditCancel);
	}

	public WebElement getwebsiteEditTextField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(websiteEditTextField);
	}

	public WebElement getlinkedInEditTextField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(linkedInEditTextField);
	}

	public WebElement gettwitterEditTextField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(twitterEditTextField);
	}

	public WebElement getbioeditTextFiledNew() throws IOException {
		this.driver = getDriver();
		return driver.findElement(bioeditTextFiledNew);
	}

}
