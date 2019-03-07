package capstone.pages;

import capstone.BaseStep;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.Browser;

public class BasePage {

    public static WebDriver driver;
    public WebDriverWait wait;

    public BasePage(){
       // this.driver = driver;
        this.driver = Browser.launch();
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver,15);
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = Browser.launch();
        }
        return driver;
    }
}
