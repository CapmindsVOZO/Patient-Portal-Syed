package com.myprofile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class My_Profile_Runner extends Base_Class {

	public static WebDriver driver = getbrowser("chrome");

	public static Pom_Class pom = new Pom_Class(driver);

	// public static void main(String[] args) throws InterruptedException {
	@Test(priority = 0)

	public void LoginPage() throws InterruptedException {

		// Launch Browser
		geturl("https://production.clientx.me/");

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		// Existing Client
		Clickonelement(pom.getmyprof().getexistingclie());

		// Enter Email
		sendkeys(pom.getmyprof().getentermai(), "roha21@spambog.com");

		// select enterAdmin@123
		Clickonelement(pom.getmyprof().getseleent());

		// User click The Forgot Password

		Clickonelement(pom.getmyprof().getforgotpass());

		// Enter Email
		Thread.sleep(2000);
		sendkeys(pom.getmyprof().getforgotmail(), "mani21@spambog.com");

		// User click The Forgot Password

		Clickonelement(pom.getmyprof().getbacklogin());

		// Enter Email
		Thread.sleep(2000);
		sendkeys(pom.getmyprof().getentermai1(), "mani21@spambog.com");

		// Enter pass
		Thread.sleep(3000);
		sendkeys(pom.getmyprof().getenterpass(), "Test@1234");

		// sele login
		Clickonelement(pom.getmyprof().getselelog());

	}

	@Ignore

	@Test(priority = 1)

	public void Myprofile() throws InterruptedException {

		// sele my pro

		Thread.sleep(5000);
		Clickonelement(pom.getmyprof().getheadmy());

		// sele my prof
		Clickonelement(pom.getmyprof().getmyprosel());

		// User click Upload
		Clickonelement(pom.getmyprof().getuploadpic());

		// Send Image
		sendkeys(pom.getmyprof().getimageupload(), "C:\\Users\\Admin\\Documents\\Test Image\\dasdasd.JPG");

		// ok

		// User click Upload
		Clickonelement(pom.getmyprof().getpressok());

		// Click Save

		Clickonelement(pom.getmyprof().getsavepic());

		//
		// sele fir name
		Thread.sleep(3000);
		clear(pom.getmyprof().getfirnam());

		sendkeys(pom.getmyprof().getfirnam(), "john");

		// sele midle nam
		Thread.sleep(3000);
		clear(pom.getmyprof().getmidnam());

		sendkeys(pom.getmyprof().getmidnam(), "tes");

		// sele midle nam
		Thread.sleep(3000);
		clear(pom.getmyprof().getlasnam());

		sendkeys(pom.getmyprof().getlasnam(), "pat");

		// sele suf
		Thread.sleep(5000);
		clear(pom.getmyprof().getsuf());

		sendkeys(pom.getmyprof().getsuf(), "A");

		// sele ss
		Thread.sleep(3000);
		clear(pom.getmyprof().getseless());

		sendkeys(pom.getmyprof().getseless(), "A");

		// sele phon
		Thread.sleep(3000);
		clear(pom.getmyprof().getselepho());

		sendkeys(pom.getmyprof().getselepho(), "9123564323");

		// add Phone
		Thread.sleep(3000);
		Clickonelement(pom.getmyprof().getaddph());

		// sele plac

		Thread.sleep(5000);

		Clickonelement(pom.getmyprof().getselepla1());

		// sele plac

		Thread.sleep(5000);
		Clickonelement(pom.getmyprof().getselepla());

		// sele phon
		Thread.sleep(5000);
		clear(pom.getmyprof().getselephofirs());

		sendkeys(pom.getmyprof().getselephofirs(), "6758768712");

		// Enter Email

		Thread.sleep(5000);
		clear(pom.getmyprof().getenmai());

		sendkeys(pom.getmyprof().getenmai(), "amith21@spambog.com");

//		selectone(pom.getmyprof().getselemail(), "Work");

		// Sele add mail

		Clickonelement(pom.getmyprof().getadenmai());

		// Enter Email 2

		Thread.sleep(5000);
		clear(pom.getmyprof().getenmai1());

		sendkeys(pom.getmyprof().getenmai1(), "test21@spambog.com");

		Thread.sleep(3000);

		Clickonelement(pom.getmyprof().getselemailone());

		Clickonelement(pom.getmyprof().getselemailone1());

		// Address

		// Street

		try {
			// sele phon
			Thread.sleep(3000);
			clear(pom.getmyprof().getentadd());
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		Thread.sleep(3000);
		sendkeys(pom.getmyprof().getentadd(), "California");

		// City

		try {
			Thread.sleep(5000);
			clear(pom.getmyprof().getcityen());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		sendkeys(pom.getmyprof().getcityen(), "Los Angeles");

		// State

		try {
			Thread.sleep(4000);
			clear(pom.getmyprof().getstat());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// state

		Clickonelement(pom.getmyprof().getstat());

		// state

		Clickonelement(pom.getmyprof().getstat1());

		// State

		Thread.sleep(2000);
		clear(pom.getmyprof().getzipc());

		sendkeys(pom.getmyprof().getzipc(), "3211");

		// About Patient

		// Date Of Bit
		sendkeys(pom.getmyprof().getdob(), "14-02-1973");

		// sex
		Thread.sleep(3000);
		Clickonelement(pom.getmyprof().getsexse());

		// sex

		Clickonelement(pom.getmyprof().getsexse1());

		// Mari Stat

		Thread.sleep(3000);
		Clickonelement(pom.getmyprof().getmarst());

		Clickonelement(pom.getmyprof().getmarst1());

		// Language Sle
		Thread.sleep(3000);

		Clickonelement(pom.getmyprof().getlansel());

		Clickonelement(pom.getmyprof().getlansel1());

		// select race
		Thread.sleep(3000);

		Clickonelement(pom.getmyprof().getselera());

		// select race

		Clickonelement(pom.getmyprof().getselera1());

		// Ethnicity

		Thread.sleep(3000);

		Clickonelement(pom.getmyprof().getethsel());

		Clickonelement(pom.getmyprof().getethsel1());

		// sele save

		try {
			Thread.sleep(3000);

			Clickonelement(pom.getmyprof().getselsa());
		} catch (Exception e) {
			System.out.println("Patient Details Under Review ");
		}

		System.out.println(" My Profile Tested Successfully ");
	}

	@Ignore
	@Test(priority = 2)

	public void Message() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Select Message

		Thread.sleep(6000);

		Clickonelement(pom.getmyprof().getmesssel());

		// ser provi

		sendkeys(pom.getmyprof().getsermes(), "Production");

		// sele patien

		Clickonelement(pom.getmyprof().getselpro());

		// Send Text

		// Clickonelement
		sendkeys(pom.getmyprof().gettypmsg(), "Hello");

		// sen msg
		Thread.sleep(3000);
		Clickonelement(pom.getmyprof().getsenmsg());

		// Search Message

		// sen msg
		Thread.sleep(3000);
		Clickonelement(pom.getmyprof().getsearchmsg());

		// Clickonelement
		sendkeys(pom.getmyprof().getsendsearch(), "earth");

		System.out.println("Messenger Tested Successfully ");

	}

	@Ignore

	@Test(priority = 3)

	public void Document() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		//////////////////////// Documents ////////////////////

		// Click Documents
		Clickonelement(pom.getmyprof().getClickDocument());

		try {

			// Click Dot

			Thread.sleep(4000);

			Clickonelement(pom.getmyprof().getClickDot1());
			// Click Documents
			Clickonelement(pom.getmyprof().getClickSign());

			// Enter Name
			sendkeys(pom.getmyprof().getEnterNamee(), "Saheerahmed");

			// Enter Name
			Clickonelement(pom.getmyprof().getClickcancel1());
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}

		// Enter Name
		// Clickonelement(pom.getmyprof().getClickSave1());

		System.out.println("Signed Successfully");

		Thread.sleep(5000);

		// Click Upkoad Documents
		Clickonelement(pom.getmyprof().getClickUploadDocu());

		//

		// Upload Document
		Thread.sleep(3000);

		sendkeys(pom.getmyprof().getClickUploadDocufile(), "C:\\Users\\Admin\\Documents\\Test Image\\dasdasd.JPG");

		// Click Upkoad Documents
		Thread.sleep(4000);
//		Clickonelement(pom.getmyprof().getClickclose());
		// Click Print
		Clickonelement(pom.getmyprof().getuploadfile());

		System.out.println("Upload Successfully");

		Thread.sleep(4000);

		// Click Dot
		Clickonelement(pom.getmyprof().getClickDot1());

//		// Click Print
//		Clickonelement(pom.getmyprof().getClickPrint());
//		
//		Thread.sleep(4000);
//		
//		// Click Cancel
//		Clickonelement(pom.getmyprof().getClickCancel1());

		// Click Download
//		Clickonelement(pom.getmyprof().getClickDownload1());

		Thread.sleep(4000);

		// Click Dot
		// Clickonelement(pom.getmyprof().getClickDot1());

		// Click Dot
		// Clickonelement(pom.getmyprof().getClickDelete1());

		// Click All Document
		Thread.sleep(4000);
		Clickonelement(pom.getmyprof().getClickDDc());

		// Select All Document
		Clickonelement(pom.getmyprof().getSelectAllDoc());

		// Click Dropdown
		Clickonelement(pom.getmyprof().getClickDDc());

		// Select Unsigned Document
		Clickonelement(pom.getmyprof().getSelectUnsigned());

		// Click Dropdown
		Clickonelement(pom.getmyprof().getClickDDc());

		// Select Review Document
		Clickonelement(pom.getmyprof().getSelectReviewDoc());

		// Click Dropdown
		Clickonelement(pom.getmyprof().getClickDDc());

		// Click All Document
		Clickonelement(pom.getmyprof().getsigndo());

		System.out.println("Document Tested Successfully");
	}

	@Ignore
	@Test(priority = 5)

	public void HealthProfile() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		//////////////////// HealthProfile /////////////////////////

		// Click HealthProfile
		Clickonelement(pom.getmyprof().getClickHealth());

		// Click Dropdown
		Clickonelement(pom.getmyprof().getClickDD());

		// Click Problem
		Clickonelement(pom.getmyprof().getClickProblem());

		// Click Dropdown
		Clickonelement(pom.getmyprof().getClickDD());

		// Click Allergie
		Clickonelement(pom.getmyprof().getClickAllergie());

		// Click Dropdown
		Clickonelement(pom.getmyprof().getClickDD());

		// Click LabOrders
		Clickonelement(pom.getmyprof().getClickLabOrders());

		// Click Dropdown
		Clickonelement(pom.getmyprof().getClickDD());

		// Click Medication
		Clickonelement(pom.getmyprof().getClickMedication());

		System.out.println("Health Profile Tested Successfully");

	}

	@Ignore
	@Test(priority = 8)

	public void Homework() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Select Home Work
		Thread.sleep(3000);
		Clickonelement(pom.getmyprof().getclihomework());

		// serach title
		sendkeys(pom.getmyprof().getserachtitle(), "test");

//		// Click Home
//		Thread.sleep(3000);
//		Clickonelement(pom.getmyprof().getclickhome());
//
//		// Click close
//		Thread.sleep(3000);
//		Clickonelement(pom.getmyprof().getclickclose1());

		// Click The list

		Thread.sleep(4000);
		Clickonelement(pom.getmyprof().getclciklist());

		// click The Grid
		Thread.sleep(4000);
		Clickonelement(pom.getmyprof().getclickgrid());

		// close
//		driver.close();

	}

