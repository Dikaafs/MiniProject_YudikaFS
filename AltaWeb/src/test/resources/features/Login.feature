Feature: Login
  as a user i want to login
  so that i can access transaction page

  Background:
  Given i am on the product page

  Scenario: as a user i can login with valid credentials
    When i click sign in button
    And i input valid email
    And i input valid password
    And i click login button
    Then i redirected to product page

  Scenario: as a user i cannot login with unregistered email
    When i click sign in button
    And i input unregistered email
    And i input random password
    And i click login button
    Then error message is shown

  Scenario: as a user i cannot login with invalid password
    When i click sign in button
    And i input valid email
    And i input invalid password
    And i click login button
    Then error message is shown
