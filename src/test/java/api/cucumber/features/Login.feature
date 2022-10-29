Feature:Login Action
  Scenario Outline: Succesful Login With Valid Credentials
    Given User is on New Page
    When User Navigate to Login Page
    And User enters"<username>" and "<password>"
    Then Message displaye Login Succesfully
    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |

