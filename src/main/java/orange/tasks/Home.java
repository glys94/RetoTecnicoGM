package orange.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import orange.models.LoginModel;
import orange.userinterface.HomePage;
import orange.userinterface.LoginPage;

public class Home implements Task {

    public static Home goToRecruitment()
    {
        return Tasks.instrumented(Home.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(HomePage.RECRUITMENT));
    }
}
