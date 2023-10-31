Feature: PRODUCT{Get by ID}
  As a user i wanto get product by id
  so that i can get selected product by id

  Scenario: as a user i can get product with valid id
    Given i set API endpoint for get product with valid id
    When i send request to get product with valid id
    Then i receive status code 200 OK
    And i receive valid data product by id

  Scenario: as a user i cannot get product with invalid id
    Given i set API endpoint for get product with invalid id
    When i send request to get product with invalid id
    Then i receive status code 404 not found
