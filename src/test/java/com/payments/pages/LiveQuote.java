package com.payments.pages;

import com.payments.runner.RunTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Derin on 28/01/16.
 */

public class LiveQuote extends RunTest{


    @AndroidFindBy(id = "panel_destination_currency")
    @iOSFindBy(name = "x")
    public MobileElement Destination_Panel;

    @AndroidFindBy(id = "currency_destination")
    @iOSFindBy(name = "x")
    public MobileElement Destination_Currency;

    @AndroidFindBy(id = "panel_source_country")
    @iOSFindBy(name = "x")
    public MobileElement Domestic_Panel;

    @AndroidFindBy(id = "currency_source")
    @iOSFindBy(name = "x")
    public MobileElement Domestic_Currency;

    @AndroidFindBy(id = "button_estimated_savings")
    @iOSFindBy(name = "x")
    public MobileElement Savings;

    @AndroidFindBy(id = "rate_widget")
    @iOSFindBy(name = "x")
    public MobileElement Rate;

    @AndroidFindBy(id = "button_country_switch")
    @iOSFindBy(name = "x")
    public MobileElement Switch;

    @AndroidFindBy(id = "button_transfer")
    @iOSFindBy(name = "x")
    public MobileElement Transfer;




    public LiveQuote(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

}
