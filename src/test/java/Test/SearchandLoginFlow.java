package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.MoreScreen;
import qa.mobile.iosBase;

import java.lang.reflect.Method;

public class SearchandLoginFlow extends iosBase {

    @Test(priority = 0)
    public void verifyIsPlayerAvailable(){
        if(homeScreen.isPlayerScreenPresent()){

        }else{
            Assert.fail("Screen not exist.So we are skipped the TC.");
        }
    }
    @Test(priority = 1, dependsOnMethods = {"verifyIsPlayerAvailable"})
    public void clickPlayer(){
        homeScreen.accessPlayer();
    }

    @Test(priority = 2, dependsOnMethods = {"verifyIsPlayerAvailable"})
    public void searchPlayerFunctionality(){
        Splayer.searchPlayer("boronia");
        try {
            Thread.sleep(10000);
        }catch (Exception e)
        {
        }
    }
    @Test(priority = 3, dependsOnMethods = {"verifyIsPlayerAvailable"})
    public void viewPlayerDirectory(){
        Splayer.selectClubDirectory();
        //Sc.NationalCompetitions();

    }
    @Test(priority = 4)
    public void loginTest(){
        homeScreen.navigateToLoginPage();
        loginScreen.logInToApplication();
        homeScreen.verifyUserIsLoggedIn();
    }
    @Test(priority = 5)
    public void logoutTest(){
        moreScreen.logout();
    }
    @BeforeMethod
    public void beforeMethod(Method m){
        System.out.println("\n" + "***** starting Test:"  +m.getName()+ "*****" + "\n");
    }
}


