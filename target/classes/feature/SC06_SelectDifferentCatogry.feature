@smoke
Feature: Logged user could select different Categories
  Scenario: Add Rondom products
    Given make list of all categories
    When  select Random product
    Then  open product Details
