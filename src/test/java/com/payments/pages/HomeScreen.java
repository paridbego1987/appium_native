package com.payments.pages;

import com.payments.runner.RunTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Derin on 28/1/16.
 */
public class HomeScreen extends RunTest{

    @AndroidFindBy(id = "button_get_quote")
    @iOSFindBy(id = "x")
    public MobileElement Get_Quote;

    public HomeScreen(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}
