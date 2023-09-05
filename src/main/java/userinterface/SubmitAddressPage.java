package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SubmitAddressPage extends PageObject {
    /*public static final Target INPUT_CITY = Target.the("where do we write the city").
            located(By.id("city"));*/

    public static final Target INPUT_ZIP = Target.the("where do we write the zip or postal").
            located(By.id("zip"));

    public static final Target LABEL_Country = Target.the("where do we choose the country").
            located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/span[1]"));

    public static final Target INPUT_COUNTRY = Target.the("where do we choose the country").
            located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[1]/div[4]/div[2]/div[1]/div[1]/input[1]"));

    public static final Target BUTTON_NEXT = Target.the("button to continue").
            located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/a[1]"));
}
