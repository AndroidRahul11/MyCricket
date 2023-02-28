package pages;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import qa.mobile.iosBase;

public class LoginScreen extends iosBase {
    IOSDriver driver;
    public LoginScreen(IOSDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
    }


    @iOSXCUITFindBy(xpath ="//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeTextField") private WebElement EmailId;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeSecureTextField") private WebElement Password;
    @iOSXCUITFindBy(xpath ="//XCUIElementTypeButton[@name=\"Log in\"]") private WebElement LoginBtn;


    public void logInToApplication(){
        util.waitforVisibility(EmailId,30);
        util.sendkeys(EmailId, "cricket.testers@gmail.com");
        EmailId.sendKeys(Keys.RETURN);
        util.sendkeys(Password, "Cr1cket14");
        Password.sendKeys(Keys.RETURN);
        util.scrollToEndAction();
        util.click(LoginBtn);

    }
}