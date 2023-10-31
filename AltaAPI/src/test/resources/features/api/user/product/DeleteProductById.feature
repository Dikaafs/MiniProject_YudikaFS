Feature: PRODUCT{Delete By ID}
  As a user i want to delete product by id
  so the selected product data can be removed

  Scenario:as a user i can delete product with valid id
    Given i set API endpoint for delete product by id
    When i send request to delete product data  with valid id
    Then i receive status code 200 ok

  Scenario: as a user i can delete product with invalid id
    Given i set API endpoint for delete product with invalid id
    When i send request to delete product data  with invalid id
    Then i receive status code 200 ok