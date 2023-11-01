Feature: PRODUCT {Assign Rating}
  as a user i want to assign a new rating
  so that ratings product is updated

  Scenario: as a user i can assign product rating
    Given i set API endpoint for assign product rating
    When i send request to assign product rating
    Then i receive status code 200

  Scenario: as a user i cannot assign product rating without token
    Given i set API endpoint for assign product rating without token
    When i send request to assign product rating without token