package TestCase;

import java.util.UUID;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.Addrecipients;
import Pages.Alldocuments;
import Pages.Dashboard;
import Pages.DocumentsScenarios;
import Pages.Dragdrop;
import Pages.Entities;
import Pages.Login;
import Pages.RecevierSide;
import Pages.ReviewaNdSend;
import Pages.Signup;
import Pages.Templatespage;
import Pages.Uploaddocuments;
import TestBase.testCaseBase;

public class TestCases_Prudhvi extends testCaseBase {
	Login login;
	Alldocuments alldocuments;
	Uploaddocuments uploaddocuments;
	Addrecipients addrecipients;
	Dragdrop dragdrop;
	ReviewaNdSend reviewaNdSend;
	RecevierSide recevierSide;
	Signup signup;
	Templatespage templatespage;
	Dashboard dashboard;
	DocumentsScenarios documentsScenarios;
	Entities entities;
	RecevierSide receiverSide;
	Templatespage template;

	@BeforeMethod
	public void Start() throws InterruptedException {
		setup();
		login = new Login(driver);
		alldocuments = new Alldocuments(driver);
		uploaddocuments = new Uploaddocuments(driver);
		addrecipients = new Addrecipients(driver);
		dragdrop = new Dragdrop(driver);
		reviewaNdSend = new ReviewaNdSend(driver);
		recevierSide = new RecevierSide(driver);
		signup = new Signup(driver);
		templatespage = new Templatespage(driver);
		dashboard = new Dashboard(driver);
		documentsScenarios = new DocumentsScenarios(driver);
		entities = new Entities(driver);
		receiverSide = new RecevierSide(driver);
		template = new Templatespage(driver);
		login.SigninNSUI();
		login.VerifyLoginSucess();
	}
	
//	 3a,Blank Doc – Sender signer & Receiver signer (With enforcement)send document with uploading blank doc for Sender & Receiver (Complete through login from
//	 sender & Complete through from mail receiver)
	@Test(priority = 1)
	public void BlankDocWithEnforcement() throws Exception {
		UUID uuid = UUID.randomUUID();
		String doc = uuid.toString().replaceAll("-", "");
		documentsScenarios.autofilloff();
		documentsScenarios.DocScenario();
		documentsScenarios.Blankloginaccount(doc);
		documentsScenarios.Recipient(1, "Receiver", "jeevithapatnana200@outlook.com", " SIGNER ");
		documentsScenarios.Saveuser();
		documentsScenarios.SignatureAndFullNameFeilds();
		documentsScenarios.DradAndDropSigAndFullName(2, 10, -20, 10, 10);
		documentsScenarios.SubDocScenarios(doc);
		documentsScenarios.clickSubmit();
		documentsScenarios.Verifysubmit();
		documentsScenarios.Viewdocument();
		documentsScenarios.Blankwithoutsenderautofill();
		recevierSide.jeevithaOutlooklogin();
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & sign");
		recevierSide.signaturefill();
		recevierSide.clickFinish();
		recevierSide.VerifyDocCompleteReceiverEnd();
	}

	// yes
	// 3bsend document with uploading blank doc for Sender & Receiver(Complete
	// through
	// login from sender & Complete through from mail receiver & sender autofill
	// enabled)
	@Test(priority = 2)
	public void BlankDocWithEnforcementWithAutofill() throws Exception {
		UUID uuid = UUID.randomUUID();
		String doc = uuid.toString().replaceAll("-", "");
		documentsScenarios.autofillon();
		documentsScenarios.DocScenario();
		documentsScenarios.Blankloginaccount(doc);
		documentsScenarios.Recipient(1, "Receiver", "jeevithapatnana200@outlook.com", " SIGNER ");
		documentsScenarios.Saveuser();
		documentsScenarios.SignatureAndFullNameFeilds();
		documentsScenarios.DradAndDropSigAndFullName(2, 10, -20, 10, 10);
		documentsScenarios.SubDocScenarios(doc);
		documentsScenarios.clickSubmit();
		documentsScenarios.Verifysubmit();
		recevierSide.jeevithaOutlooklogin();
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & sign");
		recevierSide.signaturefill();
		recevierSide.clickFinish();
		recevierSide.VerifyDocCompleteReceiverEnd();
	}

	// yes
	// 3c
	@Test(priority = 3)
	public void BlankDocWithEnforcementWithoutAutofill() throws Exception {
		UUID uuid = UUID.randomUUID();
		String doc = uuid.toString().replaceAll("-", "");
		documentsScenarios.autofilloff();
		documentsScenarios.DocScenario();
		documentsScenarios.Blankloginaccount(doc);
		documentsScenarios.Recipient(1, "Receiver", "jeevithapatnana200@outlook.com", " SIGNER ");
		documentsScenarios.Saveuser();
		documentsScenarios.SignatureAndFullNameFeilds();
		documentsScenarios.DradAndDropSigAndFullName(2, 10, -20, 10, 10);
		documentsScenarios.SubDocScenarios(doc);
		documentsScenarios.clickSubmit();
		documentsScenarios.Verifysubmit();
		documentsScenarios.Viewdocument();
		documentsScenarios.Blankwithoutsenderautofill();
		recevierSide.jeevithaOutlooklogin();
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & sign");
		recevierSide.signaturefill();
		recevierSide.clickFinish();
		recevierSide.VerifyDocCompleteReceiverEnd();
	}

	// yes
	// 4a
	// Blank Doc – Sender signer & Receiver signer (With enforcement)send document
	// with uploading blank doc for Sender & Receiver (Complete through login from
	// sender & Complete through from mail receiver)
	@Test(priority = 4)
	public void BlankDocWithtEnforcement() throws Exception {
		UUID uuid = UUID.randomUUID();
		String doc = uuid.toString().replaceAll("-", "");
		documentsScenarios.autofilloff();
		documentsScenarios.DocScenario();
		documentsScenarios.Blankloginaccount(doc);
		documentsScenarios.Recipient(1, "Receiver", "jeevithapatnana200@outlook.com", " SIGNER ");
		documentsScenarios.Signorder();
		documentsScenarios.Saveuser();
		documentsScenarios.SignatureAndFullNameFeilds();
		documentsScenarios.DradAndDropSigAndFullName(2, 10, -20, 10, 10);
		documentsScenarios.SubDocScenarios(doc);
		documentsScenarios.clickSubmit();
		documentsScenarios.Verifysubmit();
		documentsScenarios.Viewdocument();
		documentsScenarios.Blankwithoutsenderautofill();
		recevierSide.jeevithaOutlooklogin();
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & sign");
		recevierSide.signaturefill();
		recevierSide.clickFinish();
		recevierSide.VerifyDocCompleteReceiverEnd();
	}

	// yes
	// 4b
	// send document with uploading blank doc for Sender & Receiver(Complete through
	// login from sender & Complete through from mail receiver & sender autofill
	// enabled)
	@Test(priority = 5)
	public void BlankDocWithoEnforcementWithAutofill() throws Exception {
		UUID uuid = UUID.randomUUID();
		String doc = uuid.toString().replaceAll("-", "");
		documentsScenarios.autofillon();
		documentsScenarios.DocScenario();
		documentsScenarios.Blankloginaccount(doc);
		documentsScenarios.Recipient(1, "Receiver", "jeevithapatnana200@outlook.com", " SIGNER ");
		documentsScenarios.Signorder();
		documentsScenarios.Saveuser();
		documentsScenarios.SignatureAndFullNameFeilds();
		documentsScenarios.DradAndDropSigAndFullName(2, 10, -20, 10, 10);
		documentsScenarios.SubDocScenarios(doc);
		documentsScenarios.clickSubmit();
		recevierSide.jeevithaOutlooklogin();
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & sign");
		recevierSide.signaturefill();
		recevierSide.clickFinish();
		recevierSide.VerifyDocCompleteReceiverEnd();
	}

	// 6yes
	// 4c
	@Test(priority = 6)
	public void BlankDocWithoutEnforcementWithoutAutofill() throws Exception {
		UUID uuid = UUID.randomUUID();
		String doc = uuid.toString().replaceAll("-", "");
		documentsScenarios.autofilloff();
		documentsScenarios.DocScenario();
		documentsScenarios.Blankloginaccount(doc);
		documentsScenarios.Recipient(1, "Receiver", "jeevithapatnana200@outlook.com", " SIGNER ");
		documentsScenarios.Signorder();
		documentsScenarios.Saveuser();
		documentsScenarios.SignatureAndFullNameFeilds();
		documentsScenarios.DradAndDropSigAndFullName(2, 10, -20, 10, 10);
		documentsScenarios.SubDocScenarios(doc);
		documentsScenarios.clickSubmit();
		documentsScenarios.Verifysubmit();
		documentsScenarios.Viewdocument();
		documentsScenarios.Blankwithoutsenderautofill();
		recevierSide.jeevithaOutlooklogin();
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & sign");
		recevierSide.signaturefill();
		recevierSide.clickFinish();
		recevierSide.VerifyDocCompleteReceiverEnd();
	}

	// 5a
	@Test(priority = 7)
	public void uploadpdfFile() throws Exception {
		String pdffile = System.getProperty("user.dir") + "/src/test/resources/TESTING.pdf";
		documentsScenarios.DocScenario();
		documentsScenarios.uploadFileWithSendKeys(pdffile);
		documentsScenarios.nextButton();
		documentsScenarios.VerifyFileUploadSucess();
	}

