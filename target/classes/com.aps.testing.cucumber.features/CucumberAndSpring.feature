Feature: Sample test on testing Spring-Boot application

Scenario: Sample test on Spring boot with Cucumber
Given I have Spring boot application running
When I send GET request to /about
Then I should get 200OK
And I should get about message
