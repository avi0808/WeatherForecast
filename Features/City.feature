Feature: Five day weather forecast of cities

Scenario: Verification of five day weather forecast of a city 

Given the user enters the city name as "<city>"			

When the user clicks on show forecast/report/proceed/continue			

Then Five day weather forecast should be displayed

Examples:
|city|

|Glasgow|

|London|

|Cardiff|