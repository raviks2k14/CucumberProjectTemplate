Feature: Application Login


Background:
Given Validate the browser
When Browser is triggered
Then Check if browser is started

@RegTest
Scenario: Home Page Default Login
Given User is on NetBanking Landing Page
When User login into application with "jin" and "1234"
Then Home page is populated
And Cards are displayed are "true"

@SmokeTest
Scenario: Home Page Default Login
Given User is on NetBanking Landing Page
When User login into application with "john" and "4321"
Then Home page is populated
And Cards are displayed are "false"

@SanityTest
Scenario: Home Page Default Login
Given User is on NetBanking Landing Page
When User sign up with following details
| jenny | abcd | john@abcd.com | Australia | 47563493 |
Then Home page is populated
And Cards are displayed are "false"

@SanityTest
Scenario Outline: Home Page Default Login
Given User is on NetBanking Landing Page
When Login with <Username> and <Password>
Then Home page is populated
And Cards are displayed are "true"

Examples:
| Username 	 | Password   |
| "user1"    | "pass1"    |
| "user2"    | "pass2"    |
| "user3"    | "pass3"    |
| "user4"    | "pass4"    |
| "user5"    | "pass5"    |