package com.payments.pages;

import com.payments.runner.RunTest;
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

public class CountrySearch extends RunTest{


    @AndroidFindBy(id = "text_country_name")
    @iOSFindBy(id = "x")
    public MobileElement Selected_Country;

    @AndroidFindBy(id = "text_rate_base")
    @iOSFindBy(id = "x")
    public MobileElement Base_Currency;

    @AndroidFindBy(id = "text_rate_quote")
    @iOSFindBy(id = "x")
    public MobileElement Quoted_Currency;

    @AndroidFindBy(id = "button_transfer")
    @iOSFindBy(id = "x")
    public MobileElement Transfer;

    @AndroidFindBy(id = "text_country_search")
    @iOSFindBy(id = "x")
    public MobileElement Country_Search;


    @AndroidFindBy(id = "search_src_text")
    @iOSFindBy(id = "x")
    public MobileElement Header_Country_Search;

    @AndroidFindBy(id = "text_country_name")
    @iOSFindBy(id = "x")
    public MobileElement Country_Name;

    @AndroidFindBy(id = "text_currency_name")
    @iOSFindBy(id = "x")
    public MobileElement Currency_Name;

    @AndroidFindBy(id = "img_flag")
    @iOSFindBy(id = "x")
    public MobileElement Country_Flag;

    @AndroidFindBy(id = "text_rate")
    @iOSFindBy(id = "x")
    public MobileElement Rate;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
    @iOSFindBy(id = "x")
    public MobileElement Message;

    public CountrySearch(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}
