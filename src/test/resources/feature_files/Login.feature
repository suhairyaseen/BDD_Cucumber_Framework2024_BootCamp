@TutorialsNinjalogin
Feature: login Functionality of TutorialsNinja Application

@Validcredentials
Scenario Outline: Login With Valid Credentials
Given  User navigate To Login page
When User enters valid email <email1>
And user enters valid password <password1>
And  user Clicks on the login button
Then User is Rediract to Account Page

Examples:
|email1              |password1 |
|soscat025@gmail.com |Suher12345@|
|sosocat0@gmail.com  |Suher12345@|
|sosocat@gmail.com   |Suher12345@|



