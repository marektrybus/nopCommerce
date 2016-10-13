package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import tools.Tools;

import static pageObjects.TestPage.driver;
import static tools.InputData.*;

public class RegisterPage {

    public RegisterPage(){
    }

    public void register(){
        String genderMaleRadioButtonXpath = ".//div[@class='gender']/span[@class='male']/input[@id='gender-male' and @type='radio']";
        Tools.waitForElementByXpath(genderMaleRadioButtonXpath);
        driver.findElement(By.xpath(genderMaleRadioButtonXpath)).click();
        driver.findElement(By.xpath(".//input[@id='FirstName']")).sendKeys(FIRSTNAME);
        driver.findElement(By.xpath(".//input[@id='LastName']")).sendKeys(LASTNAME);
        setDayOfBirth();
        setMonthOfBirth();
        setYearOfBirth();
        driver.findElement(By.xpath(".//input[@id='Email']")).sendKeys(EMAIL);
        driver.findElement(By.xpath(".//input[@id='Company']")).sendKeys(COMPANY);
        driver.findElement(By.xpath(".//input[@id='Password']")).sendKeys(PASSWORD);
        driver.findElement(By.xpath(".//input[@id='ConfirmPassword']")).sendKeys(PASSWORD);

        driver.findElement(By.xpath(".//input[@type='submit' and @name='register-button']")).click();
        Tools.waitForElementByXpath(".//div[text()[contains(., 'Your registration completed')]]");

        driver.findElement(By.xpath(".//input[@type='submit' and @name='register-continue']")).click();
        Tools.waitForElementByXpath(".//div[@class='page-title']/h1[text()='Shopping cart']");
    }

    private void setDayOfBirth(){
        WebElement selectDayElement = driver.findElement(By.xpath(".//select[@name='DateOfBirthDay']"));
        Select selectDay = new Select(selectDayElement);
        selectDay.selectByIndex(1);
    }

    private void setMonthOfBirth(){
        WebElement selectDayElement = driver.findElement(By.xpath(".//select[@name='DateOfBirthMonth']"));
        Select selectDay = new Select(selectDayElement);
        selectDay.selectByIndex(1);
    }

    private void setYearOfBirth(){
        WebElement selectDayElement = driver.findElement(By.xpath(".//select[@name='DateOfBirthYear']"));
        Select selectDay = new Select(selectDayElement);
        selectDay.selectByIndex(1);
    }


}
