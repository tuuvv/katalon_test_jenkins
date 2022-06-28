Feature: log in ok man

  Scenario: Login ok man
    Given user is login page
    When user enter username and password
    Then click on login button
    And user is navigated to the home page

    
