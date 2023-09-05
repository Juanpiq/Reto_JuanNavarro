package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.GenerateNewPasswordPage;

public class Generate implements Task {
    public static Generate newPassword() {
        return Tasks.instrumented(Generate.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Choucair_Password#123").into(GenerateNewPasswordPage.INPUT_PASSWORD),
                Enter.theValue("Choucair_Password#123").into(GenerateNewPasswordPage.INPUT_CONFIRM),
                Click.on(GenerateNewPasswordPage.CHECKBOX_INFORMED),
                Click.on(GenerateNewPasswordPage.CHECKBOX_UTESTTERMS),
                Click.on(GenerateNewPasswordPage.CHECKBOX_PRIVACY),
                Click.on(GenerateNewPasswordPage.BUTTON_SETUP)
        );
    }
}