	@Test(priority = 8)
	public void uploadDoc() throws Exception {
		String Wordfile = System.getProperty("user.dir") + "/src/test/resources/TestCases.docx";
		documentsScenarios.DocScenario();
		documentsScenarios.uploadFileWithSendKeys(Wordfile);
		documentsScenarios.nextButton();
		documentsScenarios.VerifyFileUploadSucess();
	}

	@Test(priority = 9)
	public void uploadPNG() throws Exception {
		String PNGfile = System.getProperty("user.dir") + "/src/test/resources/png.png";
		documentsScenarios.DocScenario();
		documentsScenarios.uploadFileWithSendKeys(PNGfile);
		documentsScenarios.nextButton();
		documentsScenarios.VerifyFileUploadSucess();
	}

	@Test(priority = 10)
	public void uploadjpg() throws Exception {
		String jpgfile = System.getProperty("user.dir") +"/src/test/resources/jpg.jpg";
		documentsScenarios.DocScenario();
		documentsScenarios.uploadFileWithSendKeys(jpgfile);
		documentsScenarios.nextButton();
		documentsScenarios.VerifyFileUploadSucess();
	}

	@Test(priority = 11)
	public void uploadTXT() throws Exception {
		String txtfile = System.getProperty("user.dir") + "/src/test/resources/Documents scenarios.txt";
		documentsScenarios.DocScenario();
		documentsScenarios.uploadFileWithSendKeys(txtfile);
		documentsScenarios.nextButton();
		documentsScenarios.VerifyFileUploadSucess();
	}

	// When we upload combination of PDF & DOC files and click on next it needs to
	// navigate users page
	@Test(priority = 12)
	public void uploadPDFandDoc() throws Exception {
		String pdffile = System.getProperty("user.dir") + "src/test/resources/TESTING.pdf";
		String Wordfile = System.getProperty("user.dir") + "src/test/resources/TestCases.docx";
		documentsScenarios.DocScenario();
		documentsScenarios.uploadFileWithSendKeys(pdffile);
		documentsScenarios.uploadFileWithSendKeys(Wordfile);
		documentsScenarios.nextButton();
		documentsScenarios.VerifyFileUploadSucess();
	}

	// When we upload combination of DOC & DOC files and click on next it needs to
	// navigate users page
	@Test(priority = 13)
	public void uploadDocandDoc() throws Exception {
		String Wordfile = System.getProperty("user.dir") + "/src/test/resources/TestCases.docx";
		String Wordfile2 = System.getProperty("user.dir") + "/src/test/resources/Feautures.docx";
		documentsScenarios.DocScenario();
		documentsScenarios.uploadFileWithSendKeys(Wordfile);
		documentsScenarios.uploadFileWithSendKeys(Wordfile2);
		documentsScenarios.nextButton();
		documentsScenarios.VerifyFileUploadSucess();
	}

	// When we upload combination of DOC & TXT files and click on next it needs to
	// navigate users page
	@Test(priority = 14)
	public void uploadDOCandTXT() throws Exception {
		String txtfile = System.getProperty("user.dir") + "/src/test/resources/Documents scenarios.txt";
		String Wordfile = System.getProperty("user.dir") + "/src/test/resources/TestCases.docx";
		documentsScenarios.DocScenario();
		documentsScenarios.uploadFileWithSendKeys(Wordfile);
		documentsScenarios.uploadFileWithSendKeys(txtfile);
		documentsScenarios.nextButton();
		documentsScenarios.VerifyFileUploadSucess();
	}

	// When we upload combination of PDF& PDF files and click on next it needs to
	// navigate users page
	@Test(priority = 15)
	public void uploadPDFandPDF() throws Exception {
		String pdffile = System.getProperty("user.dir") + "/src/test/resources/TESTING.pdf";
		String pdffile2 = System.getProperty("user.dir") + "/src/test/resources/Test.pdf";
		documentsScenarios.DocScenario();
		documentsScenarios.uploadFileWithSendKeys(pdffile);
		documentsScenarios.uploadFileWithSendKeys(pdffile2);
		documentsScenarios.nextButton();
		documentsScenarios.VerifyFileUploadSucess();
	}

	// When we upload combination of PDF & TXT files and click on next it needs to
	// navigate users page
	@Test(priority = 16)
	public void uploadPDFandTXT() throws Exception {
		String pdffile = System.getProperty("user.dir") + "/src/test/resources/TESTING.pdf";
		String txtfile = System.getProperty("user.dir") + "/src/test/resources/Documents scenarios.txt";
		documentsScenarios.DocScenario();
		documentsScenarios.uploadFileWithSendKeys(pdffile);
		documentsScenarios.uploadFileWithSendKeys(txtfile);
		documentsScenarios.nextButton();
		documentsScenarios.VerifyFileUploadSucess();
	}

	// When we upload combination of DOC & PNG files and click on next it needs to
	// navigate users page
	@Test(priority = 17)
	public void uploadDOCandPNG() throws Exception {
		String Wordfile = System.getProperty("user.dir") + "/src/test/resources/TestCases.docx";
		String PNGfile = System.getProperty("user.dir") + "\\src\\test\\resources\\png.png";
		documentsScenarios.DocScenario();
		documentsScenarios.uploadFileWithSendKeys(Wordfile);
		documentsScenarios.uploadFileWithSendKeys(PNGfile);
//		documentsScenarios.nextButton();
//		documentsScenarios.VerifyFileUploadSucess();
	}

	// When we upload combination of PDF & DOC files and click on next it needs to
	// navigate users page
	@Test(priority = 18)
	public void uploadPDFandDOC() throws Exception {
		String pdffile = System.getProperty("user.dir") + "/src/test/resources/TESTING.pdf";
		String Wordfile = System.getProperty("user.dir") + "/src/test/resources/TestCases.docx";
		documentsScenarios.DocScenario();
		documentsScenarios.uploadFileWithSendKeys(pdffile);
		documentsScenarios.uploadFileWithSendKeys(Wordfile);
		documentsScenarios.nextButton();
		documentsScenarios.VerifyFileUploadSucess();
	}

	// When we upload combination of DOC & JPG files and click on next it needs to
	// navigate users page
	@Test(priority = 19)
	public void uploadDOCandJPG() throws Exception {
		String Wordfile = System.getProperty("user.dir") + "/src/test/resources/TestCases.docx";
		String jpgfile = System.getProperty("user.dir") + "/src/test/resources/jpg.jpg";
		documentsScenarios.DocScenario();
		documentsScenarios.uploadFileWithSendKeys(Wordfile);
		documentsScenarios.uploadFileWithSendKeys(jpgfile);
		documentsScenarios.nextButton();
		documentsScenarios.VerifyFileUploadSucess();
	}

	// When we upload combination of PDF & JPG files and click on next it needs to
	// navigate users page
	@Test(priority = 20)
	public void uploadPDFandJPG() throws Exception {
		String pdffile = System.getProperty("user.dir") + "/src/test/resources/TESTING.pdf";
		String jpgfile = System.getProperty("user.dir") + "/src/test/resources/jpg.jpg";
		documentsScenarios.DocScenario();
		documentsScenarios.uploadFileWithSendKeys(pdffile);
		documentsScenarios.uploadFileWithSendKeys(jpgfile);
		documentsScenarios.nextButton();
		documentsScenarios.VerifyFileUploadSucess();
	}
//	@Test//hold
//	public void ValidDocScenarios() throws Exception {
//		String a=" DocScenarios sta... ";
//		documentsScenarios.autofilloff();
//		documentsScenarios.DocScenario();
//		documentsScenarios.Blankloginaccount(a);
//		documentsScenarios.RecipientSigner(1,"jeevithapatnana200@outlook.com"," SIGNER ");
//		documentsScenarios.Saveuser();
//		documentsScenarios.SignatureAndFullNameFeilds();
//		documentsScenarios.documentsScenarios.DradAndDropSigAndFullName(2,10,-20,10,10);
//		documentsScenarios.SubDocScenarios(a);
//		documentsScenarios.clickSubmit();
//		documentsScenarios.Verifysubmit();
//		documentsScenarios.Viewdocument();
//		documentsScenarios.Blankwithoutsenderautofill();
//		documentsScenarios.nsui();
//		documentsScenarios.clickLogout();
//		documentsScenarios.SigninNSUIJeevitha();
//		documentsScenarios.loginAccountDocumentClick();
//		recevierSide.signloginAccount();
//	}

//	// OneDrive-signerand CC WithOut
//	// EnforceSignatureOrderWithSenderAutofill-receiver Email Login
	@Test(priority = 21)
	public void ValidDocscenarioOnedrive() throws Exception {
		UUID uuid = UUID.randomUUID();
		String doc = uuid.toString().replaceAll("-", "");
		documentsScenarios.autofilloff();
		documentsScenarios.DocScenario();
		documentsScenarios.DocscenarioOnedrive();
		documentsScenarios.Recipient(1, "Receiver", "jeevithapatnana200@outlook.com", " SIGNER ");
		documentsScenarios.Recipient(2, "Receiver", "prudhvib200@outlook.com", " CC ");
		documentsScenarios.Signorder();
		documentsScenarios.Saveuser();
		documentsScenarios.SignatureAndFullNameFeilds();
		documentsScenarios.DradAndDropSigAndFullName(2, 10, -20, 10, 10);
		documentsScenarios.SubDocScenarios(doc);
		documentsScenarios.clickSubmit();
		documentsScenarios.Verifysubmit();
		documentsScenarios.Viewdocument();
		documentsScenarios.Blankwithoutsenderautofill();
		recevierSide.outlooksigninpage();
		recevierSide.switchEmail();
		recevierSide.jeevithaOutlookloginPage();
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & sign");
		recevierSide.signaturefill();
		recevierSide.clickFinish();
		recevierSide.Outlooklogin("prudhvib200@outlook.com", "Meghana@123");
		recevierSide.validateAtCCTwo();

	}

//GoogleDrive-signerand CC WithOut EnforceSignatureOrderWithSenderAutofill-receiver Email Login
	@Test(priority = 22)
	public void ValidDocscenariosGdrive() throws Exception {
		UUID uuid = UUID.randomUUID();
		String doc = uuid.toString().replaceAll("-", "");
		documentsScenarios.autofilloff();
		documentsScenarios.DocScenario();
		documentsScenarios.DocscenariosGdrive();
		documentsScenarios.Recipient(1, "Receiver", "jeevithapatnana200@outlook.com", "SIGNER");
		documentsScenarios.Recipient(2, "Receiver", "meghanan180894@outlook.com", "SIGNER");
		documentsScenarios.Recipient(3, "Receiver", "prudhvib200@outlook.com", "CC");
		documentsScenarios.Signorder();
		documentsScenarios.Saveuser();
		documentsScenarios.SignatureAndFullNameFeilds();
		documentsScenarios.DradAndDropSigAndFullName(2, 10, -20, 10, 10);
		documentsScenarios.DradAndDropSigAndFullName(3, 10, 60, 10, 90);
		documentsScenarios.SubDocScenarios(doc);
		documentsScenarios.clickSubmit();
		documentsScenarios.Verifysubmit();
		documentsScenarios.Viewdocument();
		documentsScenarios.Blankwithoutsenderautofill();
		recevierSide.jeevithaOutlooklogin();
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & sign");
		recevierSide.signaturefill();
		recevierSide.clickFinish();
		recevierSide.Outlooklogin("meghanan180894@outlook.com", "Meghana@123");
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & sign");
		recevierSide.signaturefill();
		recevierSide.clickFinish();
		recevierSide.Outlooklogin("prudhvib200@outlook.com", "Meghana@123");
		recevierSide.validateAtCCGdrive();

	}

