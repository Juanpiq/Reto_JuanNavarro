package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SetPage extends PageObject {
    public static final Target INPUT_FIRSTNAME = Target.the("where do we insert first name").
            located(By.id("firstName"));

    public static final Target INPUT_LASTNAME = Target.the("where do we insert last name").
            located(By.id("lastName"));

    public static final Target INPUT_EMAIL = Target.the("where do we insert email").
            located(By.id("email"));

    public static final Target OPTION_MONTH = Target.the("where do we insert moth of birth").
            located(By.xpath("//option[contains(text(),'November')]"));

    public static final Target OPTION_DAY = Target.the("where do we insert day of birth").
            located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[4]/div[2]/div[1]/div[2]/select[1]/option[25]"));

    public static final Target OPTION_YEAR = Target.the("where do we insert year of birth").
            located(By.xpath("//option[contains(text(),'1998')]"));

    public static final Target BUTTON_NEXT = Target.the("button to continue").
            located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[2]/a[1]"));
}
