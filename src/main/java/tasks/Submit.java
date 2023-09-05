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
                Enter.theValue("0000").into(SubmitAddressPage.INPUT_ZIP));

        try {
            Thread.sleep(15000); // Pausa de 15 segundos (15000 milisegundos)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        actor.attemptsTo(Click.on(SubmitAddressPage.BUTTON_NEXT)
        );
    }
}
