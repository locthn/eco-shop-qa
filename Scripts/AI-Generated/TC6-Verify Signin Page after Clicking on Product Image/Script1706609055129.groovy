import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

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

'Step 4: At Page product, click on img object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/img_object'))

'Step 5: At Page product, click on h6 object > navigate to Page signin'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/h6_object'))

'Step 6: Add visual checkpoint at Page signin'

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Verify Signin Page after Clicking on Product Image_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
