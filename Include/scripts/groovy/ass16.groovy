import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class ass16 {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I want to write a step with (.*)")
	def I_want_to_write_a_step_with_name(String name) {
		println name
	}

	@Given ("Navigate to Katalon Signin page")
	def navigateToSignin() {
		WebUI.openBrowser("https://katalon.com/sign-in ")
		WebUI.maximizeWindow()
	}

	@When ("User enter valid (.*) and valid (.*)")
	def enterValidUsernameAndValidPassword(String username, String password) {
		WebUI.sendKeys(findTestObject('Object Repository/OR_ass16/Input_Username'), username)
		WebUI.sendKeys(findTestObject('Object Repository/OR_ass16/Input_Password'), password)
	}

	@And ("User click Sign in button")
	def clickSigninButton() {
		WebUI.click(findTestObject('Object Repository/OR_ass16/Btn_Signin'))
	}

	@And ("User click avatar icon on the top of the screen")
	def clickAvatarIcon() {
		WebUI.click(findTestObject('Object Repository/OR_ass16/Btn_AvatarIcon'))
	}

	@Then ("Username MUST MATCH the (.*) in step 2")
	def verifyUsernameInSigninPageAndUsernameInProfile(String username) {
		def valueUsernameInAvatar = WebUI.getText(findTestObject('Object Repository/OR_ass16/Label_UsernameInAvatar'))
		assert valueUsernameInAvatar == username
	}
}
