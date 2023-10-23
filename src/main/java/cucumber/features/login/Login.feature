Feature: Log in to the application

@OnlyOneTime
Scenario: Login to application as valid user
    When User enter the valid credentials
    And Click on Login
    Then Home Page should be displayed

Scenario: Login to application as Invalid user
    When User enter the inValid credentials
    And Click on Login
    Then Error Message Should be displayed