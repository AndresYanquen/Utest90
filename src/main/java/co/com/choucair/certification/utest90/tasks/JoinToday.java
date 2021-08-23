package co.com.choucair.certification.utest90.tasks;

import co.com.choucair.certification.utest90.userinterface.JoinTodayPage;
import jdk.nashorn.internal.scripts.JO;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class JoinToday implements Task {

    private JoinTodayPage joinTodayPage;

    public static JoinToday onThePage() {
        return  Tasks.instrumented(JoinToday.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(JoinTodayPage.JOIN_TODAY_BUTTON));
    }
}
