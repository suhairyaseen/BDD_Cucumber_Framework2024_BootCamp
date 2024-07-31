@TutorialNinjaSearchProduct
Feature: SearchProduct functionality of TutorialNinja Application


@ValidateSearchProduct
Scenario: user nagigate to login page 
Given user navigate to home page
When user enter valid product in search box 
And click on search button
Then user should find right product in product page 
