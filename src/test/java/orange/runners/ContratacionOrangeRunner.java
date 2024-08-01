package orange.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features/contratacion_orange.feature"},
        glue = "orange.stepdefinitions",
        snippets= CucumberOptions.SnippetType.CAMELCASE)
public class ContratacionOrangeRunner {

}
