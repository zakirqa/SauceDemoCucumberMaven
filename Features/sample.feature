#Author: your.email@your.domain.com
#Keywords Summary :
@smoke
Feature: login panel data testing

  Scenario: validating login with valid credentials
    Given user is on the loginpage
    When user enters valid username
    And user enters valid password
    And user click on the login button
    Then user should be on the homepage
    And user should able to close the browser
