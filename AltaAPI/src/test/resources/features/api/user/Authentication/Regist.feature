@Register
  Feature: Authentication {Register}
    as a user i want to create account
    so that i can buy some stuff

  Scenario: as a user i have be able to register
    Given i set API endpoint for register
    When i send request for register
    Then i receive status code 200
    And i receive valid data for new user

  Scenario: as a user i can't do register without Hook
    Given i set API endpoint for register without hook
    When i send request to register without hook
    Then i receive status code 400
