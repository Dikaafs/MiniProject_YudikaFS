Feature: INDEX
as a user i can user index feature
so that i can search product easily

  Scenario: as a user i can use feature index
    Given i set API endpoint for get index
    When i send request to get index
    Then i receive status code 200
    And i receive valid data index