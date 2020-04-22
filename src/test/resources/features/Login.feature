@Debug
Feature: Login

  Scenario: Login with valid credentials
    Given user is logged in
    Then user should see homepage