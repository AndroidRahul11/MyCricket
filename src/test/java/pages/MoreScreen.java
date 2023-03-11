package pages;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import qa.mobile.iosBase;

public class MoreScreen extends iosBase {
    IOSDriver driver;
    public MoreScreen(IOSDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
    }

    @iOSXCUITFindBy(xpath= "//XCUIElementTypeButton[@name=\"Home\"]") public WebElement Homebtn;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Matches\"]") public WebElement Matchesbtn;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Player Stats\"]") public WebElement PlayerStatsbtn;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Ladders\"]") public WebElement Laddersbtn;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"More\"]") public WebElement Morebtn;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Account holder\"]") public WebElement AccHolder;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Clubs\"]") public WebElement Following;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`value == \"On\"`][1]") public WebElement Follclub;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"LOGOUT\"]") public WebElement logoutbtn;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Done\"]") public WebElement DoneLogout;


    public MoreScreen Morebtn(){
        util.waitforVisibility(Morebtn, 10);
        util.click(Morebtn);
        return this;
    }

    public MoreScreen AccHolder(){
        util.waitforVisibility(AccHolder, 10);
        util.click(AccHolder);
        return this;
    }
    public MoreScreen logoutbtn(){
        util.waitforVisibility(logoutbtn, 10);
        util.click(logoutbtn);
        return this;
    }
    public MoreScreen DoneLogout(){
        util.waitforVisibility(DoneLogout, 10);
        util.click(DoneLogout);
        return this;
    }
    public MoreScreen logout(){
         moreScreen.Morebtn();
         moreScreen.AccHolder();
         moreScreen.logoutbtn();
         moreScreen.DoneLogout();
         return this;
     }
}


