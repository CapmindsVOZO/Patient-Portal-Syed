package com.myprofile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_Profile {

	public WebDriver driver;

	public My_Profile(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver2, this);

	}

	public WebDriver getDriver() {
		return driver;

	}

	@FindBy(xpath = "(//img[@id='wel_img-ext'])[1]")
	private WebElement existingclie;

	public WebElement getexistingclie() {
		return existingclie;

	}

	@FindBy(xpath = "(//input[@id='sig_emil-inp_ent'])[1]")
	private WebElement entermai;

	public WebElement getentermai() {
		return entermai;

	}

	@FindBy(xpath = "(//input[@id='log_mail-inp_adr'])[1]")
	private WebElement entermai1;

	public WebElement getentermai1() {
		return entermai1;

	}

	@FindBy(xpath = "(//input[@placeholder='Enter Email'])[1]")
	private WebElement forgotmail;

	public WebElement getforgotmail() {
		return forgotmail;

	}

	@FindBy(xpath = "//button[@id='sig_sub-btn_cnt']")
	private WebElement seleent;

	public WebElement getseleent() {
		return seleent;

	}

	@FindBy(xpath = "(//a[normalize-space()='Login'])[1]")
	private WebElement backlogin;

	public WebElement getbacklogin() {
		return backlogin;

	}

	@FindBy(xpath = "(//a[normalize-space()='Forgot Password?'])[1]")
	private WebElement forgotpass;

	public WebElement getforgotpass() {
		return forgotpass;

	}

	@FindBy(xpath = "(//input[@id='log_psw-inp_adr'])[1]")
	private WebElement enterpass;

	public WebElement getenterpass() {
		return enterpass;

	}

	@FindBy(xpath = "//button[@id='log_inp-btn_sbt']")
	private WebElement selelog;

	public WebElement getselelog() {
		return selelog;

	}

	@FindBy(xpath = "//*[@id='Patient_Portal']/div/div[2]/div[1]/div[2]/div[2]")
	private WebElement headmy;

	public WebElement getheadmy() {
		return headmy;

	}

	@FindBy(xpath = "(//div[@id='tpNav_prf-clk_mPrf'])[1]")
	private WebElement myprosel;

	public WebElement getmyprosel() {
		return myprosel;

	}

	@FindBy(xpath = "(//button[normalize-space()='Upload New Picture'])[1]")
	private WebElement uploadpic;

	public WebElement getuploadpic() {
		return uploadpic;

	}

	@FindBy(xpath = "(//button[@class='sc-ksZaOG kFyvtm save_active'][normalize-space()='Ok'])[2]")
	private WebElement pressok;

	public WebElement getpressok() {
		return pressok;

	}

	@FindBy(xpath = "(//button[normalize-space()='Save Picture'])[1]")
	private WebElement savepic;

	public WebElement getsavepic() {
		return savepic;

	}

	@FindBy(xpath = "(//input[@id='edPf_inp-fnm'])[1]")
	private WebElement firnam;

	public WebElement getfirnam() {
		return firnam;

	}

	@FindBy(xpath = "(//input[@id='fileInput'])[1]")
	private WebElement imageupload;

	public WebElement getimageupload() {
		return imageupload;

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

	@FindBy(xpath = "(//li[normalize-space()='Work'])[1]")
	private WebElement selepla;

	public WebElement getselepla() {
		return selepla;

	}

	@FindBy(xpath = "(//button[normalize-space()='Add Phone'])[1]")
	private WebElement addph;

	public WebElement getaddph() {
		return addph;

	}

	@FindBy(xpath = "(//input[@id='edPf_inp-phNm1'])[1]")
	private WebElement selephofirs;

	public WebElement getselephofirs() {
		return selephofirs;

	}

	@FindBy(xpath = "(//div[@class='sc-ciicml kvIaJb'][normalize-space()='Select'])[1]")
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

	@FindBy(xpath = "(//div[@class='sc-ciicml kvIaJb'])[4]")
	private WebElement selemailone;

	public WebElement getselemailone() {
		return selemailone;

	}

	@FindBy(xpath = "(//li[contains(text(),'Home')])[1]")
	private WebElement selemailone1;

	public WebElement getselemailone1() {
		return selemailone1;

	}

	@FindBy(xpath = "(//input[@class='sc-kjMGqw iNPiWB'])[1]")
	private WebElement entadd;

	public WebElement getentadd() {
		return entadd;

	}

	@FindBy(xpath = "(//input[@id='my_pf-inp_cty'])[1]")
	private WebElement cityen;

	public WebElement getcityen() {
		return cityen;

	}

	@FindBy(xpath = "(//div[@class='sc-jSMfEi pRHJE'])[1]")
	private WebElement stat;

	public WebElement getstat() {
		return stat;

	}

	@FindBy(xpath = "(//label[normalize-space()='Colorado'])[1]")
	private WebElement stat1;

	public WebElement getstat1() {
		return stat1;

	}

	@FindBy(xpath = "(//input[@id='my_pf-inp_zp'])[1]")
	private WebElement zipc;

	public WebElement getzipc() {
		return zipc;

	}

	@FindBy(xpath = "(//input[@id='date'])[1]")
	private WebElement dob;

	public WebElement getdob() {
		return dob;

	}

	@FindBy(xpath = "(//div[@id='my_pf-pat_sx'])[1]")
	private WebElement sexse;

	public WebElement getsexse() {
		return sexse;

	}

	@FindBy(xpath = "(//label[normalize-space()='Male'])[1]")
	private WebElement sexse1;

	public WebElement getsexse1() {
		return sexse1;

	}

	@FindBy(xpath = "(//div[@id='mypf_pat-mri_sta'])[1]")
	private WebElement marst;

	public WebElement getmarst() {
		return marst;

	}

	@FindBy(xpath = "(//label[normalize-space()='Domestic Partner'])[1]")
	private WebElement marst1;

	public WebElement getmarst1() {
		return marst1;

	}

	@FindBy(xpath = "(//div[@id='mypf_pat-lng'])[1]")
	private WebElement lansel;

	public WebElement getlansel() {
		return lansel;

	}

	@FindBy(xpath = "(//label[normalize-space()='Akan'])[1]")
	private WebElement lansel1;

	public WebElement getlansel1() {
		return lansel1;

	}

	@FindBy(xpath = "(//div[@id='mypf_pat-race'])[1]")
	private WebElement selera;

	public WebElement getselera() {
		return selera;

	}

	@FindBy(xpath = "(//label[normalize-space()='Black'])[1]")
	private WebElement selera1;

	public WebElement getselera1() {
		return selera1;

	}

	@FindBy(xpath = "(//div[@id='mypf_pat-ethn'])[1]")
	private WebElement ethsel;

	public WebElement getethsel() {
		return ethsel;

	}

	@FindBy(xpath = "(//label[normalize-space()='Not Hispanic or Latino'])[1]")
	private WebElement ethsel1;

	public WebElement getethsel1() {
		return ethsel1;

	}

	@FindBy(xpath = "//button[@id='edPr_btn-sv']")
	private WebElement selsa;

	public WebElement getselsa() {
		return selsa;

	}

	@FindBy(xpath = "(//img[@id='tp_nv-pst_ico'])[2]")
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

	@FindBy(xpath = "//*[@id='Patient_Portal']/div/div[2]/div[2]/div[2]/div[3]/img")
	private WebElement senmsg;

	public WebElement getsenmsg() {
		return senmsg;

	}

	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[7]")
	private WebElement searchmsg;

	public WebElement getsearchmsg() {
		return searchmsg;

	}

	@FindBy(xpath = "(//input[@placeholder='search'])[1]")
	private WebElement sendsearch;

	public WebElement getsendsearch() {
		return sendsearch;

	}

///////////// Document

	@FindBy(xpath = "(//span[normalize-space()='Documents'])[1]")

	private WebElement ClickDocument;

	public WebElement getClickDocument() {
		return ClickDocument;
	}

	@FindBy(xpath = "//*[@id='Patient_Portal']/div/div[2]/div[2]/div[2]/table/tbody/tr[1]/td[5]")

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

	@FindBy(xpath = "(//input[@type='file'])[1]")

	private WebElement ClickUploadDocufile;

	public WebElement getClickUploadDocufile() {
		return ClickUploadDocufile;
	}

	@FindBy(xpath = "(//button[normalize-space()='Upload File'])[1]")

	private WebElement uploadfile;

	public WebElement getuploadfile() {
		return uploadfile;
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

	@FindBy(xpath = "//*[@id='Patient_Portal']/div/div[2]/div[2]/div[1]/div/p[2]")

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

///////////////////////////////////////// Home Work /////////////////////////

	@FindBy(xpath = "(//label[normalize-space()='new'])[1]")
	private WebElement clickhome;

	public WebElement getclickhome() {
		return clickhome;

	}

	@FindBy(xpath = "(//img[@class='sc-dVMcbP kkkgEM'])[1]")
	private WebElement clickclose;

	public WebElement getclickclose1() {
		return clickclose;

	}

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

	//////////////// setting //////////

	@FindBy(xpath = "//span[contains(text(),'Settings')]")
	private WebElement settings;

	public WebElement getsettings() {
		return settings;

	}

	@FindBy(xpath = "//h6[contains(text(),'Change Password')]")
	private WebElement changepassword;

	public WebElement getchangepassword() {
		return changepassword;

	}

	@FindBy(xpath = "(//input[@type='password'])[1]")
	private WebElement currentpassword;

	public WebElement getcurrentpassword() {
		return currentpassword;

	}

	@FindBy(xpath = "(//input[@type='password'])[2]")
	private WebElement newpassword;

	public WebElement getnewpassword() {
		return newpassword;

	}

	@FindBy(xpath = "(//input[@type='password'])[3]")
	private WebElement confirmpassord;

	public WebElement getconfirmpassord() {
		return confirmpassord;

	}

	@FindBy(xpath = "(//input[@type='password'])[3]")
	private WebElement resetpassword;

	public WebElement getresetpassword() {
		return resetpassword;

	}
	
	@FindBy(xpath = "//h6[contains(text(),'Privacy Policy')]")
	private WebElement privacypolicy;

	public WebElement getprivacypolicy() {
		return privacypolicy;

	}

	@FindBy(xpath = "//h6[contains(text(),'Terms & Condition')]")
	private WebElement termsandcondition;

	public WebElement gettermsandcondition() {
		
		return termsandcondition;

	}
	
	@FindBy(xpath = "//h6[contains(text(),'Copyright')]")
	private WebElement copyright;

	public WebElement getcopyright() {
		
		return copyright;

	}

	@FindBy(xpath = "//h6[contains(text(),'Invite Others')]")
	private WebElement inviteothers;

	public WebElement getinviteothers() {
		
		return inviteothers;

	}
	
	@FindBy(xpath = "//h6[contains(text(),'Feedback')]")
	private WebElement feedback;

	public WebElement getfeedback() {
		
		return feedback;

	}
	
	@FindBy(xpath = "(//textarea[@placeholder='Write your comments here'])[1]")
	private WebElement comments;

	public WebElement getcomments() {
		
		return comments;

	}
	
	@FindBy(xpath = "(//button[normalize-space()='Submit Feedback'])[1]")
	private WebElement submitfeedback;

	public WebElement getsubmitfeedback() {
		
		return submitfeedback;

	}
	
}
