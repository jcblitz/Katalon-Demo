import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('http://automationpractice.com/index.php')

WebUI.verifyElementPresent(findTestObject('Home Page/Cart'), 0)

WebUI.verifyElementPresent(findTestObject('Home Page/Search Bar'), 0)

WebUI.verifyElementPresent(findTestObject('Home Page/Menu Bar'), 0)

WebUI.verifyElementPresent(findTestObject('Home Page/Home Slider'), 0)

WebUI.verifyElementPresent(findTestObject('Home Page/CMS Top'), 0)

WebUI.verifyElementPresent(findTestObject('Home Page/Featured Items'), 0)

WebUI.closeBrowser()

