package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CellPhonesPage extends TestPage{

    public WebElement cellPhones;

    public CellPhonesPage(){
    }

    public CellPhonesPage(WebElement aCellPhone){

        cellPhones = aCellPhone;
    }

    public CellPhonePage getCellPhone(String cellPhoneName){
        List<WebElement> cellPhones = getCellPhones();

        for (WebElement cellPhoneElement : cellPhones) {
            try {
                if (cellPhoneElement.findElement(By.linkText(cellPhoneName)) != null) {
                    return new CellPhonePage(cellPhoneElement);
                }
            }
            catch (NoSuchElementException e){

            }
        }
        return null;
    }

    private List<WebElement> getCellPhones(){
        List<WebElement> cellPhones = driver.findElements(By.className("product-item"));
        //List<WebElement> cellPhones = driver.findElements(By.xpath(".//*[@class='item-box']"));

        return cellPhones;
    }

}