	// Blankdoc-RearrangingOrderCCndSigner-Without enforce signature order & Without
	// sender autofill-receiver Email Login
	@Test(priority = 23)
	public void ValidRearrangingOrderCCndSigner() throws Exception {
		UUID uuid = UUID.randomUUID();
		String doc = uuid.toString().replaceAll("-", "");
		documentsScenarios.autofilloff();
		documentsScenarios.DocScenario();
		documentsScenarios.Blankloginaccount(doc);
		documentsScenarios.Recipient(1, "Receiver", "jeevithapatnana200@outlook.com", "SIGNER");
		documentsScenarios.Recipient(2, "Receiver", "meghanan180894@outlook.com", "SIGNER");
		documentsScenarios.Recipient(3, "Receiver", "prudhvib200@outlook.com", "CC");
		documentsScenarios.Rearranges(3, 1);
		documentsScenarios.Signorder();
		documentsScenarios.Saveuser();
		documentsScenarios.SignatureAndFullNameFeilds();
		documentsScenarios.DradAndDropSigAndFullName(3, 10, 60, 10, 90);
		documentsScenarios.DradAndDropSigAndFullName(4, 10, 130, 10, 160);
		documentsScenarios.SubDocScenarios(doc);
		documentsScenarios.clickSubmit();
		documentsScenarios.Verifysubmit();
		documentsScenarios.Viewdocument();
		documentsScenarios.Blankwithoutsenderautofill();
		recevierSide.jeevithaOutlooklogin();
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & sign");
		recevierSide.signaturefill();
		recevierSide.clickFinish();
		recevierSide.Outlooklogin("meghanan180894@outlook.com", "Meghana@123");
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & sign");
		recevierSide.signaturefill();
		recevierSide.clickFinish();
		recevierSide.Outlooklogin("prudhvib200@outlook.com", "Meghana@123");
		recevierSide.validateAtCC(doc);

	}

	// BlankDoc-MultipleSigners and cc-Without enforce signature order & Without
	// sender autofill-receiver Email Login
	@Test(priority = 24)
	public void ValidBlankDocMultipleSigners() throws Exception {
		UUID uuid = UUID.randomUUID();
		String doc = uuid.toString().replaceAll("-", "");
		documentsScenarios.autofilloff();
		documentsScenarios.DocScenario();
		documentsScenarios.Blankloginaccount(doc);
		documentsScenarios.Recipient(1, "Receiver", "jeevithapatnana200@outlook.com", "SIGNER");
		documentsScenarios.Recipient(2, "Receiver", "meghanan180894@outlook.com", "SIGNER");
		documentsScenarios.Recipient(3, "Receiver", "prudhvib200@outlook.com", "CC");
		documentsScenarios.Signorder();
		documentsScenarios.Saveuser();
		documentsScenarios.SignatureAndFullNameFeilds();
		documentsScenarios.DradAndDropSigAndFullName(2, 10, -20, 10, 10);
		documentsScenarios.DradAndDropSigAndFullName(3, 10, 60, 10, 90);
		documentsScenarios.SubDocScenarios(doc);
		documentsScenarios.clickSubmit();
		documentsScenarios.Verifysubmit();
		documentsScenarios.Viewdocument();
		documentsScenarios.Blankwithoutsenderautofill();
		recevierSide.jeevithaOutlooklogin();
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & sign");
		recevierSide.signaturefill();
		recevierSide.clickFinish();
		recevierSide.Outlooklogin("meghanan180894@outlook.com", "Meghana@123");
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & sign");
		recevierSide.signaturefill();
		recevierSide.clickFinish();
		recevierSide.VerifyDocCompleteReceiverEnd();

	}

//Onedrive-DocMultipleSigners-Without enforce signature order & Without sender autofill-receiver Email Login
	@Test(priority = 25)
	public void ValidOneDriveDocMultipleSigners() throws Exception {
		UUID uuid = UUID.randomUUID();
		String doc = uuid.toString().replaceAll("-", "");
		documentsScenarios.autofilloff();
		documentsScenarios.DocScenario();
		documentsScenarios.DocscenarioOnedrive();
		documentsScenarios.Recipient(1, "Receiver", "jeevithapatnana200@outlook.com", "SIGNER");
		documentsScenarios.Recipient(2, "Receiver", "meghanan180894@outlook.com", "SIGNER");
		documentsScenarios.Signorder();
		documentsScenarios.Saveuser();
		documentsScenarios.SignatureAndFullNameFeilds();
		documentsScenarios.DradAndDropSigAndFullName(2, 10, -20, 10, 10);
		documentsScenarios.DradAndDropSigAndFullName(3, 10, 60, 10, 90);
		documentsScenarios.SubDocScenarios(doc);
		documentsScenarios.clickSubmit();
		documentsScenarios.Verifysubmit();
		documentsScenarios.Viewdocument();
		documentsScenarios.Blankwithoutsenderautofill();
		recevierSide.outlooksigninpage();
		recevierSide.switchEmail();
		recevierSide.jeevithaOutlookloginPage();
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & sign");
		recevierSide.signaturefill();
		recevierSide.clickFinish();
		recevierSide.Outlooklogin("meghanan180894@outlook.com", "Meghana@123");
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & sign");
		recevierSide.signaturefill();
		recevierSide.clickFinish();
		recevierSide.VerifyDocCompleteReceiverEnd();

	}

	// BlankDoc-RearrangingOrderFirstOtherSignersndThenSender-Without enforce
	// signature order & Without sender autofill-receiver Email Login
	@Test(priority = 26)
	public void ValidRearrangingOrderFirstOtherSignersandThenSender() throws Exception {
		UUID uuid = UUID.randomUUID();
		String doc = uuid.toString().replaceAll("-", "");
		documentsScenarios.autofilloff();
		documentsScenarios.DocScenario();
		documentsScenarios.Blankloginaccount(doc);
		documentsScenarios.Recipient(1, "Receiver", "jeevithapatnana200@outlook.com", "SIGNER");
		documentsScenarios.Recipient(2, "Receiver", "meghanan180894@outlook.com", "SIGNER");
		documentsScenarios.Rearranges(0, 2);
		documentsScenarios.Signorder();
		documentsScenarios.Saveuser();
		documentsScenarios.SignatureAndFullNameFeilds();
		documentsScenarios.DradAndDropSigAndFullName(2, 10, -20, 10, 10);
		documentsScenarios.DradAndDropSigAndFullName(3, 10, 60, 10, 90);
		documentsScenarios.SubDocScenarios(doc);
		documentsScenarios.clickSubmit();
		documentsScenarios.Verifysubmit();
		documentsScenarios.Viewdocument();
		documentsScenarios.Blankwithoutsenderautofill();
		recevierSide.jeevithaOutlooklogin();
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & sign");
		recevierSide.signaturefill();
		recevierSide.clickFinish();
		recevierSide.Outlooklogin("meghanan180894@outlook.com", "Meghana@123");
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & sign");
		recevierSide.signaturefill();
		recevierSide.clickFinish();
		recevierSide.VerifyDocCompleteReceiverEnd();
	}

