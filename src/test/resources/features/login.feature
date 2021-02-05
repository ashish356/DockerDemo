Feature:  As a user I should be able to login to Rahul Shetty Application with correct credentials

  Background: application is launched
  Given Rahul shetty Application is launched

  @LoginSuccess
  Scenario Outline: User should be able to login successfully with valid credentials
    When User enter correct "<username>" and "<password>"
    Then User should be able to login successfully
    Examples:
    |username                 |password |
    |ashish2008kumar@gmail.com|kahalgaon|
    |ashish2008kumar@gmail.com|kahalgaon|

  @LoginFailure
  Scenario Outline: User should not be able to login successfully with invalid credentials
    When User enter incorrect "<username>" and "<password>"
    Then User should be not able to login successfully
    Examples:
      |username                 |password|
      |ashish2008kumar@gmail.com|kahalgao|
      |ashish2008kumar@gmail.com|kahalgao|