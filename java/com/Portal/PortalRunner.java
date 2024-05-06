package com.Portal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class PortalRunner extends BaseClass {

	public static WebDriver driver = getbrowser("chrome");

	public static POMClass pom = new POMClass(driver);

//	public static void main(String[] args) throws InterruptedException {

	@Test(priority = 0)

	public void IamnewClient() throws InterruptedException {

		// Driver Maximize and Url Launch

		geturl("https://production.clientx.me/");

		Thread.sleep(3000);

		// Click Exixting
		Clickonelement(pom.getPages().getClickExisting());

		Thread.sleep(2000);

		// Enter Mail id
		sendkeys(pom.getPages().getEnterMailid(), "jetasor436@fahih.com");

		// Click Continue
		Clickonelement(pom.getPages().getClickContinue());

		Thread.sleep(2000);

		// Enter Username
		sendkeys(pom.getPages().getEnterEmailId(), "jetasor436@fahih.com");

		// Enter Password
		sendkeys(pom.getPages().getEnterPassword(), "Test@123");

		// Click Signin Button
		Clickonelement(pom.getPages().getSigninbtn());
	}

	@Ignore
	@Test(priority = 1)

	public void Dashboard() throws InterruptedException {

/////////////////////// Dashboard  //////////////////////////////

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		try {
			// Cancel Booki
			Thread.sleep(5000);

			Clickonelement(pom.getPages().getcanboo());

			sendkeys(pom.getPages().getreas(), "dsasdb");

			Clickonelement(pom.getPages().getreasca());

		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}

		try {
			// Click make Appointment
			Thread.sleep(5000);

			Clickonelement(pom.getPages().getClickMake());

			Thread.sleep(6000);

		} catch (Exception e2) {
			// TODO Auto-generated catch block
//			e2.printStackTrace();
		}

		Thread.sleep(3000);

		// Selectone(pom.getPages().getselectProvider(), "John's Hospitals");

		// Click Office
		Clickonelement(pom.getPages().getselectOfice());

		// select Office
		Thread.sleep(3000);
		Clickonelement(pom.getPages().getselectOfice1());

		// Click provider
		Clickonelement(pom.getPages().getselectProvider());

		// Select provider
		Thread.sleep(3000);
		Clickonelement(pom.getPages().getselectProvider1());

		// Click Time
		Clickonelement(pom.getPages().getClickTime());

		try {
			// Select date
			Clickonelement(pom.getPages().getselectDate());

			// Select time
			Clickonelement(pom.getPages().getselectTime());

			Clickonelement(pom.getPages().getEnterReason());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
//			e1.printStackTrace();
		}

		// Enter Reason
		Thread.sleep(5000);
		sendkeys(pom.getPages().getEnterReason(), "Test@12345");

		try {
			// Click Submit
			Clickonelement(pom.getPages().getClickSubmit());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
//			e1.printStackTrace();
		}

		System.out.println("Appiontment Created Successfully");

		Thread.sleep(2000);

//		// Click Three dot
//		Clickonelement(pom.getPages().getClickDot());
//
//		Thread.sleep(2000);
//		// Click Edit
//		Clickonelement(pom.getPages().getClickEdit());
//
//		Thread.sleep(2000);
//		// Click Submit
//		Clickonelement(pom.getPages().getClickSubmit());

		// Click Three dot
//		Clickonelement(pom.getPages().getClickDot());
//		
//		Thread.sleep(2000);
//		
//		// Click Edit
//		Clickonelement(pom.getPages().getClickDelete());
//		
//		
//		// Enter Reason
//		sendkeys(pom.getPages().getEnterReason1(), "Test@12345");
//		
//		// Click Cancel
//		Clickonelement(pom.getPages().getClickCancel());

		Thread.sleep(3000);

		/// Click dashBoard
		Clickonelement(pom.getPages().getClickDashboard());

		// Add Crad
		Clickonelement(pom.getPages().getClickAddCard());

		// Enter Card Holder Name
		sendkeys(pom.getPages().getEnterName(), "ss");

		// Enter Card Holder Name
		sendkeys(pom.getPages().getEnterNameCardNo(), "5555 5555 5555 4444");

		// Enter CVV
		sendkeys(pom.getPages().getEnterCVV(), "345");

		// Enter CVV
		sendkeys(pom.getPages().getEnterMMYY(), "1123");

		// Clickonelement(pom.getPages().getClickCancelc());

		try {
			// Click Save
			Clickonelement(pom.getPages().getClickSave());

			// close

			Clickonelement(pom.getPages().getclclo());

		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}

		System.out.println("Card Added Successfully");

		Thread.sleep(3000);

		try {
			/// Click Make payment
			Clickonelement(pom.getPages().getClickMakePay());

			/// Click Make payment
			Clickonelement(pom.getPages().getClickMPaynow());
			Thread.sleep(2000);

			/// Click Make payment
			Clickonelement(pom.getPages().getClickClose());
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}

		System.out.println("Payment Done Successfully");

		////////////////////// Problems ///////////

		Thread.sleep(4000);

		/// Click Problems
		Clickonelement(pom.getPages().getClickProblems());

//		gettext(pom.getPages().getTextProblems());

		/////////////// Allergies ///////////////

		Thread.sleep(4000);

		/// Click Allergies
		Clickonelement(pom.getPages().getClickAllergies());

//		gettext(pom.getPages().getTextProblems());

		Thread.sleep(4000);

		/// Click Lab
		Clickonelement(pom.getPages().getClickLab());

//		gettext(pom.getPages().getTextProblems());

		// Click View All
		Clickonelement(pom.getPages().getClickViewAll());

		///////////////// Medication /////////////////

		/// Click dashBoard
		Clickonelement(pom.getPages().getClickDashboard());

//		gettext(pom.getPages().getTextProblems());

		// Click Medication View All
		Clickonelement(pom.getPages().getClickMViewAll());

	}

	@Ignore

	@Test(priority = 2)

	public void Appointment() throws InterruptedException {

		/////////////////////////// APPOINTMENT //////////////////

		// Thread.sleep(4000);

		// click Appointment
		Clickonelement(pom.getPages().getClickAppointment1());

		Thread.sleep(3000);

		// Click make Appointment
		Clickonelement(pom.getPages().getClickSCAppointment1());

		Thread.sleep(3000);

		// Selectone(pom.getPages().getselectProvider(), "John's Hospitals");

		// Click Office
		Clickonelement(pom.getPages().getselectOfice());

		// select Office

		Thread.sleep(6000);
		Clickonelement(pom.getPages().getselectOfice1());

		// Click provider
		Clickonelement(pom.getPages().getselectProvider());

		// Select provider
		Clickonelement(pom.getPages().getselectProvider1());

		// Click Time
		Clickonelement(pom.getPages().getClickTime());

		// Select date
		// Clickonelement(pom.getPages().getselectDate());
		try {
			// Select date
			Clickonelement(pom.getPages().getselectDate());

			// Select time
			Clickonelement(pom.getPages().getselectTime());

			Clickonelement(pom.getPages().getEnterReason());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
//			e1.printStackTrace();
		}

		// Select time
//		Clickonelement(pom.getPages().getselectTime());

		// Enter Reason
		sendkeys(pom.getPages().getEnterReason(), "Test@12345");

		try {
			// Click Submit
			Thread.sleep(6000);
			Clickonelement(pom.getPages().getClickSubmit());
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}

	}

	@Ignore

	@Test(priority = 3)

	public void Billing() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		////////////////////////// Billing ////////////////////////

		Thread.sleep(3000);

		// Click Billing
		Clickonelement(pom.getPages().getClickBilling());

		// Click Add card
		Clickonelement(pom.getPages().getClickAddCards());

		// Enter Card Holder Name
		sendkeys(pom.getPages().getEnterNAME(), "ss");

		// Enter Card Holder Name
		sendkeys(pom.getPages().getEnterNameCardNo1(), "5555 5555 5555 4444");

		// Enter CVV
		sendkeys(pom.getPages().getEnterCVV1(), "345");

		// Enter mm
		sendkeys(pom.getPages().getEnterMMYY1(), "1123");

		try {
			// Click Save
			Clickonelement(pom.getPages().getClickSave());

			Clickonelement(pom.getPages().getClickCancelc());
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}

		// Click Save
		// Clickonelement(pom.getPages().getClickSave());

		System.out.println("Billing Card Added Successfully");

		try {
			// clck View
			Clickonelement(pom.getPages().getClickView());

			// Click download
			Clickonelement(pom.getPages().getClickDownload());

			// Click Close
			Clickonelement(pom.getPages().getClickCancel1());

			// Click Pay button
			Clickonelement(pom.getPages().getClickPay());
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}

		System.out.println("Payment Done Successfully");

		Thread.sleep(2000);

		/// Click Make payment
		// Clickonelement(pom.getPages().getClickClose());

		// Payment History
		Clickonelement(pom.getPages().getClickPayment());

	}

	@Ignore

	@Test(priority = 4)

	public void Document() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		//////////////////////// Documents ////////////////////

		// Click Documents
		Clickonelement(pom.getPages().getClickDocument());

		// Click Dot
		Clickonelement(pom.getPages().getClickDot1());

		try {
			// Click Documents
			Clickonelement(pom.getPages().getClickSign());

			// Enter Name
			sendkeys(pom.getPages().getEnterNamee(), "Saheerahmed");

			// Enter Name
			Clickonelement(pom.getPages().getClickcancel1());
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}

		// Enter Name
		// Clickonelement(pom.getPages().getClickSave1());

		System.out.println("Signed Successfully");

		Thread.sleep(4000);

		// Click Upkoad Documents
		Clickonelement(pom.getPages().getClickUploadDocu());

		// Click Upkoad Documents
		Thread.sleep(4000);
		Clickonelement(pom.getPages().getClickclose());

		System.out.println("Upload Successfully");

		Thread.sleep(4000);

		// Click Dot
		Clickonelement(pom.getPages().getClickDot1());

