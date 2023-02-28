package pages;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import qa.mobile.iosBase;

public class Player extends iosBase {
    @iOSXCUITFindBy(xpath ="//XCUIElementTypeSearchField[@name=\"Search Clubs\"]") private WebElement searchPlayer;
    @iOSXCUITFindBy(xpath ="//XCUIElementTypeButton[@name=\"Search\"]") private WebElement searchbtn;
    @iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name=\"View Club Directory\"]") private WebElement viewClubDirectory;


    IOSDriver driver;
    public Player (IOSDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
    }

    public Player searchPlayer(String searchText) {
        util.click(searchPlayer);
        util.sendkeys(searchPlayer, searchText);
        util.click(searchbtn);
        return this;
    }

    public SearchClub selectClubDirectory() {
        util.click(viewClubDirectory);
        return new SearchClub(driver);
    }
}

