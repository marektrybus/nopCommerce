package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public abstract class TestPage {

    public static WebDriver driver = null;

    public TestPage(){
        if(driver == null){
            System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            driver = new ChromeDriver(options);

        }
    }

}