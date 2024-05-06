package com.Portal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pages {
	public WebDriver driver;

	@FindBy(id = "normal_login_username")

	private WebElement username;

	public Pages(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver2, this);

	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsername() {
		return username;
	}

	@FindBy(xpath = "(//img[@id='wel_img-ext'])[1]")

	private WebElement ClickExisting;

	public WebElement getClickExisting() {
		return ClickExisting;

	}

	@FindBy(xpath = "(//input[@id='sig_emil-inp_ent'])[1]")

	private WebElement EnterMailid;

	public WebElement getEnterMailid() {
		return EnterMailid;
	}

	@FindBy(xpath = "//button[@id='sig_sub-btn_cnt']")

	private WebElement ClickContinue;

	public WebElement getClickContinue() {
		return ClickContinue;
	}

	@FindBy(xpath = "(//input[@id='log_mail-inp_adr'])[1]")

	private WebElement EnterEmailId;

	public WebElement getEnterEmailId() {
		return EnterEmailId;
	}

	@FindBy(xpath = "(//input[@id='log_psw-inp_adr'])[1]")

	private WebElement EnterPassword;

	public WebElement getEnterPassword() {
		return EnterPassword;
	}

	@FindBy(xpath = "//button[@id='log_inp-btn_sbt']")

	private WebElement signinbtn;

	public WebElement getSigninbtn() {
		return signinbtn;
	}

////////////////////Dsahboard 
	@FindBy(xpath = "(//p[@class='sc-gKXOVf bNebaJ'])[1]")

	private WebElement canboo;

	public WebElement getcanboo() {
		return canboo;
	}

	@FindBy(xpath = "(//button[@class='sc-ksZaOG jGhjCd'])[1]")

	private WebElement reasca;

	public WebElement getreasca() {
		return reasca;
	}

	@FindBy(xpath = "(//textarea[@placeholder='Enter the Reason'])[1]")

	private WebElement reas;

	public WebElement getreas() {
		return reas;
	}

	@FindBy(xpath = "(//p[@id='dbrd_sch-p_mkApt'])[1]")

	private WebElement ClickMake;

	public WebElement getClickMake() {
		return ClickMake;
	}

	@FindBy(xpath = "(//input[@id='aptLst_napt-inp_ofc'])[1]")

	private WebElement selectOfice;

	public WebElement getselectOfice() {
		return selectOfice;
	}

	@FindBy(xpath = "(//div[normalize-space()='John Hospital'])[1]")

	private WebElement selectOfice1;

	public WebElement getselectOfice1() {
		return selectOfice1;
	}

	@FindBy(xpath = "(//input[@id='aptLst_napt-inp_prdr'])[1]")

	private WebElement selectProvider;

	public WebElement getselectProvider() {
		return selectProvider;
	}

	@FindBy(xpath = "//div[text()='Martin Edward']")

	private WebElement selectProvider1;

	public WebElement getselectProvider1() {
		return selectProvider1;
	}

	@FindBy(xpath = "(//input[@name='time'])[1]")

	private WebElement ClickTime;

	public WebElement getClickTime() {
		return ClickTime;
	}

	@FindBy(xpath = "//button[contains(text(),'10:30 am')]")

	private WebElement selectDate;

	public WebElement getselectDate() {
		return selectDate;
	}

	@FindBy(xpath = "(//button[normalize-space()='10:00 am'])[1]")

	private WebElement selectTime;

	public WebElement getselectTime() {
		return selectTime;
	}

	@FindBy(xpath = "(//textarea[@id='aptLst_napt-tare_rson'])[1]")

	private WebElement EnterReason;

	public WebElement getEnterReason() {
		return EnterReason;
	}

	@FindBy(xpath = "//button[@id='aptLst_napt-btn_smit']")

	private WebElement ClickSubmit;

	public WebElement getClickSubmit() {
		return ClickSubmit;
	}

	@FindBy(xpath = "//button[@class='sc-gpxMCN dqlvSW']//*[name()='svg']")

	private WebElement ClickDot;

	public WebElement getClickDot() {
		return ClickDot;
	}

	@FindBy(xpath = "//span[normalize-space()='Edit']")

	private WebElement ClickEdit;

	public WebElement getClickEdit() {
		return ClickEdit;
	}

	@FindBy(xpath = "//*[name()='path' and contains(@d,'M17 6h5v2h')]")

	private WebElement ClickDelete;

	public WebElement getClickDelete() {
		return ClickDelete;
	}

	@FindBy(xpath = "//body/div[@id='Patient_Portal']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/textarea[1]")

	private WebElement EnterReason1;

	public WebElement getEnterReason1() {
		return EnterReason1;
	}

	@FindBy(xpath = "//button[contains(text(),'Cancel')]")

	private WebElement ClickCancel;

	public WebElement getClickCancel() {
		return ClickCancel;
	}

	@FindBy(xpath = "(//span[normalize-space()='Dashboard'])[1]")

	private WebElement ClickDashboard;

	public WebElement getClickDashboard() {
		return ClickDashboard;
	}

	@FindBy(xpath = "(//p[@id='dbrd_adCrd-p_crdAdd'])[1]")

	private WebElement ClickAddCard;

	public WebElement getClickAddCard() {
		return ClickAddCard;
	}

	@FindBy(xpath = "(//input[@class='sc-gJwTLC cQjGJQ'])[1]")

	private WebElement EnterName;

	public WebElement getEnterName() {
		return EnterName;
	}

	@FindBy(xpath = "(//input[@id='bil_adCrd-inp_num'])[1]")

	private WebElement EnterNameCardNo;

	public WebElement getEnterNameCardNo() {
		return EnterNameCardNo;
	}

	@FindBy(xpath = "(//input[@id='bil_ad-inp_cvv'])[1]")

	private WebElement EnterCVV;

	public WebElement getEnterCVV() {
		return EnterCVV;
	}

	@FindBy(xpath = "(//input[@id='bil_ad-inp_mmyy'])[1]")

	private WebElement EnterMMYY;

	public WebElement getEnterMMYY() {
		return EnterMMYY;
	}

	@FindBy(xpath = "//button[@id='bil_ad-btn_crdSv']")

	private WebElement ClickSave;

	public WebElement getClickSave() {
		return ClickSave;
	}

	@FindBy(xpath = "(//*[name()='svg'][@id='dbrd_ad-crd_cls'])[1]")

	private WebElement clclo;

	public WebElement getclclo() {
		return clclo;
	}

	@FindBy(xpath = "(//*[name()='svg'][@id='dbrd_ad-crd_cls'])[1]")

	private WebElement ClickCancelc;

	public WebElement getClickCancelc() {
		return ClickCancelc;
	}

	@FindBy(xpath = "(//p[@id='dbrd_bovr-p_mkPay'])[1]")

	private WebElement ClickMakePay;

	public WebElement getClickMakePay() {
		return ClickMakePay;
	}

	@FindBy(xpath = "//button[@id='dbrd_mkPay-btn_pyNw']")

	private WebElement ClickMPaynow;

	public WebElement getClickMPaynow() {
		return ClickMPaynow;
	}

	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[4]")

	private WebElement ClickClose;

	public WebElement getClickClose() {
		return ClickClose;
	}

///////////  Problems	

	@FindBy(xpath = "//div[contains(text(),'Problems')]")

	private WebElement ClickProblems;

	public WebElement getClickProblems() {
		return ClickProblems;
	}

	@FindBy(xpath = "//div[contains(text(),'Problems')]")

	private WebElement TextProblems;

	public WebElement getTextProblems() {
		return TextProblems;
	}

	@FindBy(xpath = "//div[contains(text(),'Allergies')]")

	private WebElement ClickAllergies;

	public WebElement getClickAllergies() {
		return ClickAllergies;
	}

	@FindBy(xpath = "//div[contains(text(),'Allergies')]")
	private WebElement TextAllergies;

	public WebElement getTextAllergies() {
		return TextAllergies;
	}

	@FindBy(xpath = "//div[contains(text(),'Lab')]")

	private WebElement ClickLab;

	public WebElement getClickLab() {
		return ClickLab;
	}

	@FindBy(xpath = "//div[contains(text(),'Lab')]")

	private WebElement TextLab;

	public WebElement getTextLab() {
		return TextLab;
	}

	@FindBy(xpath = "//*[@id='Patient_Portal']/div/div[2]/div[2]/div[2]/div/div[10]/div[1]/button")

	private WebElement ClickViewAll;

	public WebElement getClickViewAll() {
		return ClickViewAll;
	}

	@FindBy(xpath = "//*[@id='Patient_Portal']/div/div[2]/div[2]/div[2]/div/div[11]/div/button")

	private WebElement ClickMViewAll;

	public WebElement getClickMViewAll() {
		return ClickMViewAll;
	}

	@FindBy(xpath = "//body/div[@id='Patient_Portal']/div[1]/div[2]/div[2]/div[2]/div[1]/div[11]/div[1]/button[1]")

	private WebElement TextViewAll;

	public WebElement getTextViewAll() {
		return TextViewAll;
	}

	@FindBy(xpath = "(//span[normalize-space()='Appointment'])[1]")

	private WebElement ClickAppointment1;

	public WebElement getClickAppointment1() {
		return ClickAppointment1;
	}

	@FindBy(xpath = "(//p[@id='apt_pst-sch'])[1]")

	private WebElement ClickSCAppointment1;

	public WebElement getClickSCAppointment1() {
		return ClickSCAppointment1;
	}

////////////////////// Billing////////////////

	@FindBy(xpath = "(//span[@id='nav_lnk-spn_bil'])[1]")

	private WebElement ClickBilling;

	public WebElement getClickBilling() {
		return ClickBilling;
	}

	@FindBy(xpath = "(//div[@class='sc-fytwQQ jwQPrW'])[1]")

	private WebElement ClickAddCards;

	public WebElement getClickAddCards() {
		return ClickAddCards;
	}

	@FindBy(xpath = "(//input[@class='sc-gJwTLC cQjGJQ'])[1]")

	private WebElement EnterNAME;

	public WebElement getEnterNAME() {
		return EnterNAME;
	}

	@FindBy(xpath = "(//input[@id='bil_adCrd-inp_num'])[1]")

	private WebElement EnterNameCardNo1;

	public WebElement getEnterNameCardNo1() {
		return EnterNameCardNo1;
	}

	@FindBy(xpath = "(//input[@id='bil_ad-inp_cvv'])[1]")

	private WebElement EnterCVV1;

	public WebElement getEnterCVV1() {
		return EnterCVV1;
	}

	@FindBy(xpath = "(//input[@id='bil_ad-inp_mmyy'])[1]")

	private WebElement EnterMMYY1;

	public WebElement getEnterMMYY1() {
		return EnterMMYY1;
	}

	@FindBy(xpath = "//button[normalize-space()='View']")

	private WebElement ClickView;

	public WebElement getClickView() {
		return ClickView;
	}

	@FindBy(xpath = "//body/div[@id='Patient_Portal']/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/*[1]")

	private WebElement ClickDownload;

	public WebElement getClickDownload() {
		return ClickDownload;
	}

	@FindBy(xpath = "//div[@class='sc-jSMfEi fjVgCQ']//*[name()='svg']//*[name()='path' and contains(@d,'M1.293 1.2')]")

	private WebElement ClickCancel1;

	public WebElement getClickCancel1() {
		return ClickCancel1;
	}

	@FindBy(xpath = "//tbody/tr[1]/td[5]/div[1]/button[2]")

	private WebElement ClickPay;

	public WebElement getClickPay() {
		return ClickPay;
	}

	@FindBy(xpath = "//div[contains(text(),'Payment History')]")

	private WebElement ClickPayment;

	public WebElement getClickPayment() {
		return ClickPayment;
	}

///////////// Document

	@FindBy(xpath = "(//span[normalize-space()='Documents'])[1]")

	private WebElement ClickDocument;

	public WebElement getClickDocument() {
		return ClickDocument;
	}

	@FindBy(xpath = "//tbody/tr[1]/td[5]//*[name()='svg']")

	private WebElement ClickDot1;

	public WebElement getClickDot1() {
		return ClickDot1;
	}

	@FindBy(xpath = "//img[@class='sc-breuTD dFBhus']")

	private WebElement ClickSign;

	public WebElement getClickSign() {
		return ClickSign;
	}

	@FindBy(xpath = "//input[@type='text']")

	private WebElement EnterNamee;

	public WebElement getEnterNamee() {
		return EnterNamee;
	}

	@FindBy(xpath = "//button[normalize-space()='Cancel']")

	private WebElement Clickcancel1;

	public WebElement getClickcancel1() {
		return Clickcancel1;
	}

	@FindBy(xpath = "//button[normalize-space()='Save']")

	private WebElement ClickSave1;

	public WebElement getClickSave1() {
		return ClickSave1;
	}

	@FindBy(xpath = "//button[normalize-space()='Upload Document']")

	private WebElement ClickUploadDocu;

	public WebElement getClickUploadDocu() {
		return ClickUploadDocu;
	}

	@FindBy(xpath = "//div[@class='sc-jSMfEi cwsiMz']//*[name()='svg']")

	private WebElement Clickclose;

	public WebElement getClickclose() {
		return Clickclose;
	}

	@FindBy(xpath = "(//div[text()='Print'])[1]")

	private WebElement ClickPrint;

	public WebElement getClickPrint() {
		return ClickPrint;
	}

	@FindBy(xpath = "//button[contains(text(),'Cancel')]")

	private WebElement ClickCancel2;

	public WebElement getClickCancel2() {
		return ClickCancel2;
	}

	@FindBy(xpath = "(//div[@class='sc-bjjCGC flsWpI'][normalize-space()='Download'])[1]")

	private WebElement ClickDownload1;

	public WebElement getClickDownload1() {
		return ClickDownload1;
	}

	@FindBy(xpath = "(//div[text()='Delete'])[1]")

	private WebElement ClickDelete1;

	public WebElement getClickDelete1() {
		return ClickDelete1;
	}

	@FindBy(xpath = "//p[@class='sc-gKXOVf kOriBl']//*[name()='svg']")

	private WebElement ClickDDc;

	public WebElement getClickDDc() {
		return ClickDDc;
	}

	@FindBy(xpath = "(//div[@id='doc_dd-li_snd'])[1]")

	private WebElement signdo;

	public WebElement getsigndo() {
		return signdo;
	}

	@FindBy(xpath = "(//div[text()='Signed Documents'])")

	private WebElement SelectAllDoc;

	public WebElement getSelectAllDoc() {
		return SelectAllDoc;
	}

	@FindBy(xpath = "(//div[@id='doc_dd-li_usnd'])[1]")

	private WebElement SelectUnsigned;

	public WebElement getSelectUnsigned() {
		return SelectUnsigned;
	}

	@FindBy(xpath = "(//div[@id='doc_dd-li_rvw'])[1]")

	private WebElement SelectReviewDoc;

	public WebElement getSelectReviewDoc() {
		return SelectReviewDoc;
	}

/////////////////	HealthProfile

	@FindBy(xpath = "(//span[@id='nav_lnk-spn_hltpr'])[1]")

	private WebElement ClickHealth;

	public WebElement getClickHealth() {
		return ClickHealth;
	}

	@FindBy(xpath = "//body/div[@id='Patient_Portal']/div[1]/div[2]/div[2]/h4[1]/div[1]/*[1]")

	private WebElement ClickDD;

	public WebElement getClickDD() {
		return ClickDD;
	}

	@FindBy(xpath = "(//li[@id='hltpr_li-hpl0'])[1]")

	private WebElement ClickProblem;

	public WebElement getClickProblem() {
		return ClickProblem;
	}

	@FindBy(xpath = "(//li[@id='hltpr_li-hpl1'])[1]")

	private WebElement ClickAllergie;

	public WebElement getClickAllergie() {
		return ClickAllergie;
	}

	@FindBy(xpath = "(//li[@id='hltpr_li-hpl2'])[1]")

	private WebElement ClickLabOrders;

	public WebElement getClickLabOrders() {
		return ClickLabOrders;
	}

	@FindBy(xpath = "(//li[@id='hltpr_li-hpl3'])[1]")

	private WebElement ClickMedication;

	public WebElement getClickMedication() {
		return ClickMedication;
	}
	
	/////////// My Profile/////

	@FindBy(xpath = "(//div[@class='sc-duzrYq dQQGfR'])[1]")
	private WebElement headmy;

	public WebElement getheadmy() {
		return headmy;

	}

	@FindBy(xpath = "(//div[@id='tpNav_prf-clk_mPrf'])[1]")
	private WebElement myprosel;

	public WebElement getmyprosel() {
		return myprosel;

	}

	@FindBy(xpath = "(//input[@id='edPf_inp-fnm'])[1]")
	private WebElement firnam;

	public WebElement getfirnam() {
		return firnam;

	}

	@FindBy(xpath = "(//input[@id='edPf_inp-mdnm'])[1]")
	private WebElement midnam;

	public WebElement getmidnam() {
		return midnam;

	}

	@FindBy(xpath = "(//input[@id='edPf_inp-lstnm'])[1]")
	private WebElement lasnam;

	public WebElement getlasnam() {
		return lasnam;

	}

	@FindBy(xpath = "(//input[@id='edPf_inp-sfx'])[1]")
	private WebElement suf;

	public WebElement getsuf() {
		return suf;

	}

	@FindBy(xpath = "(//input[@id='edPf_inp-ssvl'])[1]")
	private WebElement seless;

	public WebElement getseless() {
		return seless;

	}

	@FindBy(xpath = "(//input[@id='edPf_inp-phNm0'])[1]")
	private WebElement selepho;

	public WebElement getselepho() {
		return selepho;

	}

	@FindBy(xpath = "(//select[@id='edPf_inp-ph_typ0'])[1]")
	private WebElement selepla;

	public WebElement getselepla() {
		return selepla;

	}

	@FindBy(xpath = "//button[@id='edPf_btn-adPh']")
	private WebElement addph;

	public WebElement getaddph() {
		return addph;

	}

	@FindBy(xpath = "(//input[@id='edPf_inp-phNm1'])[1]")
	private WebElement selephofirs;

	public WebElement getselephofirs() {
		return selephofirs;

	}

	@FindBy(xpath = "(//select[@id='edPf_inp-ph_typ1'])[1]")
	private WebElement selepla1;

	public WebElement getselepla1() {
		return selepla1;

	}

	@FindBy(xpath = "//button[@id='edPf_btn-add_emil']")
	private WebElement adenmai;

	public WebElement getadenmai() {
		return adenmai;

	}

	@FindBy(xpath = "(//input[@id='email edPf_inp-mail_id0'])[1]")
	private WebElement enmai;

	public WebElement getenmai() {
		return enmai;

	}

	@FindBy(xpath = "(//select[@id='edPf_inp-emil_typ0'])[1]")
	private WebElement selemail;

	public WebElement getselemail() {
		return selemail;

	}

	@FindBy(xpath = "(//input[@id='email edPf_inp-mail_id1'])[1]")
	private WebElement enmai1;

	public WebElement getenmai1() {
		return enmai1;

	}

	@FindBy(xpath = "(//select[@id='edPf_inp-emil_typ1'])[1]")
	private WebElement selemailone;

	public WebElement getselemailone() {
		return selemailone;

	}

	@FindBy(xpath = "(//input[@class='sc-bcnBk bePRPo'])[1]")
	private WebElement entadd;

	public WebElement getentadd() {
		return entadd;

	}

	@FindBy(xpath = "(//input[@id='my_pf-inp_cty'])[1]")
	private WebElement cityen;

	public WebElement getcityen() {
		return cityen;

	}

	@FindBy(xpath = "(//input[@id='my_pf-inp_sta'])[1]")
	private WebElement stat;

	public WebElement getstat() {
		return stat;

	}

	@FindBy(xpath = "(//input[@id='my_pf-inp_zp'])[1]")
	private WebElement zipc;

	public WebElement getzipc() {
		return zipc;

	}

	@FindBy(xpath = "(//input[@id='my_pf-pat_dob'])[1]")
	private WebElement dob;

	public WebElement getdob() {
		return dob;

	}

	@FindBy(xpath = "(//select[@id='my_pf-pat_sx'])[1]")
	private WebElement sexse;

	public WebElement getsexse() {
		return sexse;

	}

	@FindBy(xpath = "(//select[@id='mypf_pat-mri_sta'])[1]")
	private WebElement marst;

	public WebElement getmarst() {
		return marst;

	}

	@FindBy(xpath = "(//select[@id='mypf_pat-lng'])[1]")
	private WebElement lansel;

	public WebElement getlansel() {
		return lansel;

	}

	@FindBy(xpath = "(//select[@id='mypf_pat-race'])[1]")
	private WebElement selera;

	public WebElement getselera() {
		return selera;

	}

	@FindBy(xpath = "(//select[@id='mypf_pat-ethn'])[1]")
	private WebElement ethsel;

	public WebElement getethsel() {
		return ethsel;

	}

	@FindBy(xpath = "//button[@id='edPr_btn-sv']")
	private WebElement selsa;

	public WebElement getselsa() {
		return selsa;

	}

	@FindBy(xpath = "(//img[@id='tp_nv-pst_ico'])[1]")
	private WebElement messsel;

	public WebElement getmesssel() {
		return messsel;

	}

	@FindBy(xpath = "(//input[@id='msg_inp-srch'])[1]")
	private WebElement sermes;

	public WebElement getsermes() {
		return sermes;

	}

	@FindBy(xpath = "(//p[@id='msg_cht-p_prvd0'])[1]")
	private WebElement selpro;

	public WebElement getselpro() {
		return selpro;

	}

	@FindBy(xpath = "(//input[@id='msg_inp-typMsg'])[1]")
	private WebElement typmsg;

	public WebElement gettypmsg() {
		return typmsg;

	}

	@FindBy(xpath = "(//*[name()='svg'][@class='sc-caiQmJ fZDRAg'])[1]")
	private WebElement cliat;

	public WebElement getcliat() {
		return cliat;

	}

	@FindBy(xpath = "(//img[@class='sc-iNFqmR hHTKfd'])[1]")
	private WebElement senmsg;

	public WebElement getsenmsg() {
		return senmsg;

	}

	///////////////////////////////////////// Home Work /////////////////////////

	@FindBy(xpath = "(//span[normalize-space()='HomeWork'])[1]")
	private WebElement cliho;

	public WebElement getclihomework() {
		return cliho;

	}
	
	@FindBy(xpath = "(//input[@placeholder='search'])[1]")
	private WebElement serachtitle;

	public WebElement getserachtitle() {
		return serachtitle;

	}
	
	@FindBy(xpath = "(//label[normalize-space()='List'])[1]")
	private WebElement clciklist;

	public WebElement getclciklist() {
		return clciklist;

	}
	
	@FindBy(xpath = "(//label[normalize-space()='Grid'])[1]")
	private WebElement clickgrid;

	public WebElement getclickgrid() {
		return clickgrid;

	}

}
