package Test;

import org.testng.annotations.Test;
import pages.MoreScreen;
import qa.mobile.iosBase;

public class LoginTests extends iosBase {

    @Test(priority = 1)
    public void clickPlayer(){
        homeScreen.navigateToLoginPage();
        loginScreen.logInToApplication();
        homeScreen.verifyUserIsLoggedIn();
    }
}




