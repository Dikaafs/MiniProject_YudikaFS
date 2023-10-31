Feature: PRODUCT CATEGORIES {Get Product By ID}
  as a user i want to get product by id
  so that i can get selected product

  Scenario: as a user i can GET product category by ID
    Given i set API endpoint for GET product category by ID
    When i send request to GET product category by ID
    Then i receive status code 200
    And i receive valid data product by ID

  Scenario: as a user i cannot get product category with non existent id
    Given i set API endpoint for get product category with non existent id
    When i send request to get product category with non existent id
    Then i receive status code 404 not found