Feature: Register
  as a user i want to regist
  so that i can have account to login
  Background:
    Given i am on the login page

  Scenario: as a user i can regist with valid credentials
    When i click register feature
    And i directed to register page
    And i input full name
    And i input email
    And i input password
    And i click regist button
    Then i directed to login page
    And i am on the login page

  Scenario: as a user i cannot regist with empty field
    When i click register feature
    And i directed to register page
    And i am not input field full name
    And i input valid email
    And i input password
    And i double click regist button
    Then error message "email is required" is displayed

  Scenario: as a user i can regist with invalid email credentials
    When i click register feature
    And i directed to register page
    And i input full name
    And i input invalid email credentials
    And i input password
    And i click regist button
    Then i directed to login page
    And i am on the login page

  Scenario: as a user i cannot register with registered accounts
    When i click register feature
    And i directed to register page
    And i input registered full name
    And i input registered email
    And i input registered password
    And i double click regist button
    Then error message is shown
