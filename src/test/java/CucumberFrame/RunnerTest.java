package CucumberFrame;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = {"src/test/java/CucumberFrame/Scenarious.feature"},
        glue = {"CucumberFrame"}
)
public class RunnerTest extends AbstractTestNGCucumberTests {} // для запуска через TestNG
//@RunWith(Cucumber.class) // для запуска через JUnit
//public class RunTest {}
