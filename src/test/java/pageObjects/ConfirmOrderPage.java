package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ConfirmOrderPage {

    public WebElement confirmOrderPage;

    public ConfirmOrderPage(WebElement aConfirmOrderPage){
        confirmOrderPage = aConfirmOrderPage;
    }

    public String getBillingName(){
        return confirmOrderPage.findElement(By.xpath(getXpathForBilingInfoElement("name"))).getText();
    }

    public String getBillingEmail(){
        return confirmOrderPage.findElement(By.xpath(getXpathForBilingInfoElement("email"))).getText();
    }

    public String getBillingPhone(){
        return confirmOrderPage.findElement(By.xpath(getXpathForBilingInfoElement("phone"))).getText();
    }

    public String getBillingCompany(){
        return confirmOrderPage.findElement(By.xpath(getXpathForBilingInfoElement("company"))).getText();
    }

    public String getBillingAddress1(){
        return confirmOrderPage.findElement(By.xpath(getXpathForBilingInfoElement("address1"))).getText();
    }

    public String getBillingCityStateZip(){
        return confirmOrderPage.findElement(By.xpath(getXpathForBilingInfoElement("city-state-zip"))).getText();
    }

    public String getBillingCountry(){
        return confirmOrderPage.findElement(By.xpath(getXpathForBilingInfoElement("country"))).getText();
    }

    public String getPaymentMethod(){
        return confirmOrderPage.findElement(By.xpath(".//li[@class='payment-method']/span[2]")).getText();
    }

    public String getShippingName(){
        return confirmOrderPage.findElement(By.xpath(getXpathForBilingInfoElement("name"))).getText();
    }

    public String getShippingEmail(){
        return confirmOrderPage.findElement(By.xpath(getXpathForBilingInfoElement("email"))).getText();
    }

    public String getShippingPhone(){
        return confirmOrderPage.findElement(By.xpath(getXpathForBilingInfoElement("phone"))).getText();
    }

    public String getShippingCompany(){
        return confirmOrderPage.findElement(By.xpath(getXpathForBilingInfoElement("company"))).getText();
    }

    public String getShippingAddress1(){
        return confirmOrderPage.findElement(By.xpath(getXpathForBilingInfoElement("address1"))).getText();
    }

    public String getShippingCityStateZip(){
        return confirmOrderPage.findElement(By.xpath(getXpathForBilingInfoElement("city-state-zip"))).getText();
    }

    public String getShippingCountry(){
        return confirmOrderPage.findElement(By.xpath(getXpathForBilingInfoElement("country"))).getText();
    }

    public String getShippingMethod(){
        return confirmOrderPage.findElement(By.xpath(".//li[@class='shipping-method']/span[2]")).getText();
    }

    public int getNumberOfItemsInTheCart(){
        return confirmOrderPage.findElements(
                By.xpath(".//table[@class='cart']/tbody/tr")).size();
    }

    public String getProductName(){
        return confirmOrderPage.findElement(
                By.xpath(".//table[@class='cart']/tbody/tr/td[@class='product']/a[@class='product-name']")).getText();
    }

    public void submitOrder(){
        confirmOrderPage.findElement(
                By.xpath(".//input[@type='button' and @class='button-1 confirm-order-next-step-button']")).click();
    }


    private String getXpathForBilingInfoElement(String className){
        return ".//ul[@class='billing-info']/li[@class='" + className + "']";
    }

    private String getXpathForShippingInfoElement(String className){
        return ".//ul[@class='shipping-info']/li[@class='" + className + "']";
    }

}