Feature: Orders{Craete New Order}
  as a user i want to create new order
  so that i can put new stuff to checkout

  Scenario: as a user i can create new order
    Given i set API endpoint to create new order
    When i send request to create new order
    Then i receive status code 200
    And i receive new order data

  Scenario: as a user i cannot create new order without login token
    Given i set API endpoint for create new product without login token
    When i send request to create new product without login token
    Then i receive status code 401