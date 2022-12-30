@Razetka
Feature: Rozetka test
  Scenario: Open razetka and get link and text
    When i open page "https://rozetka.com.ua/"
    Then Get All links in menu and print in consol
    And Get all summery panel text in consol

    Scenario: Open random link
      When Open random get link
      And Get Title



