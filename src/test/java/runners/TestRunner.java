package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features ="scr/main/resources/feature_files", plugin = {"html:target/ReportsDestination", "pretty"},
        monochrome = true, glue = {"stepDefinition"}, tags = "@regression")
public class TestRunner{

}



