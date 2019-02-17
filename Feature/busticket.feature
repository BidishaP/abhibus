#Author: your.email@your.domain.com
@tag
Feature: Booking bus tickets
  I want to use this template for my feature file


@tag3
  Scenario Outline: Booking bus ticket
    Given I wnt to write a step with book ticket
    When I chck for the inside step "<FromNa>", "<ToNa>", "<ToDate>", "<retnDate>"
    Then I vrify success in step
    
     Examples: 
   
      | FromNa      | ToNa       | ToDate     | retnDate   |
      | Pondicherry | Bangalore  | 18-02-2019 | 11-04-2019 |
      | Thirupur    | Chennai    | 03-03-2019 | 19-04-2019 |
      | Madurai     | chennai    | 22-02-2019 | 26-02-2019 |
      | Tirupur     | Coimbatore | 28-02-2019 | 11-03-2019 |
 