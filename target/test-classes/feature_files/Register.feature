@TutorialsNinjaRegister
Feature: registration og Tutorialninja Application

@RegisterVaildcredentials
Scenario: Register With Valid credentials
Given user navigate to register page
When user enters below mandatory fileds
|FirstName      | soso          |
|LastName       | 123           |
|Telephone      | 65789543      |
|Password       | Suher12345@   |
|ConfirmPassword| Suher12345@   |
And check the newsletter box
And user check the agree box
And user Click on continue button 
Then user successfuly create account 


