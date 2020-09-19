#amazonLoginFeatureFile
Feature: feature to test add item to cart and verify the item added in cart

  Scenario: Check login is successful with valid credentials
    Given browser is open
    And navigate to amazon.com
    When clicks on Hello Sign In
    Then user is navigated to amazon enterUsername page

  Scenario Outline: Check login is successful with valid credentials
    Given user enters <username>
    And user clicks Continue
    And user enter <password>
    When clicks on Sign-In button
    Then user is navigated to the home page

    Examples: 
      | username                | password |
      | mvmenakabtech@gmail.com | Test.123 |
