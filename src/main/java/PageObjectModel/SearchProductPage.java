package PageObjectModel;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class SearchProductPage extends BasePage {
    public SearchProductPage(AppiumDriver<MobileElement> driver) {
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
