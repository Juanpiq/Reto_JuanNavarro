package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.GenerateNewPasswordPage;

public class Generate implements Task {
    private String strPassword;

    public Generate(String strPassword) {
        this.strPassword = strPassword;
    }

    public static Generate newPassword(String strPassword) {
        return Tasks.instrumented(Generate.class, strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strPassword).into(GenerateNewPasswordPage.INPUT_PASSWORD),
                Enter.theValue(strPassword).into(GenerateNewPasswordPage.INPUT_CONFIRM),
                Click.on(GenerateNewPasswordPage.CHECKBOX_INFORMED),
                Click.on(GenerateNewPasswordPage.CHECKBOX_UTESTTERMS),
                Click.on(GenerateNewPasswordPage.CHECKBOX_PRIVACY),
                Click.on(GenerateNewPasswordPage.BUTTON_SETUP)
        );
    }
}
