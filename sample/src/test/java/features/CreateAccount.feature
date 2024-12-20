Feature: account creation

  Scenario Outline: create an account of new member
    Given I visit the magento website
    And I click on "create an account" linktext
    When I enter the frist name "<fristName>"
    And I enter the last name "<lastName>"
    And I enter the email "<email>"
    And I enter the password "<password>"
    And I enter the confirm password "<confirmPassword>"
    Then I click on "create an account" button

    Examples: 
      | frist name | last name | email                      | password   | confirm password |
      | shanti     | priya     | shantipriya@gmail.com      | priya@2508 | priya@2508       |
      | chandana   | krishna   | krishnachandana@gmail.com  | krishna@28 | krishna@28       |
      | anjana     | krishna   | anjanakrishna@987gmail.com | anjana@25  | anjana@25        |
