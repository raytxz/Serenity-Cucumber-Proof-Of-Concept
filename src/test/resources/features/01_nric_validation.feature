Feature: Validate NRIC

  Scenario: Enter a valid NRIC number
    Given I go to NRIC checker website
    When I enter the NRIC number
    Then I get redirected to the main page because of valid NRIC