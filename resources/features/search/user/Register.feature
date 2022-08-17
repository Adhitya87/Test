Feature: user can do sign up

  @Register
  Scenario: Sign Up success
    Given I go to Stockbit site
    When click button Register
    When click button Register with Email
#    Then page direct to Register Page
    And I input Name "Adhitya"
    And I input Email "prananta.adhitya87@gmail.com"
    And I input UserName "Adhit87"
    And I input Password "Pancong999"
    And I input Confirm Password "Pancong999"
    When I Click Register Button


#    Given I go to Stockbit site
#    When I click wording Sign Up
#    Then page direct to register Page
#    When I click button Register With Email
#    And I input valid "alterraacademy@gmail.com"
#    And I input "QE#2"
#    When I click Sign Up button
#    When I click OK on Message alert success create account
#    Then Direct to Login Page, i can do Login