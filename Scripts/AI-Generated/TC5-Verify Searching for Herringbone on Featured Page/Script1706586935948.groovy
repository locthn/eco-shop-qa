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

'Step 1: Navigate to Page  featured'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/featured')

'Step 2: Login into Application'

TrueTestScripts.login()

'Step 3: At Page featured, click on input object > navigate to Page search herringbone'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_featured/input_object'))

'Step 4: Add visual checkpoint at Page search herringbone'

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Verify Searching for Herringbone on Featured Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
