Feature: Wishlist Functionality

  Scenario: Adding a Product to the wishlist
    Given User is logged into theit account
    And User is on the PDP screen
    When the product from product dislay page is added to the wishlist
    Then that Product should appear in the Wishlist