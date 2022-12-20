Feature: YouTubeSearch
  Scenario: Search test
    When i open page "https://www.youtube.com/"
    And Accept coocies
    And Enter keys "Fifa" in search field
    Then Get All links