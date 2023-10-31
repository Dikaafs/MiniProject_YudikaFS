Feature: PRODUCT CATEGORIES {Create Category}
  as a user I want to create a product category
  so that my products are arranged according to their categories

  Scenario: as a user i can create new product category
    Given i set API endpoint for create new product category
    When i send request to create new product category
    Then i receive valid data for new product category
    And i receive status code 200
