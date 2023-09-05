package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class GenerateNewPasswordPage extends PageObject {
    public static final Target INPUT_PASSWORD = Target.the("where do we set password").
            located(By.id("password"));

    public static final Target INPUT_CONFIRM = Target.the("where do we confirm password").
            located(By.id("confirmPassword"));

    public static final Target CHECKBOX_INFORMED = Target.the("where do we accept to be informed").
            located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[4]/label[1]/span[1]"));


    public static final Target CHECKBOX_UTESTTERMS = Target.the("where do we accept Utest terms").
            located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[5]/label[1]/span[1]"));

    public static final Target CHECKBOX_PRIVACY = Target.the("where do we accept privacy and security policy").
            located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[6]/label[1]/span[1]"));

    public static final Target BUTTON_SETUP = Target.the("where do we accept privacy and security policy").
            located(By.id("laddaBtn"));
}
