package Tasks;

import DbsIndonesia.PageObject.LoginDbsPageObject;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class InputText {
    public static Performable onField(String fieldType, String value) throws Exception
    {
        Target field;
        switch(fieldType){
            case "DBS username":
                field = LoginDbsPageObject.USERNAME_DBS;
                break;
            case "DBS password":
                field = LoginDbsPageObject.PASSWORD_DBS;
                break;
            case "DBS wrong password":
                field = LoginDbsPageObject.WRONG_PASSWORD_DBS;
                break;
            default:
                throw new Exception("There is no field type" + fieldType);
        }

        return Task.where("{0} input: '"+ value +"'",
                Enter.theValue(value)
                        .into(field)
        );
    }
}
