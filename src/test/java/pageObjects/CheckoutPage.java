package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import tools.Tools;

import static pageObjects.TestPage.driver;
import static tools.InputData.*;

public class CheckoutPage {

    public CheckoutPage(){
    }

    public void setBillingAddress(){
        String selectCountryXpath = ".//select[@name='BillingNewAddress.CountryId']";
        Tools.waitForElementByXpath(selectCountryXpath);
        setCountry();
        driver.findElement(By.xpath(".//input[@id='BillingNewAddress_City']")).sendKeys(CITY);
        driver.findElement(By.xpath(".//input[@id='BillingNewAddress_Address1']")).sendKeys(ADDRESS1);
        driver.findElement(By.xpath(".//input[@id='BillingNewAddress_ZipPostalCode']")).sendKeys(ZIPCODE);
        driver.findElement(By.xpath(".//input[@id='BillingNewAddress_PhoneNumber']")).sendKeys(PHONE);

        driver.findElement(By.xpath(".//input[@type='button' and @title='Continue']")).click();
        //Tools.waitForElementByXpath(".//div[text()[contains(., 'Your registration completed')]]");
    }

    public void setNextDayAirShippingMethod(){
        String continueButtonXpath = ".//input[@type='button' and @class='button-1 shipping-method-next-step-button']";
        String nextDayAirOptionXpath = ".//input[@type='radio' and @id='shippingoption_1']";
        Tools.waitForElementByXpath(nextDayAirOptionXpath);
        driver.findElement(By.xpath(nextDayAirOptionXpath)).click();
        driver.findElement(By.xpath(continueButtonXpath)).click();
    }

    public void setCreditCardShippingMethod(){
        String continueButtonXpath = ".//input[@type='button' and @class='button-1 payment-method-next-step-button']";
        String crediitCardOptionXpath = ".//input[@type='radio' and @id='paymentmethod_1']";
        Tools.waitForElementByXpath(crediitCardOptionXpath);
        driver.findElement(By.xpath(crediitCardOptionXpath)).click();
        driver.findElement(By.xpath(continueButtonXpath)).click();
    }

    public void setPaymentInformation(){
        String cardHolderNameXpath = ".//input[@id='CardholderName']";
        Tools.waitForElementByXpath(cardHolderNameXpath);
        driver.findElement(By.xpath(cardHolderNameXpath)).sendKeys("Test User");
        driver.findElement(By.xpath(".//input[@id='CardNumber']")).sendKeys("4111 1111 1111 1111");
        driver.findElement(By.xpath(".//input[@id='CardCode']")).sendKeys("1234");
        driver.findElement(By.xpath(".//input[@type='button' and @class='button-1 payment-info-next-step-button']")).click();
    }

    public ConfirmOrderPage getConfirmOrderSummary(){
        String confirmOrderDataXpath = ".//div[@id='checkout-step-confirm-order']";
        Tools.waitForElementByXpath(confirmOrderDataXpath);
        ConfirmOrderPage confirmOrderPage = new ConfirmOrderPage(driver.findElement(By.xpath(confirmOrderDataXpath)));

        return confirmOrderPage;
    }

    private void setCountry(){
        WebElement selectCountryElement = driver.findElement(By.xpath(".//select[@name='BillingNewAddress.CountryId']"));
        Select selectDay = new Select(selectCountryElement);
        selectDay.selectByVisibleText(COUNTRY);
    }

}
