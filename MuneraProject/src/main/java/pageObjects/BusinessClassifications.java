package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class BusinessClassifications extends BasePage {
	public WebDriver driver;

	public BusinessClassifications() throws IOException {
		super();

	}

	By skipButton = By.xpath("//span[text()='Skip']");

	public WebElement getskipButton() throws IOException {
		this.driver = getDriver();
		return driver.findElement(skipButton);
	}

}
