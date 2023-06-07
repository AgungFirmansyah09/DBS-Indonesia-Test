package DbsIndonesia.PageObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://the-internet.herokuapp.com/login")
public class LoginDbsPageObject extends PageObject {

    public static Target USERNAME_DBS= Target.the("DBS username")
            .locatedBy("//input[@id='username']");

    public static Target PASSWORD_DBS= Target.the("DBS password")
            .locatedBy("//input[@id='password']");

    public static Target WRONG_PASSWORD_DBS= Target.the("DBS wrong password")
            .locatedBy("//input[@id='password']");

    public static Target LOGIN_BUTTON= Target.the("login button")
            .locatedBy("//button[@type='submit']");

    public static Target SUCCESS_MESSAGE= Target.the("success message")
            .locatedBy("//div[@class='flash success']");

    public static Target ERROR_MESSAGE= Target.the("error message")
            .locatedBy("//div[@class='flash error']");

    public static Target SECURE_AREA_VIEW= Target.the("secure area view")
            .locatedBy("//h4[@class='subheader']");
}