	// Onedrive-RearrangingOrderFirstOtherSignersndThenSenderOnedrive-Without
	// enforce signature order & Without sender autofill-receiver Email Login
	@Test(priority = 27)
	public void ValidRearrangingOrderFirstOtherSignersndThenSenderOnedrive() throws Exception {
		UUID uuid = UUID.randomUUID();
		String doc = uuid.toString().replaceAll("-", "");
		documentsScenarios.autofilloff();
		documentsScenarios.DocScenario();
		documentsScenarios.DocscenarioOnedrive();
		documentsScenarios.Recipient(1, "Receiver", "jeevithapatnana200@outlook.com", "SIGNER");
		documentsScenarios.Recipient(2, "Receiver", "meghanan180894@outlook.com", "SIGNER");
		documentsScenarios.Rearranges(0, 2);
		documentsScenarios.Signorder();
		documentsScenarios.Saveuser();
		documentsScenarios.SignatureAndFullNameFeilds();
		documentsScenarios.DradAndDropSigAndFullName(2, 10, -20, 10, 10);
		documentsScenarios.DradAndDropSigAndFullName(3, 10, 60, 10, 90);
		documentsScenarios.SubDocScenarios(doc);
		documentsScenarios.clickSubmit();
		documentsScenarios.Verifysubmit();
		documentsScenarios.Viewdocument();
		documentsScenarios.Blankwithoutsenderautofill();
		recevierSide.outlooksigninpage();
		recevierSide.switchEmail();
		recevierSide.jeevithaOutlookloginPage();
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & sign");
		recevierSide.signaturefill();
		recevierSide.clickFinish();
		recevierSide.Outlooklogin("meghanan180894@outlook.com", "Meghana@123");
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & sign");
		recevierSide.signaturefill();
		recevierSide.clickFinish();
		recevierSide.VerifyDocCompleteReceiverEnd();

	}

	// Blank DOc-SignerndApprover Without enforce signature order & Without sender
	// autofill-receiver Email Login
	@Test(priority = 28)
	public void ValidBlankdocSignerndApprover() throws Exception {
		UUID uuid = UUID.randomUUID();
		String doc = uuid.toString().replaceAll("-", "");
		documentsScenarios.autofilloff();
		documentsScenarios.DocScenario();
		documentsScenarios.Blankloginaccount(doc);
		documentsScenarios.Recipient(1, "Receiver", "jeevithapatnana200@outlook.com", " SIGNER ");
		documentsScenarios.Recipient(2, "Receiver", "ramyasibbala200@outlook.com", " APPROVER ");
		documentsScenarios.Signorder();
		documentsScenarios.Saveuser();
		documentsScenarios.SignatureAndFullNameFeilds();
		documentsScenarios.DradAndDropSigAndFullName(2, 10, -20, 10, 10);
		documentsScenarios.DradAndDropSigAndFullName(3, 10, 60, 10, 90);
		documentsScenarios.SubDocScenarios(doc);
		documentsScenarios.clickSubmit();
		documentsScenarios.Verifysubmit();
		documentsScenarios.Viewdocument();
		documentsScenarios.Blankwithoutsenderautofill();
		recevierSide.jeevithaOutlooklogin();
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & sign");
		recevierSide.signaturefill();
		recevierSide.clickFinish();
		recevierSide.Outlooklogin("ramyasibbala200@outlook.com", "Meghana@123");
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & Approve");
		recevierSide.signaturefill();
		recevierSide.clickApprove();
		recevierSide.VerifyDocCompleteReceiverEnd();

	}

//OneDrive-SignerndApproverOnedrive Without enforce signature order & Without sender autofill-receiver Email Login
	@Test(priority = 29)
	public void ValidSignerndApproverOnedrive() throws Exception {
		UUID uuid = UUID.randomUUID();
		String doc = uuid.toString().replaceAll("-", "");
		documentsScenarios.autofilloff();
		documentsScenarios.DocScenario();
		documentsScenarios.DocscenarioOnedrive();
		documentsScenarios.Recipient(1, "Receiver", "jeevithapatnana200@outlook.com", " SIGNER ");
		documentsScenarios.Recipient(2, "Receiver", "ramyasibbala200@outlook.com", " APPROVER ");
		documentsScenarios.Signorder();
		documentsScenarios.Saveuser();
		documentsScenarios.SignatureAndFullNameFeilds();
		documentsScenarios.DradAndDropSigAndFullName(2, 10, -20, 10, 10);
		documentsScenarios.DradAndDropSigAndFullName(3, 10, 60, 10, 90);
		documentsScenarios.SubDocScenarios(doc);
		documentsScenarios.clickSubmit();
		documentsScenarios.Verifysubmit();
		documentsScenarios.Viewdocument();
		documentsScenarios.Blankwithoutsenderautofill();
		recevierSide.outlooksigninpage();
		recevierSide.switchEmail();
		recevierSide.jeevithaOutlookloginPage();
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & sign");
		recevierSide.signaturefill();
		recevierSide.clickFinish();
		recevierSide.Outlooklogin("ramyasibbala200@outlook.com", "Meghana@123");
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & Approve");
		recevierSide.signaturefill();
		recevierSide.clickApprove();
		recevierSide.VerifyDocCompleteReceiverEnd();

	}

	// Blank Doc-RearrangingOrderFirstApproverthenSigner Without enforce signature
	// order & Without sender autofill-receiver Email Login
	@Test(priority = 30)
	public void ValidRearrangingOrderFirstApproverthenSigner() throws Exception {
		UUID uuid = UUID.randomUUID();
		String doc = uuid.toString().replaceAll("-", "");
		documentsScenarios.autofilloff();
		documentsScenarios.DocScenario();
		documentsScenarios.Blankloginaccount(doc);
		documentsScenarios.Recipient(1, "Receiver", "jeevithapatnana200@outlook.com", " SIGNER ");
		documentsScenarios.Recipient(2, "Receiver", "ramyasibbala200@outlook.com", " APPROVER ");
		documentsScenarios.Rearranges(2, 1);
		documentsScenarios.Signorder();
		documentsScenarios.Saveuser();
		documentsScenarios.SignatureAndFullNameFeilds();
		documentsScenarios.DradAndDropSigAndFullName(2, 10, -20, 10, 10);
		documentsScenarios.DradAndDropSigAndFullName(3, 10, 60, 10, 90);
		documentsScenarios.SubDocScenarios(doc);
		documentsScenarios.clickSubmit();
		documentsScenarios.Verifysubmit();
		documentsScenarios.Viewdocument();
		documentsScenarios.Blankwithoutsenderautofill();
		recevierSide.jeevithaOutlooklogin();
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & sign");
		recevierSide.signaturefill();
		recevierSide.clickFinish();
		recevierSide.Outlooklogin("ramyasibbala200@outlook.com", "Meghana@123");
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & Approve");
		recevierSide.signaturefill();
		recevierSide.clickApprove();
		recevierSide.VerifyDocCompleteReceiverEnd();
	}

	// 9.Blank Doc- (Signer , Approver & CC)Without enforce signature order &
	// Without sender autofill-receiver Email Login
	@Test(priority = 31)
	public void ValidBlankDocSignerApproverAndCCWithoutEnforceSignature() throws Exception {
		UUID uuid = UUID.randomUUID();
		String doc = uuid.toString().replaceAll("-", "");
		documentsScenarios.autofilloff();
		documentsScenarios.DocScenario();
		documentsScenarios.Blankloginaccount(doc);
		documentsScenarios.Recipient(1, "Receiver", "jeevithapatnana200@outlook.com", " SIGNER ");
		documentsScenarios.Recipient(2, "Receiver", "ramyasibbala200@outlook.com", " APPROVER ");
		documentsScenarios.Recipient(3, "Receiver", "prudhvib200@outlook.com", "CC");
		documentsScenarios.Signorder();
		documentsScenarios.Saveuser();
		documentsScenarios.SignatureAndFullNameFeilds();
		documentsScenarios.DradAndDropSigAndFullName(2, 10, -20, 10, 10);
		documentsScenarios.DradAndDropSigAndFullName(3, 10, 60, 10, 90);
		documentsScenarios.SubDocScenarios(doc);
		documentsScenarios.clickSubmit();
		documentsScenarios.Verifysubmit();
		documentsScenarios.Viewdocument();
		documentsScenarios.Blankwithoutsenderautofill();
		recevierSide.jeevithaOutlooklogin();
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & sign");
		recevierSide.signaturefill();
		recevierSide.clickFinish();
		recevierSide.Outlooklogin("ramyasibbala200@outlook.com", "Meghana@123");
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & Approve");
		recevierSide.signaturefill();
		recevierSide.clickApprove();
		recevierSide.Outlooklogin("prudhvib200@outlook.com", "Meghana@123");
		recevierSide.validateAtCC(doc);

	}

	// Blank Doc- (Signer, Multiple Approvers & CC)With/Without enforce signature
	// order & Without sender autofill--receiver Email Login
	@Test(priority = 32)
	public void ValidBlankDocSignerMulApproverAndCC() throws Exception {
		UUID uuid = UUID.randomUUID();
		String doc = uuid.toString().replaceAll("-", "");
		documentsScenarios.autofilloff();
		documentsScenarios.DocScenario();
		documentsScenarios.Blankloginaccount(doc);
		documentsScenarios.Recipient(1, "Receiver", "jeevithapatnana200@outlook.com", " SIGNER ");
		documentsScenarios.Recipient(2, "Receiver", "ramyasibbala200@outlook.com", " APPROVER ");
		documentsScenarios.Recipient(3, "Receiver", "meghanan180894@outlook.com", " APPROVER ");
		documentsScenarios.Recipient(4, "Receiver", "prudhvib200@outlook.com", "CC");
		documentsScenarios.Signorder();
		documentsScenarios.Saveuser();
		documentsScenarios.SignatureAndFullNameFeilds();
		documentsScenarios.DradAndDropSigAndFullName(2, 10, -20, 10, 10);
		documentsScenarios.DradAndDropSigAndFullName(3, 10, 60, 10, 90);
		documentsScenarios.DradAndDropSigAndFullName(4, 10, 130, 10, 160);
		documentsScenarios.SubDocScenarios(doc);
		documentsScenarios.clickSubmit();
		documentsScenarios.Verifysubmit();
		documentsScenarios.Viewdocument();
		documentsScenarios.Blankwithoutsenderautofill();
		recevierSide.jeevithaOutlooklogin();
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & sign");
		recevierSide.signaturefill();
		recevierSide.clickFinish();
		recevierSide.Outlooklogin("ramyasibbala200@outlook.com", "Meghana@123");
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & Approve");
		recevierSide.signaturefill();
		recevierSide.clickApprove();
		recevierSide.Outlooklogin("meghanan180894@outlook.com", "Meghana@123");
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & Approve");
		recevierSide.signaturefill();
		recevierSide.clickApprove();
		recevierSide.Outlooklogin("prudhvib200@outlook.com", "Meghana@123");
		recevierSide.validateAtCC(doc);

	}

