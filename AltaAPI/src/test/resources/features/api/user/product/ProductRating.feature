Feature: PRODUCT{Get Rating}
  as a user i want to get a product rating
  so that i can view the product rating

  Scenario: as a user i can get a product rating
    Given i set API endpoint for get product rating
    When i send request to get product rating
    Then i receive status code 200
    And i receive valid product rating

  Scenario: as a user i can get a product rating with deleted id
    Given i set API endpoint for get product rating deleted id
    When i send request to get product rating deleted id
    Then i receive status code 200
    And i receive valid product rating