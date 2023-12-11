Feature: Seach and Place the order for products

@OffersPage
Scenario Outline: Search Experience for product search in both Home and Offers page

Given user is on GreenCart Landing Page
When user searched with Shortname "Tom" and extracted actual name of product
Then user searched for same "Tom" Shortname in offers page
And validate product name in offers page matches with Landing Page
