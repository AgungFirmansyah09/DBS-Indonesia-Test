package Tasks;

import DbsIndonesia.PageObject.LoginDbsPageObject;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class VerifyMessage {
    public static Performable element(String elemenType) throws Exception {
        Target element;
        switch(elemenType){
            case "Success Message":
                element = LoginDbsPageObject.SUCCESS_MESSAGE;
                break;
            case "Error Message":
                element = LoginDbsPageObject.ERROR_MESSAGE;
                break;
            case "Secure Area":
                element = LoginDbsPageObject.SECURE_AREA_VIEW;
                break;

            default:
                throw new Exception("There is no element type:" + elemenType);
        }

        WaitUntil.the(element, isVisible()).forNoMoreThan(25).seconds();

        return Task.where("{0} verify element is displayed",
                Ensure.that(element)
                        .isDisplayed()
        );
    }
}
