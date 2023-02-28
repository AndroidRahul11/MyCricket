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




}


