package pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class TypeOfAgency extends BasePage{
	public WebDriver driver;
	
	By agencyOrganizationIcons = By.xpath("//div[@class='MuiPaper-root category-box  MuiPaper-elevation1 MuiPaper-rounded']");
	By continueButton = By.xpath("//span[text()='Continue']");
	
	public TypeOfAgency() throws IOException {
		super();
	}
	
	public List<WebElement> getagencyOrganizationIcons() throws IOException {
		this.driver = getDriver();
		return driver.findElements(agencyOrganizationIcons);
	}
	
	public WebElement getcontinueButton() throws IOException {
		this.driver = getDriver();
		return driver.findElement(continueButton);
	}

}
