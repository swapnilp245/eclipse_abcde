
Feature: User Registration

Scenario: User Registration Details
Given user is on registration page
When user enters following details
   
    | Sapu  | Pastapure | 123456  | sapu@gmail.com |Pune |
    | Asin |  Thottukamal | 987654 | asin@gmail.com | Mumbai |
    | Kirti |  Kharbanda | 989788  | kirti@gmail.com| New Delhi |
    
Then user registration should be successful


Scenario: User Registration Details with columns
Given user is on registration page
When user enters following details with columns
   	|firstname|lastname|phone|email|location|
    | Sapu  | Pastapure | 123456  | sapu@gmail.com |Pune |
    | Asin |  Thottukamal | 987654 | asin@gmail.com | Mumbai |
    | Kirti |  Kharbanda | 989788  | kirti@gmail.com| New Delhi |
    
Then user registration should be successful
