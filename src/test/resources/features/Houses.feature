@Houses @smoke
Feature: Get all houses


  Scenario: Get a successful response and obtain a list of all houses
    Given The user has access to the potter api endpoints
    When The user performs a GET request to the houses endpoint
    Then The response status should be 200
    And The houses info should contain the expected structure

  Scenario: Get a unsuccessful response
    Given The user does not have access to the potter api endpoints
    When The user performs a GET request to the houses endpoint
    Then The response message should be "Must pass API key for request"
    And The response status should be 409

  Scenario: Get a unsuccessful response
    Given The user has an invalid key for the potter api endpoints
    When The user performs a GET request to the houses endpoint
    Then The response message should be "API Key Not Found"