Feature: ORDER {Get order by id}
  as a user i want to get order by id
  so that i can check my order

  Scenario: as a user i cannot get order by invalid id
    Given i set API endpoint for get order by invalid id
    When i send request to get order by invalid id
    Then i receive status code 404 not found