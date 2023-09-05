package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.SubmitAddressPage;

public class Submit implements Task {
    public static Submit address() {
        return Tasks.instrumented(Submit.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Enter.theValue("Panama City").into(SubmitAddressPage.INPUT_CITY),
                Enter.theValue("0000").into(SubmitAddressPage.INPUT_ZIP),
                /*Click.on(SubmitAddressPage.LABEL_Country),
                Enter.theValue("Panama").into(SubmitAddressPage.INPUT_COUNTRY),*/
                Click.on(SubmitAddressPage.BUTTON_NEXT)
        );
    }
}
