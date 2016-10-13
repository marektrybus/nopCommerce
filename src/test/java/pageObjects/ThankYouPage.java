package pageObjects;

import org.openqa.selenium.By;
import tools.Tools;

import static pageObjects.TestPage.driver;

public class ThankYouPage {

    public ThankYouPage(){
    }

    public void checkOrderSuccessfullyProcessedMessage(){
        String orderProcessedXpath = ".//div[@class='title']/strong[text()='Your order has been successfully processed!']";
        Tools.waitForElementByXpath(orderProcessedXpath);
    }

    public void clickContinue(){
        driver.findElement(
                By.xpath(".//input[@type='button' and @class='button-1 order-completed-continue-button']")).click();
    }
}
