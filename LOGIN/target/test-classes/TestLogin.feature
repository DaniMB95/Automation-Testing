Feature: Basic Login for users that have an account already create it

  @Acceptance
  Scenario Outline: Basic Login with the wrong information
    Given The user introduce a wrong password
    When User enters the wrong "username" and "password"
    Then The status code is BAD REQUEST

    Examples:
      | username | password    |
      | DaniMB95 | Testing8795 |

  @Acceptance
  Scenario: Basic Login with the correct information
    Given The user have and account in the page
    When User enters username as username and password
    Then The status code is OK



