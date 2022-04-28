Feature:User could reset his/her password successfully
  Scenario:  you just need to confirm that this message is displayed "Email with instructions has been sent to you."
    Given click login
    And click Forget password
    And enter login email"asmaa00elsbaie@gmail.com"
    When click recovre Button

