@smoke
Feature: User could register with valid data
  Scenario: Register with user data

    Given click on Register
    When user enter "Asmaa","Mohammed","asmaa00elsbaie@gmail.com","1234512345","1234512345"
    And click on Register Button
    Then complete massage appear
    And click Continue Button


