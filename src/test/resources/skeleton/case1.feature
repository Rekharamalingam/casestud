@Login
Feature: Login

In order to login in TestMe App
As a user
I need to register first

Business rules:
 - Ony registered users can do the login
 - user should provide all the necessary details on registration page
 
To Do:
 -  password should have more than 8 characters 
 
 Background:
 Given user is on the login page
 
 Scenario Outline: user can do the successful login
 Given user is on the login page
 When  user provides "<username>"
 Given user provides the "<password>"
 And press login button
 Then  user rendered to TestMeApp home page
 
 Examples:
 |username|password|
 |lalitha|password123|

 