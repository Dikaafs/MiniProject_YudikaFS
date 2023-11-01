Feature: PRODUCT {Get product comment}
  as a user i want to get product comment by id
  so that i can view selected product comment

  Scenario: as a user i can get product comment with valid id
    Given i set API endpoint for get product comment
    When i send request to get product comment with valid id
    Then i receive status code 200
    And i receive valid product comment

  Scenario: as a user i can get product comment with invalid id
    Given i set API endpoint for get product comment with invalid id
    When i send request to get product comment with invalid id
    Then i receive status code 200
    And i receive empty data