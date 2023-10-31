Feature: PRODUCT{Get All}
  as a user i want to get all product data
  so that i can view list of all product

  Scenario: As a user i can get all product
    Given i set API endpoint for get all product
    When i send request to get all product
    Then i receive status code 200 OK
    And i receive valid data for get all product

  Scenario: As a user i cannot get all product with invalid endpoint
    Given i set invalid API  endpoint for get all product
    When i send request to get all product With invalid endpoint
    Then i receive status code 404 not found