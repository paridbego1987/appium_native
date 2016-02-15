package com.payments.pages;

import com.payments.runner.RunTest;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * edited by Derin on 26/1/16.
 */

public class Common extends RunTest{

    @FindBy(id = "lst-ib")
    public MobileElement Search_field;

    @FindBy(name = "x")
    public MobileElement Header;


    public Common(){
        PageFactory.initElements(driver, this);
    }

}
