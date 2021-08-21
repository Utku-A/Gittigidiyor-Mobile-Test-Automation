<img src = ReadmeImages/logo.png>

</br>

# Gittigidiyor Mobile Test Automation

**Used tools** : Selenium Web Driver, Appium, TestNG, Maven

## Installation For Android
- Appium for desktop
- Android SDK, Android Studio or
- Path ("JAVA_HOME" "ANDROID_HOME")
- Android version for api

## Device Connection Setting

File : src/main/java/Utilities/DriverAppium
```Java
// Device setup

caps.setCapability(CapabilityType.PLATFORM_NAME, "OS");
caps.setCapability(MobileCapabilityType.VERSION, "OS Version");
caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Mobile Name");
caps.setCapability(MobileCapabilityType.UDID, "Device ID");
```

## Test Scenarios
- Add to card search product
- Login test
- Super price menu select product
