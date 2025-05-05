Feature: Login functionality

Scenario: validate login page with valid credential

Given user should be open chrome browser
When user enters username,password
And click on login button
Then page should be navigate home page
And close the browser
