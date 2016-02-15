package com.payments.runner;

import com.payments.drivers.Drivers;
import com.payments.pages.*;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
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
    public static WebDriver driver;
    public static String build;
    public static WebDriverWait wait;

    public static Common common;


    @BeforeClass
    public static void setUp() throws Exception {
        driver = Drivers.getDriver();
        build = Drivers.getBuild();
        wait = new WebDriverWait(driver, 45);

        common = new Common();
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}
