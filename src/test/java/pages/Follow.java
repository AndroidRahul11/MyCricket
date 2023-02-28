package pages;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Follow {
    @iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name=\"CHOOSE ONE NOW AND FOLLOW MORE LATER\"]") private WebElement CricketAustrolia;


    IOSDriver driver;
    public Follow (IOSDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
    }
}
