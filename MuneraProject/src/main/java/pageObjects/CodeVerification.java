package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class CodeVerification extends BasePage{

	public WebDriver driver;

	By codeTextFiled = By.name("code");
	By continueButton = By.xpath("//span[text()='Continue']");

	public CodeVerification() throws IOException {
		super();
	}

	public WebElement getcodeTextFiled() throws IOException {
		this.driver = getDriver();
		return driver.findElement(codeTextFiled);
	}

	public WebElement getcontinueButton() throws IOException {
		this.driver = getDriver();
		return driver.findElement(continueButton);
	}

}
