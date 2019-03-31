package capstone.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestPage extends BasePage {

    String webURL = "http://54.90.133.135:8080/shop";


    @FindBy(xpath="//a[contains(text(),'Sign in')]")
    public WebElement btnSignIn;

    @FindBy(xpath="//h1//a[contains(text(),'Shopizer')]")
    public WebElement lblTitle;

    @FindBy(id="searchField1")
    public WebElement txtSearch;


    public void navigateToHomePage(){
        webURL ="http://54.90.133.135:8080/shop";
        driver.get(webURL);

    }

    public void verifyTitleLable(String labelName){
        if(lblTitle.isDisplayed())
            System.out.println(" Title label found:"+ labelName);
        else
            Assert.assertTrue("Title did not found"+labelName,false);
    }

//     public void verifyOption(String optionName){
    
//       switch(optionName.toLowerCase()){
//           case "shopizer":
//               Assert.assertTrue("Option did not found" +optionName,lblTitle.isDisplayed());
//               break;
//           case "search textbox":
//               Assert.assertTrue("Option did not found" +optionName,txtSearch.isDisplayed());
//               break;
//           default:
//               System.out.println("Case is not present for:"+ optionName);
              
                 
//       }
// //         if(lblTitle.isDisplayed())
// //             System.out.println(" option is found:"+ optionName);
// //         else
// //             Assert.assertTrue("Option did not found" +optionName,false);

//         try {
//             Thread.sleep(20);
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }
//     }
//////////////
    public void verifyOption1(String optionName){
          Assert.assertTrue("Option did not found" +optionName,lblTitle.isDisplayed());
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void verifyOption2(String optionName){
        try{
          Assert.assertTrue("Option did not found" +optionName,txtSearch.isDisplayed());
        }catch(Exception e){
            exceptionFlag = true;
            Assert.assertFalse("Option did not found" +optionName,true);
        }
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    
   //// 
    public void click(String btnName){

        if(btnName.toLowerCase().equalsIgnoreCase("sign in")){
          //  case "sign in":
                btnSignIn.click();
            //    break;

        }
    }
}
