package com.payments.steps;

import com.payments.runner.RunTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by kataril on 30/11/15.
 */
public class HomeSteps extends RunTest {

    @Given("^I am on home screen$")
    public void i_am_on_home_screen() throws Throwable {
        wait.until(ExpectedConditions.visibilityOf(homeScreen.Get_Quote));
    }

    @Given("^I tap Get a Quote$")
    public void i_tap_Get_a_Quote() throws Throwable {
        wait.until(ExpectedConditions.visibilityOf(homeScreen.Get_Quote)).click();
    }
}
