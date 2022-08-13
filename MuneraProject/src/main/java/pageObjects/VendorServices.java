package pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class VendorServices extends BasePage {
	public WebDriver driver;

	public VendorServices() throws IOException {
		super();

	}

	By vendorService = By.xpath("//div[@class='MuiPaper-root category-box  MuiPaper-elevation1 MuiPaper-rounded']");
	By continueButton = By.xpath("//span[text()='Continue']");

	public List<WebElement> getVendorServices() throws IOException {
		this.driver = getDriver();
		return driver.findElements(vendorService);
	} 
	
	public WebElement getcontinueButton() throws IOException {
		this.driver = getDriver();
		return driver.findElement(continueButton);
	}
	
}
