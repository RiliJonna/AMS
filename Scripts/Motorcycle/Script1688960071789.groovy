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

WebUI.click(findTestObject('Object Repository/Motorcycle/Page_Dashboard - Asset Management/span_Motorcycles'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Page_Dashboard - Asset Management/a_Pending'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Page_Vehicle Page - Asset Management/span_Motorcycles'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Page_Vehicle Page - Asset Management/a_Approved'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Page_Vehicle Page - Asset Management/a_Motorcycles'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Page_Vehicle Page - Asset Management/a_OnProcess'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Page_Vehicle Page - Asset Management/a_Motorcycles'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Page_Vehicle Page - Asset Management/a_Delivered'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Page_Vehicle Page - Asset Management/a_View Vehicle Info'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Page_Vehicle Information Page - Asset Management/a_Motorcycles'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Page_Vehicle Information Page - Asset Management/a_Disposed'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Page_Vehicle Page - Asset Management/a_Open Info'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Page_Vehicle Page - Asset Management/button_X'))

WebUI.click(findTestObject('Object Repository/Motorcycle/Page_Vehicle Page - Asset Management/ul_raanthony   ChangePassword Logout'))


