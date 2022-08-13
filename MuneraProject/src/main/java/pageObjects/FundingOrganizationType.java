package pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class FundingOrganizationType extends BasePage {
	public WebDriver driver;

	public FundingOrganizationType() throws IOException {
		super();

	}

	By orgTypeIcon = By.xpath("//div[@class='MuiPaper-root category-box  MuiPaper-elevation1 MuiPaper-rounded']");
	By continueButton = By.xpath("//span[text()='Continue']");
	By continueToDashboard = By.xpath("//span[text()='Continue to your Dashboard']");

	public List<WebElement> getorgTypeIcon() throws IOException {
		this.driver = getDriver();
		return driver.findElements(orgTypeIcon);
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
