Feature: Login Feature
  Verify if user is able to Login in to the site

  Scenario: Login as a authenticated user
    Given user is on"https://www.google.com" homepage
    When user navigates "https://www.gmail.com"to Login Page
    And user enters username and Password
    Then success message is displayed
