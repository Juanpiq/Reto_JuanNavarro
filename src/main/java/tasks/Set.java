package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.SetPage;

public class Set implements Task {

    public static Set personalData() {
        return Tasks.instrumented(Set.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Juan").into(SetPage.INPUT_FIRSTNAME),
                Enter.theValue("Navarro").into(SetPage.INPUT_LASTNAME),
                Enter.theValue("jpablonavarroq@hotmail.com").into(SetPage.INPUT_EMAIL),
                Click.on(SetPage.OPTION_MONTH),
                Click.on(SetPage.OPTION_DAY),
                Click.on(SetPage.OPTION_YEAR),
                Click.on(SetPage.BUTTON_NEXT)
        );
    }
}
