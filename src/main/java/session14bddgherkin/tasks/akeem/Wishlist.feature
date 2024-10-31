Feature: Wishlist functionality

  Scenario: Add an item to the wishlist
    Given the user is logged in viewing a PDP
    When the product is added to the wishlist
    Then a confirmation message is displayed