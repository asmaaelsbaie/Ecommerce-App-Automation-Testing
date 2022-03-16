Feature: Create successful Order

  Scenario: Create Order
    Given user navigates to home page
    And user login
    When user enter valid "asmaa00elsbaie@gmail.com" and "1234512345"
    And  user click on login button
    When user click on search field
    And user search with "book" of product
    Then user click to add "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[1]" to cart
    When user search with "laptop" of product
    Then user click to add "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div/div[2]/div[3]/div[2]/button[1]" to cart
    Then click Shopping cart
    When check Agree Services
    Then Click Checkout Button
