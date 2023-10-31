Feature: Payment
  as a user i want to check out my product on the cart
  so that my product can be delivered to my home


  Background:
    Given i am on the product page

  Scenario: as a user i can checkout my product
    When i click sign in button
    And i input valid email
    And i input valid password
    And i click login button
    Then i redirected to product page
    And i click Buy button to add product to cart
    And i click Buy button on another product to add to cart
    And i click cart logo
    And i click Pay button
    Then i directed to transaction page

  Scenario: as a non logged user i cannot checkout my product
    When i click Buy button to add product to cart
    And i click cart logo
    And i click Pay button
    Then i directed to login page