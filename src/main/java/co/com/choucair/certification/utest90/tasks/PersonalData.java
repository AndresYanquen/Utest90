package co.com.choucair.certification.utest90.tasks;

import co.com.choucair.certification.utest90.model.UTestSignUpData;
import co.com.choucair.certification.utest90.userinterface.PersonalDataPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class PersonalData implements Task {
    private UTestSignUpData uTestSignUpData;

    public PersonalData(UTestSignUpData uTestSignUpData) {
        this.uTestSignUpData = uTestSignUpData;
    }

    public static PersonalData inLabels(UTestSignUpData uTestSignUpData) {
        return Tasks.instrumented(PersonalData.class,uTestSignUpData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(uTestSignUpData.getFirstname()).into(PersonalDataPage.FIRST_NAME_LABEL),
                Enter.theValue(uTestSignUpData.getLastname()).into(PersonalDataPage.LAST_NAME_LABEL),
                Enter.theValue(uTestSignUpData.getEmail()).into(PersonalDataPage.EMAIL_LABEL),
                Click.on(PersonalDataPage.MONTH),
                SelectFromOptions.byVisibleText(uTestSignUpData.getMonth()).from(PersonalDataPage.MONTH),
                Click.on(PersonalDataPage.DAY),
                SelectFromOptions.byVisibleText(uTestSignUpData.getDay()).from(PersonalDataPage.DAY),
                Click.on(PersonalDataPage.YEAR),
                SelectFromOptions.byVisibleText(uTestSignUpData.getYear()).from(PersonalDataPage.YEAR),
                Click.on(PersonalDataPage.BUTTON_NEXTPI)

        );
    }
}
