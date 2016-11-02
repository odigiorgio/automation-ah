@Login
Feature: Login Action
  This action allows ro connect to the OnlineStore

  Scenario: Successful Login with Valid Credentials
    Given User is on Home Page
    When User Navigate to LogIn Page
    And User enters UserName and Password
    Then Message displayed Login Successfully

  Scenario: Successful LogOut
    Given User is on Main Page
    When User LogOut from the Application
    Then Message displayed LogOut Successfully