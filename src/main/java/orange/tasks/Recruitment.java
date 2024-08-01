package orange.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import orange.userinterface.HomePage;
import orange.userinterface.RecruitmentPage;

public class Recruitment implements Task {
    public static Recruitment openform()
    {
        return Tasks.instrumented(Recruitment.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(RecruitmentPage.ADD));

    }
}
