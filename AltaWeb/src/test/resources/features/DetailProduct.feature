Feature: Detail Product
  as a user i want to see the detail product
  so that i can view ratings product

  Background:
    Given i am on the product page

  Scenario: as a user i can see ratings product
    When i click detail button
    Then i directed to detail product page

  Scenario: as a user i cannot add or remove the ratings
    When i click detail button
    Then i directed to detail product page
    And i click ratings
    And the ratings cannot be clicked