	// Blank Doc- (Signer, Approvers& Multiple CC)With/Without enforce signature
	// order & Without sender autofill--receiver Email Login
	@Test(priority = 33)
	public void ValidBlankDocSignerApproverAndMultipleCC() throws Exception {
		UUID uuid = UUID.randomUUID();
		String doc = uuid.toString().replaceAll("-", "");
		documentsScenarios.autofilloff();
		documentsScenarios.DocScenario();
		documentsScenarios.Blankloginaccount(doc);
		documentsScenarios.Recipient(1, "Receiver", "jeevithapatnana200@outlook.com", " SIGNER ");
		documentsScenarios.Recipient(2, "Receiver", "ramyasibbala200@outlook.com", " APPROVER ");
		documentsScenarios.Recipient(3, "Receiver", "meghanan180894@outlook.com", "CC");
		documentsScenarios.Recipient(4, "Receiver", "prudhvib200@outlook.com", "CC");
		documentsScenarios.Signorder();
		documentsScenarios.Saveuser();
		documentsScenarios.SignatureAndFullNameFeilds();
		documentsScenarios.DradAndDropSigAndFullName(2, 10, -20, 10, 10);
		documentsScenarios.DradAndDropSigAndFullName(3, 10, 60, 10, 90);
		documentsScenarios.SubDocScenarios(doc);
		documentsScenarios.clickSubmit();
		documentsScenarios.Verifysubmit();
		documentsScenarios.Viewdocument();
		documentsScenarios.Blankwithoutsenderautofill();
		recevierSide.jeevithaOutlooklogin();
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & sign");
		recevierSide.signaturefill();
		recevierSide.clickFinish();
		recevierSide.Outlooklogin("ramyasibbala200@outlook.com", "Meghana@123");
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & Approve");
		recevierSide.signaturefill();
		recevierSide.clickApprove();
		recevierSide.Outlooklogin("meghanan180894@outlook.com", "Meghana@123");
		recevierSide.validateAtCC(doc);
		recevierSide.Outlooklogin("prudhvib200@outlook.com", "Meghana@123");
		recevierSide.validateAtCC(doc);

	}

	// Blank Doc- (Signer, Multiple Approvers & Multiple CC)With/Without enforce
	// signature order & Without sender autofill--receiver Email Login
	@Test(priority = 34)
	public void validBlankDocSignerMulApproverAndMulCC() throws Exception {
		UUID uuid = UUID.randomUUID();
		String doc = uuid.toString().replaceAll("-", "");
		documentsScenarios.autofilloff();
		documentsScenarios.DocScenario();
		documentsScenarios.Blankloginaccount(doc);
		documentsScenarios.Recipient(1, "Receiver", "jeevithapatnana200@outlook.com", " SIGNER ");
		documentsScenarios.Recipient(2, "Receiver", "ramyasibbala200@outlook.com", " APPROVER ");
		documentsScenarios.Recipient(3, "Receiver", "meghanan180894@outlook.com", " APPROVER ");
		documentsScenarios.Recipient(4, "Receiver", "prudhvib200@outlook.com", "CC");
		documentsScenarios.Recipient(5, "Receiver", "ramyas200@outlook.com", "CC");
		documentsScenarios.Signorder();
		documentsScenarios.Saveuser();
		documentsScenarios.SignatureAndFullNameFeilds();
		documentsScenarios.DradAndDropSigAndFullName(2, 10, -20, 10, 10);
		documentsScenarios.DradAndDropSigAndFullName(3, 10, 60, 10, 90);
		documentsScenarios.DradAndDropSigAndFullName(4, 10, 130, 10, 160);
		documentsScenarios.SubDocScenarios(doc);
		documentsScenarios.clickSubmit();
		documentsScenarios.Verifysubmit();
		documentsScenarios.Viewdocument();
		documentsScenarios.Blankwithoutsenderautofill();
		recevierSide.jeevithaOutlooklogin();
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & sign");
		recevierSide.signaturefill();
		recevierSide.clickFinish();
		recevierSide.Outlooklogin("ramyasibbala200@outlook.com", "Meghana@123");
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & Approve");
		recevierSide.signaturefill();
		recevierSide.clickApprove();
		recevierSide.Outlooklogin("meghanan180894@outlook.com", "Meghana@123");
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & Approve");
		recevierSide.signaturefill();
		recevierSide.clickApprove();
		recevierSide.Outlooklogin("prudhvib200@outlook.com", "Meghana@123");
		recevierSide.validateAtCC(doc);

	}

	// 10.Blankdoc-Rearranging order first Approver and then Signer &&CC-Without
	// enforce signature order & Without sender autofill--receiver Email Login
	@Test(priority = 35)
	public void validBlankDocRearrangeorderApproverSignerAndCC() throws Exception {
		UUID uuid = UUID.randomUUID();
		String doc = uuid.toString().replaceAll("-", "");
		documentsScenarios.autofilloff();
		documentsScenarios.DocScenario();
		documentsScenarios.Blankloginaccount(doc);
		documentsScenarios.Recipient(1, "Receiver", "jeevithapatnana200@outlook.com", " SIGNER ");
		documentsScenarios.Recipient(2, "Receiver", "ramyasibbala200@outlook.com", " APPROVER ");
		documentsScenarios.Recipient(3, "Receiver", "prudhvib200@outlook.com", "CC");
		documentsScenarios.Rearranges(2, 1);
		documentsScenarios.Signorder();
		documentsScenarios.Saveuser();
		documentsScenarios.SignatureAndFullNameFeilds();
		documentsScenarios.DradAndDropSigAndFullName(3, 10, 60, 10, 90);
		documentsScenarios.DradAndDropSigAndFullName(2, 10, -20, 10, 10);
		documentsScenarios.SubDocScenarios(doc);
		documentsScenarios.clickSubmit();
		documentsScenarios.Verifysubmit();
		documentsScenarios.Viewdocument();
		documentsScenarios.Blankwithoutsenderautofill();
		recevierSide.jeevithaOutlooklogin();
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & sign");
		recevierSide.signaturefill();
		recevierSide.clickFinish();
		recevierSide.Outlooklogin("ramyasibbala200@outlook.com", "Meghana@123");
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & Approve");
		recevierSide.signaturefill();
		recevierSide.clickApprove();
		recevierSide.Outlooklogin("prudhvib200@outlook.com", "Meghana@123");
		recevierSide.validateAtCC(doc);

	}

	// 11.Rearranging order first CC and then Signer && Approver Without enforce
	// signature order & Without sender autofill--receiver Email Login
	@Test(priority = 36)
	public void validBlankDocRearrangeorderCCSignerApprover() throws Exception {
		UUID uuid = UUID.randomUUID();
		String doc = uuid.toString().replaceAll("-", "");
		documentsScenarios.autofilloff();
		documentsScenarios.DocScenario();
		documentsScenarios.Blankloginaccount(doc);
		documentsScenarios.Recipient(1, "Receiver", "jeevithapatnana200@outlook.com", " SIGNER ");
		documentsScenarios.Recipient(2, "Receiver", "ramyasibbala200@outlook.com", " APPROVER ");
		documentsScenarios.Recipient(3, "Receiver", "prudhvib200@outlook.com", "CC");
		documentsScenarios.Rearranges(2, 1);
		documentsScenarios.Rearranges(3, 2);
		documentsScenarios.Signorder();
		documentsScenarios.Saveuser();
		documentsScenarios.SignatureAndFullNameFeilds();
		documentsScenarios.DradAndDropSigAndFullName(3, 10, 60, 10, 90);
		documentsScenarios.DradAndDropSigAndFullName(4, 10, 130, 10, 160);
		documentsScenarios.SubDocScenarios(doc);
		documentsScenarios.clickSubmit();
		documentsScenarios.Verifysubmit();
		documentsScenarios.Viewdocument();
		documentsScenarios.Blankwithoutsenderautofill();
		recevierSide.jeevithaOutlooklogin();
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & sign");
		recevierSide.signaturefill();
		recevierSide.clickFinish();
		recevierSide.Outlooklogin("ramyasibbala200@outlook.com", "Meghana@123");
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & Approve");
		recevierSide.signaturefill();
		recevierSide.clickApprove();
		recevierSide.Outlooklogin("prudhvib200@outlook.com", "Meghana@123");
		recevierSide.validateAtCC(doc);

	}

