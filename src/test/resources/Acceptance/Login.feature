@acceptance
Feature: Login to system

  In order to login to application
  user should enter correct login and password

  Scenario: Successfully login to application
    Given I am on login page
    When I enter correct credentials
    Then I should be signed in
