@smoke
Feature: user could login with valid credentials

  Scenario: user should be able to login with valid username and password

    Given click login
    When enter valid "asmaa00elsbaie@gmail.com" and "1234512345"
    And  click on login button


 Scenario:user should be able to login with inValid username and password

    Given click login
   When enter invalid "asmaaelsbaie@gmail.com" and "123456"
   And  click on login button
