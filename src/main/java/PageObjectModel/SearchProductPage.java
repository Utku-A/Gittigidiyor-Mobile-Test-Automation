package PageObjectModel;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchProductPage extends BasePage {
    public SearchProductPage(AppiumDriver<WebElement> driver) {
        super(driver);
    }

    By selectProductLocator = By.className("lazyload-img");
    By selectSuperPriceProductsLocator = By.className("product-card__image");


    public SearchProductPage selectProduct(int select) {
        clickSelectFunction(selectProductLocator,select);
        return this;
    }

    public SearchProductPage selectSuperPriceProducts(int select) {
        clickSelectFunction(selectSuperPriceProductsLocator,select+1);
        return this;
    }
}
