Feature: Free CRM Login Feature

#Without examples keyword
#Scenario: Free CRM Login Test Scenario

#Given User is already on login page
#When Title of login page is Free CRM
#Then user enters "navdusaj" and "108270sony"
#Then user clicks on login button
#Then user is on home page

#With examples keyword
Scenario Outline: Free CRM Login Test Scenario

Given User is already on login page
When Title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page

Examples:
	| username | password   |
	| navdusaj | 108270sony |
	| tom	   | test1234   |