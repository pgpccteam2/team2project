package capstone;

import org.openqa.selenium.WebDriver;
import support.Browser;

public class BaseStep {

    protected static WebDriver driver;

    public void BaseStep(){
        if(driver==null)
           driver = Browser.launch();
        //TodoUtil.driver = driver = Browser.launch();
    }
}
