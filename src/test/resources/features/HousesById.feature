@HouseById @smoke
Feature: Get a house using an Id

  Scenario Outline: Get a successful response and obtain a house by id
    Given The user has access to the potter api endpoints
    When The user performs a GET request to the houses endpoint using an <id>
    Then The response status should be 200
    And The house info should contain the expected structure

    Examples:

      | id                         |
      | "5a05e2b252f721a3cf2ea33f" |
      | "5a05da69d45bd0a11bd5e06f" |
      | "5a05dc8cd45bd0a11bd5e071" |
      | "5a05dc58d45bd0a11bd5e070" |

  Scenario Outline: Get a unsuccessful response using an invalid id
    Given The user has access to the potter api endpoints
    When The user performs a GET request to the houses endpoint using an <id>
    #Then  The response status should be 404
    Then The response error name should be "CastError" and contains "Cast to ObjectId failed for value"

    Examples:

      | id                          |
      | "5a05e2b252f721a3cf2ea33ff" |
      | "55a05da69d45bd0a11bd5e06f" |
      | "5a05dc8cd45bd0a11bd5e071@" |
      | "5a05dc58d45bd0a11bd5e07"   |


  Scenario Outline: Get a unsuccessful response with a invalid key
    Given The user has an invalid key for the potter api endpoints
    When The user performs a GET request to the houses endpoint using an <id>
    Then The response message should contains "API Key Not Found"

    Examples:

      | id                         |
      | "5a05e2b252f721a3cf2ea33f" |
      | "5a05da69d45bd0a11bd5e06f" |
      | "5a05dc8cd45bd0a11bd5e071" |
      | "5a05dc58d45bd0a11bd5e070" |

  Scenario Outline: Get a unsuccessful response without a key
    Given The user does not have access to the potter api endpoints
    When The user performs a GET request to the houses endpoint using an <id>
    Then The response message should be "Must pass API key for request"

    Examples:

      | id                         |
      | "5a05e2b252f721a3cf2ea33f" |
      | "5a05da69d45bd0a11bd5e06f" |
      | "5a05dc8cd45bd0a11bd5e071" |
      | "5a05dc58d45bd0a11bd5e070" |