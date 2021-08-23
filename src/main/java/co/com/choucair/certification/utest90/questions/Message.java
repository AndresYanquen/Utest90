package co.com.choucair.certification.utest90.questions;

import co.com.choucair.certification.utest90.userinterface.SetPasswordPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Message implements Question<Boolean> {
    private String message;

    public Message(String message) {
        this.message = message;
    }

    public static Question<Boolean> isThe(String message) {
        return new Message(message);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String registro_completo= Text.of(SetPasswordPage.MESSAGE_COMPLETED).viewedBy(actor).asString();
        if(message.equals(registro_completo)){
            result=true;
        }else{
            result = false;
        }

        return result;
    }
}
