Feature:User could reset his/her password successfully
  Scenario:  you just need to confirm that this message is displayed "Email with instructions has been sent to you."
    Given user navigates to home page
    And user login
    And user enter valid username and password
    And  user click on login button
    And Login was unsuccessful.
    When click on forget Password Link
    And enter user email
    Then Instruction maassage is Display "Email with instructions has been sent to you."
