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

'Step 1: Navigate to Page  product'

WebUI.navigateToUrl(GlobalVariable.application_domain + 'product')

'Step 2: Login into Application'

TrueTestScripts.login()

'Step 3: At Page product, click on hyperlink sign up > navigate to Page signup'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/hyperlink_sign_up'))

'Step 4: At Page signup, click on hyperlink sign in > navigate to Page signin'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/hyperlink_sign_in'))

'Step 5: At Page signin, input on input email > navigate to Page home'

WebUI.setText(findTestObject('AI-Generated/Page_signin/input_email'), input_email)

'Step 6: At Page home, click on h2 object > navigate to Page product'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/h2_object'))

'Step 7: At Page product, click on button add to basket'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_add_to_basket'))

'Step 8: At Page product, click on div object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_object'))

'Step 9: At Page product, click on hyperlink view account > navigate to Page account'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/hyperlink_view_account'))

'Step 10: At Page account, click on button edit account > navigate to Page account edit'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_account/button_edit_account'))

'Step 11: At Page account edit, click on input fullname'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_account_edit/input_fullname'))

'Step 12: At Page account edit, input on input fullname'

WebUI.setText(findTestObject('AI-Generated/Page_account_edit/input_fullname'), input_fullname)

'Step 13: At Page account edit, click on input email'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_account_edit/input_email'))

'Step 14: At Page account edit, input on input email'

WebUI.setText(findTestObject('AI-Generated/Page_account_edit/input_email'), input_email_1)

'Step 15: At Page account edit, click on input object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_account_edit/input_object'))

'Step 16: At Page account edit, input on input object'

WebUI.setText(findTestObject('AI-Generated/Page_account_edit/input_object'), input_object)

'Step 17: At Page account edit, click on button update profile'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_account_edit/button_update_profile'))

'Step 18: Add visual checkpoint at Page account edit'

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Verify Account Profile Editing and Adding Items to Basket_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
