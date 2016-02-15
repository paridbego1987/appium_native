@all
Feature: Country Search - As a customer I want to search for a country or currency so that I can see the rates and get
  a quote

  Background:
    Given I am on home screen
    And I tap Get a Quote
    And I tap on the rate
    And The page has the header "Select A Country"


  Scenario: Search Results Visibility
    Then I can see the selected country and currency rate
    And I can see the Transfer Funds button
    And every listed currency displays these following attributes
    |attributes|
    |Country Name|
    |Currency Name|
    |Rate|


  Scenario: Search Results Functionality
    When I tap on "Belgium" from the Country Search results
    Then The page has the header "Live Quote"
    And "Belgium" is dislayed as the destination country


  Scenario: Search Bar Visibility
    Then I can see a search bar with repopulated hint text


  Scenario: Search Bar Functionality
    When I tap on the search bar
    Then the search bar is positioned at the top of the screen
    And the keyboard is displayed


  Scenario: Search Bar Filter
    When I tap on the search bar
    And I enter "Au"
    Then "Australia" and "Austria" are displayed in the Country Search results


  Scenario: Unmatched Search term
    When I tap on the search bar
    And I enter "Test"
    Then no countries are listed
    And the Not Listed message is displayed

