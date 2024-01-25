package RunnerClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:Features/"
        ,glue={"classpath:stepDefiniton"},
        tags = "@Cucumberfirsttest"
)

public class RunnerClass {

    @BeforeClass
    public void test()
    {
        System.out.println("test");
    }

}
