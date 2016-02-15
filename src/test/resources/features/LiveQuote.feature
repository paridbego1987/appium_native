@all
Feature: Live quote - As a customer I want to see how much it'll cost to transfer a fixed amount of currency

  Background:
    Given I am on home screen
    And I tap Get a Quote


  Scenario: Live Quote Page Header
    Then The page has the header "Live Quote"


  Scenario: Default displayed Rate
    Then I can see the currently selected destination country
    And I can see the current indicative rate


  Scenario: Search Country CTA
    When I tap on the rate
    Then The page has the header "Select A Country"


  Scenario: Default Destination Currency value
    Then the Destination Currency code is displayed
    And the Destination Currency is positioned above the Domestic Currency
#    And the Destination Currency value is calculated correctly


  Scenario: Default Domestic Currency value
    Then the Domestic Currency code is displayed
#    And the Domestic Currency value defaults to "1000"


  Scenario: Fees and Savings display
    Then the estimated savings are displayed
#    And the applicable fees are displayed
    And the estimated savings are positioned below the Domestic Currency


  Scenario: Tapping on Destination amount
    When I tap on the Destination currency
    Then the keypad is displayed


  Scenario: Tapping on Domestic amount
    When I tap on the Domestic currency
    Then the keypad is displayed


  Scenario: Toggling Currency order
    When I tap on the currency switch cta
    Then the Domestic and Destinaton currencies switch positions


  Scenario: Tapping Transfer CTA
    When I tap on the Transfer currency cta
    Then The page has the header "Beneficiary Details"
