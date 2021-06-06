Feature: Task2

  @paytm
  Scenario: paytm scenario
    Given user is on paytm home page
    When user click on metro menu
    And user enter the all detail "<Metro Name>" Card Type and Card Number and proceed
    And user verify the card balance page
    
    Examples:
    | Metro Name |
    | Mumbai |
   