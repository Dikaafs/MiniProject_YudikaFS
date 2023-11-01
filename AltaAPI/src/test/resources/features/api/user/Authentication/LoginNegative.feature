@Login
Feature: Authentication {Login}
  As a user i want to login
  so that i can access homepage

    Scenario Outline: as a user i cannot login with unregistered account
      Given i set API endpoint for login with unregistered account
      When i send request to login with invalid email "<email>" and invalid password"<password>"
      Then i receive status code 400
      Examples:
                |email                |password           |
                |dika@gmail.com       |dika14             |