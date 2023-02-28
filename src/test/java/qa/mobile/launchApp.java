package qa.mobile;


import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;

import java.time.Duration;

public class launchApp extends iosBase{

    @Test
    public void iOSBasicsTest() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"Skip\"`]")) .click();
        driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"PLAYER\"`]")).click();
        System.out.println("Clicked on Player Option");

       driver.findElement(AppiumBy.accessibilityId("Search Clubs")).click();
        driver.findElement(AppiumBy.accessibilityId("Search Clubs")).sendKeys("Boronia");
        System.out.println("Searched for Boronia");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //driver.findElement(AppiumBy.accessibilityId("search")).click();
        driver.findElement(AppiumBy.accessibilityId("Search")).click();
        //driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"search\"`]\n")).click();
        System.out.println("Searched for Boronia");

    }
}
