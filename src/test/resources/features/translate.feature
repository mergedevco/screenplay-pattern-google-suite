Feature: Translate
  Scenario: I as user need translate words in different languages
    Given I would like translate a text
    When I translate "hola mundo" from "Español" to "English"
    Then I should see the translation "Hello world"