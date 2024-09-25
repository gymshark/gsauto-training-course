Feature: Wishlist functionality
  As a logged in user
  I want to be able to add items to my Wishlist
  So that I can easily choose my favourite items from the list to add to my Shopping cart

  Scenario: Adding an item to the wishlist
    Given the user is viewing Product page
    When the user clicks  on "Add to Wishlist"
    Then the item is added to the user's wishlist