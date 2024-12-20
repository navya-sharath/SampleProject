Feature: Login to magento website

  Scenario: User suceessful login with valid credentials
    Given I navigate to Magento Website
    When I click on "sign in" Linktext
    And I enter the Email "navya@gmail.com"
    And I enter the Password "navya@123"
    And I click on the "sign in " button
    Then I should see the "Welcome, navya krishna!" message

  Scenario: User login with invalid credentials
    Given I navigate to Magento Website
    When I click on "sign in" Linktext
    And I enter the Email "navyakrishna@gmail.com"
    And I enter the Password "navyakrishna@123"
    And I click on the "sign in" button
    Then I should see the "The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later." message

  Scenario: User login with blank fields
    Given I navigate to Magento Website
    When I click on "sign in" Linktext
    And I dont enter the Email
    And I dont enter the Password
    And I click on the "sign in" button
    Then I should see the "This is a required field." message
