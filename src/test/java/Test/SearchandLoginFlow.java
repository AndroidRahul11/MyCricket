package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.mobile.iosBase;

import java.lang.reflect.Method;

public class SearchandLoginFlow extends iosBase {

    @Test(priority = 0)
    public void verifyIsPlayerAvailable(){
        if(homeScreen.isPlayerScreenPresent()){

        }else{
            Assert.fail("Screen not exist.");
        }
    }
    @Test(priority = 1, dependsOnMethods = {"verifyIsPlayerAvailable"})
    public void clickPlayer(){
        homeScreen.accessPlayer();
    }

    @Test(priority = 2)
    public void searchPlayerFunctionality(){
        Splayer.searchPlayer("boronia");
        try {
            Thread.sleep(10000);
        }catch (Exception e)
        {
        }
    }
    @Test(priority = 3)
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
        moreScreen.Morebtn();
        moreScreen.AccHolder();
        moreScreen.logoutbtn();
    }
    @BeforeMethod
    public void beforeMethod(Method m){
        System.out.println("\n" + "***** starting Test:"  +m.getName()+ "*****" + "\n");
    }
}


