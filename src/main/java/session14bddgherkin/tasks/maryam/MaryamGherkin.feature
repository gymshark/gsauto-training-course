Scenario: User adds item to wishlist
  Given User is logged in to the app And is on PDP page
  When User clicks the 'Wishlist icon'
  Then The item is added to User's wishlist
