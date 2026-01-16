Feature: End-to-end scenario covering login, product selection, cart validation, and checkout

  Scenario: Validate that the user is able to log in
    Given the user navigates to the login page and enter the credentials
    Then the user should be able to view the My Account page

  Scenario: Validate that the user is able to select products
    Given the user navigates to the Books page
    And the user selects a book and adds it to the cart
    And the user searches for a product using the search bar
    Then the user retrieves the product details and adds it to the cart

  Scenario: Validate the products in the cart
    Given the user navigates to the cart
    And the user verifies the items in the cart along with the retrieved details
    Then the user proceeds to checkout

  Scenario: Validate the checkout process
    Given the user verifies the products again on the checkout page
    And the user proceeds with placing the order
    And the user validates that the order is placed successfully
    Then the user logs out and verifies that they have logged out successfully
