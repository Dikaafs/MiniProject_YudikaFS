Feature: INDEX
  as a user i can user index feature
  so that i can search product easily

  Scenario: as a user i cannot use index feature with invalid endpoint
    Given i set invalid API endpoint for index
    When i send request to get index with invalid API
    Then i receive status code 404 not found