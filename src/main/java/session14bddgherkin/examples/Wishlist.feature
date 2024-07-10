Feature: Wishlist functionality

  As a user I want to be able to add items to my Wishlist
  So that I can easily choose my favourite items from the list to add to my Shopping cart

Scenario: Adding an item to the wishlist
  Given the user is logged in
  And the user is on the Product page for an item they want to purchase
  When the user adds the item to wishlist
  And the user confirms the addition when prompted
  Then the selected item  should appear in the user's wishlist
    And the user receives  a confirmation message that the item has been successfully added

