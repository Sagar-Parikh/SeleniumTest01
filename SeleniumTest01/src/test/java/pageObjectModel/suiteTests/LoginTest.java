package pageObjectModel.suiteTests;

import org.testng.annotations.Test;
import pageObjectModel.data.LoginTestData;
import pageObjectModel.pages.LoginPage;
import pageObjectModel.pages.helpers.HelperBase;
import pageObjectModel.weaver.WeaverBase;

public class LoginTest extends WeaverBase {

	LoginPage loginPage;
	
    @Test(groups = {"Regression"}, dataProvider = "data-emails-login-regression", dataProviderClass= LoginTestData.class, priority = 1)
    public void validateLoginRegression(String userEmail, String password){
      loginPage = new LoginPage(driver);
      loginPage.enterCredentials(userEmail, password);
      loginPage.sendCredentials();
      
    }


}
