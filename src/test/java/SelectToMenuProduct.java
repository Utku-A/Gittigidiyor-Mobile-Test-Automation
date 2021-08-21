import PageObjectModel.IndexPage;
import PageObjectModel.ProductDetailPage;
import PageObjectModel.SearchProductPage;
import Utilities.DriverAppium;
import org.testng.annotations.Test;

public class SelectToMenuProduct extends DriverAppium {

    IndexPage indexPage;
    SearchProductPage searchProductPage;
    ProductDetailPage productDetailPage;

    @Test
    public void TS003() {
        url("gittigidiyor.com");
        indexPage = new IndexPage(driver);
        searchProductPage = new SearchProductPage(driver);
        productDetailPage = new ProductDetailPage(driver);

        indexPage
                .popupMessageClose()
                .notificationAccept()
                .menuButtonClick()
                .superPriceButtonClick();

        searchProductPage
                .selectSuperPriceProducts(2);

        productDetailPage
                .addToCard()
                .checkCard();
    }

}
