Feature: Wishlist Functionality

  Scenario: Adding an item to the wishlist
    Given User is logged in
    And User is on the PDP screen
    When User adds an item to the wishlist
    Then Item is added to their Wishlist
    And Confirmation message is displayed