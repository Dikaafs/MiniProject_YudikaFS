Feature: Transaction
  as a user i can view all my transaction
  so that i know what items have been checked out

  Background:
    Given i am on the product page
    When i click sign in button
    And i input valid email
    And i input valid password
    And i click login button
    Then i redirected to product page
    And i click Buy button to add product to cart
    And i click cart logo
    And i click Pay button
    And i directed to transaction page

  Scenario: as a user i can set Rows per page

    And i click row button
    And i set the rows per page
    Then the rows per page have been changed to 15 items on one page

  Scenario: as a user i can next to the other page of transaction
    When i click next button
    Then i directed to next page