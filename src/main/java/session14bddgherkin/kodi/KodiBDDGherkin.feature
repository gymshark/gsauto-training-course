Feature: Wishlist Functionality

  Scenario: Add an item to the wishlist from PDP
    Given the user is on a PDP
    When adding the item to the wishlist
    Then the item is added to their Wishlist