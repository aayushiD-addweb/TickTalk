package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/home/addweb/IdeaProjects/Contract/src/test/java/Feature",
        glue = "Steps",
        plugin = {"pretty"}
)

public class testrunner {
}