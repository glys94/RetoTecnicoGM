package orange.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import orange.models.LoginModel;
import orange.userinterface.LoginPage;


public class Login implements Task {
    LoginModel login;

    public Login(LoginModel login) {
        this.login = login;
    }

    public static Login login(LoginModel login)
    {
        return Tasks.instrumented(Login.class,login);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(LoginPage.USER),
                Enter.theValue(login.getUser()).into(LoginPage.USER),
                Enter.theValue(login.getPasword()).into(LoginPage.PASS),
                Click.on(LoginPage.BUTTONLOGIN)
        );

    }

}
