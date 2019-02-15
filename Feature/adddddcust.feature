@tag
Feature: To add customer plan
 

  @tag1
  Scenario: Add customer plan
    Given The user is in add customer plan page
    And Go inside the add customer page
      | fname  | lname  | email           | address  | phnno    |  
      | f1test | testl1 | test@gmail.com  | chennai  | 13527638 |  
      | f2test | testl2 | test1@gmail.com | madurai  | 62832487 |  
      | f3test | testl3 | test2@gmail.com | tambaran | 57668398 |  
      | f4test | testl4 | test3@gmail.com | omr      |  6736898 |  
    When The user fill the form
    And The user submits the add customer plan form
    Then I validate the outcome

  