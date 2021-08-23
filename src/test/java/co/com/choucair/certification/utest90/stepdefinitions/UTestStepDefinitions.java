package co.com.choucair.certification.utest90.stepdefinitions;

import co.com.choucair.certification.utest90.model.UTestSignUpData;
import co.com.choucair.certification.utest90.questions.Message;
import co.com.choucair.certification.utest90.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UTestStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Andres wants to sign up in the website Utest$")
    public void thanAndresWantsToSignUpInTheWebsiteUtest() {
        OnStage.theActorCalled("Andres").wasAbleTo(OpenUp.uTestPage());

    }


    @When("^he complete the form in the website$")
    public void heCompleteTheFormInTheWebsite(List<UTestSignUpData> uTestSignUpData) {
        OnStage.theActorInTheSpotlight().attemptsTo(JoinToday.onThePage(),
                PersonalData.inLabels(uTestSignUpData.get(0)),
                PersonalLocation.inLocation(uTestSignUpData.get(0)),
                DeviceInformation.aboutThe(uTestSignUpData.get(0)),
                SetPassword.andTermOfUse(uTestSignUpData.get(0))


        );


    }

    @Then("^he finds the text$")
    public void heFindsTheText(List<UTestSignUpData> uTestSignUpData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Message.isThe(uTestSignUpData.get(0).getMessage())));

    }
}
