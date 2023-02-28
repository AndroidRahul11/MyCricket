package Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SearchClub;
import qa.mobile.iosBase;

import java.lang.reflect.Method;

public class searchPlayer extends iosBase {

    @Test(priority = 1)
    public void clickPlayer(){
        homeScreen.selectPl();
        //hs.accessPlayer();

    }
    @Test(priority = 2)
    public void searchPlayerFunctionality(){
        //hs.accessPlayer();
        Splayer.searchPlayer("boronia");
    }

    @Test(priority = 3)
    public void viewPlayerDirectory(){
        //hs.accessPlayer();
        Splayer.selectClubDirectory();
        Sc.NationalCompetitions();
    }
    @Test(priority = 4)
    public void clickParent(){
        homeScreen.selectParent();
    }

    @BeforeMethod
    public void beforeMethod(Method m){
        System.out.println("\n" + "***** starting Test:"  +m.getName()+ "*****" + "\n");

    }

}


