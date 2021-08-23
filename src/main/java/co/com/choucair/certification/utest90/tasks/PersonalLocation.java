package co.com.choucair.certification.utest90.tasks;

import co.com.choucair.certification.utest90.model.UTestSignUpData;
import co.com.choucair.certification.utest90.userinterface.PersonalLocationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class PersonalLocation implements Task {

    private UTestSignUpData uTestSignUpData;

    public PersonalLocation(UTestSignUpData uTestSignUpData) {
        this.uTestSignUpData = uTestSignUpData;
    }

    public static PersonalLocation inLocation(UTestSignUpData uTestSignUpData) {
        return Tasks.instrumented(PersonalLocation.class, uTestSignUpData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(uTestSignUpData.getCity()).into(PersonalLocationPage.CITY),
                Hit.the(Keys.ARROW_DOWN).into(PersonalLocationPage.CITY),
                Enter.theValue(uTestSignUpData.getZip()).into(PersonalLocationPage.ZIP),
                Click.on(PersonalLocationPage.COUNTRY),
                Click.on(PersonalLocationPage.COUNTRY_ITEM),
                Click.on(PersonalLocationPage.BUTTON_NEXT_D)
                );
    }
}
