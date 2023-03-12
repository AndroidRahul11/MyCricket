package pages;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import qa.mobile.iosBase;

public class SplashScreen extends iosBase {
    IOSDriver driver;
    public SplashScreen(IOSDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Skip\"]") public WebElement skipBtn;
    @iOSXCUITFindBy(xpath= "//XCUIElementTypeStaticText[@name=\"Choose your primary role\"]") public WebElement RoleSelection;
    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"PLAYER\"]") public WebElement Player;
    @iOSXCUITFindBy(xpath= "//XCUIElementTypeButton[@name=\"PARENT\"]") private WebElement Parent;
    @iOSXCUITFindBy(iOSClassChain= "//XCUIElementTypeStaticText[@name=\"COACH\"]") private WebElement Coach;
    @iOSXCUITFindBy(iOSClassChain= "//XCUIElementTypeStaticText[@name=\"SUPPORTER\"]") private WebElement Supporter;
    @iOSXCUITFindBy(xpath ="//XCUIElementTypeSearchField[@name=\"Search Clubs\"]") private WebElement searchClub;
    @iOSXCUITFindBy(xpath ="//XCUIElementTypeButton[@name=\"Search\"]") private WebElement searchbtn;
    @iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name=\"Boronia Cricket Club\"]") private WebElement selectClub;
    @iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name=\"View Club Directory\"]") private WebElement viewClubDirectory;

   public String getTitle(){
       return util.getAttribute(RoleSelection, "text");
   }

   public SplashScreen navigateToHome(String primaryRole, String searchText){
    util.waitforVisibility(skipBtn, 30);
    util.click(skipBtn);
    util.waitforVisibility(Player, 10);
    switch (primaryRole.toLowerCase()){
        case "player":
            util.click(Player);
            util.click(searchClub);
            util.sendkeys(searchClub, searchText);
            util.click(searchbtn);
            WebElement element = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\""+searchText+"\"]"));
            util.waitforVisibility(element, 20);
            util.click(element);
            break;
        case "parent":
                util.click(Parent);
                util.click(searchClub); //Please verify xpath for Search Box
                util.sendkeys(searchClub, searchText);
            util.click(searchbtn);
                util.click(selectClub);
                break;
        case  "coach":
                    util.click(Coach);
                    util.click(searchClub);//Please verify xpath for Search Box
                    util.sendkeys(searchClub, searchText);
            util.click(searchbtn);
                    util.click(selectClub);
                    break;
        case  "supporter":
            util.click(Supporter);
            util.click(searchClub);//Please verify xpath for Search Box
            util.sendkeys(searchClub, searchText);
            util.click(searchbtn);
            util.click(selectClub);
            break;
            default:
                System.out.println("Please provide valid primary Role");
                break;
    }


    return this;
   }

}


