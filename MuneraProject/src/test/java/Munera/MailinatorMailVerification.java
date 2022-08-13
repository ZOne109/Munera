package Munera;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import base.BasePage;
import base.Hooks;
import pageObjects.Mailinator;

public class MailinatorMailVerification extends BasePage {
	public WebDriver driver = getDriver();

	public MailinatorMailVerification() throws IOException {
		super();
	}

	@Test
	public String CodeVerification(String email) throws IOException {
		
		// Switch to New Tab
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindowId = it.next();
		String childWindowId = it.next();
		driver.switchTo().window(childWindowId);

		// Mailinator code
		Mailinator mail = new Mailinator();
		driver.get("https://www.mailinator.com/");
		mail.getmailinatorSearch().sendKeys(email);
		mail.getmailinatorGoButton().click();
		mail.getmailinatorVerificatioMail().click();
		driver.switchTo().frame(mail.getmailinatorMailFrameId());
		String code = mail.getmailinatorVerificationCode().getText();
		driver.switchTo().window(parentWindowId);
//		int i=Integer.parseInt(code);

		return code;
	}
}
