package co.com.choucair.certification.utest90.tasks;

import co.com.choucair.certification.utest90.model.UTestSignUpData;
import co.com.choucair.certification.utest90.userinterface.DeviceInformationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class DeviceInformation implements Task {

    private UTestSignUpData uTestSignUpData;

    public DeviceInformation(UTestSignUpData uTestSignUpData) {
        this.uTestSignUpData = uTestSignUpData;
    }

    public static DeviceInformation aboutThe(UTestSignUpData uTestSignUpData) {
        return Tasks.instrumented(DeviceInformation.class, uTestSignUpData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(DeviceInformationPage.OS),
                Click.on(DeviceInformationPage.OS_ITEM),
                Click.on(DeviceInformationPage.VERSION),
                Click.on(DeviceInformationPage.VERSION_ITEM),
                Click.on(DeviceInformationPage.LENGUAGE),
                Click.on(DeviceInformationPage.LENGUAGE_ITEM),
                Click.on(DeviceInformationPage.MOBILE_DEVICE),
                Click.on(DeviceInformationPage.MOBILE_DEVICE_ITEM),
                Click.on(DeviceInformationPage.MODEL),
                Click.on(DeviceInformationPage.MODEL_ITEM),
                Click.on(DeviceInformationPage.OPERATING_SYSTEM),
                Click.on(DeviceInformationPage.OPERATING_SYSTEM_ITEM),
                Click.on(DeviceInformationPage.BUTTON_NEXT_LASTSTEP));
    }
}
