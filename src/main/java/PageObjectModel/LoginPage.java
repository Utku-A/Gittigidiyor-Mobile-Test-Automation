package PageObjectModel;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{
    public LoginPage(AppiumDriver<WebElement> driver) {
        super(driver);
    }

    By typeEmailTextAreaLocator = By.name("kullanici");
    By typePassportAreaLocator = By.name("sifre");

    public LoginPage typeEmailArea(String email) {
        typeFunction(typeEmailTextAreaLocator,email);
        return this;
    }

    public LoginPage typePassportArea(String passport) {
        typeFunction(typePassportAreaLocator,passport);
        return this;
    }

    public LoginPage loginButtonClick() {
        typeFunction(typeEmailTextAreaLocator, Keys.ENTER);
        return this;
    }

}
