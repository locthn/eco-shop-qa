package katalon.truetest

import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import com.kms.katalon.core.model.FailureHandling
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.webui.keyword.WebUiBuiltInKeywords as WebUI
import your.package
import authentication.Login

public class TrueTestScripts {
    
    public static void login() {
        try {
            // Trigger a Login test case
            WebUI.callTestCase(findTestCase('Login'))
            
            // Trigger a custom Login method
            // call your custom login method
            Login.login()
            
            // Trigger a custom Login keyword
            CustomKeywords.login()
        } catch(Exception e) {
            if (e.getCause() instanceof WebElementNotFoundException) {
                KeywordUtil.logInfo(e.getMessage())
                KeywordUtil.markWarning(e.getMessage())
            } else {
                throw e
            }
        }
    }
}


