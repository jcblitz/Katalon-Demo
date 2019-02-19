import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

//
//public static String randomString() {
//	String chars = "abcdefghijklmnopqrstuvwxyz0123456789";
//	int length = 5;
//  Random rand = new Random();
//  StringBuilder sb = new StringBuilder();
//  for (int i=0; i<length; i++) {
//	sb.append(chars.charAt(rand.nextInt(chars.length())));
//  }
//  return sb.toString();
//}
WebUI.openBrowser('http://automationpractice.com/index.php?id_product=1&controller=product#/color-orange/size-m')

WebUI.selectOptionByValue(findTestObject('Page_Faded Short Sleeve T-shirts -/Select Size'), '2', false)

WebUI.click(findTestObject('Page_Faded Short Sleeve T-shirts -/Add To Cart'))

WebUI.waitForElementVisible(findTestObject('Page_Faded Short Sleeve T-shirts -/Proceed to checkout'), 5)

WebUI.click(findTestObject('Page_Faded Short Sleeve T-shirts -/Proceed to checkout'))

WebUI.click(findTestObject('Page_Order - My Store/span_Proceed to checkout'))

WebUI.setText(findTestObject('Page_Login - My Store/Email Address'), ('email-' + randomString()) + 
    '@test.com')

WebUI.click(findTestObject('Page_Login - My Store/Create An Account Button'))

WebUI.click(findTestObject('Page_Login - My Store/Gender'))

WebUI.setText(findTestObject('Page_Login - My Store/Firstname'), 'Sample')

WebUI.setText(findTestObject('Page_Login - My Store/Lastname'), 'User')

WebUI.setEncryptedText(findTestObject('Page_Login - My Store/Password'), 'E3oD6E1tWJRe8Jx6DFuHew==')

WebUI.selectOptionByValue(findTestObject('Page_Login - My Store/Birth - Day'), '1', 
    true)

WebUI.selectOptionByValue(findTestObject('Page_Login - My Store/Birth - Month'), '1', 
    true)

WebUI.selectOptionByValue(findTestObject('Page_Login - My Store/Birth - Year'), '2019', 
    true)

WebUI.setText(findTestObject('Page_Login - My Store/Address 1'), '1111 main st')

WebUI.setText(findTestObject('Page_Login - My Store/City'), 'Wayne')

WebUI.selectOptionByValue(findTestObject('Page_Login - My Store/State'), '38', 
    true)

WebUI.setText(findTestObject('Page_Login - My Store/Postcode'), '19406')

WebUI.setText(findTestObject('Page_Login - My Store/Phone - Mobile'), '2155551234')

WebUI.click(findTestObject('Page_Login - My Store/Register Button'))

WebUI.setText(findTestObject('Object Repository/Page_Order - My Store/textarea_If you would like to'), 'This is a test order, please ignore. ')

WebUI.click(findTestObject('Page_Faded Short Sleeve T-shirts -/Process Address'))

WebUI.click(findTestObject('Object Repository/Page_Order - My Store/input_2.00_cgv'))

WebUI.click(findTestObject('Object Repository/Page_Order - My Store/span_Proceed to checkout_1'))

WebUI.click(findTestObject('Page_Order - My Store/Pay By Check'))

WebUI.click(findTestObject('Object Repository/Page_My Store/span_I confirm my order'))

WebUI.verifyElementText(findTestObject('Confirmation Page/Order Message Text'), 'Your order on My Store is complete.')

WebUI.verifyElementText(findTestObject('Confirmation Page/Total Price'), '$18.51')

WebUI.closeBrowser()

String randomString() {
    String chars = 'abcdefghijklmnopqrstuvwxyz0123456789'

    int length = 5

    Random rand = new Random()

    StringBuilder sb = new StringBuilder()

    for (int i = 0; i < length; i++) {
        sb.append(chars.charAt(rand.nextInt(chars.length())))
    }
    
    return sb.toString()
}

