package PageObjectModel;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class IndexPage extends BasePage{
    public IndexPage(AppiumDriver<WebElement> driver){
        super(driver);
    }

    By searchBoxLocator = By.name("k");
    By popupMessageLocator = By.name("close");
    By menuButtonLocator = By.xpath("//*[@id=\"main-header\"]/div[2]/div/div/div[1]/div[1]/div/div[1]");
    By superPriceButtonLocator = By.xpath("//*[@id=\"accordion__panel-0\"]/ul/li[2]/a[1]");

    public IndexPage searchBox(String searchProduct) {
        typeFunction(searchBoxLocator,searchProduct);
        typeFunction(searchBoxLocator, Keys.ENTER);
        return this;
    }

    public IndexPage popupMessageClose() {
        clickFunction(popupMessageLocator);
        return this;
    }

    public IndexPage notificationAccept() {
        touchScreen(907,1031);
        return this;
    }

    public IndexPage menuButtonClick() {
        clickFunction(menuButtonLocator);
        return this;
    }

    public IndexPage superPriceButtonClick() {
        clickFunction(superPriceButtonLocator);
        return this;
    }
}
