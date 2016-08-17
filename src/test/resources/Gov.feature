@Wip

Feature: As a user I want to visit Gov.Uk and
         check penalties for late filing
  Scenario:
    Given I am on Gov.Uk homepage
    When I click business and self employed
    And  I click Business tax
    And I click company tax returns
    When I click Penalties for late filing
    Then I should see company tax returns page