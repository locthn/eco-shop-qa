import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.truetest.TrueTestScripts
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'Step 1: Navigate to Page home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/')

'Step 2: Login into Application'

TrueTestScripts.login()

'Step 3: At Page home, click on h2 object > navigate to Page product'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/h2_object'))

'Step 4: At Page product, click on button add to basket'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_add_to_basket'))

'Step 5: At Page product, click on button 1'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_1'))

'Step 6: At Page product, click on button check out > navigate to Page checkout'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_check_out'))

'Step 7: At Page checkout, click on button next step'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_next_step'))

'Step 8: At Page checkout, click on input fullname'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_fullname'))

'Step 9: At Page checkout, input on input fullname'

WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_fullname'), input_fullname)

'Step 10: At Page checkout, click on input address'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_address'))

'Step 11: At Page checkout, input on input address'

WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_address'), input_address)

'Step 12: At Page checkout, click on input email'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_email'))

'Step 13: At Page checkout, input on input email'

WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_email'), input_email)

'Step 14: At Page checkout, click on input object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_object'))

'Step 15: At Page checkout, input on input object'

WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_object'), input_object)

'Step 16: At Page checkout, click on div object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/div_object'))

'Step 17: At Page checkout, click on button next step'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_next_step_1'))

'Step 18: Add visual checkpoint at Page checkout'

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Verify Checkout Process with Address Information_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
