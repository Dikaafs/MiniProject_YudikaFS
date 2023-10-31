Feature: Orders{Get All Order}
  as a user i want to get all order
  so that i can view all orders list

  Scenario: as a user i can get all order
    Given i set API endpoint for get all order
    When i send request to get all order
    Then i receive status code 200
    And i receive valid data get all oder