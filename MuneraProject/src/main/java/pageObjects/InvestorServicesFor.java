package pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class InvestorServicesFor extends BasePage {
	public WebDriver driver;

	public InvestorServicesFor() throws IOException {
		super();

	}

	By servicesForIcon = By.xpath("//div[@class='MuiPaper-root category-box  MuiPaper-elevation1 MuiPaper-rounded']");
	By continueButton = By.xpath("//span[text()='Continue']");

	public List<WebElement> getservicesForIcon() throws IOException {
		this.driver = getDriver();
		return driver.findElements(servicesForIcon);
	}

	public WebElement getcontinueButton() throws IOException {
		this.driver = getDriver();
		return driver.findElement(continueButton);
	}

}
