import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/cucumber/admin_side/category.feature"},
                 glue = {"base", "step_definition"},
                 strict = true)
public class CategoryRunner extends AbstractTestNGCucumberTests {}
