
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given I want to write a step with precondition
    And some other precondition
    When I complete action
    |title|miss|
    |fname|testf|
    |lname|testf|
    |phnno|563298684|
    And some other action
    |address|line4|
    |city|chennai|
    |county|India|
    |pin|456567|
    |email|test@gmail.com|
    |pwd|bidssipu|
    |cpwd|bidssipu|
    And yet another action
    
  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

