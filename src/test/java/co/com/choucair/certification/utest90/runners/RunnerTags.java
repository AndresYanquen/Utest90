package co.com.choucair.certification.utest90.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/signup_utest.feature",
        tags = "@stories",
        glue = "co.com.choucair.certification.utest90.stepdefinitions",
        snippets = SnippetType.CAMELCASE )
public class RunnerTags {
}