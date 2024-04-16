Feature: Hooks Demonstration

@MobileTest
Scenario: Mobile Login
Given User is on Mobile Login Page
When User login into mobile with "ravi" and "1234"
Then Home screen is observed
And User can click on the apps

@MobileTest
Scenario: Mobile Landing Page
Given User has logged in
When User clicks on the app
Then App is launched
And User can see app details