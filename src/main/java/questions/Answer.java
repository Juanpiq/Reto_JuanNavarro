package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.AccountCreated;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }
    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String titleText = Text.of(AccountCreated.LABEL_TITLE).viewedBy(actor).asString();
        if(question.equals(titleText))
            result = true;
        else
            result = false;
        return result;
    }

}
