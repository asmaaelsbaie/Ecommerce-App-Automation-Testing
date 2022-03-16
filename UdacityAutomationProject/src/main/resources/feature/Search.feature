@smoke
Feature: user could search for any product on the system

  Scenario: user should search for product using full name

    Given user navigates to home page
    When user click on search field
    And user search with "laptop" of product
    Then user could find relative results


  Scenario: user should search for product using Laptop

    Given user navigates to home page
    When user click on search field
    And user search with "book" of product
    Then user could find relative results
