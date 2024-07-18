Feature: Wishlist functionality

  Scenario: User adds item to the wishlist
    Given a logged in user is viewing a product on the product page
    When the user clicks on "Add to Wishlist"
    Then user see's a confirmation message in the snackbar
    And the item appears in the user's wishlist

