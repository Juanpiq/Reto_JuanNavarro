package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.SetPage;

public class Set implements Task {

    private String strFirstName;
    private String strLastName;
    private String strEmail;

    public Set(String strFirstName, String strLastName, String strEmail) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
    }

    public static Set personalData(String strFirstName, String strLastName, String strEmail) {
        return Tasks.instrumented(Set.class, strFirstName, strLastName, strEmail);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strFirstName).into(SetPage.INPUT_FIRSTNAME),
                Enter.theValue(strLastName).into(SetPage.INPUT_LASTNAME),
                Enter.theValue(strEmail).into(SetPage.INPUT_EMAIL),
                Click.on(SetPage.OPTION_MONTH),
                Click.on(SetPage.OPTION_DAY),
                Click.on(SetPage.OPTION_YEAR),
                Click.on(SetPage.BUTTON_NEXT)
        );
    }
}
