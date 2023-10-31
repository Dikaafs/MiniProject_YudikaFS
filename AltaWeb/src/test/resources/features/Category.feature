Feature: Category
  as a user i want to select product by category
  so that i can easily find the stuff that i need

  Scenario: as a user i cannot select product by category
    Given i am on the product page
    When i click category feature
    And i select the category
    Then i receive message "Product is empty!"