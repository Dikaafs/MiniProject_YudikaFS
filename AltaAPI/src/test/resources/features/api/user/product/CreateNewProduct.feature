Feature: PRODUCT{Create}
  As a user i want to create new product
  so that i can add my latest products

  Scenario: As a user can create new product
    Given i set API endpoint for create new product
    When i send request to create new product
    Then i receive status code 200
    And i receive valid data for new product

  Scenario: As a user i cannot create product price with string input
    Given i set API endpoint for create new product
    When i send request to create new product with string input
    Then i receive status code 400 bad request
