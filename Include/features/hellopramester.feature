Feature: log in paramester

  @smoke
  Scenario Outline: Login ok man with paramester
    Given user is login page
    When user enter <username> and <password>
    Then click on login button
    And user is navigated to the home page

    @valid
    Examples: 
      | username | password                 |
      | Admin    | hUKwJTbofgPU9eVlw/CnDQ== |
#
    #@invalid
    #Examples: 
      #| username | password                 |
      #| Admin    | hUKwJTbofgPU9eVlw/CnD123 |
