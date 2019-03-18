package capstone.steps;

import capstone.pages.BasePage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;

public class AutomationHooks {
    public static String ScenarioName = "";
    public static String scenarioTag = "";

    public AutomationHooks() {
    }

    @Before
    static public void beforeScenario(Scenario scenario) throws Exception {
        System.out.println("\n \n Before scenario \n ");
    }

    @After
    static public void afterScenario(Scenario scenario) throws Throwable {
        System.out.println("\n \n After scenario \n\n");
        System.out.println("scenario name=" + scenario.getName());
        System.out.println("scenario is =" + scenario.getStatus());
        System.out.println("scenario is =" + scenario.getSourceTagNames());

        if(BasePage.exceptionFlag == true)
            Assert.assertFail("After hooks failed",true);
                              
        WebDriver driver = BasePage.getDriver();
        driver.quit();
    }
}
