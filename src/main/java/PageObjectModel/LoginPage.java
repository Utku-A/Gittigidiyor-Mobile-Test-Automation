package PageObjectModel;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class LoginPage extends BasePage{
    public LoginPage(AppiumDriver<MobileElement> driver) {
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
