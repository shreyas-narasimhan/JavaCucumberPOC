package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CartPage {

    pages.CartPage cartpage = new pages.CartPage();

    @Given("the user navigates to the cart")
    public void user_navigates_to_cart(){
        cartpage.go_to_cart();
    }

    @And("the user verifies the items in the cart along with the retrieved details")
    public void user_verifies_details(){
        cartpage.verify_product();
    }

    @Then("the user proceeds to checkout")
    public void proceed_to_checkout(){
        cartpage.click_go_to_checkout();
    }
}
