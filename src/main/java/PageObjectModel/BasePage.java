package PageObjectModel;

import Utilities.DriverAppium;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.time.Duration;


public class BasePage extends DriverAppium {

    public BasePage(AppiumDriver<WebElement> driver){
        this.driver = driver;
    }


    public WebElement find(By locator) {
        return driver.findElement(locator);
    }

    public WebElement finds(By locator,int select) {
        return driver.findElements(locator).get(select);
    }

    public void clickFunction(By locator) {
        find(locator).click();
    }

    public void typeFunction(By locator,String text) {
        find(locator).sendKeys(text);
    }
    public void typeFunction(By locator,Keys keys) {
        find(locator).sendKeys(keys);
    }

    public void assertionText(By locator,String equals) {
        Assert.assertEquals(find(locator).getText(),equals);
        print("Given message : "+find(locator).getText());
    }

    public void clickSelectFunction(By locator,int select) {
        finds(locator,select).click();
    }

    public void touchScreen(int x,int y) {
        TouchAction toc = new TouchAction(driver);
        toc
                .press(PointOption.point(x,y))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .release().perform();
    }

}
