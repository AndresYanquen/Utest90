package co.com.choucair.certification.utest90.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class JoinTodayPage extends PageObject {

    public static final Target JOIN_TODAY_BUTTON = Target.the("Open the register menu")
            .located(By.linkText("Join Today"));
}
