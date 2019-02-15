Feature: Title of your feature
  I want to use this template for my feature file

  Scenario: Title of your scenario
    Given The user is add customer plan page
    And Go insid the add customer page
    When The user fill th form
      | fname | lanme  | email           | address  | phno    |
      | test1 | testl  | test@gmail.com  | chennai  | 1357876 |
      | test2 | testxl | test1@gmail.com | cmadurai | 1576833 |
      | test4 | testzl | test3@gmail.com | tamba    |  276389 |
    And The user submit the add customer plan form
    Then I validat the outcome
