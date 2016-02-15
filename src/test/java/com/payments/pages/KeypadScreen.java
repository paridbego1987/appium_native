package com.payments.pages;

import com.payments.runner.RunTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by admin on 29/01/16.
 */
public class KeypadScreen extends RunTest {

    @AndroidFindBy(id = "keypad_button_0")
    @iOSFindBy(id = "0")
    public MobileElement number0;

    @AndroidFindBy(id = "keypad_button_1")
    @iOSFindBy(id = "1")
    public MobileElement number1;

    @AndroidFindBy(id = "keypad_button_2")
    @iOSFindBy(id = "2")
    public MobileElement number2;

    @AndroidFindBy(id = "keypad_button_3")
    @iOSFindBy(id = "3")
    public MobileElement number3;

    @AndroidFindBy(id = "keypad_button_4")
    @iOSFindBy(id = "4")
    public MobileElement number4;

    @AndroidFindBy(id = "keypad_button_5")
    @iOSFindBy(id = "5")
    public MobileElement number5;

    @AndroidFindBy(id = "keypad_button_6")
    @iOSFindBy(id = "6")
    public MobileElement number6;

    @AndroidFindBy(id = "keypad_button_7")
    @iOSFindBy(id = "7")
    public MobileElement number7;

    @AndroidFindBy(id = "keypad_button_8")
    @iOSFindBy(id = "8")
    public MobileElement number8;

    @AndroidFindBy(id = "keypad_button_9")
    @iOSFindBy(id = "9")
    public MobileElement number9;

    @AndroidFindBy(id = "keypad_button_backspace")
    @iOSFindBy(id = "icon delete arrow")
    public MobileElement Keypad_BackSpace;

    @AndroidFindBy(id = "keypad_button_period")
    @iOSFindBy(id = "x")
    public MobileElement Keypad_Period;

    public KeypadScreen(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}
