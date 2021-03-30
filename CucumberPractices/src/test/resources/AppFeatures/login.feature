Feature: Login validation

Scenario Outline: Login fail - possible combinations
Given User is on Application landing page
When User clicks on Sign in button
Then User is displayed login screen
When User enters "<UserName>" in username field
And User enters "<Password>" in password field
And User clicks on Sign in button
Then User gets login failed error message

	Examples: 
	
	|UserName| Password|
	|sapu| 123456|
	|invalidname|12345|
	|incorrectname|345678|
	
	
	
	

