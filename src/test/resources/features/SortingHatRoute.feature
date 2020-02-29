@SortingHatRoute @smoke
Feature: Get a random Hogwarts House

  Scenario: Get a successful response and obtain a random Hogwarts House
    Given The user has access to the potterapi endpoint
    When The user performs a GET request for a random house
    Then The response status should be 200

  Scenario: Get a response not empty and obtain a random Hogwarts House
    Given The user has access to the potterapi endpoint
    When The user performs a GET request for a random house
    Then The response body should not be blank
    And The response should be one of the valid houses