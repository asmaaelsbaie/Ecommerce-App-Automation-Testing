@smoke
Feature:Logged user could add different products to Shopping cart

  Scenario: Add first product
    Given user navigates to home page
    When user click on search field
    And user search with "book" of product
    Then user click to add "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[1]" to cart
    When user search with "laptop" of product
    Then user click to add "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div/div[2]/div[3]/div[2]/button[1]" to cart


#  Scenario: add Second product
#   Given user navigates to home page
#   Given user click on search field
#    When user search with "laptop" of product
#    Then user click to add "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div/div[2]/div[3]/div[2]/button[1]" to cart
