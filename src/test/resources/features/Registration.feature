Feature: Registration
  Scenario: New user completes his first transaction
  When User navigates to http://demo.nopcommerce.com/
  And he displays “Electronics > Cell phones” page
  And he adds “HTC One Mini Blue” to his shopping cart
  And he displays his shopping cart
  And he proceed to the checkout
  And he registers
  And he proceed to the checkout
  And he fills Billing address
  And he fills Shipping address
  And he selects  Next Day Air Shipping method
  And he selects Credit Card as Payment method
  And he fills Payment information
  And he verifies data correctness on order confirmation
  And he submits his order
  Then his order has been successfully processed
