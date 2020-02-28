@Character @smoke
  Feature: Get a character

    Scenario Outline: Get a successful character using his id
      Given The user has access to the potterapi endpoint using a key
      When The user performs a GET request for one character using an <id>
      Then The response status should be 200

      Examples:

        |                   id                     |
        |       "5a0fa4daae5bc100213c232e"         |
        |       "5a0fa54aae5bc100213c232f"         |
        |       "5a0fa5deae5bc100213c2330"         |
        |       "5a0fa60aae5bc100213c2331"         |

