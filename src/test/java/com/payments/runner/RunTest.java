package com.payments.runner;

import com.payments.drivers.Drivers;
import com.payments.pages.*;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Derin on 26/1/16.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"pretty", "html:target/cucumber-html", "json:target/cucumber-json-report.json"},
        features={"src/test/resources/features"},
        monochrome = true,
        tags={"@derin"},
        glue = {"com.payments.steps"}
)

public class RunTest {
    public static AppiumDriver<MobileElement> driver;
    public static String device;
    public static String build;
    public static String platform;
    public static WebDriverWait wait;

    public static Common common;
    public static HomeScreen homeScreen;
    public static LiveQuote liveQuote;
    public static CountrySearch countrySearch;
    public static KeypadScreen keypad;

    @BeforeClass
    public static void setUp() throws Exception {
        driver = Drivers.getDriver();
        device = Drivers.getDevice();
        build = Drivers.getBuild();
        platform = Drivers.getPlatform();
        wait = new WebDriverWait(driver, 45);

        common = new Common();
        homeScreen = new HomeScreen();
        liveQuote = new LiveQuote();
        countrySearch = new CountrySearch();
        keypad = new KeypadScreen();

    }

    @AfterClass
    public static void tearDown() {
        if (device.equals("android_sim") || device.equals("ios_sim")) {
            driver.resetApp();
        } else if (platform.equals("iOS") || platform.equals("android")){
            driver.removeApp("com.travelex.payments." + build);
        }
        driver.quit();
    }
}
