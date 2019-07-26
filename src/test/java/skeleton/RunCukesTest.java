package skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/skeleton/Login.feature")
		//plugin = "json:target\\Jsonreport.json")
public class RunCukesTest {
}
