package tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Collections;
import java.util.List;

import static pageObjects.TestPage.driver;

public class Tools {

    public static final int TIMEOUT = 10;

    public static void waitForElementByClass(String classname){
        WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(classname)));
    }

    public static void waitForElementByXpath(String locator){
        WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }
}
