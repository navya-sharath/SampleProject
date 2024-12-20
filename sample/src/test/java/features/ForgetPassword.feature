Feature: Forget password in magento website

  @all @regression @navya @forgetPassword
  Scenario: Forget password
    Given i visit magento website
    When i click on sign in linktext
    And i click on forget password button
    And i enter email "navya@gmail.com"
    And i click reset my password
    Then i should see the "If there is an account associated with navya@gmail.com you will receive an email with a link to reset your password." message
