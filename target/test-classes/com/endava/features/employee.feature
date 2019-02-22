Feature: Request employees
  As a lead
  I want to get employees data
  So that...

  Scenario: Get all employees
    Given There are employees
    When I request for all employees
    Then I should get all employees data