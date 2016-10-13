package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageObjects.CheckoutPage;
import pageObjects.ConfirmOrderPage;

import static tools.InputData.*;

public class CheckoutSteps {

    CheckoutPage checkoutPage;

    @Before
    public void setup(){
        checkoutPage = new CheckoutPage();
    }

    @When("^he fills Billing address$")
    public void setBillingAddress(){
        checkoutPage.setBillingAddress();
    }

    @When("^he fills Shipping address$")
    public void proceedToTheCheckout(){
        //Ship to the same address checked
    }

    @When("^he selects  Next Day Air Shipping method$")
    public void setShippingMethod(){
        checkoutPage.setNextDayAirShippingMethod();
    }

    @When("^he selects Credit Card as Payment method$")
    public void setPaymentMethod(){
        checkoutPage.setCreditCardShippingMethod();
    }

    @When("^he fills Payment information$")
    public void setPaymentInformation(){
        checkoutPage.setPaymentInformation();
    }

    @When("^he verifies data correctness on order confirmation$")
    public void verifyDataCorrectness(){
        ConfirmOrderPage orderSummary = checkoutPage.getConfirmOrderSummary();
        Assert.assertEquals(FIRSTNAME + " " + LASTNAME, orderSummary.getBillingName());
        Assert.assertEquals("Email: " + EMAIL, orderSummary.getBillingEmail());
        Assert.assertEquals("Phone: " + PHONE, orderSummary.getBillingPhone());
        Assert.assertEquals(COMPANY, orderSummary.getBillingCompany());
        Assert.assertEquals(ADDRESS1, orderSummary.getBillingAddress1());
        Assert.assertEquals(CITY + " , " + ZIPCODE, orderSummary.getBillingCityStateZip());
        Assert.assertEquals(COUNTRY, orderSummary.getBillingCountry());
        Assert.assertEquals("Credit Card", orderSummary.getPaymentMethod());
        Assert.assertEquals(FIRSTNAME + " " + LASTNAME, orderSummary.getShippingName());
        Assert.assertEquals("Email: " + EMAIL, orderSummary.getShippingEmail());
        Assert.assertEquals("Phone: " + PHONE, orderSummary.getShippingPhone());
        Assert.assertEquals(COMPANY, orderSummary.getShippingCompany());
        Assert.assertEquals(ADDRESS1, orderSummary.getShippingAddress1());
        Assert.assertEquals(CITY + " , " + ZIPCODE, orderSummary.getShippingCityStateZip());
        Assert.assertEquals(COUNTRY, orderSummary.getShippingCountry());
        Assert.assertEquals("Next Day Air", orderSummary.getShippingMethod());
        Assert.assertEquals(CELLPHONENAME, orderSummary.getProductName());
        Assert.assertEquals(1, orderSummary.getNumberOfItemsInTheCart());
    }

    @When("^he submits his order$")
    public void submitOrder(){
        ConfirmOrderPage orderSummary = checkoutPage.getConfirmOrderSummary();
        orderSummary.submitOrder();
    }


}
