Feature: Opening bank account
Scenario: Opening bank account with nominee
Given User should be at accounts page
When User enters the following data
| Erin | smith | erin.smith@gmail.com | 9988776655 |
| Robert | Jackson | robert.jackson@gmail.com |9876543210 |
And User clicks on submit button
Then User should see confirmation