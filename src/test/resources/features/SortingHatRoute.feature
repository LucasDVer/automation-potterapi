@SortingHatRoute @smoke
Feature: Get a random Hogwarts House

  Scenario: Get a successful response and obtain a random Hogwarts House
    Given The user has access to the sorting hat endpoint
    When The user performs a GET request to the sorting hat endpoint
    Then The response status should be 200
    And The response body should not be blank
    And The response should be one of the valid houses







