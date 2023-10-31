Feature: PRODUCT CATEGORIES {Get all categories}
  As a user i want to get all categories
  so that i can view all categories

  Scenario: as a user i can get all category with valid endpoint
    Given i set API endpoint for get all category
    When i send request to get all category with valid endpoint
    Then i receive status code 200
    And i receive valid list the category

  Scenario: as a user i cannot get all category with invalid endpoint
    Given i set API endpoint for get all category with invalid endpoint
    When i send request to get all category with invalid endpoint
    Then i receive status code 404
