package co.com.choucair.certification.utest90.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PersonalDataPage extends PageObject {

    public static final Target FIRST_NAME_LABEL = Target.the("put the firstname")
            .located(By.id("firstName"));

    public static final Target LAST_NAME_LABEL = Target.the("put the firstname")
            .located(By.xpath("//input[@id='lastName']"));

    public static final Target EMAIL_LABEL = Target.the("put the firstname")
            .located(By.xpath("//input[@id='email']"));

    public static final Target MONTH = Target.the("put the firstname")
            .located(By.xpath("//select[@id='birthMonth']"));
    public static final Target DAY = Target.the("put the firstname")
            .located(By.xpath("//select[@id='birthDay']"));
    public static final Target YEAR = Target.the("put the firstname")
            .located(By.xpath("//select[@id='birthYear']"));

    public static final Target BUTTON_NEXTPI = Target.the("put the firstname")
            .located(By.xpath("//span[contains(text(),'Next: Location')]"));

}
