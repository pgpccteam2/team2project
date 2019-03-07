package capstone.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestPage extends BasePage {

    String webURL = "https://medium.com/";


    @FindBy(xpath="//a[contains(text(),'Sign in')]")
    public WebElement btnSignIn;

    @FindBy(xpath="//h1//a[contains(text(),'Shopizer')]")
    public WebElement lblTitle;


    public void navigateToHomePage(){
        webURL ="http://3.91.198.235:8080/shop";
        driver.get(webURL);

    }

    public void verifyTitleLable(String labelName){
        if(lblTitle.isDisplayed())
            System.out.println(" Title label found:"+ labelName);
        else
            Assert.assertTrue("Title did not found"+labelName,false);
    }

    public void verifyOption(String optionName){
        if(lblTitle.isDisplayed())
            System.out.println(" option is found:"+ optionName);
        else
            Assert.assertTrue("Option did not found" +optionName,false);

        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void click(String btnName){

        if(btnName.toLowerCase().equalsIgnoreCase("sign in")){
          //  case "sign in":
                btnSignIn.click();
            //    break;

        }
    }
}
