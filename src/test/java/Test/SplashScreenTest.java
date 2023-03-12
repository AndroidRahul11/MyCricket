package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.MoreScreen;
import qa.mobile.iosBase;

import java.lang.reflect.Method;

@Test(priority=1)
public class SplashScreenTest extends iosBase {

    @Test
    public void VerifyFirstLaunchPages(){
        splashScreen.navigateToHome("player", "Boronia Cricket Club");
        homeScreen.verifyHomeScreenWithoutLogin();
    }

    @BeforeMethod
    public void beforeMethod(Method m){
        System.out.println("\n" + "***** starting Test:"  +m.getName()+ "*****" + "\n");
    }
}


