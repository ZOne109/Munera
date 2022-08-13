package Munera;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.Hooks;
import pageObjects.AgencyProfileSetup;
import pageObjects.CodeVerification;
import pageObjects.Homepage;
import pageObjects.OnboardingPage1;
import pageObjects.TypeOfAgency;

public class AgencyOnboarding extends Hooks {

	public AgencyOnboarding() throws IOException {
		super();
	}

	@Test
	public void TC1() throws InterruptedException, IOException {

		// Excel File data
		FileInputStream dataLocation = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\data.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook(dataLocation);
		XSSFSheet sheet = wb.getSheetAt(0);

		// Getting Cell values
		Row row1 = sheet.getRow(1);
		Cell R1C0 = row1.getCell(0);
		Cell R1C1 = row1.getCell(1);
		Cell R1C2 = row1.getCell(2);
		Cell R1C3 = row1.getCell(3);
		Cell R1C4 = row1.getCell(4);
		Cell R1C5 = row1.getCell(5);
		Cell R1C6 = row1.getCell(6);
		Cell R1C7 = row1.getCell(7);
		Cell R1C8 = row1.getCell(8);

		// Converting cell data into Strings
		String firstName = R1C0.toString();
		String lastName = R1C1.toString();
		double email = R1C2.getNumericCellValue();
		int mail = (int) email;
		// System.out.println(mail);
		String zipcode = R1C3.toString();
		String password = R1C4.toString();
		String confirmPassword = R1C5.toString();
		String agencyDeptName = R1C6.toString();
		String agencyJobTitle = R1C7.toString();
		String agencyWebsite = R1C8.toString();

		System.out.println("First Name = " + firstName + "\n" + "Last Name = " + lastName + "\n" + "Email = " + mail
				+ "@mailinator.com\n" + "Zipcode = " + zipcode + "\n" + "Password = " + password + "\n");

		// User Type selection
		Homepage hp = new Homepage();
		hp.getselectAnAccountType_DropDown().click();
		hp.getuserTypePublicAgency_Option().click();
		hp.getsignUp_Button().click();

		// Agency details
		OnboardingPage1 op1 = new OnboardingPage1();
		op1.getfirstName_TextField().sendKeys(firstName);
		op1.getlastName_TextField().sendKeys(lastName);
		op1.getworkEmail_TextField().sendKeys("agency" + mail + "@mailinator.com");
		op1.getzipcode_TextField().sendKeys(zipcode);
		Thread.sleep(2000);
		op1.getpassword_TextField().sendKeys(password);
		op1.getconfirmPassword_TextField().sendKeys(confirmPassword);
		Thread.sleep(2000);
		op1.getagreeAndCreateAnAccount_Button().click();

		// Mailinator code fetch
		MailinatorMailVerification mmv = new MailinatorMailVerification();
		String code = mmv.CodeVerification("agency" + mail + "@mailinator.com");

		// Code verification
		CodeVerification cv = new CodeVerification();
		cv.getcodeTextFiled().sendKeys(code);
		cv.getcontinueButton().click();
		Thread.sleep(5000);

		// Agency Type Selection
		String selection = "Charter School";
		TypeOfAgency toa = new TypeOfAgency();
		List<WebElement> icon = toa.getagencyOrganizationIcons();
		for (WebElement we : icon) {
			if (we.getText().equals(selection)) {
				Thread.sleep(2000);
				we.click();
				System.out.println("Agency Type Selected : " + selection);
				break;
			}
		}
		toa.getcontinueButton().click();

		// Agency Profile Setup
		AgencyProfileSetup aps = new AgencyProfileSetup();
		aps.getagencyDepartmentName().sendKeys(agencyDeptName);
		aps.getjobTitle().sendKeys(agencyJobTitle);
		aps.getagencyWebsite().sendKeys(agencyWebsite);
		aps.getcontinueButton().click();
		aps.getcontinueToDashboard().click();
		System.out.println("Agency Account Created");
		Thread.sleep(5000);

		R1C2.setCellType(CellType.STRING);
		R1C2.setCellValue(mail + 1);

		FileOutputStream fileOut = new FileOutputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\data.xlsx");
		wb.write(fileOut);
		fileOut.close();
	}

}
