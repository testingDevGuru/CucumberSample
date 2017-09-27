Feature: Sample test on REST API

Scenario: Test sample responses from REST API
Given I have a city name as Baltimore
When I send request to weather API
Then I should receive weather information about Baltimore