package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class JoinPage extends PageObject {
    public static final Target JOIN_BUTTON = Target.the("button to create new account").
            located(By.className("unauthenticated-nav-bar__dropdown-menu-sign-up"));
}
