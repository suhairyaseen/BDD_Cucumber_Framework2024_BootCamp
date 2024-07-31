@TutorileNinjaAddToCart
Feature: AddToCart functionality of TutorialNinja appliction

@ValidateAddToCart

Scenario: validate Addtocart product

Given user navigate to product page
When user click on AddToCart button
And user click on ShoppingCart button
And user should find the right product in shoppingcart
Then click on CheckOut button
