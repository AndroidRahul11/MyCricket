package qa.mobile;


import Test.Logout;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.*;
import utils.Utility;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class iosBase {
    public IOSDriver driver;
    public AppiumDriverLocalService service;
    public static HomeScreen homeScreen;
    public static Player Splayer;
    public static Utility util;
    public static SearchClub Sc;
    public static Follow Follow;
    public static LoginScreen loginScreen;
    public static MoreScreen moreScreen;
     public static Logout logout;

    @BeforeClass
    public void ConfiguredAppium() throws MalformedURLException {


        AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js")).withIPAddress("0.0.0.0").usingPort(4723).build();
        service.start();

        XCUITestOptions options = new XCUITestOptions();
        options.setDeviceName("Rahul's iPhone");
        options.setPlatformVersion("15.4");
        options.setWdaLaunchTimeout(Duration.ofSeconds(20));
        //options.setDeviceName("iPhone 12");
        //options.setCapability(MobileCapabilityType.UDID,"68371E31-E177-4A3C-816D-DD2A45D46B81");
        options.setCapability(MobileCapabilityType.UDID,"00008110-0001553E3E3B801E");//emu- 6EA4A8ED-1DBD-45BD-A165-01BA6E9550DB //Rahuls - 00008110-0001553E3E3B801E
        options.setCapability("simulatorStartupTimeout", 180000);
        options.setApp("/Users/rahul.vyavahare/Downloads/Testapps/MyCricket.ipa");
        //options.setCapability("bundleId","com.cricketaustralia.mycricket");
        options.setCapability("autoAcceptAlerts", true);
        options.setCapability("noReset", true);
        //driver.SwitchTo().Alert().Accept();


        driver = new IOSDriver(new URL("http://0.0.0.0:4723"), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        try{
            driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"Skip\"`]")) .click();
        }catch (Exception e){
            System.out.println("Skip button not available to click.");
        }
        //driver.findElement(AppiumBy.xpath("//XCUIElementTypeStaticText[@name=\"PLAYER\"]")).click();
        homeScreen=new HomeScreen(driver);
        Splayer = new Player(driver);
        util = new Utility(driver);
         Sc = new SearchClub (driver);
         Follow = new Follow (driver);
        loginScreen = new LoginScreen(driver);
        moreScreen = new MoreScreen(driver);
        //logout = new Logout(driver);
    }
    @AfterClass
    public void teardown() throws InterruptedException {
        Thread.sleep(10000);
        service.stop();
        driver.quit();
    }

}
