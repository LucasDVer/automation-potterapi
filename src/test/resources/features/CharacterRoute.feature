@CharacterRoute @smoke
  Feature: Get all characters

    Scenario: Get a successful response an obtain information of all the characters
      Given The user has access to the potterapi endpoint using a key
      When The user performs a GET request for all characters
      Then The response status should be 200