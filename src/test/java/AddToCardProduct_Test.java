import PageObjectModel.IndexPage;
import PageObjectModel.LoginPage;
import PageObjectModel.ProductDetailPage;
import PageObjectModel.SearchProductPage;
import Utilities.DriverAppium;
import org.springframework.core.annotation.Order;
import org.testng.annotations.Test;


public class AddToCardProduct_Test extends DriverAppium {

    IndexPage indexPage;
    SearchProductPage searchProductPage;
    ProductDetailPage productDetailPage;
    LoginPage loginPage;

    @Order(1)
    @Test
    public void TS001() {
        url("index");
        indexPage = new IndexPage(driver);
        searchProductPage = new SearchProductPage(driver);
        productDetailPage = new ProductDetailPage(driver);

        indexPage
                .popupMessageClose()
                .notificationAccept()
                .searchBox("Araba");

        searchProductPage
                .selectProduct(5);

        productDetailPage
                .addToCard()
                .checkCard();

    }

    @Order(2)
    @Test
    public void TS002() {
        url("login");
        loginPage = new LoginPage(driver);

        loginPage
                .typeEmailArea("deneme@debene.com")
                .typePassportArea("Deneme123")
                .loginButtonClick();
    }
}
