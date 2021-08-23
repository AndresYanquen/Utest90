package co.com.choucair.certification.utest90.tasks;

import co.com.choucair.certification.utest90.model.UTestSignUpData;
import co.com.choucair.certification.utest90.userinterface.SetPasswordPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SetPassword implements Task {
    private UTestSignUpData uTestSignUpData;

    public SetPassword(UTestSignUpData uTestSignUpData) {
        this.uTestSignUpData = uTestSignUpData;
    }

    public static SetPassword andTermOfUse(UTestSignUpData uTestSignUpData) {
        return Tasks.instrumented(SetPassword.class, uTestSignUpData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SetPasswordPage.PASSWORD),
                Enter.theValue(uTestSignUpData.getPassword()).into(SetPasswordPage.PASSWORD),
                Click.on(SetPasswordPage.CONFIRM_PASSWORD),
                Enter.theValue(uTestSignUpData.getPassword()).into(SetPasswordPage.CONFIRM_PASSWORD),
                Click.on(SetPasswordPage.STAY_INFORMED),
                Click.on(SetPasswordPage.TERMS_OF_USE),
                Click.on(SetPasswordPage.PRIVACY_SECURITY)

        );
    }
}
