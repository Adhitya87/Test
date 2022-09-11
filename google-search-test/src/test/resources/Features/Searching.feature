Feature: Google Search
  Scenario: I search name on google
    Given I'm Open the browser
    And I go to Google website
    And I'm on google website
    When I try to search "Hilda Lisnawati"
    Then I find some result related with "Hilda Lisnawati"