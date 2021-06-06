Feature: Task1

  @OrangeHrm
  Scenario: Login scenario
    Given user is on login page
    When user logs in to the application
    Then user is on dashboard page
    Then user nevigate to manager reviews page
    When user search for the employee
    Then user click to Evaluate option
    Then user add ratings and save