	// 12.Rearranging order first Approver and then CC && Signer--receiver Email
	// Login
	@Test(priority = 37)
	public void validRearrangeorderApproverCCSigner() throws Exception {
		UUID uuid = UUID.randomUUID();
		String doc = uuid.toString().replaceAll("-", "");
		documentsScenarios.autofilloff();
		documentsScenarios.DocScenario();
		documentsScenarios.Blankloginaccount(doc);
		documentsScenarios.Recipient(1, "Receiver", "jeevithapatnana200@outlook.com", " SIGNER ");
		documentsScenarios.Recipient(2, "Receiver", "ramyasibbala200@outlook.com", " APPROVER ");
		documentsScenarios.Recipient(3, "Receiver", "prudhvib200@outlook.com", "CC");
		documentsScenarios.Rearranges(2, 1);
		documentsScenarios.Rearranges(3, 2);
		documentsScenarios.Signorder();
		documentsScenarios.Saveuser();
		documentsScenarios.SignatureAndFullNameFeilds();
		documentsScenarios.DradAndDropSigAndFullName(2, 10, -20, 10, 10);
		documentsScenarios.DradAndDropSigAndFullName(4, 10, 130, 10, 160);
		documentsScenarios.SubDocScenarios(doc);
		documentsScenarios.clickSubmit();
		documentsScenarios.Verifysubmit();
		documentsScenarios.Viewdocument();
		documentsScenarios.Blankwithoutsenderautofill();
		recevierSide.jeevithaOutlooklogin();
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & sign");
		recevierSide.signaturefill();
		recevierSide.clickFinish();
		recevierSide.Outlooklogin("ramyasibbala200@outlook.com", "Meghana@123");
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & Approve");
		recevierSide.signaturefill();
		recevierSide.clickApprove();
		recevierSide.Outlooklogin("prudhvib200@outlook.com", "Meghana@123");
		recevierSide.validateAtCC(doc);

	}

	// 13. Blank Doc-Rearranging order first Signer and then CC && Approver-Without
	// enforce signature order & Without sender autofill--receiver Email Login
	@Test(priority = 38)
	public void validBlankDocRearrangeorderSignerCCApprover() throws Exception {
		UUID uuid = UUID.randomUUID();
		String doc = uuid.toString().replaceAll("-", "");
		documentsScenarios.autofilloff();
		documentsScenarios.DocScenario();
		documentsScenarios.Blankloginaccount(doc);
		documentsScenarios.Recipient(1, "Receiver", "jeevithapatnana200@outlook.com", " SIGNER ");
		documentsScenarios.Recipient(2, "Receiver", "ramyasibbala200@outlook.com", " APPROVER ");
		documentsScenarios.Recipient(3, "Receiver", "prudhvib200@outlook.com", "CC");
		documentsScenarios.Rearranges(3, 2);
		documentsScenarios.Signorder();
		documentsScenarios.Saveuser();
		documentsScenarios.SignatureAndFullNameFeilds();
		documentsScenarios.DradAndDropSigAndFullName(2, 10, -20, 10, 10);
		documentsScenarios.DradAndDropSigAndFullName(4, 10, 130, 10, 160);
		documentsScenarios.SubDocScenarios(doc);
		documentsScenarios.clickSubmit();
		documentsScenarios.Verifysubmit();
		documentsScenarios.Viewdocument();
		documentsScenarios.Blankwithoutsenderautofill();
		recevierSide.jeevithaOutlooklogin();
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & sign");
		recevierSide.signaturefill();
		recevierSide.clickFinish();
		recevierSide.Outlooklogin("ramyasibbala200@outlook.com", "Meghana@123");
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & Approve");
		recevierSide.signaturefill();
		recevierSide.clickApprove();
		recevierSide.Outlooklogin("prudhvib200@outlook.com", "Meghana@123");
		recevierSide.validateAtCC(doc);

	}

	// 14.Blank Doc-Rearranging order first CC and then Approver && Signer-Without
	// enforce signature order & Without sender autofill--receiver Email Login
	@Test(priority = 39)
	public void validBlankDocRearrangeorderCCApproversigner() throws Exception {
		UUID uuid = UUID.randomUUID();
		String doc = uuid.toString().replaceAll("-", "");
		documentsScenarios.autofilloff();
		documentsScenarios.DocScenario();
		documentsScenarios.Blankloginaccount(doc);
		documentsScenarios.Recipient(1, "Receiver", "jeevithapatnana200@outlook.com", " SIGNER ");
		documentsScenarios.Recipient(2, "Receiver", "ramyasibbala200@outlook.com", " APPROVER ");
		documentsScenarios.Recipient(3, "Receiver", "prudhvib200@outlook.com", "CC");
		documentsScenarios.Rearranges(3, 2);
		documentsScenarios.Rearranges(3, 2);
		documentsScenarios.Signorder();
		documentsScenarios.Saveuser();
		documentsScenarios.SignatureAndFullNameFeilds();
		documentsScenarios.DradAndDropSigAndFullName(3, 10, 60, 10, 90);
		documentsScenarios.DradAndDropSigAndFullName(4, 10, 130, 10, 160);
		documentsScenarios.SubDocScenarios(doc);
		documentsScenarios.clickSubmit();
		documentsScenarios.Verifysubmit();
		documentsScenarios.Viewdocument();
		documentsScenarios.Blankwithoutsenderautofill();
		recevierSide.jeevithaOutlooklogin();
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & sign");
		recevierSide.signaturefill();
		recevierSide.clickFinish();
		recevierSide.Outlooklogin("ramyasibbala200@outlook.com", "Meghana@123");
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & Approve");
		recevierSide.signaturefill();
		recevierSide.clickApprove();
		recevierSide.Outlooklogin("prudhvib200@outlook.com", "Meghana@123");
		recevierSide.validateAtCC(doc);

	}

	// 15.Blank Doc-Multiple signers , approver&& CC Without enforce signature
	// order& Without sender autofill-receiver Email Login
	@Test(priority = 40)
	public void validBlankDocMulsignerApproverCC() throws Exception {
		UUID uuid = UUID.randomUUID();
		String doc = uuid.toString().replaceAll("-", "");
		documentsScenarios.autofilloff();
		documentsScenarios.DocScenario();
		documentsScenarios.Blankloginaccount(doc);
		documentsScenarios.Recipient(1, "Receiver", "jeevithapatnana200@outlook.com", "SIGNER");
		documentsScenarios.Recipient(2, "Receiver", "meghanan180894@outlook.com", "SIGNER");
		documentsScenarios.Recipient(3, "Receiver", "ramyas200@outlook.com", "APPROVER");
		documentsScenarios.Recipient(4, "Receiver", "prudhvib200@outlook.com", "CC");
		documentsScenarios.Signorder();
		documentsScenarios.Saveuser();
		documentsScenarios.SignatureAndFullNameFeilds();
		documentsScenarios.DradAndDropSigAndFullName(2, 10, -20, 10, 10);
		documentsScenarios.DradAndDropSigAndFullName(3, 10, 60, 10, 90);
		documentsScenarios.DradAndDropSigAndFullName(4, 10, 130, 10, 160);
		documentsScenarios.SubDocScenarios(doc);
		documentsScenarios.clickSubmit();
		documentsScenarios.Verifysubmit();
		documentsScenarios.Viewdocument();
		documentsScenarios.Blankwithoutsenderautofill();
		recevierSide.jeevithaOutlooklogin();
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & sign");
		recevierSide.signaturefill();
		recevierSide.clickFinish();
		recevierSide.Outlooklogin("meghanan180894@outlook.com", "Meghana@123");
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & sign");
		recevierSide.signaturefill();
		recevierSide.clickFinish();
		recevierSide.Outlooklogin("ramyas200@outlook.com", "Meghana@123");
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & Approve");
		recevierSide.signaturefill();
		recevierSide.clickApprove();
		recevierSide.Outlooklogin("prudhvib200@outlook.com", "Meghana@123");
		recevierSide.validateAtCC(doc);

	}

	// 16.Rearranging order first Other Signers and then Sender Signer
	// &&Approver-Without enforce signature order & Without sender autofill-receiver
	// Email Login
	@Test(priority = 41)
	public void validBlankDocOtherSignerSenderSignerApprover() throws Exception {
		UUID uuid = UUID.randomUUID();
		String doc = uuid.toString().replaceAll("-", "");
		documentsScenarios.autofilloff();
		documentsScenarios.DocScenario();
		documentsScenarios.Blankloginaccount(doc);
		documentsScenarios.Recipient(1, "Receiver", "jeevithapatnana200@outlook.com", "SIGNER");
		documentsScenarios.Recipient(2, "Receiver", "meghanan180894@outlook.com", "SIGNER");
		documentsScenarios.Recipient(3, "Receiver", "ramyas200@outlook.com", "APPROVER");
		documentsScenarios.Rearranges(0, 2);
		documentsScenarios.Signorder();
		documentsScenarios.Saveuser();
		documentsScenarios.SignatureAndFullNameFeilds();
		documentsScenarios.DradAndDropSigAndFullName(2, 10, -20, 10, 10);
		documentsScenarios.DradAndDropSigAndFullName(3, 10, 60, 10, 90);
		documentsScenarios.DradAndDropSigAndFullName(4, 10, 130, 10, 160);
		documentsScenarios.SubDocScenarios(doc);
		documentsScenarios.clickSubmit();
		documentsScenarios.Verifysubmit();
		documentsScenarios.Viewdocument();
		documentsScenarios.Blankwithoutsenderautofill();
		recevierSide.jeevithaOutlooklogin();
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & sign");
		recevierSide.signaturefill();
		recevierSide.clickFinish();
		recevierSide.Outlooklogin("meghanan180894@outlook.com", "Meghana@123");
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & sign");
		recevierSide.signaturefill();
		recevierSide.clickFinish();
		recevierSide.Outlooklogin("ramyas200@outlook.com", "Meghana@123");
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & Approve");
		recevierSide.signaturefill();
		recevierSide.clickApprove();
		recevierSide.VerifyDocCompleteReceiverEnd();
	}

