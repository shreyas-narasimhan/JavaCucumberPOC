package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CheckoutPage {

    pages.CheckoutPage checkoutpage = new pages.CheckoutPage();

    @Given("the user verifies the products again on the checkout page")
    public void user_verifies_at_checkout() {
        checkoutpage.verify_product_in_checkout();
    }

    @And("the user proceeds with placing the order")
    public void user_proceeds_to_placing_order() {
        checkoutpage.click_checkout_btn();
    }

    @And("the user validates that the order is placed successfully")
    public void place_oder() {
        checkoutpage.verify_order_placed();
    }

    @Then("the user logs out and verifies that they have logged out successfully")
    public void user_logsout() {
        checkoutpage.logout_session();
    }
}
