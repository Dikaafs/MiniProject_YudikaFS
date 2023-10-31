Feature: Cart
  as a user i want to add product to cart
  so that i can check out my product

  Background:
    Given i am on the product page

  Scenario: as a user i can add product to cart
    When i click sign in button
    And i input valid email
    And i input valid password
    And i click login button
    Then i redirected to product page
    And i click Buy button to add product to cart
    And i click cart logo
    Then i directed to cart page

  Scenario: as a non logged user i can add product to cart
    When i click Buy button to add product to cart
    And i click cart logo
    Then i directed to cart page