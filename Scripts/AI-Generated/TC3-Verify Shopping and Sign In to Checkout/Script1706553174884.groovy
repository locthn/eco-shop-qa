import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.truetest.TrueTestScripts

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'Step 1: Navigate to Page home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '')

'Step 2: At Page home, click on h2 object > navigate to Page product'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/h2_object'))

'Step 3: At Page product, click on button add to basket'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_add_to_basket'))

'Step 4: At Page product, click on svg object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/svg_object'))

'Step 5: At Page product, click on button check out'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_check_out'))

'Step 6: At Page product, click on button sign in to checkout > navigate to Page signin'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_sign_in_to_checkout'))

'Step 7: Login into Application'

TrueTestScripts.login()

'Step 8: Login into Application'

TrueTestScripts.login()

'Step 9: At Page home, click on hyperlink shop > navigate to Page shop'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_shop'))

'Step 10: Add visual checkpoint at Page shop'

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Verify Shopping and Sign In to Checkout_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
