package Utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.URL;

public class DriverAppium {

    public AppiumDriver<WebElement> driver;

    @BeforeTest
    public void setUp() {
        try {

            DesiredCapabilities caps = new DesiredCapabilities();

            caps.setCapability(CapabilityType.PLATFORM_NAME, "Android");
            caps.setCapability(MobileCapabilityType.VERSION, "10");
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android SDK built for x86");
            caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
            caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
            caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");

            URL url = new URL("http://127.0.0.1:4723/wd/hub");

            driver = new AppiumDriver<WebElement>(url, caps);

        } catch (Exception e) {
            print("Hata kaynağı : " + e.getCause());
            print("Hata ayrıntısı : " + e.getMessage());
        }
    }


    @AfterTest
    public void tearDown() {
        driver.close();
        driver.quit();
    }

    public void print(Object text) {
        System.out.println(text);
    }

    public void url(String site) {
        driver.get("https://www."+site);
    }

}
