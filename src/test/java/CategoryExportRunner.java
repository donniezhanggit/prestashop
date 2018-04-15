import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/cucumber/admin_side/export_category.feature"},
                 glue = {"base", "step_definition"},
                 strict = true)
public class CategoryExportRunner extends AbstractTestNGCucumberTests {}
