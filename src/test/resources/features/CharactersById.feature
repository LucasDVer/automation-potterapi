@Character @smoke
Feature: Get a character

  Scenario Outline: Get a successful character using his id
    Given The user has access to the potter api endpoints
    When The user performs a GET request to the characters endpoint using an <id>
    Then The response status should be 200
    And The character info should contain the expected structure

    Examples:

      | id                         |
      | "5a0fa4daae5bc100213c232e" |
      | "5a0fa54aae5bc100213c232f" |
      | "5a0fa5deae5bc100213c2330" |
      | "5a0fa60aae5bc100213c2331" |


  Scenario Outline: Get a unsuccessful response using an invalid id
    Given The user has access to the potter api endpoints
    When The user performs a GET request to the characters endpoint using an <id>
        #Then  The response status should be 404
    Then The response error name should be CastError and contains the correct error message

    Examples:

      | id                          |
      | "5a0fa4daae5bc100213c232ee" |
      | "5a0fa54aae5bc100213c232"   |
      | "5a0fa5deae5bc100213c23300" |
      | "5a0fa60aae5bc100213c233"   |

  @testInTheMoment
  Scenario Outline: Get a unsuccessful response with a invalid key
    Given The user has an invalid key for the potter api endpoints
    When The user performs a GET request to the characters endpoint using an <id>
    Then The response message should contain: API Key Not Found

    Examples:

      | id                         |
      | "5a0fa4daae5bc100213c232e" |
      | "5a0fa54aae5bc100213c232f" |
      | "5a0fa5deae5bc100213c2330" |
      | "5a0fa60aae5bc100213c2331" |

  Scenario Outline: Get a unsuccessful response without a key
    Given The user does not have access to the potter api endpoints
    When The user performs a GET request to the characters endpoint using an <id>
    Then The response message should contain: Must pass API key for request

    Examples:

      | id                         |
      | "5a0fa4daae5bc100213c232e" |
      | "5a0fa54aae5bc100213c232f" |
      | "5a0fa5deae5bc100213c2330" |
      | "5a0fa60aae5bc100213c2331" |





