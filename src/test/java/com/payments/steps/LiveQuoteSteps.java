package com.payments.steps;

import com.payments.runner.RunTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by admin on 28/01/16.
 */
public class LiveQuoteSteps extends RunTest {


    @Then("^The page has the header \"([^\"]*)\"$")
    public void the_page_has_the_header(String header_text) throws Throwable {
        wait.until(ExpectedConditions.visibilityOf(common.Header));
        Assert.assertTrue(common.Header.getText().contains(header_text));
    }

    @Then("^I can see the currently selected destination country$")
    public void i_can_see_the_currently_selected_destination_country() throws Throwable {

    }

    @Then("^I can see the current indicative rate$")
    public void i_can_see_the_current_indicative_rate() throws Throwable {
        wait.until(ExpectedConditions.visibilityOf(liveQuote.Rate));
    }

    @When("^I tap on the rate$")
    public void i_tap_on_the_rate() throws Throwable {
        wait.until(ExpectedConditions.visibilityOf(liveQuote.Rate)).click();
    }


    @Then("^the Destination Currency code is displayed$")
    public void the_Destination_Currency_code_is_displayed() throws Throwable {
        wait.until(ExpectedConditions.visibilityOf(liveQuote.Destination_Currency));
    }

    @Then("^the Destination Currency is positioned above the Domestic Currency$")
    public void the_Destination_Currency_is_positioned_above_the_Domestic_Currency() throws Throwable {
        int dest_loc = liveQuote.Destination_Panel.getLocation().getY();
        int dom_loc = liveQuote.Domestic_Panel.getLocation().getY();

        Assert.assertTrue(dom_loc > dest_loc);
    }

    @Then("^the Destination Currency value is calculated correctly$")
    public void the_Destination_Currency_value_is_calculated_correctly() throws Throwable {

    }

    @Then("^the Domestic Currency code is displayed$")
    public void the_Domestic_Currency_code_is_displayed() throws Throwable {
        wait.until(ExpectedConditions.visibilityOf(liveQuote.Domestic_Currency));
    }

    @Then("^the Domestic Currency value defaults to \"([^\"]*)\"$")
    public void the_Domestic_Currency_value_defaults_to(String amount) throws Throwable {

    }

    @Then("^the estimated savings are displayed$")
    public void the_estimated_savings_are_displayed() throws Throwable {
        wait.until(ExpectedConditions.visibilityOf(liveQuote.Savings));
    }

    @Then("^the applicable fees are displayed$")
    public void the_applicable_fees_are_displayed() throws Throwable {

    }

    @Then("^the estimated savings are positioned below the Domestic Currency$")
    public void the_estimated_savings_are_positioned_below_the_Domestic_Currency() throws Throwable {
        int dom_loc = liveQuote.Domestic_Panel.getLocation().getY();
        int sav_loc = liveQuote.Savings.getLocation().getY();

        Assert.assertTrue(sav_loc > dom_loc);
    }

    @When("^I tap on the Destination currency$")
    public void i_tap_on_the_Destination_currency() throws Throwable {
        wait.until(ExpectedConditions.visibilityOf(liveQuote.Destination_Currency)).click();
    }

    @When("^I tap on the Domestic currency$")
    public void i_tap_on_the_Domestic_currency() throws Throwable {
        wait.until(ExpectedConditions.visibilityOf(liveQuote.Domestic_Currency)).click();
    }

    @Then("^the keypad is displayed$")
    public void the_keypad_is_displayed() throws Throwable {
        wait.until(ExpectedConditions.visibilityOf(keypad.Keypad_Period));
    }

    @When("^I tap on the currency switch cta$")
    public void i_tap_on_the_currency_switch_cta() throws Throwable {
        wait.until(ExpectedConditions.visibilityOf(liveQuote.Switch)).click();
    }

    @Then("^the Domestic and Destinaton currencies switch positions$")
    public void the_Domestic_and_Destinaton_switch_positions() throws Throwable {
        wait.until(ExpectedConditions.visibilityOf(liveQuote.Domestic_Currency));

        int dest_loc = liveQuote.Destination_Panel.getLocation().getY();
        int dom_loc = liveQuote.Domestic_Panel.getLocation().getY();

        Assert.assertTrue(dom_loc < dest_loc);
    }

    @When("^I tap on the Transfer currency cta$")
    public void i_tap_on_the_Transfer_currency_cta() throws Throwable {
        wait.until(ExpectedConditions.visibilityOf(liveQuote.Transfer)).click();
    }

    @Then("^I am on the Beneficiary Details screen$")
    public void i_am_on_the_Beneficiary_Details_screen() throws Throwable {

    }
}
