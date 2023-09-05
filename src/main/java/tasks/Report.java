package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterface.JoinPage;
import userinterface.ReportDevicesPage;

public class Report implements Task {
    public static Report aboutDevices() {
        return Tasks.instrumented(Report.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ReportDevicesPage.BUTTON_MOBILE_DEVICE),
                Click.on(ReportDevicesPage.LABEL_MOBILE_DEVICE),

                Click.on(ReportDevicesPage.BUTTON_MOBILE_MODEL),
                Click.on(ReportDevicesPage.LABEL_MOBILE_MODEL),

                Click.on(ReportDevicesPage.BUTTON_OP_SYSTEM),
                Click.on(ReportDevicesPage.LABEL_OP_SYSTEM),

                Click.on(ReportDevicesPage.BUTTON_NEXT)
        );
    }
}