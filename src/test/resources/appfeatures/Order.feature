Feature: Order information

Background:
Given user should be logged into application
When user click on orders button
Then user redirects to orders page

Scenario: Fetch currently placed order
When user click on current order button
Then user should see the current order information

Scenario: Fetch past order information
When user click on past order button
Then user should see the past order information

Scenario: Fetch cancelled order information
When user click on cancelled order button
Then user should see the cancelled order information