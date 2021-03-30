
Feature: Uber Booking Feature
@smoke
Scenario: Booking sedan
Given User wants to select a car type as "sedan" from Uber app
When User selects car "sedan" and pick up point "Banglore" and drop location "Pune"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD



@regression
Scenario: Booking SUV
Given User wants to select a car type as "SUV" from Uber app
When User selects car "SUV" and pick up point "Banglore" and drop location "Pune"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD


Scenario: Booking Mini
Given User wants to select a car type as "sedan" from Uber app
When User selects car "Mini" and pick up point "Banglore" and drop location "Pune"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD


