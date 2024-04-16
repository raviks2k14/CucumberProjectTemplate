Feature: Application Login

@SmokeTest
Scenario: Home Page Default Login
Given User is on NetBanking Landing Page
When User login into application with "jin" and "1234"
Then Home page is populated
And Cards are displayed are "true"
