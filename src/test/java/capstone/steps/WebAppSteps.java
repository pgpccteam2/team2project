package capstone.steps;

import capstone.BaseStep;
import capstone.pages.TestPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import support.Browser;

public class WebAppSteps extends BaseStep{

    TestPage testPage;

    public WebAppSteps(){
        testPage = new TestPage();
    }

    @Given("^I am on web app home page$")
    public void am_I_on_the_todo_page() throws Throwable {
        testPage.navigateToHomePage();
        Thread.sleep(20);
    }

    @Then("^I click \"([^\"]*)\" button$")
    public void iClickButton(String btnName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        TestPage tp = new TestPage();
        tp.click(btnName);
        throw new PendingException();
    }

    @Then("^I verify the title label as \"([^\"]*)\"$")
    public void iVerifyTheTitleLabelAs(String labelName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        testPage.verifyTitleLable(labelName);
    }

    @Then("^I verify the option1 \"([^\"]*)\" is displayed$")
    public void iVerifyTheOption1IsDisplayed(String optionName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        testPage.verifyOption1(optionName);
    }
    ///
    @Then("^I verify the option2 \"([^\"]*)\" is displayed$")
    public void iVerifyTheOption2IsDisplayed(String optionName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        testPage.verifyOption2(optionName);
    }
    ///
}