//	@Ignore
	@Test(priority = 9)

	public void Settings() throws InterruptedException {

		// click The setting
		Thread.sleep(4000);
		Clickonelement(pom.getmyprof().getsettings());

		// click change password b
		Thread.sleep(4000);
		Clickonelement(pom.getmyprof().getchangepassword());

		// click The currentpassword
		Thread.sleep(2000);
		sendkeys(pom.getmyprof().getcurrentpassword(), "Test@1234");

		// click The newpasswpord
		Thread.sleep(2000);
		sendkeys(pom.getmyprof().getnewpassword(), "Test@1234");

		// click The confirmpassword
		Thread.sleep(2000);
		sendkeys(pom.getmyprof().getconfirmpassord(), "Test@1234");

		// click The resetpassword
		Thread.sleep(4000);
		Clickonelement(pom.getmyprof().getresetpassword());

		// click The Grid
		Thread.sleep(4000);
		Clickonelement(pom.getmyprof().getsettings());

		// click The Grid
		Thread.sleep(2000);
		Clickonelement(pom.getmyprof().getprivacypolicy());

		// click The Grid
		Thread.sleep(2000);
		Clickonelement(pom.getmyprof().gettermsandcondition());

		// click The Grid
		Thread.sleep(2000);
		Clickonelement(pom.getmyprof().getcopyright());

		// click The Grid
		Thread.sleep(2000);
		Clickonelement(pom.getmyprof().getinviteothers());

		// click The Grid
		Thread.sleep(2000);
		Clickonelement(pom.getmyprof().getfeedback());

		// click The Grid
		Thread.sleep(2000);
		sendkeys(pom.getmyprof().getcomments(), "");

		// click The Grid
		Thread.sleep(2000);
		Clickonelement(pom.getmyprof().getsubmitfeedback());

	}
}
