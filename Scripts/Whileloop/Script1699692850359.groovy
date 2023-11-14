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
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys
import org.openqa.selenium.WebElement as Keys
import org.openqa.selenium.WebElement


WebUI.openBrowser(GlobalVariable.baseUrl)
WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('Object Repository/OR_Zing/Input_Search'), 60, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/OR_Zing/Input_Search'))

WebUI.sendKeys(findTestObject('Object Repository/OR_Zing/Input_Search'), GlobalVariable.inputSearchText)

List<WebElement> SearchResults = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/OR_Zing/Label_SearchResult'), 60)

def i = 0
while (i<SearchResults.size()) {
	println(SearchResults[i].getText())
	i++
}

