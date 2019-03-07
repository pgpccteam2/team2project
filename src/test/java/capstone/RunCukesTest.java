package capstone;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        glue = {"capstone/steps"},
        features = {"src/test/resources/"},
        tags = {""@capstone1,@capstone2"},
        plugin = {"pretty", "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt", "html:target/cucumber-html", "rerun:target/rerun.txt"}
//        plugin = {"pretty"}, monochrome = true

)
public class RunCukesTest {


  
  //This test is intentionally blank
  
  //See: 
  //  * src/test/resources for Gherkin Feature files
  //  * bank.Stepdefs for step definitions
  
}
