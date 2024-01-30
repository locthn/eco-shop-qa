import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable
import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'Step 1: Navigate to Page featured'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/featured')

'Step 2: Login into Application'

TrueTestScripts.login()

'Step 3: At Page featured, click on input object > navigate to Page search herringbone'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_featured/input_object'))

'Step 4: At Page search herringbone, input on input object'

WebUI.setText(findTestObject('AI-Generated/Page_search_herringbone/input_object'), input_object)

'Step 5: At Page search herringbone, click on svg object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_search_herringbone/svg_object'))

'Step 6: At Page search herringbone, click on img object > navigate to Page product'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_search_herringbone/img_object'))

'Step 7: Add visual checkpoint at Page product'

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Verify Product Page after Logging In_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
