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

Mobile.startExistingApplication('com.todoist')

Mobile.tap(findTestObject('mobile/Button-Continue_with_email'), 20)

Mobile.setText(findTestObject('Object Repository/mobile/EditText-Email'), 'erikasnow99@gmail.com', 20)

Mobile.tap(findTestObject('mobile/Button-CONTINUE_WITH_EMAIL (1)'), 20)

Mobile.setEncryptedText(findTestObject('Object Repository/mobile/EditText-Password'), 'iZat7NiuvkwZOfTgc9SU/g==', 
    30)

Mobile.tap(findTestObject('mobile/Button-LOG_IN'), 20)

Mobile.getText(findTestObject('Object Repository/mobile/TextView - Today'), 20)

Mobile.waitForElementPresent(findTestObject('mobile/ImageButton-HamburgerMenu'), 20)

Mobile.tap(findTestObject('mobile/ImageButton-HamburgerMenu'), 20)

Mobile.verifyElementText(findTestObject('mobile/TextView - Shopping List'), 'Shopping List')

