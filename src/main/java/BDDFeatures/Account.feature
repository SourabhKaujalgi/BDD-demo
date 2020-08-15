Feature: Account Test
@SmokeTest
Scenario: Home page default login
Given User is on Account Page
When User login into application with "Jin" and password "1234"
Then Home page is populated 
And cards are displayed "true"