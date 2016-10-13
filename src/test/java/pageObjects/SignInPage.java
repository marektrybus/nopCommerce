package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tools.Tools;

public class SignInPage extends TestPage{

    public WebElement signInPage;

    public SignInPage(){
    }

    public SignInPage(WebElement aSignInPage){

        signInPage = aSignInPage;
    }

    public void register(){
        String registerButtonXpath = ".//input[@type='button' and @class='button-1 register-button']";
        Tools.waitForElementByXpath(registerButtonXpath);
        driver.findElement(By.xpath(registerButtonXpath)).click();
        Tools.waitForElementByXpath(".//div[@class='page-title']/h1[text()='Register']");
    }

}
