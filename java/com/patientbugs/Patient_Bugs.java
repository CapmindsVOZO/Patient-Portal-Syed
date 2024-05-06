package com.patientbugs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Patient_Bugs {
	public WebDriver driver;

	public Patient_Bugs(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver2, this);

	}

	public WebDriver getDriver() {
		return driver;

	}

	@FindBy(xpath = "(//h5[contains(text(),'I’M A NEW CLIENT')])[1]")
	private WebElement newcli;

	public WebElement getnewcli() {
		return newcli;

	}

	@FindBy(xpath = "(//img[@alt='Email Verified'])[1]")
	private WebElement lodi;

	public WebElement getlodi() {
		return lodi;

	}

	@FindBy(xpath = "(//input[@placeholder='Enter Email'])[1]")
	private WebElement enmai;

	public WebElement getenmai() {
		return enmai;

	}

	@FindBy(xpath = "(//button[@id='sig_sub-btn_cnt'])[1]")
	private WebElement precon;

	public WebElement getprecon() {
		return precon;

	}

	@FindBy(xpath = "(//input[@class='sc-jOrMOR llZsTn'])[1]")
	private WebElement otpse;

	public WebElement getotpse() {
		return otpse;

	}

	@FindBy(xpath = "(//span[@class='sc-BeQoi jHBgii'])[1]")
	private WebElement resendbtn;

	public WebElement getresendbtn() {
		return resendbtn;

	}

	@FindBy(xpath = "(//h5[normalize-space()='EXISTING CLIENT'])[1]")
	private WebElement exicli;

	public WebElement getexicli() {
		return exicli;

	}
	
	@FindBy(xpath = "(//input[@placeholder='Enter Email'])[1]")
	private WebElement enmain;

	public WebElement getenmain() {
		return enmain;

	}
	
	@FindBy(xpath = "(//button[@id='sig_sub-btn_cnt'])[1]")
	private WebElement clcom;

	public WebElement getclcom() {
		return clcom;

	}
	@FindBy(xpath = "(//a[@class='sc-fnykZs cGCDRj'])[1]")
	private WebElement rebtn;

	public WebElement getrebtn() {
		return rebtn;

	}

	@FindBy(xpath = "(//input[@placeholder='Enter Email'])[1]")
	private WebElement enmai1;

	public WebElement getenmai1() {
		return enmai1;

	}

	@FindBy(xpath = "(//input[@id='log_mail-inp_adr'])[1]")
	private WebElement enmai2;

	public WebElement getenmai2() {
		return enmai2;

	}

	@FindBy(xpath = "(//input[@id='log_psw-inp_adr'])[1]")
	private WebElement enpass;

	public WebElement getenpass() {
		return enpass;

	}

	@FindBy(xpath = "(//button[normalize-space()='continue'])[1]")
	private WebElement precon1;

	public WebElement getprecon1() {
		return precon1;

	}

	@FindBy(xpath = "(//button[normalize-space()='Log in'])[1]")
	private WebElement logbtn;

	public WebElement getlogbtn() {
		return logbtn;

	}

	@FindBy(xpath = "(//label[@class='sc-ezWOiH bdVqLD'])[1]")
	private WebElement valpa;

	public WebElement getvalpa() {
		return valpa;

	}

	@FindBy(xpath = "(//label[@class='sc-ezWOiH bdVqLD'])[1]")
	private WebElement valmai;

	public WebElement getvalmai() {
		return valmai;

	}

	@FindBy(xpath = "(//div[@class='sc-jSMfEi jAizZO'])[1]")
	private WebElement proph;

	public WebElement getproph() {
		return proph;

	}

	@FindBy(xpath = "(//p[normalize-space()='Make a Payment'])[1]")
	private WebElement makpay;

	public WebElement getmakpay() {
		return makpay;

	}

	@FindBy(xpath = "(//button[normalize-space()='Pay Now'])[1]")
	private WebElement payn;

	public WebElement getpayn() {
		return payn;

	}

	@FindBy(xpath = "(//p[normalize-space()='Add Card'])[1]")
	private WebElement adca;

	public WebElement getadca() {
		return adca;

	}

	@FindBy(xpath = "(//input[@class='sc-gJwTLC cQjGJQ'])[1]")
	private WebElement carhol;

	public WebElement getcarhol() {
		return carhol;

	}

	@FindBy(xpath = "(//input[@class='sc-gJwTLC sc-fxvKuh cQjGJQ dKGrtl'])[1]")
	private WebElement carna;

	public WebElement getcarna() {
		return carna;

	}

	@FindBy(xpath = "(//input[@placeholder='CVV'])[1]")
	private WebElement cvvn;

	public WebElement getcvvn() {
		return cvvn;

	}

	@FindBy(xpath = "(//input[@placeholder='MM/YY'])[1]")
	private WebElement expnu;

	public WebElement getexpnu() {
		return expnu;

	}

	@FindBy(xpath = "(//button[normalize-space()='Save Card'])[1]")
	private WebElement savop;

	public WebElement getsavop() {
		return savop;

	}

	@FindBy(xpath = "(//div[@class='sc-fThYeS hqOpRh'])[1]")
	private WebElement clicar;

	public WebElement getclicar() {
		return clicar;

	}

	@FindBy(xpath = "(//span[@class='sc-hKdnnL iqewLn'])[1]")
	private WebElement clied;

	public WebElement getclied() {
		return clied;

	}

	@FindBy(xpath = "(//input[@class='sc-cuqtlR jthlJB'])[1]")
	private WebElement namde;

	public WebElement getnamde() {
		return namde;

	}

	@FindBy(xpath = "(//input[@class='sc-cuqtlR jthlJB'])[2]")
	private WebElement expd;

	public WebElement getexpd() {
		return expd;

	}

	@FindBy(xpath = "(//span[@class='sc-ikZpkk hRsZWX'])[1]")
	private WebElement radibtn;

	public WebElement getradibtn() {
		return radibtn;

	}

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	private WebElement savcar;

	public WebElement getsavcar() {
		return savcar;

	}

	@FindBy(xpath = "(//div[@class='sc-DdwlG gtGoQO'])[1]")
	private WebElement baccar;

	public WebElement getbaccar() {
		return baccar;

	}

	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[7]")
	private WebElement clicl;

	public WebElement getclicl() {
		return clicl;

	}

	@FindBy(xpath = "(//div[normalize-space()='Allergies'])[1]")
	private WebElement selal;

	public WebElement getselal() {
		return selal;

	}

	@FindBy(xpath = "(//div[normalize-space()='Lab'])[1]")
	private WebElement sella;

	public WebElement getsella() {
		return sella;

	}

	@FindBy(xpath = "(//span[normalize-space()='Appointment'])[1]")
	private WebElement appcl;

	public WebElement getappcl() {
		return appcl;

	}

	@FindBy(xpath = "(//p[@class='sc-gKXOVf jEbkKK'])[1]")
	private WebElement clisch;

	public WebElement getclisch() {
		return clisch;

	}

	@FindBy(xpath = "(//p[normalize-space()='Select Office'])[1]")
	private WebElement seloff;

	public WebElement getseloff() {

		return seloff;

	}

	@FindBy(xpath = "(//div[@name='office'])[1]")
	private WebElement seloff1;

	public WebElement getseloff1() {

		return seloff1;

	}

	@FindBy(xpath = "(//p[normalize-space()='Select Provider'])[1]")
	private WebElement selpro;

	public WebElement getselpro() {

		return selpro;

	}

	@FindBy(xpath = "(//div[@name='provider'])[1]")
	private WebElement selpro1;

	public WebElement getselpro1() {

		return selpro1;

	}

	@FindBy(xpath = "(//input[@name='time'])[1]")
	private WebElement timeandd;

	public WebElement gettimeandd() {

		return timeandd;

	}

	@FindBy(xpath = "(//button[normalize-space()='01:00 pm'])[1]")
	private WebElement timeandd1;

	public WebElement gettimeandd1() {

		return timeandd1;

	}

	@FindBy(xpath = "(//textarea[@placeholder='Enter reason'])[1]")
	private WebElement enre;

	public WebElement getenre() {

		return enre;

	}

	@FindBy(xpath = "(//button[normalize-space()='Submit'])[1]")
	private WebElement subbtn;

	public WebElement getsubbtn() {

		return subbtn;

	}
	
	@FindBy(xpath = "(//span[normalize-space()='Documents'])[1]")
	private WebElement docse;

	public WebElement getdocse() {

		return docse;

	}
	
	@FindBy(xpath = "//td[@class='sc-dmRaPn enXAcH']//*[name()='svg']")
	private WebElement thdo;

	public WebElement getthdo() {

		return thdo;

	}
	
	@FindBy(xpath = "//div[@class='sc-fbHdRr cSuaoy']//div[1]")
	private WebElement prisel;

	public WebElement getprisel() {

		return prisel;

	}
	
	@FindBy(xpath = "(//p[@class='sc-gKXOVf kOriBl'])[1]")
	private WebElement aldo;

	public WebElement getaldo() {

		return aldo;

	}
	
	@FindBy(xpath = "(//div[normalize-space()='Signed Documents'])[1]")
	private WebElement sigd;

	public WebElement getsigd() {

		return sigd;

	}
	
	@FindBy(xpath = "(//div[normalize-space()='In Review Dcouments'])[1]")
	private WebElement inre;

	public WebElement getinre() {

		return inre;

	}
	
	@FindBy(xpath = "//div[normalize-space()='New / UnSigned Documents']")
	private WebElement newdo;

	public WebElement getnewdo() {

		return newdo;

	}
	
	@FindBy(xpath = "(//span[normalize-space()='HealthProfile'])[1]")
	private WebElement healpro;

	public WebElement gethealpro() {

		return healpro;

	}
	
	@FindBy(xpath = "//table/tbody/tr/td[1]")
	private WebElement probl;

	public WebElement getprobl() {

		return probl;

	}
	

	@FindBy(xpath = "(//div[@class='sc-jFAmCJ ibrggA'])[1]")
	private WebElement seleale;

	public WebElement getseleale() {

		return seleale;

	}
	
	@FindBy(xpath = "(//li[normalize-space()='Allergies'])[1]")
	private WebElement seleale1;

	public WebElement getseleale1() {

		return seleale1;

	}
	
	@FindBy(xpath = "//table/tbody/tr/td[1]")
	private WebElement aler;

	public WebElement getaler() {

		return aler;

	}
	
	@FindBy(xpath = "(//div[@class='sc-jFAmCJ ibrggA'])[1]")
	private WebElement medse;

	public WebElement getmedse() {

		return medse;

	}
	
	@FindBy(xpath = "(//li[normalize-space()='Medication'])[1]")
	private WebElement medse1;

	public WebElement getmedse1() {

		return medse1;

	}
	
	@FindBy(xpath = "//table/tbody/tr/td[1]")
	private WebElement medica;

	public WebElement getmedica() {

		return medica;

	}
	
	@FindBy(xpath = "(//img[@class='sc-hKMtZM hrjMPk'])[1]")
	private WebElement climsg;

	public WebElement getclimsg() {

		return climsg;

	}
	
	@FindBy(xpath = "(//input[@placeholder='Search Provider'])[1]")
	private WebElement searpro;

	public WebElement getsearpro() {

		return searpro;

	}
	
	@FindBy(xpath = "(//p[@id='msg_cht-p_prvd0'])[1]")
	private WebElement selepro;

	public WebElement getselepro() {

		return selepro;

	}
	
	@FindBy(xpath = "(//input[@id='msg_inp-typMsg'])[1]")
	private WebElement writex;

	public WebElement getwritex() {

		return writex;

	}
	

	@FindBy(xpath = "(//p[@id='msg_cht-p_prvd0'])[1]")
	private WebElement secpro;

	public WebElement getsecpro() {

		return secpro;

	}
}