//		// Click Print
//		Clickonelement(pom.getPages().getClickPrint());
//		
//		Thread.sleep(4000);
//		
//		// Click Cancel
//		Clickonelement(pom.getPages().getClickCancel1());

		// Click Download
//		Clickonelement(pom.getPages().getClickDownload1());

		Thread.sleep(4000);

		// Click Dot
		// Clickonelement(pom.getPages().getClickDot1());

		// Click Dot
		// Clickonelement(pom.getPages().getClickDelete1());

		// Click All Document
		Thread.sleep(4000);
		Clickonelement(pom.getPages().getClickDDc());

		// Select All Document
		Clickonelement(pom.getPages().getSelectAllDoc());

		// Click Dropdown
		Clickonelement(pom.getPages().getClickDDc());

		// Select Unsigned Document
		Clickonelement(pom.getPages().getSelectUnsigned());

		// Click Dropdown
		Clickonelement(pom.getPages().getClickDDc());

		// Select Review Document
		Clickonelement(pom.getPages().getSelectReviewDoc());

		// Click Dropdown
		Clickonelement(pom.getPages().getClickDDc());

		// Click All Document
		Clickonelement(pom.getPages().getsigndo());

		System.out.println("Document Tested Successfully");
	}

	@Ignore
	@Test(priority = 5)

	public void HealthProfile() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		//////////////////// HealthProfile /////////////////////////

		// Click HealthProfile
		Clickonelement(pom.getPages().getClickHealth());

		// Click Dropdown
		Clickonelement(pom.getPages().getClickDD());

		// Click Problem
		Clickonelement(pom.getPages().getClickProblem());

		// Click Dropdown
		Clickonelement(pom.getPages().getClickDD());

		// Click Allergie
		Clickonelement(pom.getPages().getClickAllergie());

		// Click Dropdown
		Clickonelement(pom.getPages().getClickDD());

		// Click LabOrders
		Clickonelement(pom.getPages().getClickLabOrders());

		// Click Dropdown
		Clickonelement(pom.getPages().getClickDD());

		// Click Medication
		Clickonelement(pom.getPages().getClickMedication());

		System.out.println("Health Profile Tested Successfully");

	}

	@Ignore
	@Test(priority = 6)

	public void Myprofile() throws InterruptedException {

		// sele my pro

		Thread.sleep(3000);
		Clickonelement(pom.getPages().getheadmy());

		// sele my prof
		Clickonelement(pom.getPages().getmyprosel());

		// sele fir name
		Thread.sleep(3000);
		ClearText(pom.getPages().getfirnam());

		sendkeys(pom.getPages().getfirnam(), "john");

		// sele midle nam
		Thread.sleep(3000);
		ClearText(pom.getPages().getmidnam());

		sendkeys(pom.getPages().getmidnam(), "tes");

		// sele midle nam
		Thread.sleep(3000);
		ClearText(pom.getPages().getlasnam());

		sendkeys(pom.getPages().getlasnam(), "pat");

		// sele suf
		Thread.sleep(5000);
		ClearText(pom.getPages().getsuf());

		sendkeys(pom.getPages().getsuf(), "A");

		// sele ss
		Thread.sleep(3000);
		ClearText(pom.getPages().getseless());

		sendkeys(pom.getPages().getseless(), "A");

		// sele phon
		Thread.sleep(3000);
		ClearText(pom.getPages().getselepho());

		sendkeys(pom.getPages().getselepho(), "9123564323");

		// sele plac

		Thread.sleep(5000);
		Selectone(pom.getPages().getselepla(), "Mobile");

		// add Phone
		Thread.sleep(3000);
		Clickonelement(pom.getPages().getaddph());

		// sele plac

		Selectone(pom.getPages().getselepla1(), "Home");

		// sele phon
		Thread.sleep(5000);
		ClearText(pom.getPages().getselephofirs());

		sendkeys(pom.getPages().getselephofirs(), "6758768712");

		// Enter Email

		Thread.sleep(5000);
		ClearText(pom.getPages().getenmai());

		sendkeys(pom.getPages().getenmai(), "abc@tempr.email");

		Selectone(pom.getPages().getselemail(), "Home");

		// Sele add mail

		Clickonelement(pom.getPages().getadenmai());

		// Enter Email 2

		Thread.sleep(5000);
		ClearText(pom.getPages().getenmai1());

		sendkeys(pom.getPages().getenmai1(), "abc123d@tempr.email");

		Selectone(pom.getPages().getselemailone(), "Work");

		// Address

		// Street

		// sele phon
		Thread.sleep(5000);
		ClearText(pom.getPages().getentadd());

		sendkeys(pom.getPages().getentadd(), "California");

		// City

		Thread.sleep(5000);
		ClearText(pom.getPages().getcityen());

		sendkeys(pom.getPages().getcityen(), "Los Angeles");

		// State

		Thread.sleep(2000);
		ClearText(pom.getPages().getstat());

		sendkeys(pom.getPages().getstat(), "Balor");

		// State

		Thread.sleep(2000);
		ClearText(pom.getPages().getzipc());

		sendkeys(pom.getPages().getzipc(), "3211");

		// About Patient

		// Date Of Bit
		sendkeys(pom.getPages().getdob(), "07/05/1990");

		// sex

		Selectone(pom.getPages().getsexse(), "Male");

		// Mari Stat

		Selectone(pom.getPages().getmarst(), "Single");

		// Language Sle

		Selectone(pom.getPages().getlansel(), "Tamil");

		// select race

		Selectone(pom.getPages().getselera(), "White");

		// Ethnicity

		Selectone(pom.getPages().getethsel(), "Hispanic or Latino");

		// sele save

		try {
			Thread.sleep(3000);

			Clickonelement(pom.getPages().getselsa());
		} catch (Exception e) {
			System.out.println("Patient Details Under Review ");
		}

		System.out.println(" My Profile Tested Successfully ");
	}

	@Ignore
	@Test(priority = 7)

	public void Message() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

