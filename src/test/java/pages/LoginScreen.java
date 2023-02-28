package pages;

import io.appium.java_client.HidesKeyboard;
import io.appium.java_client.HidesKeyboardWithKeyName;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.remote.HideKeyboardStrategy;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.indexeddb.model.Key;
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

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"or\"]") private WebElement or;
    @iOSXCUITFindBy(xpath ="//XCUIElementTypeButton[@name=\"Log in\"]") private WebElement LoginBtn;
    @iOSXCUITFindBy(xpath ="//XCUIElementTypeButton[@name=\"Continue to App\"]") private WebElement ContinuetoApp; //XCUIElementTypeButton[@name="Continue to App"]


    public void logInToApplication(){
        util.waitforVisibility(EmailId,30);
        util.sendkeys(EmailId, "anshuyadavplayhq+1@gmail.com");
        util.click(or);
        util.sendkeys(Password, "upcoming@12345");
        util.click(or);
        //util.scrollToEndAction();
        util.click(LoginBtn);
        util.click(ContinuetoApp);

    }
}