@acceptance
Feature: Adding some items

  In order to add some items
  user should enter Item Type and Amount

  Scenario: Successfully added some items
    Given I am on adding items page
    When I enter correct value
    Then I should be adding some items