	// 17.Rearranging order first Approver and then Sender Signer && Other
	// Signers-receiver Email Login
	@Test(priority = 42)
	public void validBlankDocApproverSenderSignerOtherSigner() throws Exception {
		UUID uuid = UUID.randomUUID();
		String doc = uuid.toString().replaceAll("-", "");
		documentsScenarios.autofilloff();
		documentsScenarios.DocScenario();
		documentsScenarios.Blankloginaccount(doc);
		documentsScenarios.Recipient(1, "Receiver", "jeevithapatnana200@outlook.com", "SIGNER");
		documentsScenarios.Recipient(2, "Receiver", "meghanan180894@outlook.com", "SIGNER");
		documentsScenarios.Recipient(3, "Receiver", "ramyas200@outlook.com", "APPROVER");
		documentsScenarios.Rearranges(3, 2);
		documentsScenarios.scrollUp();
		documentsScenarios.Rearranges(0, 1);
		documentsScenarios.Signorder();
		documentsScenarios.Saveuser();
		documentsScenarios.SignatureAndFullNameFeilds();
		documentsScenarios.DradAndDropSigAndFullName(2, 10, -20, 10, 10);
		documentsScenarios.DradAndDropSigAndFullName(3, 10, 60, 10, 90);
		documentsScenarios.DradAndDropSigAndFullName(4, 10, 130, 10, 160);
		documentsScenarios.SubDocScenarios(doc);
		documentsScenarios.clickSubmit();
		documentsScenarios.Verifysubmit();
		documentsScenarios.Viewdocument();
		documentsScenarios.Blankwithoutsenderautofill();
		recevierSide.jeevithaOutlooklogin();
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & sign");
		recevierSide.signaturefill();
		recevierSide.clickFinish();
		recevierSide.Outlooklogin("meghanan180894@outlook.com", "Meghana@123");
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & sign");
		recevierSide.signaturefill();
		recevierSide.clickFinish();
		recevierSide.Outlooklogin("ramyas200@outlook.com", "Meghana@123");
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & Approve");
		recevierSide.signaturefill();
		recevierSide.clickApprove();
		recevierSide.VerifyDocCompleteReceiverEnd();
	}

	// 18.Rearranging order first Other Signers and then Approver && Sender
	// Signer--receiver Email Login
	@Test(priority = 43)
	public void validBlankDocOtherSignerApproverSenderSigner() throws Exception {
		UUID uuid = UUID.randomUUID();
		String doc = uuid.toString().replaceAll("-", "");
		documentsScenarios.autofilloff();
		documentsScenarios.DocScenario();
		documentsScenarios.Blankloginaccount(doc);
		documentsScenarios.Recipient(1, "Receiver", "jeevithapatnana200@outlook.com", "SIGNER");
		documentsScenarios.Recipient(2, "Receiver", "meghanan180894@outlook.com", "SIGNER");
		documentsScenarios.Recipient(3, "Receiver", "ramyas200@outlook.com", "APPROVER");
		documentsScenarios.Rearranges(0, 2);
		documentsScenarios.scrollDown();
		documentsScenarios.Rearranges(3, 2);
		documentsScenarios.Signorder();
		documentsScenarios.Saveuser();
		documentsScenarios.SignatureAndFullNameFeilds();
		documentsScenarios.DradAndDropSigAndFullName(2, 10, -20, 10, 10);
		documentsScenarios.DradAndDropSigAndFullName(3, 10, 60, 10, 90);
		documentsScenarios.DradAndDropSigAndFullName(4, 10, 130, 10, 160);
		documentsScenarios.SubDocScenarios(doc);
		documentsScenarios.clickSubmit();
		documentsScenarios.Verifysubmit();
		documentsScenarios.Viewdocument();
		documentsScenarios.Blankwithoutsenderautofill();
		recevierSide.jeevithaOutlooklogin();
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & sign");
		recevierSide.signaturefill();
		recevierSide.clickFinish();
		recevierSide.Outlooklogin("meghanan180894@outlook.com", "Meghana@123");
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & sign");
		recevierSide.signaturefill();
		recevierSide.clickFinish();
		recevierSide.Outlooklogin("ramyas200@outlook.com", "Meghana@123");
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & Approve");
		recevierSide.signaturefill();
		recevierSide.clickApprove();
		recevierSide.VerifyDocCompleteReceiverEnd();
	}

	// 19.Rearranging order first Sender Signer and then Approver && Other
	// Signers-receiver Email Login
	@Test(priority = 44)
	public void validBlankDocSenderSignerApproverOtherSigner() throws Exception {
		UUID uuid = UUID.randomUUID();
		String doc = uuid.toString().replaceAll("-", "");
		documentsScenarios.autofilloff();
		documentsScenarios.DocScenario();
		documentsScenarios.Blankloginaccount(doc);
		documentsScenarios.Recipient(1, "Receiver", "jeevithapatnana200@outlook.com", "SIGNER");
		documentsScenarios.Recipient(2, "Receiver", "meghanan180894@outlook.com", "SIGNER");
		documentsScenarios.Recipient(3, "Receiver", "ramyas200@outlook.com", "APPROVER");
		documentsScenarios.Rearranges(3, 2);
		documentsScenarios.Signorder();
		documentsScenarios.Saveuser();
		documentsScenarios.SignatureAndFullNameFeilds();
		documentsScenarios.DradAndDropSigAndFullName(2, 10, -20, 10, 10);
		documentsScenarios.DradAndDropSigAndFullName(3, 10, 60, 10, 90);
		documentsScenarios.DradAndDropSigAndFullName(4, 10, 130, 10, 160);
		documentsScenarios.SubDocScenarios(doc);
		documentsScenarios.clickSubmit();
		documentsScenarios.Verifysubmit();
		documentsScenarios.Viewdocument();
		documentsScenarios.Blankwithoutsenderautofill();
		recevierSide.jeevithaOutlooklogin();
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & sign");
		recevierSide.signaturefill();
		recevierSide.clickFinish();
		recevierSide.Outlooklogin("meghanan180894@outlook.com", "Meghana@123");
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & sign");
		recevierSide.signaturefill();
		recevierSide.clickFinish();
		recevierSide.Outlooklogin("ramyas200@outlook.com", "Meghana@123");
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & Approve");
		recevierSide.signaturefill();
		recevierSide.clickApprove();
		recevierSide.VerifyDocCompleteReceiverEnd();
	}

	@Test(priority = 45)
	public void uploadVedio() throws Exception {
		String file = System.getProperty("user.dir") + "/src/test/resources/NEW SIGN.mp4";
		documentsScenarios.DocScenario();
		documentsScenarios.uploadFileWithSendKeys(file);
		documentsScenarios.nextButton();
	}

	// 3.Reuploading a completed Esigns ID Generated DOC
	@Test(priority = 46)
	public void ReuploadingCompletedEsignsIDGeneratedDOC() throws Exception {
		UUID uuid = UUID.randomUUID();
		String doc = uuid.toString().replaceAll("-", "");
		String file = System.getProperty("user.dir") + "/src/test/resources/TESTING.pdf";
		documentsScenarios.DocScenario();
		documentsScenarios.uploadFileWithSendKeys(file);
		documentsScenarios.nextButton();
		documentsScenarios.Recipient(1, "Receiver", "jeevithapatnana200@outlook.com", "SIGNER");
		documentsScenarios.Saveuser();
		documentsScenarios.DradAndDropSigAndFullName(2, 10, -20, 10, 10);
		documentsScenarios.SubDocScenarios(doc);
		documentsScenarios.clickSubmit();
		documentsScenarios.Verifysubmit();
		recevierSide.jeevithaOutlooklogin();
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & sign");
		recevierSide.signaturefill();
		recevierSide.clickFinish();
		recevierSide.VerifyDocCompleteReceiverEnd();
	}

//	(All These in Change Document also)
	@Test(priority = 47)
	public void changeDocument() throws InterruptedException, Exception {
		UUID uuid = UUID.randomUUID();
		String doc = uuid.toString().replaceAll("-", "");
		String file = System.getProperty("user.dir") + "/src/test/resources/Test.pdf";
		String pdffile = System.getProperty("user.dir") + "/src/test/resources/TESTING.pdf";
		documentsScenarios.DocScenario();
		documentsScenarios.uploadFileWithSendKeys(file);
		documentsScenarios.nextButton();
		documentsScenarios.Recipient(1, "Receiver", "jeevithapatnana200@outlook.com", "SIGNER");
		documentsScenarios.Saveuser();
		documentsScenarios.changeDoc();
		documentsScenarios.uploadFileTwoWithSendKeys(pdffile);
		documentsScenarios.clickContinue();
		documentsScenarios.DradAndDropSigAndFullName(2, 10, -20, 10, 10);
		documentsScenarios.SubDocScenarios(doc);
		documentsScenarios.clickSubmit();
		documentsScenarios.Verifysubmit();
		recevierSide.jeevithaOutlooklogin();
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & sign");
		recevierSide.signaturefill();
		recevierSide.clickFinish();
		recevierSide.VerifyDocCompleteReceiverEnd();

	}

//	5.Attachment Downloads

