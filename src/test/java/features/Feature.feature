Feature: End-to-end scenario covering login, product selection, cart validation, and checkout

  Scenario: Validate that the user is able to log in
    Given the user navigates to the login page
    And the user enters valid login credentials
    Then the user should be able to view the My Account page

  Scenario: Validate that the user is able to select products
    Given the user navigates to the Books page
    And the user selects a book and retrieves its name
    And the user adds the book to the cart
    And the user searches for a product using the search bar
    And the user retrieves the product details
    Then the user adds the product to the cart

  Scenario: Validate the products in the cart
    Given the user navigates to the cart
    And the user verifies the items in the cart along with the retrieved details
    Then the user proceeds to checkout

  Scenario: Validate the checkout process
    Given the user validates the checkout page
    And the user verifies the products again on the checkout page
    When the user proceeds with placing the order
    Then the user validates that the order is placed successfully
    And the user logs out and verifies that they have logged out successfully
