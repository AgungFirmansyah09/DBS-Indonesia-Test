package DbsIndonesia.StepDeffinition;

import Tasks.ClickOn;
import Tasks.InputText;
import Tasks.NavigateTo;
import Tasks.VerifyMessage;
import io.cucumber.java.en.*;
import io.github.cdimascio.dotenv.Dotenv;
import net.serenitybdd.screenplay.Actor;

public class LoginStepdefs {
    @Given("{actor} open DBS login page")
    public void userOpenDBSLoginPage(Actor actor) throws Exception {
        actor.wasAbleTo(NavigateTo.theURL("DBS Login"));
    }

    @When("{actor} input email and password")
    public void userInputEmailAndPassword(Actor actor) throws Exception {
        Dotenv dotenv = Dotenv.load();

        String username = dotenv.get("USERNAME_DBS");
        String password = dotenv.get("PASSWORD_DBS");

        actor.attemptsTo(
                InputText.onField("DBS username", username),
                InputText.onField("DBS password", password)
        );
    }

    @And("{actor} click button login")
    public void userClickButtonLogin(Actor actor) throws Exception {
        actor.attemptsTo(
                ClickOn.button("DBS Button Login")
        );

    }

    @Then("{actor} can views success notification")
    public void userCanViewsSuccessNotification(Actor actor) throws Exception {
        actor.attemptsTo(
                VerifyMessage.element("Success Message")
        );

    }

    @And("{actor} direct to secure area page")
    public void userDirectToSecureAreaPage(Actor actor) throws Exception{
        actor.attemptsTo(
                VerifyMessage.element("Secure Area")
        );
    }

    @When("{actor} input email and wrong password")
    public void userInputEmailAndWrongPassword(Actor actor) throws Exception {
        Dotenv dotenv = Dotenv.load();
        String username = dotenv.get("USERNAME_DBS");
        String wrong_password = dotenv.get("WRONG_PASSWORD_DBS");

        actor.attemptsTo(
                InputText.onField("DBS username", username),
                InputText.onField("DBS wrong password", wrong_password)
        );
    }

    @Then("{actor} can views password invalid")
    public void userCanViewsPasswordInvalid(Actor actor) throws Exception {
        actor.attemptsTo(
                VerifyMessage.element("Error Message")
        );
    }
}