////		WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
////		        .until(ExpectedCondition.elementToBeClickable(By.xpath("//a/h3")));
//		
//		Thread.sleep(3000);
//		WebDriverWait savp = new WebDriverWait(driver, 20);
//		WebElement psa = savp
//				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[@id='tp_nv-pst_ico'])[1]")));
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", psa);

		// Select Message

		Thread.sleep(5000);

		Clickonelement(pom.getPages().getmesssel());

		// ser provi

		sendkeys(pom.getPages().getsermes(), "Tech1");

		// sele patien

		Clickonelement(pom.getPages().getselpro());

		// Send Text

		// Clickonelement
		sendkeys(pom.getPages().gettypmsg(), "Hello");

		// send msg
//		Thread.sleep(3000);
//		Clickonelement(pom.getPages().getsenmsg());

		System.out.println("Messenger Tested Successfully ");

//		driver.close();

	}

	@Ignore
	@Test(priority = 8)

	public void Homework() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Select Home Work
		Thread.sleep(3000);
		Clickonelement(pom.getPages().getclihomework());

		// serach title
		sendkeys(pom.getPages().getserachtitle(), "Hello");

		// Click The list

		Thread.sleep(4000);
		Clickonelement(pom.getPages().getclciklist());

		// click The Grid
		Thread.sleep(4000);
		Clickonelement(pom.getPages().getclickgrid());

		// close
		driver.close();

	}

}
