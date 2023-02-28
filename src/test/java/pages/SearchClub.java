package pages;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import qa.mobile.iosBase;

public class SearchClub extends iosBase {
    @iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name=\"CHOOSE ONE NOW AND FOLLOW MORE LATER\"]") private WebElement SearchClubPage;
    @iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name=\"National Competitions\"]") private WebElement NationalCompetitions;
    @iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name=\"Premier Cricket\"]") private WebElement PremierCricket;
    @iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name=\"Australian Capital Territory\"]") private WebElement AustralianCapitalTerritory;
    @iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name=\"New South Wales\"]") private WebElement NewSouthWales;


    IOSDriver driver;
    public SearchClub(IOSDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
    }

    public SearchClub SearchClubPage(){
        util.click(SearchClubPage);
        return this;
    }
    public SearchClub NationalCompetitions(){
        util.click(NationalCompetitions);
        return this;
    }
    public SearchClub PremierCricket(){
        util.click(PremierCricket);
        return this;
    }
    public SearchClub AustralianCapitalTerritory(){
        util.click(AustralianCapitalTerritory);
        return this;
    }
    public Follow selectNationalComp() {
        util.waitforVisibility(NationalCompetitions,10);
        util.click(NationalCompetitions);
        return new Follow(driver);
    }
}

