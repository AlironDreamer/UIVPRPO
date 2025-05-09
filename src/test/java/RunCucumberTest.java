import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

@Suite
@SelectClasspathResource("features") // Путь к calc.feature в resources
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "steps") // Путь к step-классам
public class RunCucumberTest {
}

