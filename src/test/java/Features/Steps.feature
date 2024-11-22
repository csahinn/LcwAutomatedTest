Feature: LC Waikiki

  Scenario: Go to LCW Website and print the cheapest item
    Given Go to LCW Website
    When Click to reject cookies
    When Click the category of men
    When Click sort dropdown
    When Sort ascending
    When Pick the first item
    Then Get the price of item