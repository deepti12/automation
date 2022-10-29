Feature: Test Login Functinality

  Scenario Outline: Check Login is successful with valid credential
    Given Browser is open
    And User is on login Page
    When User enters <username> and <password>
    When User click on Login
    Then User is navigate to home page
    Examples:
      | username | password |
      | Deepti   | 12345    |
      | Anjali   | 12345    |
