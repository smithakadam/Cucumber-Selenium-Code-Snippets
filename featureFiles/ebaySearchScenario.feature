Feature: Gadgets Search on Ebay

In order to check if the search is working properly
As a user
I want to see if the search results come up

@tester
Scenario: Check for devices in Lenovo on ebay when I enter it in the search field.

Given I am on ebay homepage
When I search for Lenovo in search field
Then Search result should display different devices