	@Test(priority = 48)
	public void attachmentDownloads() throws Exception {
		String file = System.getProperty("user.dir") + "/src/test/resources/TESTING.pdf";
		String pdffile = System.getProperty("user.dir") + "/src/test/resources/TESTING.pdf";
		documentsScenarios.DocScenario();
		documentsScenarios.Fileuploads(file);
		documentsScenarios.nextButton();
		documentsScenarios.Saveuser();
		documentsScenarios.SignatureAndFullNameFeilds();
		documentsScenarios.dragRequestDocFeild();
		documentsScenarios.uploadFileWithSendKeys(pdffile);
		documentsScenarios.save();
		documentsScenarios.clickFinishDoc();
		documentsScenarios.viewDocandDownload();

	}

//	// drag and drop feilds after adding the form template to the company profile
	@Test(priority = 49)
	public void contentFeildsCompanyProfile() throws Exception {
		UUID uuid = UUID.randomUUID();
		String doc = uuid.toString().replaceAll("-", "");
//		entities.FormTemplate();
//		entities.CreateFormtemplate(doc);
//		entities.templateContentFeilds();
//		entities.submit();
//		entities.contentFeildsDragAndDrop();
//		entities.companyProfile();
		documentsScenarios.DocScenario();
		documentsScenarios.Blankloginaccount(doc);
		documentsScenarios.Recipient(1, "Receiver", "jeevithapatnana200@outlook.com", "SIGNER");
		documentsScenarios.Saveuser();
		documentsScenarios.DragContentFeildsCompanyProfile();
		documentsScenarios.DradAndDropSigAndFullName(2, 10, -20, 10, 10);
		documentsScenarios.SubDocScenarios(doc);
		documentsScenarios.clickSubmit();
		documentsScenarios.Verifysubmit();
	}

	@Test(priority = 50)
	public void BasicfeildsCompanyProfile() throws Exception {
		UUID uuid = UUID.randomUUID();
		String doc = uuid.toString().replaceAll("-", "");
		entities.FormTemplate();
		entities.CreateFormtemplate(doc);
		entities.templateBasicFeilds();
		entities.submit();
		entities.basicFeilds();
//		entities.companyProfile();
//		documentsScenarios.DocScenario();
//		documentsScenarios.Blankloginaccount(doc);
//		documentsScenarios.Recipient(1, "Receiver", "jeevithapatnana200@outlook.com", "SIGNER");
//		documentsScenarios.Saveuser();
//		documentsScenarios.DragAndDropBasicFeildsInDocument();
//		documentsScenarios.DradAndDropSigAndFullName(2, 10, -120, 10, -90);
//		documentsScenarios.SubDocScenarios(doc);
//		documentsScenarios.clickSubmit();
//		documentsScenarios.Verifysubmit();
	}

//
	@Test(priority = 51)
	public void AdvancedFieldsCompanyProfile() throws Exception {
		UUID uuid = UUID.randomUUID();
		String doc = uuid.toString().replaceAll("-", "");
		entities.FormTemplate();
		entities.CreateFormtemplate(doc);
		entities.templateAdvancedFeilds();
		entities.submit();
		entities.advancedFeilds();
//		entities.companyProfile();
//		documentsScenarios.DocScenario();
//		documentsScenarios.Blankloginaccount(doc);
//		documentsScenarios.Recipient(1, "Receiver", "jeevithapatnana200@outlook.com", "SIGNER");
//		documentsScenarios.Saveuser();
////		documentsScenarios.advancedFeilds();
//		documentsScenarios.DradAndDropSigAndFullName(2,10,-20,10,10);
//		documentsScenarios.SubDocScenarios(doc);
//		documentsScenarios.clickSubmit();
//		documentsScenarios.Verifysubmit();
	}
//Entity mapping from documents: (Individual entity)(Update after document completion from settings)
	private String doc;
	@Test(priority = 52)
	public void EntityMappingIndividualEntityUpdateAfterDocumentCompletionFromSettings() throws Exception {
		UUID uuid = UUID.randomUUID();
		String doc = uuid.toString().replaceAll("-", "");

		String arr[] = { "1", "06-01-2024 To 07-01-2024", "TESTING.pdf", "PemmaMohan ReddyMeghana", "1,2", "9347618053",
				"PemmaMohan ReddyMeghana", "Computer science", "1", "Computer science,maths", "List", "06-01-2024",
				"11:04:09", "01:00", "06-05-2024 00:00:00", "Monday", "YES" };
		entities.entity();
		entities.ClickCreateEntity();
		entities.CreateEntityFromScratch(doc, "Start from scratch", "INDIVIDUAL");
		entities.addtemplate(" templateBasicFeilds ");
		documentsScenarios.Updateafterdocumentcompletionfromsettings();
		documentsScenarios.DocScenario();
		documentsScenarios.Blankloginaccount(doc);
		documentsScenarios.addContactAtAddrecipient(1, doc, "ramyasibbala200@outlook.com", "ramya", "sibbala",
				"SIGNER");
		documentsScenarios.Saveuser();
		documentsScenarios.DradAndDropSigAndFullName(2, -250, -150, -250, -110);
		documentsScenarios.DragAndDropBasicFeildsInDocument();
		documentsScenarios.SubDocScenarios(doc);
		documentsScenarios.clickSubmit();
		documentsScenarios.Verifysubmit();
		recevierSide.firstOutlooklogin("ramyasibbala200@outlook.com");
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & sign");
//		recevierSide.ClickSignatureFeild();
		recevierSide.signaturefill();
		recevierSide.receiverSideBasicFeildsFill();
		driver.get("https://nsui.esigns.io/signin");
		entities.entity();
		entities.ClickEntityAction(doc);
		recevierSide.verifyBasicFeildDataFillInIndividualEntity(arr);
	}
//	, dependsOnMethods = {
//	"EntityMappingIndividualEntityUpdateAfterDocumentCompletionFromSettings" }
	@Test(priority = 53)
	public void EntityMappingIndividualEntityUpdateExistedData() throws Exception {	
		String arr[] = {};
		documentsScenarios.DocScenario();
		documentsScenarios.Blankloginaccount(doc);
		documentsScenarios.addContactAtAddrecipient(1, doc, "prudhvib200@outlook.com", "prudhvi", "b", "SIGNER");
		documentsScenarios.Saveuser();
		documentsScenarios.DradAndDropSigAndFullName(2, -250, 150, -250, 180);
		documentsScenarios.DragAndDropBasicFeildsInDocument();
		documentsScenarios.SubDocScenarios(doc);
		documentsScenarios.clickSubmit();
		documentsScenarios.Verifysubmit();
		recevierSide.firstOutlooklogin("prudhvib200@outlook.com");
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & sign");
		recevierSide.ClickSignatureFeild();
		recevierSide.signaturefill();
		recevierSide.receiverSideBasicFeildsFill();
		recevierSide.clickFinish();
		entities.entity();
		entities.ClickEntityAction(doc);
		recevierSide.verifyBasicFeildDataFillInIndividualEntity(arr);
	}

	//
	@Test(priority = 54)
	public void EntityMappingIndividualEntityUpdateafteruserfinishesthedocumentfromsettings() throws Exception {
		UUID uuid = UUID.randomUUID();
		String doc = uuid.toString().replaceAll("-", "");
//		String doc="EntityMappingIndividualEntity11";
		String arr[] = { "1", "06-01-2024 To 07-01-2024", "TESTING.pdf", "PemmaMohan ReddyMeghana", "1,2", "9347618053",
				"PemmaMohan ReddyMeghana", "Computer science", "1", "Computer science,maths", "List", "06-01-2024",
				"11:04:09", "01:00", "06-05-2024 00:00:00", "Monday", "YES" };
		entities.entity();
		entities.ClickCreateEntity();
		entities.CreateEntityFromScratch(doc, "Start from scratch", "INDIVIDUAL");
		entities.addtemplate(" templateBasicFeilds ");
		documentsScenarios.Updateafterdocumentcompletionfromsettings();
		documentsScenarios.DocScenario();
		documentsScenarios.Blankloginaccount(doc);
		documentsScenarios.addContactAtAddrecipient(1, doc, "ramyasibbala200@outlook.com", "ramya", "sibbala",
				"SIGNER");
		documentsScenarios.addContactAtAddrecipient(2, doc, "ramyas200@outlook.com", "ramya", "sibbala", "SIGNER");
		documentsScenarios.Saveuser();
		documentsScenarios.DradAndDropSigAndFullName(2, -250, -150, -250, -110);
		documentsScenarios.DragAndDropBasicFeildsInDocument();
		documentsScenarios.SubDocScenarios(doc);
		documentsScenarios.clickSubmit();
		documentsScenarios.Verifysubmit();
		recevierSide.firstOutlooklogin("ramyasibbala200@outlook.com");
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & sign");
		recevierSide.signaturefill();
		recevierSide.receiverSideBasicFeildsFill();
		driver.get("https://nsui.esigns.io/signin");
		entities.entity();
		entities.ClickEntityAction("individualEntity");
		recevierSide.verifyBasicFeildDataFillInIndividualEntity(arr);
		recevierSide.Outlooklogin("ramyas200@outlook.com", "Meghana@123");
		recevierSide.clickEmail(doc);
		recevierSide.reviewandSign("Review & sign");
		recevierSide.signaturefill();
		recevierSide.receiverSideBasicFeildsFill();
		driver.get("https://nsui.esigns.io/signin");
		entities.entity();
		entities.ClickEntityAction(doc);
		recevierSide.verifyBasicFeildDataFillInIndividualEntity(arr);
	}

//	@AfterMethod
//	public void quit() {
//		driver.quit();
//	}

}
