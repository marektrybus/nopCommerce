package steps;


import cucumber.api.java.Before;
import cucumber.api.java.en.When;
import pageObjects.MainPage;

public class MainPageSteps {

    MainPage mainPage;

    @Before()
    public void setup(){
        mainPage = new MainPage();
    }

    @When("^User navigates to http://demo.nopcommerce.com/$")
    public void userNavigatesToNopCommerce(){
        mainPage.open();
    }

    @When("^he displays “Electronics > Cell phones” page$")
    public void displayElectronicsCellPhones(){
        mainPage.openElectronicsCellPhones();
    }

    @When("^he displays his shopping cart$")
    public void displayShoppingCart(){
        mainPage.openShoppingCart();
    }

}
