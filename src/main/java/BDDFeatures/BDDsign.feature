Feature: Application login 
Description: The purpose of this feature is to test the Background keyword

Background: User Launch browser
Given use lands on page



@RegTest
Scenario: Home page default login
Given User is on landing page
When User login into application with "Jin" and password "1234"
Then Home page is populated 
And cards are displayed "true"

@SmokeTest
Scenario: Home page login with invalid
Given User is on NetBanking landing page
When User sign up following details
| jenny | abcd | john@abcd.com | Austrlian | 3212121|
Then Home page is populated 
And cards are displayed "false"


@SmokeTest
Scenario Outline: Home page login with invalid
Given User is login page 
When User Login Page following with <username> and <password>
Then Home page<HMElement> is populated 
And New Test added for dry run

Examples:

|username|password|HMElement|
|username1|password1|HM1|
|username2|password2|HM2|
|username3|password3|HM3|
