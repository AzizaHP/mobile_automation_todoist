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

Mobile.tap(findTestObject('mobile/ImageButton-HamburgerMenu'), 0)

Mobile.tap(findTestObject('Object Repository/mobile/ViewGroup-ShoppingList_project'), 0)

Mobile.tap(findTestObject('Object Repository/mobile/ImageButton-add_plus_icon'), 0)

Mobile.setText(findTestObject('Object Repository/mobile/EditText-Task_name'), 'Cheese', 0)

Mobile.setText(findTestObject('Object Repository/mobile/EditText-Description'), 'for baking nastar', 0)

Mobile.tap(findTestObject('Object Repository/mobile/TextView-Due_date'), 0)

Mobile.tap(findTestObject('Object Repository/mobile/TextView-Next_week'), 0)

Mobile.tap(findTestObject('Object Repository/mobile/ImageView-Submit'), 0)

Mobile.tap(findTestObject('mobile/ViewGroup - Shopping List header'), 0)

WS.sendRequestAndVerify(findTestObject('API/check_task'))

