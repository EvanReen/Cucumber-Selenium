Feature: Seach and Place the order for products

@PlaceOrder
Scenario Outline: Search Experience for product search in both Home and Offers page

Given user is on GreenCart Landing Page
When user searched with Shortname "Tom" and extracted actual name of product
And Added "3" items of the selected product to cart
Then User proceeds to Checkout and validate the <Name> items in checkout page
And verify that user has ability to enter promo code and place the order

Examples:
| Name |
| Tom  |