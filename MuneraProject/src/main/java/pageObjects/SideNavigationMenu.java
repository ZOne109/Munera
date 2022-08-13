package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class SideNavigationMenu extends BasePage {
	public WebDriver driver;

	public SideNavigationMenu() throws IOException {
		super();

	}

	By homeNavigation = By.xpath("//span[text()='Home']");
	By profilesNavigation = By.xpath("//span[text()='Profiles']");
	By myProfile = By.xpath("//span[text()='My Profile']");
	By profilePublicAgency = By.xpath("//span[text()='Public Agency']");
	By publicProfileOption = By.xpath("//span[text()='Public Profile ']");
	By teamNavigation = By.xpath("//span[text()='Team']");
	By conversationNavigation = By.xpath("//span[text()='Conversations']");
	By programsNavigation = By.xpath("//span[text()='Programs']");
	By dealsNavigation = By.xpath("//span[text()='Deals']");
	By projectsNavigation = By.xpath("//span[text()='Projects']");
	By profileArrowIcon = By.xpath("//span[@class = 'arrow-icon']");
	By profileOption = By.xpath("//li[text()='Profile']");
	By logoutOption = By.xpath("//li[text()='Logout']");

	public WebElement gethomeNavigation() throws IOException {
		this.driver = getDriver();
		return driver.findElement(homeNavigation);
	}

	public WebElement getprofilesNavigation() throws IOException {
		this.driver = getDriver();
		return driver.findElement(profilesNavigation);
	}

	public WebElement getteamNavigation() throws IOException {
		this.driver = getDriver();
		return driver.findElement(teamNavigation);
	}

	public WebElement getconversationNavigation() throws IOException {
		this.driver = getDriver();
		return driver.findElement(conversationNavigation);
	}

	public WebElement getdealsNavigation() throws IOException {
		this.driver = getDriver();
		return driver.findElement(dealsNavigation);
	}

	public WebElement getprogramsNavigation() throws IOException {
		this.driver = getDriver();
		return driver.findElement(programsNavigation);
	}

	public WebElement getprofileArrowIcon() throws IOException {
		this.driver = getDriver();
		return driver.findElement(profileArrowIcon);
	}

	public WebElement getprofileOption() throws IOException {
		this.driver = getDriver();
		return driver.findElement(profileOption);
	}

	public WebElement getlogoutOption() throws IOException {
		this.driver = getDriver();
		return driver.findElement(logoutOption);
	}

	public WebElement getprojectsNavigation() throws IOException {
		this.driver = getDriver();
		return driver.findElement(projectsNavigation);
	}

	public WebElement getmyProfile() throws IOException {
		this.driver = getDriver();
		return driver.findElement(myProfile);
	}

	public WebElement getprofilePublicAgency() throws IOException {
		this.driver = getDriver();
		return driver.findElement(profilePublicAgency);
	}

}
