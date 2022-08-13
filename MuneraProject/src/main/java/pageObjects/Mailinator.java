package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class Mailinator extends BasePage{
	
	public WebDriver driver;
	
	By mailinatorSearch = By.id("search");
	By mailinatorGoButton = By.xpath("//button[text()='GO']");
	By mailinatorVerificatioMail = By.xpath("//td[contains(.,'Verification Email')]");
	String mailinatorMailFrameId = "html_msg_body";
	By mailinatorVerificationCode = By.xpath("//body/child::h2[2]");
	
	public Mailinator() throws IOException {
		super();
	}
	
	public WebElement getmailinatorSearch() throws IOException {
		this.driver = getDriver();
		return driver.findElement(mailinatorSearch);
	}
	public WebElement getmailinatorGoButton() throws IOException {
		this.driver = getDriver();
		return driver.findElement(mailinatorGoButton);
	}
	public WebElement getmailinatorVerificatioMail() throws IOException {
		this.driver = getDriver();
		return driver.findElement(mailinatorVerificatioMail);
	}
	public WebElement getmailinatorVerificationCode() throws IOException {
		this.driver = getDriver();
		return driver.findElement(mailinatorVerificationCode);
	}
	
	public String getmailinatorMailFrameId() throws IOException {
		this.driver = getDriver();
		return mailinatorMailFrameId;
	}

}
