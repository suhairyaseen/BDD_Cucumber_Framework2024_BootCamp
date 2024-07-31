@TutotrialNinjaLogout
Feature: logout functionality of tutorialninja Application


@validateLogout
Scenario: user Logout successfully
Given user is logged in 
When user click on the logout button
And user should get massage saying Account logout
Then user click on countinue button to navigate to homepage