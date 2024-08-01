Feature: Wishlist Functionality

  Scenario: Add an item to the wishlist from PDP
    Given the user is on a PDP
    When the user clicks the wishlist heart icon
    Then the heart icon transitions the fill opacity from 0% to 100%
    And the snackbar confirmation message will be display
    And the item is added to their Wishlist