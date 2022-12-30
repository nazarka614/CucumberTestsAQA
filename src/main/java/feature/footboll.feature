@Footboll
Feature: Rozetka test
  Scenario: Open razetka and get link and text
    When i open page "https://football.ua/"
    And Click log button
    And Enter mail "nazarka614@gmail.com"
    And Enter password "test!123"
    Then Click enter button