Feature: Login functionality

@Ignore
Scenario: validate login page with valid credential

Given user should be open chrome browser
When user enters username,password
And click on login button
Then page should be navigate home page
And close the browser

@RunThis 
Scenario Outline: validate login page with invalid credential
Given user should be open chrome browser
When  user enters "<invalid username>", "<password>"
And click on login button
Then error message should be display to the user
And close the browser

Examples:
| invalid username | password | 
| abc@gmail.com | 12334 | 
| xyz@gmail.com | 126543 | 
| pqr@gmail.com | 0987 | 