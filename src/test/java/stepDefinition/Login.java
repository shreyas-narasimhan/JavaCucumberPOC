package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LoginPage;


public class Login {

    LoginPage loginPage = new LoginPage();

    @Given("the user navigates to the login page and enter the credentials")
    public void user_navigates_to_the_Login_page() throws Throwable{
        loginPage.LoginAction();
    }

    @Then("the user should be able to view the My Account page")
    public void user_is_able_to_view_account_page(){
        loginPage.MyAccountVerify();
    }
}
