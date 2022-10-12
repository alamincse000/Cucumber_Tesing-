
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
// Without report using bellow method
//@CucumberOptions(plugin = {"pretty"})
// When will create report
@CucumberOptions(plugin = {"pretty", "html:target/cucumber-reports/cucumber.html",
        "json:target/cucumber-reports/cucumber.json"})
public class RunCucumberTest {

}

