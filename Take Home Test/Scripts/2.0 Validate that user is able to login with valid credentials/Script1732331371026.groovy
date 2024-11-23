import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://search.permission.io/')

WebUI.click(findTestObject('Object Repository/Page_Permission Search/button_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_Sign in to permission-realm/input_Email_username'), 'gecobekevin@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to permission-realm/input_Password_password'), 'JmsziDCrGntBqYgJvgh0fw==')

WebUI.click(findTestObject('Object Repository/Page_Sign in to permission-realm/katalon-div_id(katalon-rec_elementInfoDiv)'))

WebUI.click(findTestObject('Object Repository/Page_Sign in to permission-realm/input_Forgot password_login'))

WebUI.click(findTestObject('Object Repository/Page_Opt-in Market Place - Permission.io/button_Accept All'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Opt-in Market Place - Permission.io/img'), 0)

WebUI.click(findTestObject('Object Repository/Page_Opt-in Market Place - Permission.io/div_KG'))

WebUI.click(findTestObject('Object Repository/Page_Profile - Permission.io/svg_gecobekevingmail.com_lucide lucide-log-_e2e147'))

WebUI.closeBrowser()

