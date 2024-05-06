package com.patientbugs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Patientpotal_Runner extends Base_Class {

	public static WebDriver driver = getbrowser("chrome");

	public static Pom_Class pom = new Pom_Class(driver);

	// public static void main(String[] args) throws InterruptedException {
//	@Ignore

	@Test(priority = 0)

	public void IamnewClient() throws InterruptedException {

		// Launch Browser
		geturl("https://production.clientx.me/");

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		// Click Iam New Client
		Clickonelement(pom.getpatipobugs().getnewcli());

		// logo displayed
		displayed(pom.getpatipobugs().getlodi());

		System.out.println("Logo Is Displayed ");

		// enter mail

		sendkeys(pom.getpatipobugs().getenmai(), "mani121@spambog.com");

		// press cont
		Thread.sleep(3000);
		Clickonelement(pom.getpatipobugs().getprecon());

		// Copied Otp
		sendkeys(pom.getpatipobugs().getotpse(), "5432");

		System.out.println("Otp able to Paste");

		// Clear otp

		Thread.sleep(3000);
		clear(pom.getpatipobugs().getotpse());
		System.out.println("Otp able to Clear");

		// Resend button

		Clickonelement(pom.getpatipobugs().getresendbtn());

		System.out.println("Able To Click Resend");

		driver.navigate().back();

		Thread.sleep(3000);
		driver.navigate().back();

		Thread.sleep(3000);
		driver.navigate().back();

		System.out.println("Back Option ");

	}

//	@Ignore

	@Test(priority = 1)

	public void Withoutaccount() throws InterruptedException {

		// Launch Browser
//		geturl("https://mumbai.clientx.me/");

		// Exisiting Client
		Thread.sleep(3000);
		Clickonelement(pom.getpatipobugs().getexicli());

		// Enter mai

		sendkeys(pom.getpatipobugs().getenmain(), "jame11@tempr.email");

		// cli con
		Clickonelement(pom.getpatipobugs().getclcom());

		// cli resen

		Thread.sleep(3000);

//		Clickonelement(pom.getpatipobugs().getrebtn());

//		driver.navigate().back();
//
//		driver.navigate().back();

		driver.navigate().back();

		System.out.println("Without account Tested ");
	}

	@Ignore

	@Test(priority = 2)

	public void Withaccount() throws InterruptedException {

//
//		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		// Exisiting Client
//		Thread.sleep(3000);
//		Clickonelement(pom.getpatipobugs().getexicli());
//
//		driver.navigate().back();

		// enter mail

//		sendkeys(pom.getpatipobugs().getenmai1(), "jame11@tempr.email");
//
//		// press cont
//		Thread.sleep(2000);
//		Clickonelement(pom.getpatipobugs().getprecon1());

		// Enter mail
		// enter mail
		Thread.sleep(5000);
		sendkeys(pom.getpatipobugs().getenmai2(), "mani21@spambog.com");

		// enter mail

		sendkeys(pom.getpatipobugs().getenpass(), "Test@1234");

		// cli login

		Clickonelement(pom.getpatipobugs().getlogbtn());

		driver.navigate().back();

//		Thread.sleep(2000);
//
//		gettext(pom.getpatipobugs().getvalpa());
//
//		System.out.println("User able to enter Only Strong Password ");
//
//		System.out.println("Correct Password Lable Was Displayed");
//
//		// clea
//		clear(pom.getpatipobugs().getenmai2());
//
//		sendkeys(pom.getpatipobugs().getenmai2(), "testpatie");
//
//		gettext(pom.getpatipobugs().getvalmai());
//
//		System.out.println("Correct Mail Label Was Displayed ");
//
//		driver.navigate().back();

//		// clea
//		clear(pom.getpatipobugs().getenpass());
//
//		sendkeys(pom.getpatipobugs().getenpass(), "Test@12345");
//
//		Clickonelement(pom.getpatipobugs().getlogbtn());

		// Login

		sendkeys(pom.getpatipobugs().getenmai2(), "mani21@s");

		sendkeys(pom.getpatipobugs().getenpass(), "Test@1234");
		Thread.sleep(5000);

		Clickonelement(pom.getpatipobugs().getlogbtn());
	}

//	@Ignore
	@Test(priority = 3)

	public void Dashboard() throws InterruptedException {

		// Exisiting Client
		Thread.sleep(3000);
		Clickonelement(pom.getpatipobugs().getexicli());

		// Enter mai

		sendkeys(pom.getpatipobugs().getenmain(), "mani21@spambog.com");

		// cli con
		Clickonelement(pom.getpatipobugs().getclcom());

		// Enter mail
		// enter mail
		Thread.sleep(5000);
		sendkeys(pom.getpatipobugs().getenmai2(), "mani21@spambog.com");

		// enter mail

		sendkeys(pom.getpatipobugs().getenpass(), "Test@1234");
		
		Thread.sleep(5000);

		Clickonelement(pom.getpatipobugs().getlogbtn());

		// Profile Photo

		Thread.sleep(5000);

//		displayed(pom.getpatipobugs().getproph());

		try {
			// cli add car

			Clickonelement(pom.getpatipobugs().getadca());

			// sen
			sendkeys(pom.getpatipobugs().getcarhol(), "abcd");

			// card nu
			sendkeys(pom.getpatipobugs().getcarna(), "5555 5555 5555 4444 5105");

			// cvv
			sendkeys(pom.getpatipobugs().getcvvn(), "1223");

			// exp nu

			sendkeys(pom.getpatipobugs().getcvvn(), "1223");

			// exp nu

			sendkeys(pom.getpatipobugs().getexpnu(), "dasd");

			clear(pom.getpatipobugs().getexpnu());
			sendkeys(pom.getpatipobugs().getexpnu(), "1233");

			System.out.println("User Only able to enter numbers");

			// save op

			Thread.sleep(3000);
			Clickonelement(pom.getpatipobugs().getsavop());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Card Details Tested Successfully");
		}

		// My car
		Thread.sleep(3000);
		Clickonelement(pom.getpatipobugs().getclicar());

		// Edit
		Thread.sleep(3000);
		Clickonelement(pom.getpatipobugs().getclied());

		// Name
		displayed(pom.getpatipobugs().getnamde());

		// exp dat

		sendkeys(pom.getpatipobugs().getexpd(), "11/23");

		// cli pri

		Clickonelement(pom.getpatipobugs().getradibtn());

		// cli pri
		Thread.sleep(5000);

		Clickonelement(pom.getpatipobugs().getsavcar());

//		// cli bac
//		Thread.sleep(5000);
//		Clickonelement(pom.getpatipobugs().getbaccar());
//
//		// cli bac
//		Thread.sleep(3000);
//		Clickonelement(pom.getpatipobugs().getbaccar());

		try {
			// click mak pay
			Thread.sleep(5000);

			Clickonelement(pom.getpatipobugs().getmakpay());

			// pay now
			Clickonelement(pom.getpatipobugs().getpayn());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			// cli clos
			Thread.sleep(3000);
			Clickonelement(pom.getpatipobugs().getclicl());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Payment Tested");

		}

		// sele al

		Clickonelement(pom.getpatipobugs().getselal());

		// sele pr
		Thread.sleep(3000);
		Clickonelement(pom.getpatipobugs().getsella());

	}

	@Ignore

	@Test(priority = 4)

	public void Appointment() throws InterruptedException {

		// Login

//		sendkeys(pom.getpatipobugs().getenmai2(), "kamal3@tempr.email");
//
//		sendkeys(pom.getpatipobugs().getenpass(), "Test@123");
//
//		Clickonelement(pom.getpatipobugs().getlogbtn());

		// cli appo
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		// Thread.sleep(5000);
		Clickonelement(pom.getpatipobugs().getappcl());

		// cli sch

		Clickonelement(pom.getpatipobugs().getclisch());

		// sele off

		Clickonelement(pom.getpatipobugs().getseloff());

		// sele off

		Clickonelement(pom.getpatipobugs().getseloff1());

		// sel pro

		// Clickonelement(pom.getpatipobugs().getseloff1());

		// selepro

		Clickonelement(pom.getpatipobugs().getselpro());

		// selepro
		Thread.sleep(3000);

		Clickonelement(pom.getpatipobugs().getselpro1());

		// Sele Time

		Clickonelement(pom.getpatipobugs().gettimeandd());

		// sele tim
		Thread.sleep(3000);

		Clickonelement(pom.getpatipobugs().gettimeandd1());

		// sele tim
		Thread.sleep(3000);

		sendkeys(pom.getpatipobugs().getenre(), "cold");

		try {
			// cli subm

			Clickonelement(pom.getpatipobugs().getsubbtn());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Schedule Appointment ");
		}

		// Thread.sleep(5000);
		Clickonelement(pom.getpatipobugs().getappcl());

		//

	}

	@Ignore

	@Test(priority = 5)

	public void Document() throws InterruptedException {
		// Login

//		sendkeys(pom.getpatipobugs().getenmai2(), "kamal3@tempr.email");
//
//		sendkeys(pom.getpatipobugs().getenpass(), "Test@123");
//
//		Clickonelement(pom.getpatipobugs().getlogbtn());

		// Sele Docume
		Thread.sleep(3000);
		Clickonelement(pom.getpatipobugs().getdocse());

//		// print sele
//		Thread.sleep(3000);
//
//		Clickonelement(pom.getpatipobugs().getthdo());
//
//		// print sele
//		Thread.sleep(3000);
//
//		Clickonelement(pom.getpatipobugs().getprisel());
//		try {
//			// print sele
//			Thread.sleep(3000);
//
//			sendkeys1(pom.getpatipobugs().getprisel(), Keys.ESCAPE);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			System.out.println("Print ");
//		}

		// sig do

		Thread.sleep(3000);
		Clickonelement(pom.getpatipobugs().getaldo());

		// sig do
		Thread.sleep(3000);
		Clickonelement(pom.getpatipobugs().getsigd());

		// sig do
		Thread.sleep(3000);
		Clickonelement(pom.getpatipobugs().getaldo());

		// re do

		Thread.sleep(3000);
		Clickonelement(pom.getpatipobugs().getinre());

		// sig do
		Thread.sleep(3000);
		Clickonelement(pom.getpatipobugs().getaldo());

		// re do

		Thread.sleep(3000);
		Clickonelement(pom.getpatipobugs().getnewdo());

	}

	@Ignore

	@Test(priority = 6)

	public void Healthprofile() throws InterruptedException {

		// Login

//		sendkeys(pom.getpatipobugs().getenmai2(), "kamal3@tempr.email");
//
//		sendkeys(pom.getpatipobugs().getenpass(), "Test@123");
//
//		Clickonelement(pom.getpatipobugs().getlogbtn());

		Thread.sleep(3000);
		Clickonelement(pom.getpatipobugs().gethealpro());

		try {
			// Problem
			Thread.sleep(3000);
			displayed(pom.getpatipobugs().getprobl());
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			System.out.println("Problem Is Displayed ");
		}

		// Aler
		Thread.sleep(3000);
		Clickonelement(pom.getpatipobugs().getseleale());

		Thread.sleep(3000);
		Clickonelement(pom.getpatipobugs().getseleale1());

		try {
			// ale
			Thread.sleep(3000);
			displayed(pom.getpatipobugs().getaler());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("Allergies Is Displayed");
		}

		// med
		Thread.sleep(3000);
		Clickonelement(pom.getpatipobugs().getmedse());

		Thread.sleep(3000);
		Clickonelement(pom.getpatipobugs().getmedse1());

		try {
			// al
			Thread.sleep(3000);
			displayed(pom.getpatipobugs().getmedica());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Medication Is Displayed");
		}
	}

	@Ignore
	@Test(priority = 7)

	public void Messenger() throws InterruptedException {

		// Login

//		sendkeys(pom.getpatipobugs().getenmai2(), "kamal3@tempr.email");
//
//		sendkeys(pom.getpatipobugs().getenpass(), "Test@123");
//
//		Clickonelement(pom.getpatipobugs().getlogbtn());

		// Click Messenger

		Thread.sleep(3000);
		Clickonelement(pom.getpatipobugs().getclimsg());

		// ser Pro
		Thread.sleep(3000);
		sendkeys(pom.getpatipobugs().getsearpro(), "mumbai");

		// sele

		Clickonelement(pom.getpatipobugs().getselepro());

		// sen tex

		sendkeys(pom.getpatipobugs().getwritex(), "hello");

		// cle
		clear(pom.getpatipobugs().getsearpro());

		sendkeys(pom.getpatipobugs().getsearpro(), "saheer");

		// sele pro
		Thread.sleep(3000);
		Clickonelement(pom.getpatipobugs().getsecpro());

	}

}
