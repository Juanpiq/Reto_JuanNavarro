package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AccountCreated extends PageObject {
    public static final Target LABEL_TITLE = Target.the("Title of the page").
            located(By.xpath("//h1[contains(text(),\"Welcome to the world's largest community of freela\")]"));
}
