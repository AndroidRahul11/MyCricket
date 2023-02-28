package pages;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import qa.mobile.iosBase;

public class HomeScreen extends iosBase {
    IOSDriver driver;
    public HomeScreen(IOSDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"More\"]") public WebElement userNameOnDashboard;
    @iOSXCUITFindBy(xpath= "//XCUIElementTypeStaticText[@name=\"Log in to unlock your dashboard\"]") public WebElement loginbtn;
    @iOSXCUITFindBy(xpath= "//XCUIElementTypeStaticText[@name=\"Choose your primary role\"]") public WebElement RoleSelection;
    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"PLAYER\"]") public WebElement Player;
    @iOSXCUITFindBy(xpath= "//XCUIElementTypeButton[@name=\"PARENT\"]") private WebElement Parent;
    @iOSXCUITFindBy(iOSClassChain= "//XCUIElementTypeStaticText[@name=\"COACH\"]") private WebElement Coach;
    @iOSXCUITFindBy(iOSClassChain= "//XCUIElementTypeStaticText[@name=\"SUPPORTER\"]") private WebElement Supporter;

   public String getTitle(){
       return util.getAttribute(RoleSelection, "text");
   }

   public HomeScreen selectPl(){
       util.click(Player);
       return this;
   }
   public HomeScreen selParent(){
       util.click(Parent);
       return this;
   }
    public HomeScreen Coach(){
        util.click(Coach);
        return this;
    }
    public HomeScreen Supporter(){
        util.click(Supporter);
        return this;
    }

    public Player accessPlayer() {
        //Player.click();
        util.waitforVisibility(Player,10);
        util.click(Player);
        return new Player(driver);
    }

    public Player selectParent() {
        util.waitforVisibility(Parent,10);
        util.click(Parent);
        return new Player(driver);
    }
    public Player selectCoach() {
        util.waitforVisibility(Coach,10);
        util.click(Coach);
        return new Player(driver);
    }
    public Player selectSupporter() {
        util.waitforVisibility(Supporter,10);
        util.click(Supporter);
        return new Player(driver);
    }

    public void navigateToLoginPage() {
        util.waitforVisibility(loginbtn,20);
        util.click(loginbtn);
    }

    public void verifyUserIsLoggedIn() {
        util.waitforVisibility(userNameOnDashboard,15);
        Assert.assertTrue(userNameOnDashboard.getText().contains("Hello Anshu!\n"),"Hello Anshu!");

    }

}


