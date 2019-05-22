Feature: Three hourly weather forecast of a city

Scenario: Verification of three hourly weather forecast of a city 

Given the user enters the five day weather forecast for Glasgow city			

When the user clicks any row of the day			

Then the three hourly weather forecast of that day should be displayed

And the user clicks on the same row of the day again

Then the three hourly weather forecast should be hidden