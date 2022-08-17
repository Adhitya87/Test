Feature: as a user can sign in

  @SignIn
  Scenario: Sign In success
    Given I on Login Page
    When I field username "Adhit87"
    When I field password "Badabes123"
    And I click Button to Login
#    When I click SKIP on pop up
#    Then I directed to home page