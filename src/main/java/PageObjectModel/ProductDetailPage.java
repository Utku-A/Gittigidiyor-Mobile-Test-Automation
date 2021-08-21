package PageObjectModel;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductDetailPage extends BasePage {
    public ProductDetailPage(AppiumDriver<WebElement> driver){
        super(driver);
    }

    By buyNowButtonLocator = By.id("buy-now");
    By addToCardLocator = By.xpath("//*[@id=\"sp-addbasket-button\"]/form");
    By checkCardLocator = By.xpath("//*[@id=\"cart-items-container\"]/h1");

    public ProductDetailPage buyNowButton() {
        clickFunction(buyNowButtonLocator);
        return this;
    }

    public ProductDetailPage addToCard() {
        clickFunction(addToCardLocator);
        return this;
    }

    public ProductDetailPage checkCard() {
        assertionText(checkCardLocator,"Alışveriş Sepetim");
        return this;
    }

}
