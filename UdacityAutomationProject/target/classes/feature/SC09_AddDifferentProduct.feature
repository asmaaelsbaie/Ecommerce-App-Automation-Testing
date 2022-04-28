@smoke
Feature:Logged user could add different products to Shopping cart

  Scenario: Add first product

    Given  click on search field
    When   search with "book" of product
    Then  user click to add "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[1]" to cart
    When  search with "laptop" of product
    Then user click to add "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div/div[2]/div[3]/div[2]/button[1]" to cart

