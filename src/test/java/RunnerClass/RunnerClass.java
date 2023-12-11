package RunnerClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:Features/FirstFeature.feature"
        ,glue={"classpath:stepDefiniton"},
        tags = "@Cucumberfirsttest"
)

public class RunnerClass {

}