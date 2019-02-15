#Author: your.email@your.domain.com
Feature: To test add tariff plan functionality

  @tag2
  Scenario Outline: Add multiple tariff plan
  
    Given The user is in add tariff plan page
    When The user fill the plan details "<MonthRent>","<Freeloc>","<FreeInt>","<Freesms>","<LocCharges>","<IntCharges>","<SMSCharges>"
    And The user submits the add tariff plan form
    Then The user should see the success message


    Examples: 
      | MonthRent | Freeloc | FreeInt | Freesms | LocCharges | IntCharges | SMSCharges |
      |       100 |     200 |     300 |     400 |        500 |        600 |        700 |
      |       200 |     300 |     400 |     500 |        600 |        700 |        800 |
      |       300 |     400 |     500 |     600 |        700 |        800 |        900 |
      |       400 |     500 |     600 |     700 |        800 |        900 |       1000 |
 