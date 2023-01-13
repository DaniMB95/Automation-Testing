Feature: Basic Login for users that have an account already create it

  @Acceptance
  Scenario: Basic Login with the correct information
    Given The user have and account in the page
    When User enters username as username and password
    Then The status code is OK



