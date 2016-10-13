package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import tools.Tools;


public class MainPage extends TestPage {

    public MainPage() {
    }

    public void open(){
        driver.navigate().to("http://demo.nopcommerce.com");
    }

    public void openElectronicsCellPhones(){
        //Tools.waitForElementByClass("top-menu");
        Tools.waitForElementByXpath(".//ul[@class='top-menu']/li/a[@href='/electronics']");

        Actions action = new Actions(driver);
        WebElement electronicsMenu = driver.findElement(By.linkText("Electronics"));
        action.moveToElement(electronicsMenu).build().perform();
        Tools.waitForElementByXpath(".//a[contains(text(), 'Cell phones')]");
        WebElement cellPhonesItem = driver.findElement(By.linkText("Cell phones"));
        action.moveToElement(cellPhonesItem).click().build().perform();

        //Tools.waitForElementByClass("button-2 product-box-add-to-cart-button");
        Tools.waitForElementByClass("product-grid");
    }

    public void openShoppingCart(){
        Tools.waitForElementByXpath(".//li[@id='topcartlink']/a");

        driver.findElement(By.linkText("Shopping cart")).click();

        Tools.waitForElementByXpath(".//div[@class='page-title']/h1[text()='Shopping cart']");
    }



}
