@smoke
Feature: Create successful Order
  Scenario: Create Order
    When  click on search field
    And search with "book" of product
    Then user click to add "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[1]" to cart
    When search with "laptop" of product
    Then user click to add "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div/div[2]/div[3]/div[2]/button[1]" to cart
    Then click Shopping cart
    When check Agree Services
    Then Click Checkout Button
