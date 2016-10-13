package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.When;
import pageObjects.RegisterPage;
import pageObjects.ShoppingCartPage;
import pageObjects.SignInPage;

/**
 * Created by Marek on 2016-10-12.
 */
public class RegisterSteps {

    SignInPage signInPage;
    RegisterPage registerPage;

    @Before
    public void setup(){
        signInPage = new SignInPage();
        registerPage = new RegisterPage();
    }

    @When("^he registers$")
    public void proceedToTheCheckout(){
        signInPage.register();
        registerPage.register();
    }
}
