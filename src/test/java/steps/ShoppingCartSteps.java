package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import pageObjects.ShoppingCartPage;
import pageObjects.TestPage;
import tools.Tools;


public class ShoppingCartSteps extends TestPage{

    ShoppingCartPage shoppingCartPage;

    @Before
    public void setup(){
        shoppingCartPage = new ShoppingCartPage();
    }

    @When("^he proceed to the checkout$")
    public void proceedToTheCheckout(){
        shoppingCartPage.acceptTermsOfService();
        shoppingCartPage.checkout();
    }
}
