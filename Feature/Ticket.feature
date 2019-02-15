#Author: your.email@your.domain.com
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag2
  Scenario Outline: Booking bus ticket
    Given I want to write a step with 
    When I check for the in step "<FromNa>", "<ToNa>", "<Date>"
    Then I verify the success in step

    Examples: 
      | FromNa  | ToNa      | Date       |
      | Chennai | Banglore  | 19-02-2019 |
      | Salem   | Chennai   | 03-03-2019 |
      | Madurai | chennai   | 13-02-2019 |
      | Tirupur | Coimbatur | 18-02-2019 |
