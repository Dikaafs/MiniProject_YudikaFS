Feature: Authentication {Get user information}
  as a user i want to get user information
  so that i can get spesific user information

  Scenario: as a user i can get user information
    Given i set API endpoint for get user information
    When i send request to get user information
    Then i receive status code 200
    And i receive valid data the user

  Scenario: as a user i cannot get user information without token
    Given i set API endpoint for get user information without token
    When  i send request to get user information without token
    Then i receive status code 401
