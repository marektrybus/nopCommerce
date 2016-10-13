package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tools.Tools;

public class ShoppingCartPage extends TestPage{

    public WebElement shoppingCart;

    public ShoppingCartPage(){
    }

    public ShoppingCartPage(WebElement aShoppingCart){

        shoppingCart = aShoppingCart;
    }

    public void acceptTermsOfService(){
        String termsOfServiceXpath = ".//input[@id='termsofservice' and @type='checkbox']";

        Tools.waitForElementByXpath(termsOfServiceXpath);
        driver.findElement(By.xpath(termsOfServiceXpath)).click();
    }

    public void checkout(){
        Tools.waitForElementByXpath(".//ul[@class='top-menu']/li/a[@href='/electronics']");
        driver.findElement(By.id("checkout")).click();
        Tools.waitForElementByXpath(".//div[@class='page-title']/h1[text()='Welcome, Please Sign In!' or 'Checkout']");
    }

}
