package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import userinterface.JoinPage;

public class Join implements Task {
    public static Join onThePage() {
        return Tasks.instrumented(Join.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        WaitUntil.the(JoinPage.JOIN_BUTTON, WebElementStateMatchers.isVisible())
                        .forNoMoreThan(20).seconds(),
        Click.on(JoinPage.JOIN_BUTTON));
    }
}
