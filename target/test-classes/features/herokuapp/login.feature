Feature: Login to Herokuapp

  @login
  Scenario Outline: Positive case login

    Given user access page "http://the-internet.herokuapp.com/login"
    When user input username "<username>"
    And user input password "<password>"
    And user click login button
    Then user can see success message
#    Then user can see message "<messageType>"

    Examples:
      | username    | password |
      | tomsmith    | SuperSecretPassword! |