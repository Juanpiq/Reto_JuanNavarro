package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ReportDevicesPage extends PageObject {
    public static final Target BUTTON_MOBILE_DEVICE = Target.the("where we choose device").
            located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/span[1]"));
    public static final Target LABEL_MOBILE_DEVICE = Target.the("where we choose device").
            located(By.xpath("//div[contains(text(),'Huawei')]"));


    public static final Target BUTTON_MOBILE_MODEL = Target.the("where we choose the mobile model").
            located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[2]/div[2]/div[1]/div[1]/span[1]"));
    public static final Target LABEL_MOBILE_MODEL = Target.the("where we choose the mobile model").
            located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[2]/div[2]/div[1]/ul[1]/li[1]/div[139]/span[1]/div[1]"));


    public static final Target BUTTON_OP_SYSTEM = Target.the("where do we write mobile operating system").
            located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[3]/div[2]/div[1]/div[1]/span[1]"));
    public static final Target LABEL_OP_SYSTEM = Target.the("where do we write mobile operating system").
            located(By.xpath("//div[contains(text(),'Android 10')]"));

    public static final Target BUTTON_NEXT = Target.the("button to continue").
            located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/a[1]"));
}
