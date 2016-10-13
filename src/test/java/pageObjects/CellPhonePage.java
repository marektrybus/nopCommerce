package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tools.Tools;

public class CellPhonePage {

    public WebElement cellPhone;

    public CellPhonePage(WebElement aCellPhone){
        cellPhone = aCellPhone;
    }

    public void addCellPhoneToTheCart(){
        cellPhone.findElement(By.xpath(".//div/input[@class='button-2 product-box-add-to-cart-button']")).click();
        Tools.waitForElementByXpath(".//li[@id='topcartlink']/a/span[contains(@class, 'cart-qty') and text() = '(1)']");
    }
}