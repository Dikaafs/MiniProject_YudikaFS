Feature: PRODUCT{Create Comment}
  As a user i want to add comment
  so that i can put my comment review on the product

  Scenario: as a user i can add comment
    Given i set API endpoint for add comment
    When i send request to add comment
    Then i receive status code 200
    And i receive data product with the added comment

  Scenario: as a user i cannot add comment without id
    Given i set API endpoint for add comment without id
    When i send request to add comment without id
    Then i receive status code 405