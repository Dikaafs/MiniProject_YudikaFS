Feature: PRODUCT CATEGORIES {Delete By ID}
  As a user i want to delete category by id
  so the selected category data can be removed

  Scenario:as a user i can delete category with valid id
    Given i set API endpoint for delete category by id
    When i send request to delete category data  with valid id
    Then i receive status code 200 ok

  Scenario: as a user i cannot delete category with a alphabet id
    Given i set API endpoint for delete category with alphabet id
    When i send request to delete category with alphabet id
    Then i receive status code 400 bad request