package Tasks;

import DbsIndonesia.PageObject.LoginDbsPageObject;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class ClickOn {
    public static Performable button(String buttonType) throws Exception{
        Target button;

        switch(buttonType) {
            case "DBS Button Login":
                button = LoginDbsPageObject.LOGIN_BUTTON;
                break;

            default:
                throw new Exception("There is no button type" + buttonType);
        }
        return Task.where("{0} click" + buttonType + "button",
                Click.on(button));
    }
}
