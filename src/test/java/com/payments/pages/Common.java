package com.payments.pages;

import com.payments.runner.RunTest;
import com.payments.runner.RunTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * edited by Derin on 26/1/16.
 */

public class Common extends RunTest{

    @AndroidFindBy(name = "x")
    @iOSFindBy(name = "x")
    public MobileElement X;

    @AndroidFindBy(id = "toolbar_title")
    @iOSFindBy(id = "x")
    public MobileElement Header;



    public Common(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public boolean isElementPresent(MobileElement locator) {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        try {
            locator.isDisplayed();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
        finally {
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        }
    }

}
