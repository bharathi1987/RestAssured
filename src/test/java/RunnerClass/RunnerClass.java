package RunnerClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:Features/"
        ,glue={"classpath:stepDefiniton"}
      //  tags = "@Cucumberfirsttest"
)

public class RunnerClass {

}