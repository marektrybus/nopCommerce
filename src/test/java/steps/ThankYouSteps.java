package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import pageObjects.ThankYouPage;

public class ThankYouSteps {

    ThankYouPage thankYouPage;

    @Before
    public void setup(){
        thankYouPage = new ThankYouPage();
    }

    @Then("^his order has been successfully processed$")
    public void orderHasBeenSuccessfullyProcessed(){
        thankYouPage.checkOrderSuccessfullyProcessedMessage();
        thankYouPage.clickContinue();
    }
}
