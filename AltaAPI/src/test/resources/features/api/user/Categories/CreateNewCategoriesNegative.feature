Feature: PRODUCT CATEGORIES {Create Category}
  as a user I want to create a product category
  so that my products are arranged according to their categories

    Scenario: as a user i cannot create new product with invalid endpoint
      Given i set invalid API endpoint for create new product
      When i send request to create new product with invalid endpoint
      Then i receive status code 404 not found