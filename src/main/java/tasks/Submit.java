package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.SubmitAddressPage;

public class Submit implements Task {
    private String strZip;

    public Submit(String strZip) {
        this.strZip = strZip;
    }

    public static Submit address(String strZip) {
        return Tasks.instrumented(Submit.class, strZip);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(strZip).into(SubmitAddressPage.INPUT_ZIP));

        try {
            Thread.sleep(5000); // Pausa de 5 segundos (5000 milisegundos)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        actor.attemptsTo(
                Click.on(SubmitAddressPage.BUTTON_Country),
                Click.on(SubmitAddressPage.LABEL_COUNTRY),
                Click.on(SubmitAddressPage.BUTTON_NEXT)
        );
    }
}
