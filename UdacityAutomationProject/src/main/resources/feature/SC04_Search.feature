@smoke
Feature: user could search for any product on the system

  Scenario: user should search for product using full name

    Given click on search field
    When search with "laptop" of product
    Then find relative results


  Scenario: user should search for product using Laptop

    Given click on search field
    When search with "book" of product
    Then find relative results
