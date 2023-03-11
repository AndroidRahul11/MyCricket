package Test;

import org.testng.annotations.Test;
import pages.MoreScreen;
import qa.mobile.iosBase;

public class LoginTests extends iosBase {

    @Test(priority = 1)
    public void VerifyloginFunctionality(){
        homeScreen.navigateToLoginPage();
        loginScreen.logInToApplication();
        homeScreen.verifyUserIsLoggedIn();
    }
    @Test(priority = 2)
    public void VerifyLogoutFunctionality(){
         homeScreen.navigateToLoginPage();
         loginScreen.logInToApplication();
         homeScreen.verifyUserIsLoggedIn();
         moreScreen.logout();
         homeScreen.verifyUserIsLoggedOut();
     }
}




