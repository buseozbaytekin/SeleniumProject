Feature: Amazon.com
  Scenario: Amazon.com adding product
    Given User is on home page
    When Click accept cookies
    When Click search button
    When Write product name
    When Click shipped by amazon radio button
    When Click Apple radio button for filter
    When Click first product
    When Add to cart
    When Check cart page
    Then The item should be added to the cart